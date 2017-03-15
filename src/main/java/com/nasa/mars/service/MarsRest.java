package com.nasa.mars.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nasa.mars.api.MarsRead;
import com.nasa.mars.impl.MarsReadImpl;
import com.nasa.mars.validation.exception.InvalidCommandException;
import com.nasa.mars.validation.exception.InvalidPositionException;
 
@RestController
public class MarsRest {
		
	@RequestMapping(value = "/rest/mars/{commands}", method = RequestMethod.POST)
	public ResponseEntity<?> mars(@PathVariable("commands") String commands) {
		
		System.out.println("@@@ Robot start - Commands: " + commands);
		
		MarsRead mars = new MarsReadImpl();
		try{
			return new ResponseEntity<>(mars.readAndExecuteCommands(commands).getPosition(), HttpStatus.OK);
		}catch(InvalidCommandException e){
			System.out.println("InvalidCommandException!");
			return new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
		}catch (InvalidPositionException e) {
			System.out.println("InvalidPositionException!");
			return new ResponseEntity("400 Bad Request", HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "/rest/mars/", method = RequestMethod.POST)
	public ResponseEntity<?> mars() {
		return new ResponseEntity<>("Available commands to explore Mars: \nL (Rotate to Left); \nR (Rotate to Right); \nM (Move). \nLets explore!", HttpStatus.OK);
	}
	
}