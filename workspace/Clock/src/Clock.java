
public class Clock {
	private Display hour= new Display(24);
	private Display minute= new Display(60);
	
	public void start()
	{
		while(true)
		{
			minute.increace();
			if (minute.getvalue()==0)
			{
				hour.increace();
			}
			System.out.printf("%02d:%02d\n", hour.getvalue(),minute.getvalue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock=new Clock();
		clock.start();
				
	}

}
//封装，就是把数据和对这些数据的操作放在一起，并且用这些操作把数据掩盖起来，是面向对象的基本概念之一，也是最核心的概念。
//我们有一个非常直截了当的手段来保证在类的设计的时候做到封装：
//所有的成员变量必须是private的，这样就避免别人任意使用你的内部数据；
//所有public的函数，只是用来实现这个类的对象或类自己要提供的服务的，而不是用来直接访问数据的。
//除非对数据的访问就是这个类及对象的服务。简单地说，给每个成员变量提供一对用于读写的get/set函数也是不合适的设计。
