import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Shell;

public class ROWLAYOUT {
	public void Layout(Shell shells){
		RowLayout rowLayout = new RowLayout();
		rowLayout.spacing = 50;
		rowLayout.marginLeft = 10;
		rowLayout.marginTop = 10;
		shells.setLayout(rowLayout);
	}
}
