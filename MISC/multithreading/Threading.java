class myThread extends Thread{

public void run()
{    
    // Job of myThread //
    for (int i=0;i<10;i++)
        for (int j=0;j<3;j++) // <-----In normal conditions there is a context switch at these loop as well. But I need to make this loop mutually exclusive
            System.out.println(i+" : "+j+" myThread");
    /////////////////////
}
}

public class Threading{

    public static void main(String[] args) {

        myThread t=new myThread();
        t.start();
        // Job of main thread //
        for (int i=0;i<10;i++)
            for (int j=0;j<3;j++)
                System.out.println(i+" : "+j+" Main Thread");
        /////////////////////
        
    }

}