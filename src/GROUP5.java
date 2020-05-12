import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class GROUP5 {
	public void MoveTable(Shell shell) {
		Composite tableGroup = new Composite (shell, SWT.BORDER); 
		tableGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
		
    	MessageBox tableErrorMessage = new MessageBox(shell);
    	tableErrorMessage.setText("Information");
    	
		Text tableText = new Text(tableGroup, SWT.BORDER);
		RowData tableTextData = new RowData();
		tableText.setLayoutData(tableTextData);
		tableText.pack();
		
		Button addToTableButton = new Button(tableGroup, SWT.NONE);
		Button changeToSecondRowButton = new Button(tableGroup, SWT.NONE);
		addToTableButton.pack();
		addToTableButton.setText("ADD");
		
		changeToSecondRowButton.setText("-->");
		changeToSecondRowButton.pack();
		Button changeToFirstRowButton = new Button(tableGroup, SWT.NONE);
		
		changeToFirstRowButton.pack();
		changeToFirstRowButton.setText("<--");
		
		
		Table table = new Table(tableGroup, SWT.MULTI | SWT.BORDER
		        | SWT.FULL_SELECTION);
         table.setHeaderVisible(true);
         String[] titles = { "Col 1", "Col 2"};
       	    
       	for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
       	    TableColumn column = new TableColumn(table, SWT.NULL);
       	    column.setText(titles[loopIndex]);
       	 }
       	for (int i = 0; i < titles.length; i++) {
            TableColumn column = new TableColumn(table, SWT.NONE);
            column.setText(titles[i]);
          }
       	
       	for (int i = 0; i < 6; i++) {
            TableItem item = new TableItem(table, SWT.NONE);
          }

       	      for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
       	        table.getColumn(loopIndex).pack();
       	      }
       	      
       	      
       	   addToTableButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent arg0) {
					for(int i = 0;i<table.getItemCount();i++) {
						if(table.getItem(i).getText(0).isEmpty() & table.getItem(i).getText(1).isEmpty()) {
						table.getItem(i).setText(0,tableText.getText());
						break;}}
			}});
       	   
       	   
       	changeToSecondRowButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				if(table.getSelectionIndex()!=-1)
					if(table.getItem(table.getSelectionIndex()).getText(1).isEmpty()) {
					table.getItem(table.getSelectionIndex()).setText(1,table.getItem(table.getSelectionIndex()).getText(0));
					table.getItem(table.getSelectionIndex()).setText(0,"");
			}}
		});
       	
       	
       	changeToFirstRowButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent arg0) {
				if(table.getSelectionIndex()!=-1)
					if(table.getItem(table.getSelectionIndex()).getText(0).isEmpty()) {
					table.getItem(table.getSelectionIndex()).setText(0,table.getItem(table.getSelectionIndex()).getText(1));
					table.getItem(table.getSelectionIndex()).setText(1,"");}
			}
		});
	}

}
