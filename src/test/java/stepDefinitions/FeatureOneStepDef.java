package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class FeatureOneStepDef {
	
	Response response;
	
	public void generateAuthToken() {
		
		/*
		 * RestAssured.useRelaxedHTTPSValidation(); Response
		 * tokenResponse=RestAssured.given().when().log().all() .formParam("grant_type",
		 * "client_credentials") .formParam("client_id","client id value that we get")
		 * .formParam("client_secret", "client id value that we get")
		 * .formParam("scope","scope of the token").post(
		 * "https://domain/as/token.oauth2");
		 * 
		 * String
		 * authToken=tokenResponse.getBody().jsonPath().getString("access_token");
		 */		

	}
	
	@Given("send a get request to get the list of users")
	public void send_a_get_request_to_get_the_list_of_users() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		response=RestAssured.given().when().log().all().get("https://reqres.in/api/users?page=2");
		System.out.println("------------------------------------------------");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
	    
	}
	@And("Verify the list of users")
	public void verify_the_list_of_users() {
		
		JsonPath jp=new JsonPath(response.getBody().toString());
		
		Assert.assertEquals(jp.getString("total_pages"),2);
		response.then().assertThat().statusCode(200);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	   
	}
	
	
	
	
	

}
