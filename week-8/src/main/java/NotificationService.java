
import java.util.*;

public class NotificationService {

    private Map<User, List<String>> notifications;

    public NotificationService() {
        notifications = new HashMap<>();
    }

    /**
     * requires: user and message must not be null.
     * effects: Adds the message to the user's notification list.
     */
    public void sendNotification(User user, String message) {
        notifications.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }
    /**

     * requires: user must not be null.
     * effects: Returns the list of messages sent to the user. Returns empty list if none.
     */
    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}