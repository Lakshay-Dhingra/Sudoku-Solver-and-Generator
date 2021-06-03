package frontend;

import testing.TestSudokuApp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends BasicFrame
{
	private static final long serialVersionUID = 1L;
	
	public Welcome()
	{
		TestSudokuApp.testGenerateGrid();
		makeVisible();
	}
	
	public void addMainSection()
	{
		JPanel main_section=new JPanel();
		main_section.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 4));
		main_section.setLayout(new BoxLayout(main_section,BoxLayout.Y_AXIS));
		
				JPanel main_heading_panel=new JPanel();
				main_heading_panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,50));
					JTextField main_heading=new JTextField("Welcome To The Sudoku Game");
					main_heading.setFont(new Font(Font.SANS_SERIF,Font.TYPE1_FONT,36));
					main_heading.setForeground(Color.DARK_GRAY);
					main_heading.setBackground(main_section.getBackground());
					main_heading.setBorder(BorderFactory.createEmptyBorder());
					main_heading_panel.add(main_heading);
				main_heading_panel.setVisible(true);
				main_section.add(main_heading_panel);
				
				JPanel difficulty_heading_panel=new JPanel();
				difficulty_heading_panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
					JTextField difficulty_heading=new JTextField("Please Select The Difficulty Level:");
					difficulty_heading.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,32));
					difficulty_heading.setForeground(Color.DARK_GRAY);
					difficulty_heading.setBackground(main_section.getBackground());
					difficulty_heading.setBorder(BorderFactory.createEmptyBorder());
					difficulty_heading_panel.add(difficulty_heading);
				difficulty_heading_panel.setVisible(true);
				main_section.add(difficulty_heading_panel);
				
				JPanel button_panel=new JPanel();
				button_panel.setLayout(new FlowLayout(FlowLayout.CENTER,40,30));
					
					JButton level_button1=new JButton("Easy");
					level_button1.setFont(new Font(Font.SANS_SERIF,Font.BOLD,36));
					level_button1.setBackground(Color.RED);
					level_button1.setForeground(Color.WHITE);
					level_button1.setMargin(new Insets(18,36,18,36));
						
					//When Button is Pressed
					level_button1.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
	//									new Login();
	//									disposeWindow();
								}
							});
					button_panel.add(level_button1);
					
					JButton level_button2=new JButton("Medium");
					level_button2.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
					level_button2.setForeground(main_heading.getForeground());
						
					//When Button is Pressed
					level_button2.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
//										new Login();
//										disposeWindow();
								}
							});
					button_panel.add(level_button2);
					
					JButton level_button3=new JButton("Hard");
					level_button3.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
					level_button3.setForeground(main_heading.getForeground());
						
					//When Button is Pressed
					level_button3.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
//										new Login();
//										disposeWindow();
								}
							});
					button_panel.add(level_button3);
						
				button_panel.setVisible(true);
				main_section.add(button_panel);
								
//				main_heading_panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 4));
				
				//Footer Button
				JPanel footer_button_panel=new JPanel();
				footer_button_panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,0));
					JButton footer_button=new JButton("Close Application");
					footer_button.setFont(new Font(Font.MONOSPACED,Font.BOLD,24));
					footer_button.setBackground(Color.WHITE);
					footer_button.setForeground(main_heading.getForeground());
						
						//When Button is Pressed
						footer_button.addActionListener(new ActionListener()
								{
									public void actionPerformed(ActionEvent e)
									{
										disposeWindow();
									}
								});
					
				footer_button_panel.add(footer_button);
				footer_button_panel.setVisible(true);
				main_section.add(footer_button_panel);
				//Footer Button End
				
		main_section.setVisible(true);
		main_panel.add(main_section);
	}
	
	public static void main(String[] args)
	{
		new Welcome();
	}

}