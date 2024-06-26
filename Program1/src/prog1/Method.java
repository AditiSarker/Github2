package prog1;

public class Method {
	
	void Addnumbers() {
		System.out.println("Method created");
		
	}

	public static void main(String[] args) {
		
		Method obj = new Method();
		M1 obj1 = new M1();
		M2 obj2 = new M2();
		obj1.Addnumbers();
		obj1.Substraction();
		obj1.Multiplication();
		System.out.println("Sum is: "+obj2.info());
		System.out.println("Addition is: "+obj2.sum(2,3));
		System.out.println("Addition is: "+obj2.sum(5,3));

	}

}
