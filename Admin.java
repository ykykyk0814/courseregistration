package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User implements AdminInterface {
    	
		public Admin(String username, String password, String firstName, String lastName) {
			super(username, password, firstName, lastName);
		}
		ArrayList<Course> courses = new ArrayList<>();//should i still leave the initiation here
    	ArrayList<Student> students = new ArrayList<>();
    	Scanner scanner = new Scanner(System.in);

        void displayMenu() {
            while (true) {
                System.out.println("Courses Management:(enter option number to progress");
                System.out.println("1. Create a new course");
                System.out.println("2. Delete a course");
                System.out.println("3. Edit a course");
                System.out.println("4. Display information for a given course");
                System.out.println("5. Register a student");
                System.out.println("6. Exit");
                
                int choice = scanner.nextInt();
                scanner.nextLine(); //take in the answer

                switch (choice) {
                    case 1:
                        createCourse();
                        break;
                    case 2:
                        deleteCourse();
                        break;
                    case 3:
                        editCourse();
                        break;
                    case 4:
                        displayCourseInfo();
                        break;
                    case 5:
                        registerStudent();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        public void createCourse() {
            System.out.println("Enter course ID:");
            String id = scanner.nextLine();
            System.out.println("Enter course name:");
            String name = scanner.nextLine();
            Course course = new Course(courseid, coursename);
            courses.add(course);
            System.out.println("Course created successfully.");
        }

        public void deleteCourse() {
            System.out.println("Enter course ID to delete:");
            String id = scanner.nextLine();
            courses.removeIf(course -> course.id.equals(id));
            System.out.println("Course deleted successfully.");
        }

       public void editCourse() {
            System.out.println("Enter course ID to edit:");
            String id = scanner.nextLine();
            for (Course course : courses) {
                if (course.id.equals(id)) {
                    System.out.println("Enter new description:");
                    String description = scanner.nextLine();
                    course.description = description;
                    System.out.println("Course updated successfully.");
                    return;
                }
            }
            System.out.println("Course not found.");
        

        public void displayCourseInfo() {
            System.out.println("Enter course ID to display information:");
            String id = scanner.nextLine();
            for (Course course : courses) {
                if (course.id.equals(id)) {
                    System.out.println("Course ID: " + course.id);
                    System.out.println("Course Name: " + course.name);
                    System.out.println("Course Description: " + course.description);
                    return;
                }
            }
            System.out.println("Course not found.");
        }

        public void registerStudent() {
            System.out.println("Enter student ID:");
            String id = scanner.nextLine();
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            Student student = new Student();
            student.studentID = id;
            student.name = name;
            students.add(student);
            System.out.println("Student registered successfully.");
        }

}


		@Override
		public void editCourse() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void displayCourseInfo() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void registerStudent() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void generateReports() {
			// TODO Auto-generated method stub
			
		}