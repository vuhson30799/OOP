import java.time.LocalTime;

public class stopWatch {
    private long startTime;
    private long endTime;
    public stopWatch () {
       startTime = System.currentTimeMillis();
    }
    public long getStartTime (){
        return startTime;
    }
    public long getEndTime () {
        return endTime;
    }
    public void start ()
    {
        startTime = System.currentTimeMillis();
    }
    public void stop ()
    {
        endTime = System.currentTimeMillis();
    }
    public long  getElapseTime() {
        return endTime - startTime;

    }
}
