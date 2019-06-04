package com.basic.GrofVuilOphaalSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class )
	@CucumberOptions(			
			
			monochrome = true,
			//dryRun = true,
			strict = true,
			
			features= {"src/test/resources/com/basic/GrofVuilOphaalFF"},
			
			glue= {"com.basic.GrofVuilOphaalSD"},
			
			plugin= {"pretty",
		    	 "html:target/cucumber",
		    	 "json:target/cucumber.json",
				
		  
			
			}
			)
	
	
	public class RunGrofvuilOphaalTest {

}
	


