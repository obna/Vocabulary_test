package testing;
/**
 * @author OBNA
 *
 */
//package for_vocab_fun;

import java.awt.*;// we need this one for Components
import java.awt.event.*;// we need this one for ActionListener
import javax.swing.*;// we need this one for components
import java.util.*;

public class PracticeNow extends JFrame{
	//gui1
	private JLabel enterVListL;
	private JButton enterB;
	private JLabel loadVListL;
	private JButton loadB; 
	//gui2/3 enter
	private JLabel wordL;
	private JTextField wordTF;
	private JLabel defL;
	private JTextArea defTA;
	private JButton addB;
	private JButton checkB;
	private JButton testB;
	private JButton resetB;
	//	private JButton viewB;
	private JTextArea viewTA;
	private JScrollPane viewSP;
	private JLabel errorL;
	private JTextField errorTF;

	private Container myCP;

	private static int myCount=0;
	//	private ArrayList<String> myWords = new ArrayList<String>();
	private ArrayList<String> myDefinitionsList = new ArrayList<String>();
	//<def key, word value>
	private HashMap<String, String> vocabMap = new HashMap();

	public  PracticeNow() {
		super ("Practicing Vocabulary Is Fun They Said");
		setSize(550,550);
		setLocation(370,130);
		myCP = getContentPane();
		myCP.setLayout(null);
		myCP.setBackground(new Color (216,191,216));
		Font font1 = new Font(null, Font.ITALIC, 20);

		vocabMap.put("one of the first public-key\\ncryptosystems and is widely used\\nfor secure data transmission.", "RSA");
		vocabMap.put("is a systematic investment manager,\nfounded with the goal of applying\\ncutting-edge technology to the\\nda"
				+ "tarich world of finance", "Two Sigma");
		vocabMap.put("the largest e-commerce\nmarketplace and cloud \ncomputing platform in the world", "Amazon");
		vocabMap.put("A better way to design. Design,\nprototype, and gather feedback all\nin one place with","Figma");

		//gui1
		enterVListL = UtilityMethods.makeLabel(50, 100, 170, 35, "Enter Vocab List", myCP);
		enterVListL.setFont(font1);
		enterB = UtilityMethods.makeButton(100, 130, 70, 35, "ENTER", Color.black,(e-> EnterBHandler()), myCP);
		loadVListL = UtilityMethods.makeLabel(300, 100, 170, 35, "Load Vocab List", myCP);
		loadVListL.setFont(font1);
		loadB = UtilityMethods.makeButton(350, 130, 70, 35, "LOAD", Color.black, (e -> LoadBHandler()), myCP);
		//gui2/3
		wordL = UtilityMethods.makeLabel(50, 100, 100, 35, "WORD:: ", myCP);
		wordL.setFont(font1);
		wordL.setVisible(false);
		wordTF = UtilityMethods.makeTextField(149, 100, 250, 35, "", Color.black, myCP);
		wordTF.setVisible(false);
		defL = UtilityMethods.makeLabel(50, 150, 100, 35, "DEFINE:: ", myCP);
		defL.setFont(font1);
		defL.setVisible(false);
		defTA = UtilityMethods.makeTextArea(150, 150, 250, 105, "", Color.black, myCP);
		defTA.setVisible(false);
		addB = UtilityMethods.makeButton(403, 220, 40, 35, "ADD", Color.black, (e -> AddBHandler()), myCP);
		addB.setVisible(false);
		errorL = UtilityMethods.makeLabel(50, 470, 100, 35, "ERROR::" , myCP);
		errorL.setFont(font1);
		errorL.setVisible(false);
		errorTF = UtilityMethods.makeTextField(150, 470, 370, 35, "", Color.red, myCP);
		errorTF.setVisible(false);
		errorTF.setEditable(false);

		checkB = UtilityMethods.makeButton(403, 220, 55, 35, "CHECK", Color.black, (e -> CheckBHandler()), myCP);
		checkB.setVisible(false);
		checkB.setEnabled(false);
		testB = UtilityMethods.makeButton(260, 60, 55, 35, "TEST", Color.black, (e -> StartBHandler()), myCP);
		testB.setVisible(false);
		resetB = UtilityMethods.makeButton(10, 10, 165, 35, "<< From the beginning", Color.MAGENTA, (e -> ResetBHandler()), myCP);
		resetB.setEnabled(false);



		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}//windowClosing
		}); //end of definition of WindowAdapter and semicolon to end the line
	}//PracticingVocabulary constructor

	private void eraseGui() {
		enterVListL.setVisible(false);
		enterB.setVisible(false);
		loadVListL.setVisible(false);
		loadB.setVisible(false);
		wordL.setVisible(false);
		wordTF.setVisible(false);
		defL.setVisible(false);
		defTA.setText("");
		defTA.setVisible(false);
		addB.setVisible(false);
		checkB.setVisible(false);
		checkB.setEnabled(false);
		testB.setVisible(false);
		errorL.setVisible(false);
		errorTF.setText("");
		errorTF.setVisible(false);
		//		viewSP.setVisible(false);
	}//nextGui
	private void beginngingGui() {
		eraseGui();
		enterVListL.setVisible(true);
		enterB.setVisible(true);
		loadVListL.setVisible(true);
		loadB.setVisible(true);
		checkB.setVisible(false);
		resetB.setEnabled(true);
		//		viewB.setEnabled(true);
		myCP.setBackground(new Color (216,191,216));
		errorTF.setText("");
		errorTF.setForeground(Color.black);
		errorL.setForeground(Color.black);		
		resetB.setEnabled(false);
		errorL.setText("ERROR::");
		errorTF.setText("");
	}//beginningGui
	private void majorUse() {
		wordL.setVisible(true);
		wordTF.setVisible(true);
		defL.setVisible(true);
		defTA.setVisible(true);
		errorTF.setVisible(true);
		errorL.setVisible(true);
		defTA.setEditable(true);
		resetB.setEnabled(true);
		//		viewB.setEnabled(true);
	}//majorUse
	private void enterGui() {
		eraseGui();
		majorUse();
		checkB.setVisible(false);
		addB.setVisible(true);
		myCP.setBackground(new Color (218,112,214));
		errorL.setText("ERROR::");
		errorTF.setText("");
	}//enterGui

	private void practiceGui() {
		eraseGui();
		majorUse();
		defTA.setEditable(false);
		myCP.setBackground(new Color (186,85,211));
		testB.setVisible(true);
		checkB.setVisible(true);
		errorTF.setText("Click \"TEST\"");
		errorTF.setForeground(Color.black);
		errorL.setText("HINT::");
		errorL.setForeground(Color.black);
	}//practiceGui

	private void ResetBHandler() {
		beginngingGui();
	}//ResetBHandler
	private void EnterBHandler() {
		enterGui();	
	}//enterBHandler
	private void LoadBHandler() {
		practiceGui(); 
		testB.setEnabled(true);
		wordTF.setEditable(false);
	}//loadBHandler

	public void AddBHandler() {
		String vocab = wordTF.getText();
		String expl = defTA.getText();
		if(vocab.equals("")&& expl.equals("")){
			errorL.setForeground(Color.red);
			errorTF.setText("Hello Mate. Please a provide word and definition");
		}else if (!vocab.equals("") && expl.equals("")){
			errorL.setForeground(Color.red);//red label
			errorTF.setText("Hiya Buddy. Please define:: "+ wordTF.getText());//no def entered
		}else if(vocab.equals("") && !expl.equals("")){
			errorL.setForeground(Color.red);//red label
			errorTF.setText("Howdy Pal. Please give a vocabulary word ");//no def entered
		}else { 
			myDefinitionsList.add(expl);
			vocabMap.put(expl,vocab);

			wordTF.setText("");
			defTA.setText("");
			errorL.setForeground(Color.black);
			errorTF.setForeground(Color.black);
			errorTF.setText("");
		}//else
	}//addBHandler

	// Function select an element base on index  
	// and return an element 

	//
	private String getRandomDef()
	{
		Random random = new Random();
		int listSize = myDefinitionsList.size();
		int randomIndex = random.nextInt(listSize);
		return myDefinitionsList.get(randomIndex);
	}

	public void StartBHandler() {
		wordTF.setEditable(true);
		errorTF.setText("Enter the word that matches the definition");
		checkB.setEnabled(true);

		defTA.setText(getRandomDef());

		testB.setEnabled(false);
	}//StartBHandler

	public void CheckBHandler() {

		String userGuess = wordTF.getText();
		String givenDef = defTA.getText();

		if(userGuess.equals("")){
			errorTF.setText("You have to actually enter a word to study silly");			
			errorL.setForeground(Color.red);
			errorTF.setForeground(Color.red);
		}else { 
			errorL.setForeground(Color.black);
			errorTF.setForeground(Color.black);

			if((vocabMap.get(givenDef).equals(userGuess))) {

				errorTF.setText("You are correct. Press \"TEST\"");	
				checkB.setEnabled(false);
				testB.setEnabled(true);
				wordTF.setText("");
			}else {
				errorTF.setText("Incorrect. Lame. Try Again.");			
			}//else
		}//else
	}//CheckBHandler

	public static void main (String args[]) {
		PracticeNow myAppF = new PracticeNow();
	}//main
}//PracticeNow Class







