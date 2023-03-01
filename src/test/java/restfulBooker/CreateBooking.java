package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
	
		/*
		 * //Build Request RequestSpecification requestSpecification =
		 * RestAssured.given().log().all();
		 * requestSpecification.baseUri("https://restful-booker.herokuapp.com");
		 * requestSpecification.basePath("/booking");
		 * 
		 * 
		 * requestSpecification.body("{\r\n" + "    \"firstname\" : \"Rachana\",\r\n" +
		 * "    \"lastname\" : \"Kharath\",\r\n" + "    \"totalprice\" : 110,\r\n" +
		 * "    \"depositpaid\" : true,\r\n" + "    \"bookingdates\" : {\r\n" +
		 * "        \"checkin\" : \"2023-03-03\",\r\n" +
		 * "        \"checkout\" : \"2023-03-05\"\r\n" + "    },\r\n" +
		 * "    \"additionalneeds\" : \"lunch\"\r\n" + "}");
		 * requestSpecification.contentType(ContentType.JSON);
		 * 
		 * 
		 * //hit the request and get response
		 * 
		 * Response response= requestSpecification.post();
		 * 
		 * 
		 * //validate response ValidatableResponse valideresp =
		 * response.then().log().all(); valideresp.statusCode(200);
		 */

		//Build Request
		//setup
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com")
		.basePath("/booking")
		.body("{\r\n"
				+ "    \"firstname\" : \"Rachana\",\r\n"
				+ "    \"lastname\" : \"Kharath\",\r\n"
				+ "    \"totalprice\" : 110,\r\n"
				+ "    \"depositpaid\" : true,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2023-03-03\",\r\n"
				+ "        \"checkout\" : \"2023-03-05\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"lunch\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//hit the request
		.post()
		//validate response
		.then().log().all()
		.statusCode(200);
	}

}
