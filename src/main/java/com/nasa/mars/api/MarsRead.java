package com.nasa.mars.api;

import com.nasa.mars.model.Robot;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;

public interface MarsRead {
	
	public Robot readAndExecuteCommands(String commands) throws InvalidCommandException, InvalidPositionException;
	
}
