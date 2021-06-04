package frontend;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import testing.TestSudokuApp;

public class GameScreen extends BasicFrame
{
	private static final long serialVersionUID = 1L;
	
	public GameScreen()
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
				difficulty_heading_panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,10));
					JTextField difficulty_heading=new JTextField("Please Select The Difficulty Level:");
					difficulty_heading.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,32));
					difficulty_heading.setForeground(Color.DARK_GRAY);
					difficulty_heading.setBackground(main_section.getBackground());
					difficulty_heading.setBorder(BorderFactory.createEmptyBorder());
					difficulty_heading_panel.add(difficulty_heading);
				difficulty_heading_panel.setVisible(true);
				main_section.add(difficulty_heading_panel);
				
				JPanel button_panel=new JPanel();
				button_panel.setLayout(new FlowLayout(FlowLayout.CENTER,40,20));
					
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
	//									new GameScreen();
	//									disposeWindow();
								}
							});
					button_panel.add(level_button1);
					
					JButton level_button2=new JButton("Medium");
					level_button2.setFont(new Font(Font.SANS_SERIF,Font.BOLD,36));
					level_button2.setBackground(Color.RED);
					level_button2.setForeground(Color.WHITE);
					level_button2.setMargin(new Insets(18,36,18,36));
						
					//When Button is Pressed
					level_button2.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
	//									new GameScreen();
	//									disposeWindow();
								}
							});
					button_panel.add(level_button2);
					
					JButton level_button3=new JButton("Hard");
					level_button3.setFont(new Font(Font.SANS_SERIF,Font.BOLD,36));
					level_button3.setBackground(Color.RED);
					level_button3.setForeground(Color.WHITE);
					level_button3.setMargin(new Insets(18,36,18,36));
						
					//When Button is Pressed
					level_button3.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
								{
	//									new GameScreen();
	//									disposeWindow();
								}
							});
					button_panel.add(level_button3);
							
				button_panel.setVisible(true);
				main_section.add(button_panel);
				
				JPanel seed_heading_panel=new JPanel();
				seed_heading_panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));
					JTextField seed_heading=new JTextField("Enter The Game Seed: (Leave It Empty For A Random Game)");
					seed_heading.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,32));
					seed_heading.setForeground(Color.DARK_GRAY);
					seed_heading.setBackground(main_section.getBackground());
					seed_heading.setBorder(BorderFactory.createEmptyBorder());
					seed_heading_panel.add(seed_heading);
				difficulty_heading_panel.setVisible(true);
				main_section.add(seed_heading_panel);
				
				JPanel enter_seed_panel=new JPanel();
				enter_seed_panel.setLayout(new FlowLayout(FlowLayout.CENTER,60,0));
					JLabel enter_seed_label=new JLabel("Seed: ");
					enter_seed_label.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,28));
					enter_seed_label.setForeground(Color.DARK_GRAY);
					enter_seed_panel.add(enter_seed_label);
					
					JTextField enter_seed_input=new JTextField(30);
					enter_seed_input.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,28));
					enter_seed_input.setForeground(Color.GRAY);
					enter_seed_panel.add(enter_seed_input);
				enter_seed_panel.setVisible(true);
				main_section.add(enter_seed_panel);
				
//				main_heading_panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 4));
				
				
				JPanel footer_space_panel=new JPanel();
				footer_space_panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
				footer_space_panel.setVisible(true);
				main_section.add(footer_space_panel);
				//Footer Button End
				
		main_section.setVisible(true);
		main_panel.add(main_section);
	}
	
	public static void main(String[] args)
	{
		new Welcome();
	}

}
