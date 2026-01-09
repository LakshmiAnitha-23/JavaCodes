class FileTask implements Runnable
{
    private String taskName;

    FileTask(String taskName)
    {
        this.taskName = taskName;
    }

    public void run()
    {
        System.out.println(taskName + "started By"
        + Thread.currentThread().getName());

        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(taskName + "completed By"
        + Thread.currentThread().getName());
    }
}

public class MultiThreading
{
    public static void main(String[] args)
    {
        FileTask download = new FileTask("download file");
        FileTask update = new FileTask("update file");

        Thread t1 = new Thread(download);
        Thread t2 = new Thread(update);

        t1.start();
        t2.start();
    }
}