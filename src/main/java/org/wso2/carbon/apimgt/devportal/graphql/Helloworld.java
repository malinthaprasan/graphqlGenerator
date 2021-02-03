package org.wso2.carbon.apimgt.devportal.graphql;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping("/")
    public String Hello(){

        return "Hello World";
    }

}
