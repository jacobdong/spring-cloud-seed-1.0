package site.igeek.person.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacobdong on 16/6/22.
 */
@RestController
public class GreetingController {

    @RequestMapping(value = "/greeting")
    public Map sayHello() {

        Map map = new HashMap();
        map.put("name", "jacobDong");
        map.put("content", "hello world");

        return map;
    }
}
