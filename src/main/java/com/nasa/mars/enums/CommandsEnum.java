package com.nasa.mars.enums;

import com.nasa.mars.validation.exception.InvalidCommandException;

public enum CommandsEnum {

	LEFT('L'), RIGHT('R'), MOVE('M');
	
	private char code;

	CommandsEnum(char code) {
		this.code = code;
	}

	public char getCode() {
		return this.code;
	}
		 
	public static CommandsEnum getCommandFromCode(char code) throws InvalidCommandException{
	    for (CommandsEnum  command : CommandsEnum.values()) {
	        if(command.code == code)
	            return command;
	    }
	    throw new InvalidCommandException();
	}
}
