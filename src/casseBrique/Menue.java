package casseBrique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menue extends JPanel implements ActionListener{
	
	public Menue(JFrame jf){
		
		JButton boutonGO = new JButton("GO");
		boutonGO.setFocusable(false);
		JButton boutonSTOP = new JButton("STOP");
		boutonSTOP.setFocusable(false);
		JLabel score = new JLabel("score");
		this.add(boutonGO);
		this.add(boutonSTOP);
		this.add(score);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//	      animated = true;
//
//	      t = new Thread(new PlayAnimation());
//
//	      t.start();
//
//	      bouton.setEnabled(false);
//
//	      bouton2.setEnabled(true);
	}

}
