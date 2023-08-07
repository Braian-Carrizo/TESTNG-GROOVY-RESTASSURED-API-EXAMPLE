





class Base {
    @BeforeClass
    public static void setupRestAssured() {

        RestAssured.baseURI = "https://qa-library-dev.herokuapp.com";
        RestAssured.basePath = "/api/";
        RequestSpecification requestSpecification = new RequestSpecBuiler().
                addHeader("Content-Type", ContentType.JSON.toString()).
                addHeader("Accept", ContentType.JSON.toString())
                .build()
        RestAssured.requestSpecification = requestSpecification
    }
}