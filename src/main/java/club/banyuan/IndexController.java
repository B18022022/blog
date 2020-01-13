package club.banyuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping ("/users/{username}/blogs/{blogId:[0-9]+}")
    @ResponseBody
    public String userProfile(@PathVariable String username, @PathVariable int blogId) {
        return String.format("user %s id %s", username,blogId);
    }

}
