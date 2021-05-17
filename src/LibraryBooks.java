import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class LibraryBooks {
	
	@Test
	
	public void AddBook(){
		
		RestAssured.baseURI= "http://216.10.245.166";
		 given().log().all().header("Content-Type","application/json")
		.body(Payload.inputData("isbn", "aisle"))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().asString();
		
		
	}

}
