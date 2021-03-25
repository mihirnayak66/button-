import java.awt.*;
import java.awt.event.*;
class mylist extends Frame implements ItemListener
{
 List l;
 mylist()
 {
	 setLayout(new FlowLayout());
  l=new List(3);
  l.add("R15");
  l.add("KTM");
  l.add("Royal enfield");
  l.add("duke");
  l.setBounds(100,260,70,40);
        
  add(l);
  l.addItemListener(this);
  addWindowListener( new WindowAdapter()
  {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
 }
   public void itemStateChanged(ItemEvent ie)
   {
    repaint();
	}
	public static void main(String[] args)
	{
	 mylist ml=new mylist();
	 ml.setSize(400,400);
	 ml.setVisible(true);
	 }
	 }
© 2021 GitHub, Inc.
