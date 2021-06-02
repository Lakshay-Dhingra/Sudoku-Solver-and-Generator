package frontend;
import java.awt.*;
import javax.swing.*;

//Basic Frame Defines The Basic UI Structure Of The App
//The BasicFrame() constructor will run when any of its child class's object is created
//Child classes can override the methods of Basic Frame, if they want to.

public class BasicFrame extends JFrame
{
	private static final long serialVersionUID = 1L;
	public Container content;
	public JPanel title_panel;
	public JPanel main_panel;
	
	//Constructor - This will be called first
	public BasicFrame()	
	{
		super("Sudoku - Can You Solve It!");	//Title Bar
		setSize(1350,950);	//Window Size
		setLocation(280,65);
		
		content=this.getContentPane();
		content.setLayout(new BorderLayout());
			title_panel=new JPanel();
			title_panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,30));
				addTitle("Sudoku - Can You Solve It!");
			title_panel.setVisible(true);
			
			main_panel=new JPanel();
			main_panel.setLayout(new CardLayout(130,100));
				addMainSection();
			main_panel.setVisible(true);
			
			baseStyling();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	
	public void addTitle(String title_text)
	{
		JTextField title=new JTextField(title_text);
		title.setFont(new Font(Font.SANS_SERIF,Font.BOLD,42));
		title.setOpaque(false);
		title.setForeground(Color.BLACK);
		title.setBorder(BorderFactory.createEmptyBorder());
		title.setEditable(false);
		
		title_panel.add(title);
	}
	
	public void addMainSection()
	{}
	
	public void baseStyling()
	{
		title_panel.setBackground(Color.ORANGE);
		title_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
		main_panel.setBackground(Color.WHITE);
		main_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
	}
	
	public void makeVisible()
	{
		content.add(title_panel,BorderLayout.NORTH);
		content.add(main_panel,BorderLayout.CENTER);
		setVisible(true);
	}
	
	
	public void disposeWindow()
	{
		super.dispose();
	}
}
