package org.roy.quiz.model;

public abstract class Car{

	protected CarShapeEnum shape;
	protected int positionX;
	protected int positionY;
	protected OrientationEnum orientation;

	public CarShapeEnum getShape() {
		return shape;
	}
	public void setShape(CarShapeEnum shape) {
		this.shape = shape;
	}
	public int getPositionX() {
		return positionX;
	}
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	public int getPositionY() {
		return positionY;
	}
	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}
	public OrientationEnum getOrientation() {
		return orientation;
	}
	public void setOrientation(OrientationEnum orientation) {
		this.orientation = orientation;
	}
}
