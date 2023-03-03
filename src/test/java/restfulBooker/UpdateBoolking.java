package restfulBooker;

import io.restassured.RestAssured;


public class UpdateBoolking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking/12")
				.header("Content-Type", "application/json")
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				//.header("Cookie","token=c5d05e7a96956c3")
				.body(" {\r\n"
						+ "        \"firstname\": \"Kim\",\r\n"
						+ "        \"lastname\": \"Rath\",\r\n"
						+ "        \"totalprice\": 111,\r\n"
						+ "        \"depositpaid\": true,\r\n"
						+ "        \"bookingdates\": {\r\n"
						+ "            \"checkin\": \"2023-01-01\",\r\n"
						+ "            \"checkout\": \"2014-01-01\"\r\n"
						+ "        },\r\n"
						+ "        \"additionalneeds\": \"Breakfast and lunch\"\r\n"
						+ "    }")
			.when()
				.put()
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}
