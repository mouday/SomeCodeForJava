package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class KCBData implements TableModel {
	private String[] title={
		"周一","周二","周三","周四","周五","周六","周日"
	};
	private String[][] data= new String[8][7];
	
	public  KCBData() 
	{
		// TODO Auto-generated constructor stub
		for (int i=0;i<data.length;i++)
		{
			for (int j=0;j<data[i].length;j++)
			{
				data[i][j]="";
			}
		}
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 7;
	}

	@Override
	public String getColumnName(int arg0) {
		// TODO Auto-generated method stub
		return title[arg0];
	}

	@Override
	public Class<?> getColumnClass(int arg0) {
		// TODO Auto-generated method stub
		return String.class;
	}

	@Override
	public boolean isCellEditable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		data[rowIndex][columnIndex]=(String)aValue;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub

	}

}
