/* Practical1 - Question 7
Eryk Gloginski
08/03/2022
Implementing StopWatch class*/

public class StopWatch 
{
    // class variables
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;

    // constructor that resets when created
    public StopWatch()
    {
        reset();
    }

    // start stopwatch
    public void start()
    {
        if (isRunning)
            return;
        isRunning = true;
        startTime = System.nanoTime();
    }

    // stop stopwatch
    public void stop()
    {
        if (!isRunning)
            return;
        isRunning = false;
        long endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
    }

    // return total elapsed time
    public long getElapsedTime()
    {
        if (isRunning)
        {
            long endTime = System.nanoTime();
            elapsedTime = (endTime - startTime);
            return elapsedTime;
        }
        else
            return elapsedTime;
    }

    // reset elapsed time to 0 and turn off if it's running
    public void reset()
    {
        elapsedTime = 0;
        isRunning = false;
    }
}
