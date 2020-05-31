package org.roy.quiz.model;

public class RectangularCar extends Car{
	
	public RectangularCar() {
		this.shape = CarShapeEnum.RECTANGULAR;
		this.positionX = 1;
		this.positionY = 1;
		this.orientation = OrientationEnum.NORTH;
	}
	
	public RectangularCar(OrientationEnum orientation, Park park) {
		this.shape = CarShapeEnum.RECTANGULAR;
		this.positionX = 1;
		this.positionY = 1;
		this.orientation = orientation;
	}
}
