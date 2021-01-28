package com.equifaxA.APITesting;

import com.equifaxA.Utilities.ConfigurationReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;

public class getTests {


    @BeforeAll
    public static void setUp(){
        baseURI= ConfigurationReader.getProperty("uri");


    }
    @Test
    public void Test1(){

        Response response = given().
                get(baseURI + "employees/");
        //verify status code
        assertEquals(200, response.getStatusCode());
        System.out.println(response.prettyPrint());
    }
    @Test
    public void Test2(){

        Response response=given()
                .get(baseURI+"employees");
        assertEquals(200,response.getStatusCode());

        assertEquals("application/json;charset=utf-8",response.getHeader("Content-Type"));

        assertEquals("application/json;charset=utf-8",response.getContentType());


    }
    //getting collection of all employees salaries
    @Test
    @DisplayName("verifying size of employees")
    public void Test3(){
        List<?> employeeSize = given().
                accept(ContentType.JSON).
                when().
                get("/employees").prettyPeek().
                thenReturn().jsonPath().getList("data.id");
        assertEquals(24,employeeSize.size());
    }

    @Test
    @DisplayName("deleting employee by id")
    public void Test4(){
       Response response= given().
            accept(ContentType.JSON).
            when().delete("/delete/{id}", 5);
       int statusCode=response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode,200);

        String jsonString=response.asString();
        Assert.assertEquals(jsonString.contains("Successfully! Record has been deleted"),true);



    }


}




