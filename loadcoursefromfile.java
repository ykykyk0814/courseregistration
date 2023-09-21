package student;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class loadcoursefromfile<Course> loadcoursefromfile<Course> loadCoursesFromFile(String filePath) {
     loadcoursefromfile<Course> courses = new ArrayList<>();
     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
         String line;
         br.readLine(); // Skip the header row
         while ((line = br.readLine()) != null) {
             String[] values = line.split(",");
             Course course = new Course(
                     values[0],  // courseName
                     values[1],  // courseID
                     Integer.parseInt(values[2]),  // maxNumberOfStudents
                     Integer.parseInt(values[3]),  // currentNumberOfStudents
                     values[4],  // courseInstructor
                     values[5],  // courseSectionNumber
                     values[6]   // courseLocation
             );
             courses.add(course);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
     return courses;
 }
}
