package com.JSON.POJOClasses;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestJSON {
	private Integer id;

	@Test
	public void postRequest() {
		Random random = new Random();
		do {
			id = random.nextInt();
		} while (id < 0);

		// Address(Primary) Class Object Creation
		Address addressPrimary = new Address();
		addressPrimary.setCity("Gujrat");
		addressPrimary.setPin(112233);
		addressPrimary.setSector("morbi");
		addressPrimary.setState("Morbi");

		// Address(Secondary) Class Object Creation
		Address addressSecondary = new Address();
		addressSecondary.setCity("Noida");
		addressSecondary.setPin(204005);
		addressSecondary.setSector("62");
		addressSecondary.setState("Uttar Pradesh");

		// Create an array to store values of available addresses

		Address[] address = new Address[2];
		address[0] = addressPrimary;
		address[1] = addressSecondary;

		// POJO Class Object Creation
		POJO pojo = new POJO();
		pojo.setAddress(address);
		pojo.setDepartment("Ceremic ");
		pojo.setDesignation("Quality Enginner");
		pojo.setFirstName("Sourabh");
		pojo.setLastName("Rana");
		pojo.setId(id);

		Response response = given().contentType(ContentType.JSON).when().body(pojo)
				.post("http://localhost:3000/TestApi");
		Assert.assertEquals(response.statusCode(), 201);
		System.out.println(response.statusCode());
		System.out.println("Generated id is::" + id);

	}

	// Get Request method
	@Test
	public void getRequest() {
		Response response = given().contentType(ContentType.JSON).get("http://localhost:3000/TestApi");
		Assert.assertEquals(response.statusCode(), 200);
		System.out.println(response.statusCode());
		System.out.println((response.asString()));

	}
}
