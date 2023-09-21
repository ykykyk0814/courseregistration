package student;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;//for reading the csv
import com.google.gson.Gson;//import the package needed for json
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import student.Course;
import student.loadcoursefromfile;

	public class Main {//user+main
		loadcoursefromfile.loadCoursesFromFile("MyUniversityCourses.csv");
		public static ArrayList<Course> courses = new ArrayList<>();
	    private static final String ADMIN_USERNAME = "Admin";
	    private static final String ADMIN_PASSWORD = "Admin001";
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Welcome to the system. Are you an Admin or a Student?");
	            String userType = scanner.nextLine();
	            
	            if (userType.equalsIgnoreCase("Admin")) {
	                System.out.println("Enter admin username:");
	                String username = scanner.nextLine();
	                System.out.println("Enter admin password:");
	                String password = scanner.nextLine();

	                if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
	                    Admin admin = new Admin(username, password, "Admin", "User");
	                    // Call a method to display the admin menu and handle admin operations
	                } else {
	                    System.out.println("Invalid admin credentials.");
	                }
	                Admin.displayMenu();
	            } else if (userType.equalsIgnoreCase("Student")) {
	                // Student functionalities can be added here
	            	System.out.println("Enter student username:");
	                String username = scanner.nextLine();
	                System.out.println("Enter student password:");
	                String password = scanner.nextLine();
	                Student student = new Student();
	            } else {
	                System.out.println("Invalid input. Please enter either 'Admin' or 'Student'.");
	            }}}}

	      