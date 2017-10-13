package com.crmindz.bcjmay2017.classes.medium.lab5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PointTest {

	@Test
	public void testDistanceFromAnotherPoint() {
		Point p = new Point(1,1);
		assertEquals(Math.sqrt(2),p.distanceFromAnotherPoint(2, 2),0.05);
	}

	@Test
	public void testSlopeWithAnotherPoint() {
		Point p = new Point(1,1);
		assertEquals(1,p.slopeWithAnotherPoint(2, 2),0);
	}

	@Test
	public void testIsCollinear() {
		Point p = new Point(-5,7);
		assertEquals(true,p.isCollinear(-4,5,1,-5));
	}

	@Test
	public void testMidPoint() {
	}

	@Test
	public void testDistanceFromOrigin() {
		Point p = new Point(2,2);
		assertEquals(Math.sqrt(8),p.distanceFromOrigin(),0.05);
	}

	@Test
	public void testIsVertical() {
	}

	@Test
	public void testIsHorizontal() {
	}

	@Test
	public void testQuadrant() {
		Point p = new Point(2,2);
		assertEquals("Q1",p.quadrant());
	}

}