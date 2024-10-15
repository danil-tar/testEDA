public class Timer {
    public long time;

    public Timer(long time) {
        this.time = time;
    }

    public void startTimer() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}