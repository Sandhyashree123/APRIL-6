package methodoverload.com;

public class AxisBank2 extends  BAnk1  {

	public void savings() {
		System.out.println("45%");
	}

	@Override
	public void Bankemployeesalary() {
		// TODO Auto-generated method stub
		System.out.println("4000");
	}
	@Override
	public void Bankemployeeage() {
		// TODO Auto-generated method stub
		System.out.println("34");
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AxisBank2  a = new AxisBank2 ();
			a.savings();
			a.Bankemployeeage();
			a.Bankemployeesalary();
		}
	}
