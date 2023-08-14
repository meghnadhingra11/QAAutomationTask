package stepDefnitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "F:\\New folder\\VishnuVardahn\\Com.Cucumber.Test\\src\\test\\resources\\Features\\NameAndAge.feature",
    glue = "steps"
)

package com.cucumber.test.com.cucumber.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NameAndAge {

	public static void main(String[] args) {
		static WebDriver driver= null;
		 @Given("^I have open the browser")
		   public static void openBrowser()
		 {
		      driver = new ChromeDriver();
		 }

		   @When("^I open the website")
		   public  void goToWebsite()
		   {
		      driver.navigate().to("https://howoldru.m-messiah.cc/");
		   }

		   @When("^I enter the name")
		   public void Your_Name()
		   {

		      driver.findElement(By.xpath(Elements.Your_Name)).sendKeys("Vishnu Vardhan")
		   }

		   @When("^I enter date of birth")
		   public void dateofBrith()
		   {
			   driver.findElement(By.xpath(Elements.dateofBrith)).sendKeys("15/08/1947")
		   }



		   @Then("^Display the name and Age$")
		   public void Submit()
		   {
		      if(driver.findElement(By.xpath(Elements.Submit)).isEnabled())
		      {
		         System.out.println("Test 1 Pass");
		      } else {
		         System.out.println("Test 1 Fail");
		      }


		      driver.close();
		   }
		}

}