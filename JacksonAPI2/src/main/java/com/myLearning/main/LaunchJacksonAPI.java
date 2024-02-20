package com.myLearning.main;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myLearning.pojo.Course;
import com.myLearning.pojo.Implementers;

public class LaunchJacksonAPI {
	public static void main(String[] args) throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		Implementers impl = new Implementers();
		impl.setId(1);
		impl.setName("Rajat");
		impl.setCity("Chennai");
		impl.setActive(true);
		impl.setCourse(new Course(1, "Java", 1200.00));
		impl.setHobbies(new String []{"Reading","Dancing"});
		impl.setInterests(Arrays.asList("Badminton","Table Tenis","Cricket"));

		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(impl);
		System.out.println(json);

		
		
//		{
//			  "id" : 1,
//			  "name" : "Rajat",
//			  "city" : "Chennai",
//			  "active" : true,
//			  "course" : {
//			    "price" : 1200.0,
//			    "cid" : 1,
//			    "cname" : "Java"
//			  },
//			  "hobbies" : [ "Reading", "Dancing" ],
//			  "interests" : [ "Badminton", "Table Tenis", "Cricket" ]
//		}		
		

//     Converting to JSON to Java
		Implementers imp = mapper.readValue(json, Implementers.class);
		System.out.println(imp);
		
		File file = new File("/Users/prashantkumartiwary/Desktop/file.json");
		Implementers implJson = mapper.readValue(file, Implementers.class);
		System.out.println(implJson);
		

	}
}
