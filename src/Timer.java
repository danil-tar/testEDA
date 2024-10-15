public class Timer {
    private long time;
    private EventSource eventSource;

    public Timer(long time) {
        this.time = time;
        this.eventSource = new EventSource();
    }

    public void addListener(EventListener listener) {
        eventSource.addListener(listener);
    }

    public void startTimer() {
        Thread thread = new Thread(
                () -> {
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    eventSource.notifyListeners();
                }
        );
        thread.start();

    }
}