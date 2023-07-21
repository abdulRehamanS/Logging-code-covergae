package In.Abdul.API_REST_UNIT_TEST.Controller;


import In.Abdul.API_REST_UNIT_TEST.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    Service service;


    @GetMapping(value = "/")
    public String getWelcome() {
        return service.welcome();
    }
}
