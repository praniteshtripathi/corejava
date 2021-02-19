package rnd.io;

import java.io.File;

public class CreateDirectotyMkDIr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Path of the directory
        String strPath = "C:/test/./data/data2";
        
        File dir = new File(strPath);
        boolean isDirCreated=false;
        if(!dir.exists()) {
        	isDirCreated = dir.mkdir();
        }
        
        if(isDirCreated)
            System.out.println("Directory created successfully");
        else
            System.out.println("Failed to create directory");
        
    }
	}


