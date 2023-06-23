package telran.exceptions;

public class BallBrokenFloor {
	private int floor;
	
	public BallBrokenFloor(int nFloors) {
		
		floor = (int) (1 + Math.random() * nFloors);//random number in the range [1, nFloors]
	}
	public void broken(int floor) throws Exception {
		if(floor <= this.floor) {
			throw new Exception(); 
			
		}
	}
	public int getFloor() {
		return floor;
	}
	
	
}
