package com.adactin.helper;

public class File_Reader_Manager {
	
	private File_Reader_Manager getInstance() {
		
		File_Reader_Manager reader = new File_Reader_Manager();
		
		return reader;

	}
	
	
	private Cofiguration_Reader getInstanceCR() throws Throwable {
		
		Cofiguration_Reader helper = new Cofiguration_Reader();

		return helper;
	}

}
