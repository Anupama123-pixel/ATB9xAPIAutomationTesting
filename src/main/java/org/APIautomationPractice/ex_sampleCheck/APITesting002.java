package org.APIautomationPractice.ex_sampleCheck;

import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {
        //Gerkin syntax
        //Given- Pre-requisirte- url,header,auth,body
        //when-HTTp method? -Get/Post/Patch/put/delete
        //then-validation- 200 ok, Firstname==pramod

        //Full URL- https://api.zippopotam.us/IN/560016
        //base URI-https://api.zippopotam.us
        //bath path-/In/560016

        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/In/560016").when().get().then().log().all().statusCode(200);

    }
}
