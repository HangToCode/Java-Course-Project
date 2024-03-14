//Name: Li Hang Biao
//Lab: 11A

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
import java.io.File;
import java.util.TreeMap;

public class EditHandler extends FileHandler implements ActionListener  {

	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Edit")) {
			JOptionPane.showMessageDialog(null, "You clicked on Edit");
			String userInput = JOptionPane.showInputDialog(null, "Enter your word input");
			addIn(userInput);
			

		} else if (menuName.equals("Clear")) { //Clear treemap and textbox
			JOptionPane.showMessageDialog(null, "You Cleared the TreeMap and all 6 textBoxs");
			clearAllThings();
			
		}
	} // actionPerformed
	
	public void addIn(String arr) {
		String [] stringChange = arr.split(" "); //Convert string to array string 
		for (int i = 0; i < stringChange.length; i++) {
			Word w = new Word(stringChange[i]);
			if(w.word != null) theInput.add(w);
		}
		TreeMap<Word, Word> treeMap = theInput.getWordMap();
		WordGui.taskWordGui(treeMap); // This pass the array to WordGui where it will print out the sorted


	}
	
	public void clearAllThings() {
		theInput.mapClear(); // Clear the TreeMap
		WordGui.clearText(); // This pass the array to WordGui where it will print out the sorted

	}
	
}
