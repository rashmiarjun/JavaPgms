package com.API.TestScripts;

import org.testng.annotations.Test;
import  static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deletebypassparameter {
	int id=11;
	@Test
	public void DeleteResource()
	{
		
		RequestSpecification rs=given();
		rs.pathParam("id",id);
		
		Response res=rs.delete("http://localhost:3000/posts/{id}");//passing parameter for deteleting the specific resouce
		System.out.println(res.prettyPrint());
		
		
	}

}
