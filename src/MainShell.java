import java.util.ArrayList;


import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class MainShell {

	public void mainShell() {
		Display display = new Display();
		
		
		Shell mainShell = new Shell(display);
		Shell addToComboBoxShell = new Shell(display);
		Shell changeButtonsNameShell = new Shell(display);
		Shell radioButtonsShell = new Shell(display);
		Shell checkBoxButtonsShell = new Shell(display);
		Shell tableShell = new Shell(display);
		
		mainShell.setText("Main window");
		
		ROWLAYOUT layout = new ROWLAYOUT();
		layout.Layout(mainShell);
		layout.Layout(addToComboBoxShell);
		layout.Layout(changeButtonsNameShell);
		layout.Layout(radioButtonsShell);
		layout.Layout(checkBoxButtonsShell);
		layout.Layout(tableShell);
		
		AddToList addToList = new AddToList();
		addToList.addToList(mainShell);
		ButtonsNames buttonsName = new ButtonsNames();
		buttonsName.changeButtonsName(mainShell);
		CheckRadioButtons checkRadioButtons = new CheckRadioButtons();
		checkRadioButtons.radioButtons(mainShell);
		CheckCheckBoxes checkCheckBoxes = new CheckCheckBoxes();
		checkCheckBoxes.CheckBoxButtons(mainShell);
		FillTable fillTable = new FillTable();
		fillTable.MoveTable(mainShell);	
		
		ArrayList<Shell> allShells = new ArrayList<Shell>();
		allShells.add(mainShell);
		allShells.add(addToComboBoxShell);
		allShells.add(changeButtonsNameShell);
		allShells.add(radioButtonsShell);
		allShells.add(checkBoxButtonsShell);
		allShells.add(tableShell);
		SeparatedShells Shells = new SeparatedShells();
		Shells.ShellsChanges(allShells, display);
		mainShell.open();
		
		while(!mainShell.isDisposed()) {
			if(!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
		}
	}
