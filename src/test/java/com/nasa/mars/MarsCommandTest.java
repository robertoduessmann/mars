package com.nasa.mars;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nasa.mars.api.MarsCommand;
import com.nasa.mars.enums.OrientationsEnum;
import com.nasa.mars.impl.MarsCommandImpl;
import com.nasa.mars.model.Robot;

public class MarsCommandTest {

	private MarsCommand marsCommand;

	@Before
	public void setup(){
		marsCommand = new MarsCommandImpl();
	}
	
	@Test
	public void testRotateLeft(){
		Assert.assertEquals(OrientationsEnum.WEST, marsCommand.rotateLeft(OrientationsEnum.NORTH));
	}
	
	@Test
	public void testRotateRight(){
		Assert.assertEquals(OrientationsEnum.EAST, marsCommand.rotateRight(OrientationsEnum.NORTH));
	}
	
	@Test 
	public void testMove(){
		Robot robot = new Robot(0, 0, OrientationsEnum.NORTH, 4, 4);
		robot = marsCommand.move(robot);
		
		Assert.assertEquals(0, robot.getX());
		Assert.assertEquals(1, robot.getY());
		Assert.assertEquals(OrientationsEnum.NORTH, robot.getOrientation());
	}	
	
}
