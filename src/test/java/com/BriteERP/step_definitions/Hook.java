package com.BriteERP.step_definitions;

import org.junit.After;
import org.junit.Before;

public class Hook {

    @Before
    public void setup(){
        System.out.println("=======================");
        System.out.println("Test setup");
       // Driver.get().manage().window().maximize();
    }

//   @After
//    public void teardown(Scenario scenario){
//        if(Scenario.isFailed)(){
//           System.out.println("Test failed");
//       }else{
//           System.out.println("Cleanup!");
//           System.out.println("Test Completed!");
//       }
//       System.out.println("=======================");
//        Driver.close();
//   }

}
