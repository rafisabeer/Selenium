package JavaTest;
interface employee{
	void salary();
	void bonus();
}
public class practice implements employee {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 practice q=new practice();
 q.bonus();
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary");
	}

	@Override
	public void bonus() {
		int a=5;
		// TODO Auto-generated method stub
		System.out.println("bonus"+a);
		
	}

}
