package in.madhav;

public class Car {

	
	private IEngine eng;
	
	public Car() {
		System.out.println("zero::car");
	}
	
	public Car(IEngine eng) {
		this.eng=eng;
		System.out.println("parm::car");
	}
	
	
	public void drive() {
		
		int status=eng.start();
		
		if(status>0){
			System.out.println("engine startede..");
		}
		else {
			System.out.println("problem in engine!!!!");
		}
	}
}
