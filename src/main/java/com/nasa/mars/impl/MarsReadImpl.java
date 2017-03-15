package com.nasa.mars.impl;

import com.nasa.mars.api.MarsCommand;
import com.nasa.mars.api.MarsRead;
import com.nasa.mars.enums.CommandsEnum;
import com.nasa.mars.enums.OrientationsEnum;
import com.nasa.mars.model.Robot;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;

public class MarsReadImpl implements MarsRead{
	
	private Robot robot;
	
	public Robot readAndExecuteCommands(String commands) throws InvalidCommandException, InvalidPositionException{
		
		//New Robot 5x5 (0,0,N)
		robot = new Robot(0, 0, OrientationsEnum.NORTH, 4, 4);
		
		for (char command: commands.toCharArray()) {
			executeCommand(CommandsEnum.getCommandFromCode(command));
		}
		
		System.out.println("@@@ Robot commands end.");
		
		return robot;
	}
	
	private void executeCommand(CommandsEnum command) throws InvalidPositionException{
		MarsCommand marsCommand = new MarsCommandImpl();
			
		switch (command) {
			case LEFT:
				robot.setOrientation(marsCommand.rotateLeft(robot.getOrientation()));			
				break;
			case RIGHT:
				robot.setOrientation(marsCommand.rotateRight(robot.getOrientation()));
				break;
			case MOVE:				
				Robot robotNew = marsCommand.move(robot);
				robot.setX(robotNew.getX());
				robot.setY(robotNew.getY());
				break;
			default:
				break;
		}
	}
	
	
}
