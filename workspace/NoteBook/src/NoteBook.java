import java.util.ArrayList;

public class NoteBook {
	private ArrayList<String> notes= new ArrayList<String>();
	public void add(String s)
	{
		notes.add(s);
	}
	
	public int getsize(){
		return notes.size();
	}
	
	public String getnote(int index){
		return notes.get(index);
	}
	
	public void removenote(int index){
		 notes.remove(index);
	}
	
	public String[] list(){
		
		String[] a = new String[notes.size()];
		notes.toArray(a);
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		nb.add("thrid");
		System.out.println(nb.getsize());
		System.out.println(nb.getnote(0));
		nb.removenote(1);
		String[] a= nb.list();
		for(String s:a){
			System.out.println(s);
		}
		
	}

}
