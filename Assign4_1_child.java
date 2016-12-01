import Assign_newpaack4.ClassAssign4_1;//importing package
public class Assign4_1_child extends ClassAssign4_1 {//extending class

	public static void main(String[] args) {
		
		String add;
		
		Assign4_1_child obj = new Assign4_1_child();//creating object of child class
		
		add = obj.address();//calling parent class method using child class	
		
		System.out.println(add);
	}

}