package com.nasa.mars.model;

import com.nasa.mars.enums.OrientationsEnum;

public class Robot {
	
	private int x;
	private int y;
	private OrientationsEnum orientation;
	private int xmax;
	private int ymax;
	
	public Robot(int x, int y, OrientationsEnum orientation, int xmax, int ymax){
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		this.xmax = xmax;
		this.ymax = ymax;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public OrientationsEnum getOrientation() {
		return orientation;
	}

	public void setOrientation(OrientationsEnum orientation) {
		this.orientation = orientation;
	}

	public int getXmax() {
		return xmax;
	}

	public void setXmax(int xmax) {
		this.xmax = xmax;
	}

	public int getYmax() {
		return ymax;
	}

	public void setYmax(int ymax) {
		this.ymax = ymax;
	}

	public String getPosition(){
		return "(" + this.getX() + ", " + this.getY() + ", " + this.getOrientation().getCode() + ")";
	}

}
