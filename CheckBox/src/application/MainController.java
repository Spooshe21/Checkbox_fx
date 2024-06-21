/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController.java
 *   Project:  CheckBox
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * MainController class handles the user interface for selecting checkboxes and
 * displaying the selected items and their count.
 */
public class MainController {

	// CheckBox UI components
	@FXML
	private CheckBox cb1;

	@FXML
	private CheckBox cb2;

	@FXML
	private CheckBox cb3;

	@FXML
	private CheckBox cb4;

	// Label UI components to display selected items and their count
	@FXML
	private Label lbllist;

	@FXML
	private Label lblcount;

	/**
	 * Handles the action event triggered by selecting or deselecting checkboxes.
	 * Updates the label to show the number of selected items and their names.
	 *
	 * @param event the action event triggered by checkbox selection
	 */
	public void checkEvent(ActionEvent event) {
		int count = 0; // Variable to store the count of selected items
		String message = ""; // Variable to store the names of selected items

		// Check if each checkbox is selected and update count and message accordingly
		if (cb1.isSelected()) {
			count++;
			message += cb1.getText() + "\n";
		}

		if (cb2.isSelected()) {
			count++;
			message += cb2.getText() + "\n";
		}

		if (cb3.isSelected()) {
			count++;
			message += cb3.getText() + "\n";
		}

		if (cb4.isSelected()) {
			count++;
			message += cb4.getText() + "\n";
		}

		// Update the labels with the count of selected items and their names
		lblcount.setText("Items selected: " + count);
		lbllist.setText(message);
	}
}
