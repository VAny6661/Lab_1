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

public class CheckCheckBoxes {
	public void CheckBoxButtons(Shell shell) {
		Composite checkBoxComposite = new Composite (shell, SWT.BORDER); 
		checkBoxComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		
        Group checkBoxesGroup = new Group(checkBoxComposite, SWT.NONE);
        checkBoxesGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
        
    	MessageBox errorMessage = new MessageBox(shell);
		errorMessage.setText("Information");
		
		Text checkButtonNamesText = new Text(checkBoxComposite, SWT.BORDER);
		RowData checkButtonNamesTextData = new RowData();
		checkButtonNamesText.setLayoutData(checkButtonNamesTextData);
		checkButtonNamesText.pack();
		
		Button checkCheckButtonNamesButton = new Button(checkBoxComposite, SWT.NONE);
		checkCheckButtonNamesButton.pack();
		checkCheckButtonNamesButton.setText("CheckCheckBoxes");
		
		Button checkBox1 = new Button(checkBoxesGroup, SWT.RADIO);
		checkBox1.setText("CheckBox 1");
		checkBox1.pack();
		Button checkBox2 = new Button(checkBoxesGroup, SWT.RADIO);
		checkBox2.pack();
		checkBox2.setText("CheckBox 2");
		Button checkBox3 = new Button(checkBoxesGroup, SWT.RADIO);
		checkBox3.pack();
		checkBox3.setText("CheckBox 3");
		checkCheckButtonNamesButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				errorMessage.setMessage("It's doesn't exist");
				if(checkButtonNamesText.getText().equals(checkBox1.getText())){
					if(checkBox1.getSelection() == false) {
						checkBox1.setSelection(true);
					return;
				}
					else {
						checkBox1.setSelection(false);
						return;}}
				if(checkButtonNamesText.getText().equals(checkBox2.getText())){
					if(checkBox2.getSelection() == false) {
						checkBox2.setSelection(true);
						return;
					}
					else {
						checkBox2.setSelection(false);
						return;}
					}
				if(checkButtonNamesText.getText().equals(checkBox3.getText())){
					if(checkBox3.getSelection() == false) {
						checkBox3.setSelection(true);
						return;}
					else {
						checkBox3.setSelection(false);
						return;
					}}
				errorMessage.open();
		}});
		
	}

}
