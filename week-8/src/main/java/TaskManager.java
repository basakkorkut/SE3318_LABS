
import java.util.List;


public class TaskManager {

    /**

     * requires: user and task must not be null.
     * effects: Adds the task to the user's list of tasks.
     */
    public void assignTask(User user, Task task) {
        if (user != null && task != null) {
            user.addTask(task);
        }
    }

    /**

     * requires: user and task must not be null.
     * effects: Removes the task from the user's list of tasks if it exists.
     */
    public void removeTask(User user, Task task) {
        if (user != null && task != null) {
            user.getTasks().remove(task);
        }
    }

    /**

     *
     * requires: user must not be null.
     * effects: Returns the list of tasks assigned to the user.
     */
    public List<Task> listTasks(User user) {
        return user.getTasks();
    }
}
