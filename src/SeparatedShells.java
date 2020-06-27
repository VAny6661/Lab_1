
import java.util.ArrayList;import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

public class SeparatedShells {
	int i = -2;
	private Runnable task;
	public void ShellsChanges(ArrayList<Shell> allShells, Display display) {;
	AddToList group1 = new AddToList();
	group1.addToList(allShells.get(1));
	ButtonsNames group2 = new ButtonsNames();
	group2.changeButtonsName(allShells.get(2));
	CheckRadioButtons group3 = new CheckRadioButtons();
	group3.radioButtons(allShells.get(3));
	CheckCheckBoxes group4 = new CheckCheckBoxes();
	group4.CheckBoxButtons(allShells.get(4));
	FillTable group5 = new FillTable();
	group5.MoveTable(allShells.get(5));	
	
	allShells.get(1).setSize(300, 150);
	allShells.get(2).setSize(500, 150);
	allShells.get(3).setSize(500, 150);
	allShells.get(4).setSize(350, 150);
	allShells.get(5).setSize(300, 300);
	
	Listener displayListener = new Listener() {
		public void handleEvent(Event e) {
			if((e.stateMask & SWT.CTRL)==SWT.CTRL & e.keyCode == 'r') {
				Display.getDefault().timerExec(1000, task);
			}
			if((e.stateMask & SWT.ALT)==SWT.ALT & e.keyCode == 'r') {
				Display.getDefault().timerExec(-1, task);
				allShells.get(5).setFocus();}
		}
   };
   for(int j= 1;j<6;j++) {
   allShells.get(j).addListener(SWT.Close, new Listener() {
	      public void handleEvent(Event event) {
	        event.doit = false;
	      }
	    });}
   
	 display.addFilter(SWT.KeyUp, displayListener);
		
		       task = () -> {
		    	  if(display.getShells().length != 6)
		    		  display.removeFilter(SWT.KeyUp, displayListener);
				if(i == -2) {
					allShells.get(0).setVisible(false);
					allShells.get(1).setVisible(true);
					allShells.get(2).setVisible(true);
					allShells.get(3).setVisible(true);
					allShells.get(4).setVisible(true);
					allShells.get(5).setVisible(true);
					}
				if(i == -1) {						
					allShells.get(1).setLocation(900, 50);
					allShells.get(2).setLocation(1300, 400);
					allShells.get(3).setLocation(1100, 750);
					allShells.get(4).setLocation(500, 700);
					allShells.get(5).setLocation(500, 200);}
				
				allShells.get(1).setFocus();
				
				if(i == 0) 	allShells.get(1).setVisible(false);
				if(i == 1) 	allShells.get(2).setVisible(false);
			    if(i == 2) 	allShells.get(3).setVisible(false);
				if(i == 3) 	allShells.get(4).setVisible(false);
				if(i == 4) 	allShells.get(5).setVisible(false);
				if(i == 5) 	allShells.get(0).setVisible(true);
				i++;
				if(i == 6) i = -2;
				Display.getDefault().timerExec(1000,this.task);};		 
}}
	
