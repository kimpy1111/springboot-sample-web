package sample.web.ui.mvc;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.web.ui.mvc.vo.HealthVo;


@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping(path = "health")
    public HealthVo getHealth() {
        HealthVo health = new HealthVo();
        health.setHealth("up");
        return health;
    }
}
