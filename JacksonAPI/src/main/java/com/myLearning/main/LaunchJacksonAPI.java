package com.myLearning.main;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myLearning.pojo.Implementer;

public class LaunchJacksonAPI {
	public static void main(String[] args) throws JsonProcessingException {

		Implementer impl = new Implementer();
		impl.setId(1);
		impl.setName("Rajkumar");
		impl.setCity("Dehradun");

		System.out.println(impl);

		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writeValueAsString(impl);
		System.out.println(json);

		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(impl);
		System.out.println(json);

		Implementer impl2 = new Implementer();
		impl2.setId(2);
		impl2.setName("Rajkumari");
		impl2.setCity("Patna");

		Implementer impl3 = new Implementer();
		impl3.setId(3);
		impl3.setName("Binod");
		impl3.setCity("Jaipur");

		Implementer impl4 = new Implementer();
		impl4.setId(4);
		impl4.setName("Raghav");
		impl4.setCity("Gaya");

		List<Implementer> list = new ArrayList<>();
		list.add(impl);
		list.add(impl2);
		list.add(impl3);
		list.add(impl4);

		System.out.println();
		String json3 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(json3);

	}
}
