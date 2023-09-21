package student;

import java.util.ArrayList;

public class Course {//declaring variables for course
	private String courseid;
    private String coursename;
    private int MaxStudents;
    private int currentRegisteredStudents;
    private ArrayList<String> studentNames;
    private String instructor;
    private String sectionNumber;
    private String location;


    public Course(String coursename, String courseid, int MaxStudents, String instructor, String sectionNumber, String location) {
        this.coursename = coursename;
        this.courseid = courseid;
        this.MaxStudents = MaxStudents;
        this.currentRegisteredStudents = 0; // Initially no students are registered；accumulate student later
        this.studentNames = new ArrayList<>(); // Initially the list of student names is empty
        this.instructor = instructor;
        this.sectionNumber = sectionNumber;
        this.location = location;
    }
 // Getters and Setters
    public String getName() {
        return coursename;
    }

    public void setName(String coursename) {
        this.coursename = coursename;
    }

    public String getId() {
        return courseid;
    }

    public void setId(String courseid) {
        this.courseid = courseid;
    }

    public int getMaxStudents() {
        return MaxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.MaxStudents = maxStudents;
    }

    public int getCurrentRegisteredStudents() {
        return currentRegisteredStudents;
    }

    public void setCurrentRegisteredStudents(int currentRegisteredStudents) {
        this.currentRegisteredStudents = currentRegisteredStudents;
    }

    public ArrayList<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(ArrayList<String> studentNames) {
        this.studentNames = studentNames;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void registerStudent(String studentName) {//registerstudnet
        if (currentRegisteredStudents < MaxStudents) {
            studentNames.add(studentName);
            currentRegisteredStudents++;
        } else {
            System.out.println("Registration failed. The course is full.");
        }
    }
    
    public void withdrawStudent(String studentName) {//removestudent
        if (studentNames.contains(studentName)) {
            studentNames.remove(studentName);
            currentRegisteredStudents--;
        } else {
            System.out.println("Withdrawal failed. Student is not registered in the course.");
        }
    }
}
