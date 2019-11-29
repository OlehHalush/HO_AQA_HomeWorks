package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

/*
1. Create a new  maven project and add RestAssured dependency.
2. Add any test framework (TestNG or JUnit).
3. Go to the link https://www.mockapi.io/clone/5d2224742ba8cf0014c44d8c to clone the mockapi project.
4. Create a test class and add 5-10 test methods. Each method should represent
separate request to the mock service.
5. Create a request to the mock service to get all users.
Endpoint: /api/v1/users.
Extract all users from the response body and add them to ArrayList(Type of array list you can pick by yourself).
Print all user's first names, last names and ages to the console.
6. Create a separate class to represent a user. This class should have all the fields according to the mock service.
7. Create an object of a user and send it to mock service in post request.
8. Get any user by id using GET request and create an object using the request body.
Endpoint: api/v1/users/id
9. Delete any user by ID using DELETE request.
10. Update any user by ID using PUT request.
11. All requests should verify that response status code is correct.
*/

public class TestApi {
    @BeforeClass
    public static void setUp() {
        baseURI = "http://5de0343cbb46ce001434c0b3.mockapi.io";
    }

    @Test
    public void getAllUsers() {
        System.out.println("=============================================");
        System.out.println("Get all users response:");
        given().
                get("/api/users").
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();
        System.out.println("=============================================");
    }

    @Test
    public void getUserById() {
        System.out.println("=============================================");
        System.out.println("Get user by id:");
        given().
                get("/api/users/{id}", 1).
                then().
                assertThat().statusCode(200).extract().body().jsonPath().prettyPrint();
        System.out.println("=============================================");
    }

    @Test
    public void saveAllUsersToArrayList() {
        System.out.println("=============================================");
        System.out.println("Save users to list and print names and ages:");
        final List<ApiUser> listOfUsersNames = when().get("/api/users").then().assertThat().statusCode(200).extract().body().jsonPath().getList("name");
        final List<ApiUser> listOfUsersAges = when().get("/api/users").then().assertThat().statusCode(200).extract().body().jsonPath().getList("age");

        System.out.println(listOfUsersNames.toString());
        System.out.println(listOfUsersAges.toString());
        System.out.println("=============================================");
    }

    @Test
    public void createUser() {
        System.out.println("=============================================");
        System.out.println("Create new user:");
        ApiUser myApiUser = new ApiUser("Oleh", 30);
        given().
                body(myApiUser.toString()).
                when().
                post("/api/users").
                then().
                assertThat().statusCode(201).extract().body().jsonPath().prettyPrint();
        System.out.println("=============================================");
    }

    @Test
    public void createUserObjectFromResponse() {
        System.out.println("=============================================");
        System.out.println("Create new user from response body:");

        Response response = get("/api/users/{id}", 1);
        JsonPath jsonResponse = response.jsonPath();
        String name = jsonResponse.get("name");
        int age = jsonResponse.get("age");
        System.out.println("Name and age from response:");
        System.out.println(name);
        System.out.println(age);
        System.out.println("Name and age from new user object:");
        ApiUser newUser = new ApiUser(name, age);
        System.out.println(newUser.toString());
        System.out.println("=============================================");
    }

    @Test
    public void updateUser() {
        System.out.println("=============================================");
        System.out.println("Update user:");
        ApiUser employee = new ApiUser("Oleh", 30);
        given()
                .body(employee.toString()).
                when().
                put("/users/{id}", 2).
                then()
                .assertThat().statusCode(200)
                .extract().body().jsonPath().prettyPrint();
        System.out.println("=============================================");
    }

    @Test
    public void deleteUser() {
        System.out.println("=============================================");
        System.out.println("Delete user:");
        given().
                when().
                delete("/users/{id}", 3).
                then()
                .assertThat().statusCode(200)
                .extract().body().jsonPath().prettyPrint();
        System.out.println("=============================================");
    }
}