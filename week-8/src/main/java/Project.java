import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    /**
    requires:user must not be null.
    effects:adds the user to the project's user list
     */
    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    /**
    requires:task must not be null
    effcts adds the task to the projects task list
     */
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }

    /**
    requires:title mus not be null or empty
    effects:Returns the task with the given title, or null if not found.


     */
    public Task getTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}





