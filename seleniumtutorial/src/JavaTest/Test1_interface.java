package JavaTest;

interface fruits{
void display();
}

interface apple extends fruits{
	void display1();
}

interface orange extends apple{
	@Override
	void display1();	
}

public class Test1_interface implements orange{
	@Override
	public void display() {
		System.out.println("here its fruits");		
	}
	@Override
	public void display1() {
		System.out.println("here its orange and apple");		
	}
	public static void main(String[] args) {
		orange ornge = new Test1_interface();
		ornge.display1();
	}

}
