import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Group_2 {
	public void ChangeButtonsName(Shell shell) {
		Composite changeButtonsName = new Composite (shell, SWT.BORDER); 
		changeButtonsName.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		 Group changeButtonsNameGroup = new Group(changeButtonsName, SWT.NONE);
		 changeButtonsNameGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
	        
		Text buttonNameAfterPress = new Text(changeButtonsNameGroup, SWT.BORDER);
		RowData buttonNameAfterPressData = new RowData();
		buttonNameAfterPress.setLayoutData(buttonNameAfterPressData);
		buttonNameAfterPress.pack();
		
		Button setThisButtonNameFromTextFieldButton = new Button(changeButtonsNameGroup, SWT.NONE);
		setThisButtonNameFromTextFieldButton.pack();
		setThisButtonNameFromTextFieldButton.setText("SetThisButtonNameFromTextFieldButton");
		Button swapButtonsNamesButton = new Button(changeButtonsNameGroup, SWT.NONE);
		swapButtonsNamesButton.pack();
		swapButtonsNamesButton.setText("SwapButtonsNamesButton");
		setThisButtonNameFromTextFieldButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				setThisButtonNameFromTextFieldButton.setText(buttonNameAfterPress.getText());}
	});
		
		swapButtonsNamesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				String buff = swapButtonsNamesButton.getText();
				swapButtonsNamesButton.setText(setThisButtonNameFromTextFieldButton.getText());
				setThisButtonNameFromTextFieldButton.setText(buff);
			}});
		
	}

}
