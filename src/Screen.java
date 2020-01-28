import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Screen {

    task goal = new task();

    public static void main(String[] args) {
        Screen s = new Screen(); 
        s.start();
        int i = JOptionPane.showConfirmDialog(null, "Do you want to add a task?");
        if (i == JOptionPane.YES_OPTION) {
            s.add();
        }
        s.cont();
        
    }

    void cont(){
        /*JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b = new JButton();*/
        String s = "";
        String task = "";
        int i = JOptionPane.showConfirmDialog(null, "Do you want to add another task?");
        if(i ==  0){
            s = JOptionPane.showInputDialog("Which parent task?");
            task = JOptionPane.showInputDialog("what task");
        }
        //System.out.println("task: " + s);
        task t = new task();
        t.setMainTaskName(task);
        for (int j = 0; j < goal.getSubtasks().size(); j++) {
        	//System.out.println(goal.getTask(j).getMainTaskNam().toLowerCase());
            if(goal.getTask(j).getMainTaskNam().toLowerCase().equals(s.toLowerCase())){
                goal.getTask(j).addTask(t);
                //System.out.println("Parent task: " + goal.getTask(j).getMainTaskNam());
                //System.out.println("Child task: " + task);
            }
        }
        list();
    }
    void start() {
        goal.setMainTaskName(JOptionPane.showInputDialog("What's your task?"));
        //System.out.println(goal.getMainTaskNam());
    }
    void add(){
        task t = new task();
        t.setMainTaskName(JOptionPane.showInputDialog("What task do you want to add?"));
        //System.out.println(t.getMainTaskNam());
        goal.addTask(t);

    }
    void list() {
    	try {
    		FileWriter fw =  new FileWriter("src/job.txt");
    		fw.write("Task: " + goal.getMainTaskNam() + "\n");
    		for (int i = 0; i < goal.subtasks.size(); i++) {
			System.out.println("Subtask: " + goal.getTask(i).getMainTaskNam());
			fw.write("   " +goal.getTask(i).getMainTaskNam() + "\n"); 
			for (int j = 0; j < goal.getTask(i).subtasks.size(); j++) {
				System.out.println("Subtask of " + goal.getTask(i).getMainTaskNam()+ ": " + goal.getTask(i).getTask(j).getMainTaskNam());
				fw.write("      " + goal.getTask(i).getTask(j).getMainTaskNam() + "\n");
			}
			fw.close();
		}
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    }
}
