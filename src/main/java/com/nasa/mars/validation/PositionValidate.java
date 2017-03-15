package com.nasa.mars.validation;

import com.nasa.mars.model.Robot;
import com.nasa.mars.validation.exception.InvalidPositionException;

public class PositionValidate {
	public int validateX(Robot robot, int x) throws InvalidPositionException{
		if (x >=0 && x <= robot.getXmax()){
			return x;
		}else{
			throw new InvalidPositionException();
		}	
	}
	
	public int validateY(Robot robot, int y) throws InvalidPositionException{
		if (y >= 0 && y <= robot.getYmax()){
			return y;
		}else{
			throw new InvalidPositionException();
		}		
	}
}
