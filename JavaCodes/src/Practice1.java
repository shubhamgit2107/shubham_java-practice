
public class Practice1 {

	public static void main(String[] args) {
		 RequestSpecification reqest=Resassursd.given();
		 
		 Response respo=request.when().get("\"http://localhost:8080/employees/get\";");
		 respo.getcontectType();
		 
		 respo.then().statuscode(200).log().all();
	}

}
