import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level6Proj implements ActionListener{

	 JFrame frame;
	 JPanel panel;
	 JButton addTask;
	 JButton saveTask;
	
	public static void main(String[] args) {
		Level6Proj l6 = new Level6Proj();
	}
	
	Level6Proj(){
		frame = new JFrame("Progress Tracker");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		addTask = new JButton();
		addTask.setText("Add Task");
		addTask.addActionListener(this);
		
		saveTask = new JButton();
		saveTask.setText("Save Task");
		saveTask.addActionListener(this);
		
		panel.add(addTask);
		addTask.setBounds(120, 10, 75, 35);
		
		panel.add(saveTask);
		saveTask.setBounds(300, 10, 75, 35);
		
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addTask) {
			System.out.println("Adding Task");
		}
		
		if (e.getSource() == saveTask) {
			System.out.println("Saving Task");
		}
		
	}
	
	
}
