package com.API.TestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreatResource {
	@Test
	public void CrearResource()
	{
		JSONObject jo=new JSONObject();
		jo.put("title","Microprocessor");
		jo.put("author","8086");
		
		RequestSpecification rs=given();
		rs.contentType(ContentType.JSON);
		rs.body(jo.toJSONString());
		Response res=rs.post("http://localhost:3000/posts");
		System.out.println(res.prettyPrint());
		
	}

}
