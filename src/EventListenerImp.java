public class EventListenerImp implements EventListener {

    private String listenerName;


    public EventListenerImp(String name) {
        this.listenerName = name;
    }

    @Override
    public void onEvent() {
        System.out.println("Listener " + listenerName + "  worked");
    }
}
