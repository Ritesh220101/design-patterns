package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "I'm consultant.......";
	}

	@Override
	public String responsibility() {
		return "Writing code...";
	}

}
