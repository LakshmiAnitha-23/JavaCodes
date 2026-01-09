/*class mythread extends Thread
{
    public void run()
    {
        System.out.println("thread is in running state");
    }

    public static void main(String[] args)
    {
        mythread t = new mythread();
        t.start();
    }
}*/

/*class myrunnable implements Runnable
{
    public void run()
    {
        System.out.println("thread is running");
    }

    public static void main(String[] args)
    {
        myrunnable obj = new myrunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}*/

class ThreadName extends Thread
{
    public void run()
    {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
        ThreadName t = new ThreadName();
        t.start();
    }

}