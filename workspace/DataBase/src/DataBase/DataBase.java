package DataBase;
import java.util.ArrayList;

public class DataBase {
	private ArrayList<CD> listCD =new ArrayList<CD>();
	public void add(CD cd){
		listCD.add(cd);
	}
	
	public void list(){
		
		listCD.print(cd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "DataBase [listCD=" + listCD + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
