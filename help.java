package help;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class help extends JFrame {

 private JPanel contentPane;
 int Textlength = 0;
 Timer t;
 int i = 0;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     help frame = new help();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the frame.
  */
 public help() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 1200, 1000);
  contentPane = new JPanel();
  contentPane.setBackground(Color.WHITE);
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  
  JTextArea textArea = new JTextArea(2, 20);
	textArea.setForeground(Color.BLACK);
	textArea.setText("Stracheship Presentation\r\n" + 
			"\r\n" + 
			"Main idea\r\n" + 
			"\r\n" + 
			"Stracheship is a competitive game, a variation of the known games of chess, ship naval battles. Basically is a combination of those two games as the name shall clarify.\r\n" + 
			"\r\n" + 
			"Stra from strategy that it should use\r\n" + 
			"\r\n" + 
			"Ches from chess\r\n" + 
			"\r\n" + 
			"And ship from naval battles.\r\n" + 
			"\r\n" + 
			"In this game two players compete for the domination of the sea. Main goal is to destroy all the ships of competitor.\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"Play area\r\n" + 
			"\r\n" + 
			"Stracheship is taking place in two 10x10 tables. Each player has his own table.\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"FLEET\r\n" + 
			"\r\n" + 
			"Each player is given a number of troops. Specifically each player has five ships each one of them with a different length and stamina.\r\n" + 
			"\r\n" + 
			"They have one small ship which withholds two places in the  table and can endures two attacks of enemy troops.\r\n" + 
			"\r\n" + 
			"Two normal ships with three places in the warzone and stamina of three lifes.\r\n" + 
			"\r\n" + 
			"Two large ships with four places and stamina of 4 enemy attacks.\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"Movement\r\n" + 
			"\r\n" + 
			"Ships can be placed either horizontally or vertically. If a ship is horizontally placed\r\n" + 
			"\r\n" + 
			"It can only move right or left. In the opposite, if it is placed vertically it can only move up or down by size of the table.\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"Deities\r\n" + 
			"\r\n" + 
			"Players represent a god from Greek mythology. They choose the deity before the game starts. They cannot choose the same. Each one of them has different power of attack and defense accordingly his role in mythology. The deities they can choose is zeus , artemis , ares and Poseidon. More specifically :\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Zeus\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Attack = As the god of thunders in his attacks he chooses a ship of the enemy troops and\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"either he destroys it or only leaves it with one life. If the ship is small or normal it gets full destroyed, if it is large it is left with stamina of one hit.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"His attacks ,however, cannot pass the defense of Poseidon but can go through the defense of Aris.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Defense = Being the father of all gods he can raise a ship that is destroyed back to life with full stamina.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Artemis\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Attack :\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"As the goddess of hunt she picks a line out of ten and throws an arrow among that line. Everything in the way of the arrow gets hit.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Defense:\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Goddess of care and protector of children, she can pick a ship of hers which is not destroyed and full its stamina.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Ares\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Attack:\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"God of war. His attack matches his role in mythology, every ship of the enemy gets hit one time losing one point on its stamina.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Defense:\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Being the god of war he protects his warriors. He chooses a ship of his own and shields it. The enemy has to hit each block of the shield ship two times to destroy it.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Poseidon\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Attack:\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"God of sea. He chooses a ship of the enemy. That ship appears in a new different table(10x10)/sea. Now the player knows the specific place of that ship. However the player cannot know how much life/stamina that ship contains.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Defense:\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \"Picks coordinates x,y in the table. Those coordinates form the top left corner of a new 4x4 table which is created. Every ship in this table is being protected by enemy attacks for four rounds.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Game instructions\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Each player has his own round. In this round the player has five available movements . He can choose in every move if he wants to move a ship of his or to hit in a block of the enemy table so as to hit enemy troops. When those five movements end player gets to choose either to give turn in enemy or to use god power . If he chooses god then he picks attack or defense accordingly to his plans. When god power ends he has to choose to give turn so he cannot see the table of his enemy. Also, player can win any time. Not all movements must be used.  \\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"In case in which he hits an enemy ship a sound will be made so the player knows he actually hit a block that contains part of the ship.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Screen of the player contains his table(sea), ships. When he clicks in a ship it also shows its stamina and type of sea(small, normal, large).\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"All ships have the same color. For reasons of convenience the ship you click gets more dark.\\r\\n\" + \r\n"
			+ "    				\"\\r\\n\" + \r\n"
			+ "    				\"Players also have a map of enemy table which shows the blocks he has hit with a black color.  So, every time he presses the button “hit” in his screen he knows his previous hits.");
	
	
	textArea.setWrapStyleWord(true);
	textArea.setLineWrap(false);
	textArea.setOpaque(false);
	textArea.setEditable(false);
	textArea.setFocusable(true);
	textArea.setBounds(0, 0, 2000, 2100);
	textArea.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 14));
	contentPane.add(textArea);
	String txt = textArea.getText();
	Textlength = txt.length();
	t = new Timer(1, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			i++;
			if(i < Textlength + 1) {
				textArea.setText(txt.substring(0,i));
				}
			}
		});
  t.start();
  } 
}