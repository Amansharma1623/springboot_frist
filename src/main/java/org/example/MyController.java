package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private Person myObject; // Spring autowires the Person bean


    @GetMapping("/getMappings")
    public String getMappings(){

        myObject.name = "Aman Sharma trying to mail send..............!!!!";
        String response =  myObject.toString();
        Sendmail.sendEmail(response);
        return response;
    }
}
