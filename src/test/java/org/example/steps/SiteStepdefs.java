package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;

public class SiteStepdefs {
    String url;
    Response response;

    @Given("user has site url {string}")
    public void userHasSiteUrl(String url) {
        this.url = url;
    }

    @When("get query by this link")
    public void getQueryByThisLink() {
        this.response = get(url);
    }

    @Then("The site should receive a response with a status code equal to {int}")
    public void siteShouldGetResponseWithStatus(int statusCode) {
        System.out.println(response.statusCode());
        Assert.assertEquals(response.statusCode(), statusCode);
    }
}
