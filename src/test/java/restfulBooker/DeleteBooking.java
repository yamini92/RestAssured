package restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/1")
				.contentType(ContentType.JSON)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		
			.when()
				.delete()
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);
	}

}
