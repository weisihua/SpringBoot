package com.wei.component;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.wei.bean.Person;

@org.springframework.boot.jackson.JsonComponent
public class JsonComponent {

	public static class Serialize extends JsonSerializer<Person> {

		@Override
		public void serialize(Person value, JsonGenerator gen, SerializerProvider serializers)
				throws IOException, JsonProcessingException {
			// TODO Auto-generated method stub
		}
		
	}
}
