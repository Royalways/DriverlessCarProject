package org.roy.quiz.model;

public class CarInPark {
    private Park park;
    private Car car;
    
    public CarInPark() {
    	this.park = new Park();
    	this.car = new RectangularCar();
    }
    
    public CarInPark(Park park) {
    	this.park = park;
    	this.car = new RectangularCar();
    }
    
    public CarInPark(Car car) {
    	this.park = new Park();
    	this.car = car;
    }
    
    public CarInPark(Park park, Car car) {
    	this.park = park;
    	this.car = car;
    }
    
    public void move() throws Exception{
		switch (this.car.getOrientation()) {
		case EAST:
			if (this.car.getPositionX()+1>this.park.getX()) {
				throw new Exception("Moving forward may result incident.");
			}
			this.car.setPositionX(this.car.getPositionX()+1);
			break;
		case WEST:
			if (this.car.getPositionX()-1<1) {
				throw new Exception("Moving forward may result incident.");
			}
			this.car.setPositionX(this.car.getPositionX()-1);
		    break; 
		case SOUTH:
			if (this.car.getPositionY()-1<1) {
				throw new Exception("Moving forward may result incident.");
			}
			this.car.setPositionY(this.car.getPositionY()-1);
			break;
		case NORTH:
			if(this.car.getPositionY()+1>this.park.getY()) {
				throw new Exception("Moving forward may result incident.");
			}
			this.car.setPositionY(this.car.getPositionY()+1);
			break;
		}
    }
    
    public void turnClockwise() {
		switch (this.car.getOrientation()) {
		case EAST:
			this.car.setOrientation(OrientationEnum.SOUTH);
			break;
		case WEST:
			this.car.setOrientation(OrientationEnum.NORTH);
			break;
		case SOUTH:
			this.car.setOrientation(OrientationEnum.WEST);
			break;
		case NORTH:
			this.car.setOrientation(OrientationEnum.EAST);
			break;
		}
    }
    
    public void getParkMap() {
    	System.out.println("Car info: position is ("+this.car.getPositionX()+","+this.car.getPositionY()+"), orientation:"+this.car.getOrientation());
    	for(int i=0;i<this.park.getY();i++) {
    		for(int j=0;j<this.park.getX();j++) {
    			System.out.print("|");
    			if (j==this.car.getPositionX()-1 && this.park.getY()-i==this.car.positionY) {
					System.out.print("C");
				}else {
					System.out.print(" ");
				}
    		}
    		System.out.print("|");
    		System.out.println();
    	}
    }

}
