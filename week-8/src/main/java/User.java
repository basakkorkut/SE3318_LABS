
import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private String email;
    private List<Task> tasks;

    public User(String name,String email){
        this.name=name;
        this.email=email;
        this.tasks=new ArrayList<>();
    }

    /*
    requires:task must not be null
    effects:adds the given task to the user's task list
     */
    public void addTask(Task task) {
        if (task != null) {
            tasks.add(task);
        }
    }
    /*
    requires:task must not be null.
    effects:returns true if the user's task list contains the given task

     */
    public boolean hasTask(Task task) {
        return tasks.contains(task);
    }

       public List<Task> getTasks(){
            return tasks;
        }

        public String getUserName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

}
