
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
//��װ�����ǰ����ݺͶ���Щ���ݵĲ�������һ�𣬲�������Щ�����������ڸ����������������Ļ�������֮һ��Ҳ������ĵĸ��
//������һ���ǳ�ֱ���˵����ֶ�����֤�������Ƶ�ʱ��������װ��
//���еĳ�Ա����������private�ģ������ͱ����������ʹ������ڲ����ݣ�
//����public�ĺ�����ֻ������ʵ�������Ķ�������Լ�Ҫ�ṩ�ķ���ģ�����������ֱ�ӷ������ݵġ�
//���Ƕ����ݵķ��ʾ�������༰����ķ��񡣼򵥵�˵����ÿ����Ա�����ṩһ�����ڶ�д��get/set����Ҳ�ǲ����ʵ���ơ�
