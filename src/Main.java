//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EventListenerImp eventListenerImp1 = new EventListenerImp("First");
        EventListenerImp eventListenerImp2 = new EventListenerImp("Double");

        EventSource eventSource = new EventSource();
        eventSource.addListener(eventListenerImp1);

        Timer timer1 = new Timer(3000);
        Timer timer2 = new Timer(5000);

        timer1.startTimer();
        eventSource.notifyListeners();

        eventSource.addListener(eventListenerImp2);
        timer2.startTimer();
        eventSource.notifyListeners();

    }
}