import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class CheckRadioButtons {
	public void radioButtons(Shell shell) {
		Composite radioButtonsComposite = new Composite (shell, SWT.BORDER); 
		radioButtonsComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
        Group radioButtonsGroup = new Group(radioButtonsComposite, SWT.NONE);
        radioButtonsGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
        
		Text radioButtonsNames = new Text(radioButtonsGroup, SWT.BORDER);
		RowData radioButtonsNamesData = new RowData();
		radioButtonsNames.setLayoutData(radioButtonsNamesData);
		radioButtonsNames.pack();
		
		MessageBox errorMessage = new MessageBox(shell);
		errorMessage.setText("Information");
		
		Button checkSwitchNameButton = new Button(radioButtonsGroup, SWT.NONE);
		checkSwitchNameButton.pack();
		checkSwitchNameButton.setText("Enter a switch name");
		Button switch1 = new Button(radioButtonsGroup, SWT.RADIO);
		switch1.setText("switch 1");
		switch1.pack();
		Button switch2 = new Button(radioButtonsGroup, SWT.RADIO);
		switch2.pack();
		switch2.setText("switch 2");
		Button switch3 = new Button(radioButtonsGroup, SWT.RADIO);
		switch3.pack();
		switch3.setText("switch 3");
		
		
		checkSwitchNameButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				errorMessage.setMessage("It's doesn't exist");
				if(radioButtonsNames.getText().equals(switch1.getText())){
					if(switch1.getEnabled()) {
						switch1.setSelection(true);
						switch2.setSelection(false);
						switch3.setSelection(false);
						return;
				}}
				if(radioButtonsNames.getText().equals(switch2.getText())){
					if(switch2.getEnabled()) {
						switch2.setSelection(true);
						switch1.setSelection(false);
						switch3.setSelection(false);
						return;
					}}
				if(radioButtonsNames.getText().equals(switch3.getText())){
					if(switch3.getEnabled()) {
						switch3.setSelection(true);
						switch1.setSelection(false);
						switch2.setSelection(false);
						return;
					}}
				errorMessage.open();
		}});
		
	}

}
