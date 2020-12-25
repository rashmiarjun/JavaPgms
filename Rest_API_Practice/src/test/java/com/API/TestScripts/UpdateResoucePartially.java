package com.API.TestScripts;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateResoucePartially {
	@Test
	public void UpdateResourceRow()
	{
		JSONObject jo=new JSONObject();
		jo.put("title", "CET1");
		jo.put("author","Shashi");
		
		
		RequestSpecification rs=given();
		rs.contentType(ContentType.JSON);
		rs.body(jo.toJSONString());
		Response res=rs.put("http://localhost:3000/posts/12");
		System.out.println(res.prettyPrint());
		
	}

}
