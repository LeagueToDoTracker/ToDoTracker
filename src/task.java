import java.util.ArrayList;


public class task {
    String name;
    ArrayList<task>subtasks = new ArrayList<task>();
    
    public void addTask(task t){
        System.out.println(t.name);
        subtasks.add(t);

    }
    public void setMainTaskName(String name){
        this.name = name;
    }
    public String getMainTaskNam(){
        return this.name;
    }
    public ArrayList getSubtasks(){
        return this.subtasks;
    }
}