package student;

import student.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User implements StudentInterface {
        private ArrayList<Course> registeredCourses;//registeredcourse arraylist
        public void Student(String username, String password, String firstName, String lastName) {
				super(username, password, firstName, lastName);
                this.registeredCourses = new ArrayList<>(); }

		String StudentID;
		
		void generateReports() {
	        while (true) {
	            System.out.println("Reports:");
	            System.out.println("1. View all courses");
	            System.out.println("2. View all courses that are FULL");
	            System.out.println("3. Write to a file the list of courses that are full");
	            System.out.println("4. View the names of the students being registered in a specific course");
	            System.out.println("5. View the list of courses that a given student is being registered on");
	            System.out.println("6. Sort courses based on the current number of student registers");
	            System.out.println("7. Exit");

	            Scanner scanner;//file i/o
				int choice = scanner.nextInt();
	            scanner.nextLine();  // take in next line

	            switch (choice) {
	                case 1:
	                    viewAllCourses();
	                    break;
	                // ... (Implement other cases similarly)
	                case 7:
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    void viewAllCourses() {
	        // Method to view all courses
	        // Implementation here
	    }
	    
	    void viewCoursesNotFull() {
	        // Method to view all courses that are not FULL
	        // Implementation here
	    }

	    // ... (Define other report methods here)
	}

