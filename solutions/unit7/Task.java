import java.time.LocalTime; // import the LocalTime class to use

public class Task implements Comparable<Task> {
    private LocalTime dueTime;
    private String description;

    public Task (LocalTime dueTime, String description) {
        this.dueTime = dueTime;
        this.description = description;
    }

    public LocalTime getDueTime () {
        return dueTime;
    }

    public int compareTo (Task o) {              
        return o.getDueTime().compareTo (dueTime);   
    }
    
    public String toString () {
       String result = "Task: ";
       result += "due at " + dueTime.toString();
       result += " - " + description;
       return result;
    }
    
    // -- simple test of PriorityQueue and task
    public static void main (String[] args) {
     // Simple TODO manager as a priority queue
     PriorityQueue<Task> todo = new PriorityQueue<Task> ();
     
     todo.insert( new Task(LocalTime.of(9,00), "Leave for work") );
     todo.insert( new Task(LocalTime.of(11,30), "Meeting with tutor") );
     todo.insert( new Task(LocalTime.of(10,00), "Call bank") );
     todo.insert( new Task(LocalTime.of(16,00), "Finish essay") );
     todo.insert( new Task(LocalTime.of(13,00), "Remember lunch") );
     
     // get next task
     System.out.println ("Next task is: " + todo.takeNext());
     
    }
}
