package application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "starter")
@Component
@RestController
public class ExampleEndpoint {

   @RequestMapping("/starter/hello")
   @ReadOperation
    public String example() {
        return ":) self care baby :)";
    }
}