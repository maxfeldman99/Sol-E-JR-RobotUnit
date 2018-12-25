package com.max.models;

import java.util.ArrayList;

public class Request
{
	String id;
	ArrayList<RobotRequest> sequence;
	int sizeOfSequence;
	
	public Request() {}

	public String getId() {
		return id;
	}

	public ArrayList<RobotRequest> getSequence() {
		return sequence;
	}

	public int getSizeOfSequence() {
		return sizeOfSequence;
	}
	
	

}
