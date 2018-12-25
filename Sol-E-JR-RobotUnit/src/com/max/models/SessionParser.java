package com.max.models;

public class SessionParser {

	// this class will parse our json files
	
	public SessionParser() {
		
	}
	
	public RobotRequest parseJson(Request request) { 
		
		RobotRequest robotRequest = new RobotRequest();
		
		// parsing logic
		String payload;
		String id;
		String type;
		
		// here we will use GSON library to parse the json
		//
		//
		// after parsing we will update our RobotRequest fields
		
		//robotRequest.setPayload(payload);
		//robotRequest.setPayload(id);
		//robotRequest.setPayload(type);
		
		return robotRequest;
	}
	
}
