package AdvJAVA;
import java.awt.*;
import java.awt.event.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91942
 */
public class Eventdm {
    Frame f1=new Frame();
    Button b1=new Button("Click");
    TextField tf1=new TextField(40);
    Eventdm()
    {
        f1.setLayout(new FlowLayout());
        f1.add(tf1);
        f1.add(b1);
         classA a1= new classA(tf1);
        b1.addActionListener(a1);
        f1.setSize(450,450);
        f1.setVisible(true);
  
    
    }
	public static void main(String[] args) {
		Eventdm e=new Eventdm();
	}
	
	class classA implements ActionListener{
		TextField tf;
		classA(TextField tf){
			
			this.tf=tf;
		}
		public void actionPerformed(ActionEvent ae) {
			tf.setText("mihir nayak");
		}
		
	}

}
class closef extends WindowAdapter{
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
