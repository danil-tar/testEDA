import java.util.ArrayList;
import java.util.List;

public class EventSource {

    private List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListenerImp listener) {
        listeners.add(listener);
    }

    public void notifyListeners() {
        listeners.forEach(listener -> listener.onEvent());
    }

}
