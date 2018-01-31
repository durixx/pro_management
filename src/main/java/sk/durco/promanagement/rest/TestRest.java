package sk.durco.promanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.durco.promanagement.service.TestService;

@RestController
public class TestRest {

    @Autowired
    private TestService testService;

    @RequestMapping("/test-api")
    public void test() {
        this.testService.insert();
    }
}
