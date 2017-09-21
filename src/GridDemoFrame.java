import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridDemoFrame extends JFrame
{
	GridDemoPanel thePanel;
	JLabel scoreLabel;
	public GridDemoFrame()
	{
		super("Grid Demo");
		
		setSize(600,600+24+16);
		
		this.getContentPane().setLayout(new BorderLayout());
		thePanel = new GridDemoPanel(this);
		scoreLabel = new JLabel("Score: 0");
		this.getContentPane().add(thePanel,BorderLayout.CENTER);
		this.getContentPane().add(scoreLabel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	public void updateScore(int score)
	{
		scoreLabel.setText("Score: "+score);
		scoreLabel.repaint();
	}
}
