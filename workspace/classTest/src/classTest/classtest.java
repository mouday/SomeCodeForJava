package classTest;

public class classtest {
	public static void main(String []args)
	{
		SuperClass s =new SubClass();
		System.out.println(s.getValue());
		
		s=new SuperClass();
		System.out.println(s.getValue());
		
	}
}
 class SuperClass
 {
    int i=5;
	public int getValue(){
		return i;
		}
}
 class SubClass extends SuperClass{
	 int j;
	 public SubClass()
	 {
		 this(-3);
		 
	 }
	 public SubClass(int i)
	 {
		 this.j=i;
	 }
	 
	 public int getValue()
	 {
		 return j;
		 
	 }
}