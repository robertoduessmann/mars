package com.nasa.mars.api;

import com.nasa.mars.enums.OrientationsEnum;
import com.nasa.mars.model.Robot;
import com.nasa.mars.validation.exception.InvalidPositionException;

public interface MarsCommand {

	public OrientationsEnum rotateLeft(OrientationsEnum orientation);
	
	public OrientationsEnum rotateRight(OrientationsEnum orientation);
		
	public Robot move(Robot robot) throws InvalidPositionException;
	
}
