package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class BDDBooking {

	public static void main(String[] args) {
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
			
			.when()
				.post()
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}
