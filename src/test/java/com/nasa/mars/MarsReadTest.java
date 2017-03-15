package com.nasa.mars;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nasa.mars.api.MarsRead;
import com.nasa.mars.enums.OrientationsEnum;
import com.nasa.mars.impl.MarsReadImpl;
import com.nasa.mars.model.Robot;

public class MarsReadTest {
	
	private MarsRead marsRead;
	
	@Before
	public void setup(){
		marsRead = new MarsReadImpl();
	}
	
	@Test
	public void testReadAndExecuteCommands(){
		Robot robot = marsRead.readAndExecuteCommands("MML");
		
		Assert.assertEquals(0, robot.getX());
		Assert.assertEquals(2, robot.getY());
		Assert.assertEquals(OrientationsEnum.WEST, robot.getOrientation());
	}
	
}
