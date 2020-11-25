package stepDefinitions;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.*;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.CityBikeResponse;
import resources.Utils;



public class CityBikeApiStepDefinition extends Utils{
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	int statusCode;
	String bodyResponse;
	List<String> networkLocations;
	List<String> networkLocationsCity;
	List<String> networkLocationsCountry;
	List<Long> networkLocationsLatitude;
	List<Long> networkLocationsLongitude;
	
	

	
	@Given("user calls cityBike api get request succefully")
	public void user_calls_cityBike_api_get_request_succefully() {
		response = given().when().get("http://api.citybik.es/v2/networks");
		
	}
	
	@When("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		assertEquals(200,response.getStatusCode());
	}


	@Then("user can veify {string} is in {string} and user can view latitude and longitude")
	public void user_can_veify_is_in_and_user_can_view_latitude_and_longitude(String city, String country) {
		
		bodyResponse = given().when().get("http://api.citybik.es/v2/networks").body().asString();
		JsonPath  js = new JsonPath(bodyResponse);	
		networkLocations = js.get("networks.location");
		networkLocationsCity = js.get("networks.location.city");
		networkLocationsCountry = js.get("networks.location.country");
		networkLocationsLatitude = js.get("networks.location.latitude");
		networkLocationsLongitude = js.get("networks.location.longitude");
		
		
		for (int i=0; i< networkLocationsCity.size(); i++) {
			if(networkLocationsCity.get(i).contentEquals(city))
			{
				
				assertEquals(country, networkLocationsCountry.get(i));
				System.out.println(networkLocationsCity.get(i) + " is in "+ networkLocationsCountry.get(i));
				System.out.println("Latitude is "+ networkLocationsLatitude.get(i));
				System.out.println("longitude is"+ networkLocationsLongitude.get(i));
			}
			
		}
	}

	
	


	
}
