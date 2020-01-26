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
       
    }

    void cont(){
        /*JFrame f = new JFrame();
        JPanel p = new JPanel();
        JButton b = new JButton();*/
        String s = "";
        int i = JOptionPane.showConfirmDialog(null, "Do you want to add another task?");
        if(i ==  0){
            s = JOptionPane.showInputDialog("Which parent task?");
        }
        for (int j = 0; j < goal.getSubtasks().size(); j++) {
            if(goal.getSubtasks().get(j).toString().toLowerCase() == s.toLowerCase()){

            }
        }
    }
    void start() {
        goal.setMainTaskName(JOptionPane.showInputDialog("What's your task?"));
        System.out.println(goal.getMainTaskNam());
    }
    void add(){
        task t = new task();
        t.setMainTaskName(JOptionPane.showInputDialog("What task do you want to add?"));
        System.out.println(t.getMainTaskNam());
        goal.addTask(t);

    }
}
