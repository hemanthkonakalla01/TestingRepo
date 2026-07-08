package com.java.standard.edition.abstraction;

public class BiologyTeacher extends Teacher {

	@Override
	public void teach() 
	{
		//sysout is used to print message on console
		//Added new line by hemanthdev for new feature
		System.out.println("BiologyTeacher teaches biology subject");

	}

	@Override
	public void experiments() {
		System.out.println("BiologyTeacher conducts biology experiments");

	}

}
