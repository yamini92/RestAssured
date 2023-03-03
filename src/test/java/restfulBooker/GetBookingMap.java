package restfulBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;


public class GetBookingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("/booking/{id}")
			.pathParam("id", 12)//One way to pass path parameter
		.when()
		
		//.get("https://restful-booker.herokuapp.com/{basepath}/{id}","booking",1) This is one way to pass inline parameter to the url if the parameter are more than 
		//expected then error is thrown. We cannot parameterize the bse uri e.g. https://{baseuri}.herokuapp.com/{basepath}/{id} 
			.get()
		.then()
			.log().all()
			.statusCode(200);

		
		
		/*
		 * if there are more path parameters to pass to the url then use map
		 * create one map
		 * Map<String, Object> pathpara = new HashMap<String, Object>();
			pathpara.put("basepath", "booking");
			pathpara.put("id", 1);
		
		Add map in pathpaParam ---
			.pathParam(pathpara)
		 */
		
		
	}

}
