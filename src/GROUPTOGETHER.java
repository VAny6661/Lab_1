import java.util.ArrayList;


import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class GROUPTOGETHER {

	public void MainShell() {
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
		
		GROUP1 group1 = new GROUP1();
		group1.AddToComboBox(mainShell);
		Group_2 group2 = new Group_2();
		group2.ChangeButtonsName(mainShell);
		GROUP3 group3 = new GROUP3();
		group3.RadioButtons(mainShell);
		GROUP4 group4 = new GROUP4();
		group4.CheckBoxButtons(mainShell);
		GROUP5 group5 = new GROUP5();
		group5.MoveTable(mainShell);	
		
		ArrayList<Shell> allShells = new ArrayList<Shell>();
		allShells.add(mainShell);
		allShells.add(addToComboBoxShell);
		allShells.add(changeButtonsNameShell);
		allShells.add(radioButtonsShell);
		allShells.add(checkBoxButtonsShell);
		allShells.add(tableShell);
		Shells_open Shells = new Shells_open();
		Shells.ShellsChanges(allShells, display);
		mainShell.open();
		
		while(!mainShell.isDisposed()) {
			if(!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
		}
	}
