package com.API.TestScripts;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class GetallResouces {
	@Test
	public void getTest()
	{
		Response res= get("http://dummy.restapiexample.com/api/v1/employees");
		
	System.out.println("Header of the method is "+ res.getHeaders());
	System.out.println();
	System.out.println("Body is"+  res.getBody().asString());
	System.out.println();
	System.out.println("The status code is"+ res.getStatusCode());
	System.out.println();
	System.out.println("The time response is"+ res.getTime());
	System.out.println();
	System.out.println("he content type is"+ res.getContentType());
	System.out.println();
	System.out.println(res.prettyPrint());

	
	}

}
