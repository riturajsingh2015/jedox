public class Directory implements File {
    private List<File> files = new ArrayList<>();

    public String getType() {

        return "directory";

    }

    public void addFile(File file) {

        files.add(file);

    }

    public Long getSize() {

        Long size = 0L;

        for (File file : files) {

            size = size + file.getSize();

        }

        return size;

    }

}