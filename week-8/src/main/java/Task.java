import java.time.LocalDateTime;

public class Task {
    private String title;
    private boolean completed;
    private LocalDateTime date;

    public Task(String title,boolean completed,LocalDateTime date){
         this.title = title;
         this.completed = completed;
         this.date = date;

    }

    public String getTitle(){
        return title;
    }

    /**
    requires:dueDate must not be null
    effects:Returns true if today's date is after the due date and task is not completed
     */
    public boolean isOverdue(){
        return !completed;
    }

    /**
    effects:Sets the task's completed status to true.
     */
    public void markkAsCompleted(){
        this.completed=true;
    }
    /**
    effects:Returns true if the task has been marked completed,false otherwise
     */
    public boolean isCompleted(){
        return completed;
    }



}
