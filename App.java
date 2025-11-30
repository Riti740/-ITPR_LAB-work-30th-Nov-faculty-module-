package com.knmodicollege.collegemanagement;

import com.knmodicollege.collegemanagement.controller.CourseController;
import com.knmodicollege.collegemanagement.util.DataBaseUtil;

public class App 
{
    public static void main( String[] args )
    {
    	//to create tables if not exists
    	DataBaseUtil.createTables();
    	
    	//creating object of CourseController
    	new CourseController().registerCourseUI();
    }
}
