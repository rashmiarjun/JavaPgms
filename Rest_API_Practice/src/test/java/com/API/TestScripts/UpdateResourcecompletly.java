package com.API.TestScripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;


public class UpdateResourcecompletly {
	@Test
	public void UpdateResource()
	{
		JSONObject jo=new JSONObject();
		jo.put("title", "CET");
		jo.put("author","Shashidhar" );
		
		
		RequestSpecification rs=given();
		rs.contentType(ContentType.JSON);
		rs.body(jo.toJSONString());
		Response res=rs.patch("http://localhost:3000/posts/10");
		System.out.println(res.prettyPrint());
		
	}

}
