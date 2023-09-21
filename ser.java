package student;
import student.Admin;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;//import the package needed for json
import java.util.Scanner;

public class ser {

    try {//serialize the arraylist course and student
        FileWriter writer = new FileWriter("myfile.json");

        Gson gson = new Gson();
		gson.toJson(ArrayList<Studnet>, writer);

        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
	@Override
	public void generateReports() {
		// TODO Auto-generated method stub
		
	}
}
