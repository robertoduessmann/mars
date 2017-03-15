package com.nasa.mars.impl;

import com.nasa.mars.api.MarsCommand;
import com.nasa.mars.enums.OrientationsEnum;
import com.nasa.mars.model.Robot;
import com.nasa.mars.validation.PositionValidate;
import com.nasa.mars.validation.exception.InvalidPositionException;

public class MarsCommandImpl implements MarsCommand {
	
	public OrientationsEnum rotateLeft(OrientationsEnum orientation){
		switch (orientation) {
			case NORTH:
				return OrientationsEnum.WEST;
			case SOUTH:
				return OrientationsEnum.EAST;
			case EAST:
				return OrientationsEnum.NORTH;
			case WEST:
				return OrientationsEnum.SOUTH;
			default:
				return null;
		}
	}
	
	public OrientationsEnum rotateRight(OrientationsEnum orientation){
		switch (orientation) {
			case NORTH:
				return OrientationsEnum.EAST;
			case SOUTH:
				return OrientationsEnum.WEST;
			case EAST:
				return OrientationsEnum.SOUTH;
			case WEST:
				return OrientationsEnum.NORTH;
			default:
				return null;
		}
	}
	
	public Robot move(Robot robot) throws InvalidPositionException{
		
		PositionValidate valid = new PositionValidate();
		
		switch (robot.getOrientation()) {
			case NORTH:
				robot.setY(valid.validateY(robot, robot.getY()+1));
				break;
			case SOUTH:
				robot.setY(valid.validateY(robot, robot.getY()-1));
				break;
			case EAST:
				robot.setX(valid.validateX(robot, robot.getX()+1));
				break;
			case WEST:
				robot.setX(valid.validateX(robot, robot.getX()-1));
				break;
			default:
				break;
		}
		
		return robot;
	}
	
}
