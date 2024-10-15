//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Timer timer1 = new Timer(5000);
        Timer timer2 = new Timer(1000);

        timer1.addListener(new EventListener() {
            @Override
            public void onEvent() {
                System.out.println("Anonymus");
            }
        });

        timer2.addListener(new EventListener() {
            @Override
            public void onEvent() {
                System.out.println("Anonymus");
            }
        });

        timer2.addListener(() -> {
            System.out.println("Lambda");
        });

        timer1.startTimer();
        timer2.startTimer();

    }
}