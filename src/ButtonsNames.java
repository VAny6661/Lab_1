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

public class ButtonsNames {
	public void changeButtonsName(Shell shell) {
		Composite changeButtonsName = new Composite (shell, SWT.BORDER); 
		changeButtonsName.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		 Group renameButtonsGroup = new Group(changeButtonsName, SWT.NONE);
		 renameButtonsGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
	        
		Text buttonNameAfterPress = new Text(renameButtonsGroup, SWT.BORDER);
		RowData buttonNameAfterPressData = new RowData();
		buttonNameAfterPress.setLayoutData(buttonNameAfterPressData);
		buttonNameAfterPress.pack();
		
		Button setTextButton = new Button(renameButtonsGroup, SWT.NONE);
		setTextButton.pack();
		setTextButton.setText("SetThisButtonNameFromTextFieldButton");
		Button swapButtonsNamesButton = new Button(renameButtonsGroup, SWT.NONE);
		swapButtonsNamesButton.pack();
		swapButtonsNamesButton.setText("SwapButtonsNamesButton");
		setTextButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				setTextButton.setText(buttonNameAfterPress.getText());}
	});
		
		swapButtonsNamesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				String buff = swapButtonsNamesButton.getText();
				swapButtonsNamesButton.setText(setTextButton.getText());
				setTextButton.setText(buff);
			}});
		
	}

}
