public class TextFile implements File {
    private Long size;

    public TextFile(Long size) {

        this.size = size;

    }

    public String getType() {

        return "txt";

    }

    public Long getSize() {

        return this.size;

    }

}