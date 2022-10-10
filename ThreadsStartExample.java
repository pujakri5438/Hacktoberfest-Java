import java.io.*;
import java.util.*;
class ThreadExample extends Thread
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.print("---");
        }
    }
}
class RunnableExample implements Runnable
{
    public void run()
    {
        for(int i=0;i<100;i++)
        {
            System.out.print("***");
        }
    }
}
class ThreadsStartExample 
{
public static void main(String arg[])
{
    new ThreadExample().start();
    new Thread(new RunnableExample()).start();
}    
}
