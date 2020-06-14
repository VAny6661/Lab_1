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

public class AddToList {
	public void addToList(Shell shell) {
		Composite addToListComposite = new Composite (shell, SWT.BORDER); 
		addToListComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		 Group addToListGroup = new Group(addToListComposite, SWT.NONE);
		 addToListGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
		Combo list = new Combo(addToListGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		Text listText = new Text(addToListGroup, SWT.BORDER);
		listText.pack();
		RowData listData = new RowData();
		MessageBox errorMessage = new MessageBox(shell);
		errorMessage.setText("Information");
		listData.width=150;
		Button addToListButton=new Button(addToListGroup, SWT.NONE);
		addToListButton.setText("Add Text");
		addToListButton.pack();
		addToListButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				errorMessage.setMessage("It's already exist");
				for(int i = 0; i<list.getItemCount();i++)
				if(listText.getText().equals(list.getItem(i))) {
					errorMessage.open();
					return;
				}
				list.add(listText.getText());
			}
		});

		
	}

}
