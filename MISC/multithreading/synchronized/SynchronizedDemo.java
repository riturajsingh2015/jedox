import java.util.*;

class Display{

    public synchronized void wish(String name) 
    {
        for(int i=0;i<5;i++)
        {
            System.out.print(i + ": Good Morning :");

            System.out.println(name);
        }
        System.out.println("__________________________________");
    }
}

class myThread extends Thread{

    Display d;
    String name;
    myThread(Display d,String name)
    {
        this.d=d;
        this.name=name;        
    }
    public void run(){
        d.wish(name);
    }
}

class SynchronizedDemo{

    public static void main(String[] args) {
        Display d=new Display();
        
        List<myThread> threadList = new ArrayList<>();
        int rows=10;
        for(int i=0;i<rows;i++)
            threadList.add(new myThread(d, "Thread-"+i));

        for(int i=0;i<rows;i++)
            threadList.get(i).start();

    }
}