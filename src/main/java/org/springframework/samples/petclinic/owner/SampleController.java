package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.samples.petclinic.aspect.LogExecutionTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @Autowired
    String JongJin;

    @LogExecutionTime
    @GetMapping("/context")
    public String context() {
        return "Hello" + JongJin;
    }
}
