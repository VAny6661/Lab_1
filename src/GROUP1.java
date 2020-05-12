import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class GROUP1 {
	public void AddToComboBox(Shell shell) {
		Composite comboBoxes = new Composite (shell, SWT.BORDER); 
		comboBoxes.setLayout(new RowLayout(SWT.HORIZONTAL));
		 Group comboBoxesGroup = new Group(comboBoxes, SWT.NONE);
		 comboBoxesGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
		Combo list = new Combo(comboBoxesGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		Text addedToListAfterButtonPress = new Text(comboBoxesGroup, SWT.BORDER);
		addedToListAfterButtonPress.pack();
		RowData listData = new RowData();
		MessageBox errorMessage = new MessageBox(shell);
		errorMessage.setText("Information");
		listData.width=150;
		Button addToListButton=new Button(comboBoxesGroup, SWT.NONE);
		addToListButton.setText("Add Text");
		addToListButton.pack();
		addToListButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				errorMessage.setMessage("It's already exist");
				for(int i = 0; i<list.getItemCount();i++)
				if(addedToListAfterButtonPress.getText().equals(list.getItem(i))) {
					errorMessage.open();
					return;
				}
				list.add(addedToListAfterButtonPress.getText());
			}
		});

		
	}

}
