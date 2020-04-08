package testing;

//package for_vocab_fun;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UtilityMethods {

	/**
	 * does all the work to construct a JButton using parameters
	 * @param theX horizontal component of upper left corner of the JButton
	 * @param theY vertical component of the upper left corner of the JButton
	 * @param theWidth horizontal dimension of the JButton
	 * @param theHeight vertical dimension of the JButton
	 * @param theText label that appears on the JButton
	 * @param theForeground color of the text that appears on the JButton
	 * @param theHandler the ActionListener of the JButton
	 * @param theContainer who adds this JButton
	 * @return the constructed JButton
	 */
	public static JButton makeButton(int theX, int theY, int theWidth, int theHeight,
			String theText, Color theForeground, ActionListener theHandler,
			Container theContainer){
		JButton toReturn = new JButton(theText);
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.setForeground(theForeground);
		theContainer.add(toReturn);//myCP
		toReturn.addActionListener(theHandler);
		return toReturn;

	}//makeButton

	/**
	 * does all the work to construct a JButton using parameters
	 * @param theX horizontal component of upper left corner of the JButton
	 * @param theY vertical component of the upper left corner of the JButton
	 * @param theWidth horizontal dimension of the JButton
	 * @param theHeight vertical dimension of the JButton
	 * @param theText label that appears on the JButton
	 * @param theForeground color of the text that appears on the JButton
	 * @param theHandler the ActionListener of the JButton
	 * @param theContainer who adds this JButton
	 * @param enabledOrNot true is initially enabled, false if not
	 * @return the constructed JButton
	 */
	public static JButton makeButton(int theX, int theY, int theWidth, int theHeight,
			String theText, Color theForeground, ActionListener theHandler,
			Container theContainer, boolean enabledOrNot){
		JButton toReturn = new JButton(theText);
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.setForeground(theForeground);
		theContainer.add(toReturn);//myCP
		toReturn.addActionListener(theHandler);
		toReturn.setEnabled(enabledOrNot);
		return toReturn;
	}//makeButton
	public static JLabel makeLabel(int theX, int theY, int theWidth, int theHeight,
			String theText, Container theContainer) {
	JLabel toReturn = new JLabel(theText);
	toReturn.setSize(theWidth, theHeight);
	toReturn.setLocation(theX, theY);
	theContainer.add(toReturn);//myCP
	return toReturn;
	}//makeLabel
	public static JTextField makeTextField(int theX, int theY, int theWidth, int theHeight,
			String theText,Color theForeground, Container theContainer ) {//
		JTextField toReturn = new JTextField(theText);
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.setForeground(theForeground);
		theContainer.add(toReturn);//myCP
		return toReturn;
	}//makeTextField
	public static JTextArea makeTextArea(int theX, int theY, int theWidth, int theHeight,
			String theText,Color theForeground, Container theContainer ) {//
		JTextArea toReturn = new JTextArea(theText);
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.setForeground(theForeground);
		theContainer.add(toReturn);//myCP
		//toReturn.setEnabled(resetOrNot);
		return toReturn;
	}//makeTextArea
	public static JComboBox<String> makeComboBox(int theX, int theY, int theWidth, int theHeight,
			ActionListener theHandler, Container theContainer ) {
		JComboBox<String> toReturn = new JComboBox<>();
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.addActionListener(theHandler);
		theContainer.add(toReturn);//myCP
		return toReturn;
	}//makeComboBox
	public static JComboBox<String> makeComboBox(int theX, int theY, int theWidth, int theHeight,
			String [] theStrings, ActionListener theHandler, Container theContainer ) {
		JComboBox<String> toReturn = new JComboBox<>(theStrings);
		toReturn.setSize(theWidth, theHeight);
		toReturn.setLocation(theX, theY);
		toReturn.addActionListener(theHandler);
		theContainer.add(toReturn);//myCP
		return toReturn;
	}//makeComboBox
}//makeComboBox

