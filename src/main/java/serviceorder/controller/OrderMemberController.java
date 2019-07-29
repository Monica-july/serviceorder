package serviceorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import serviceorder.service.OrderMemberService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderMemberController {
    @Value("${server.port}")
    private String serverport;
    @Autowired
    private OrderMemberService orderMemberService;

    @RequestMapping("/getAll")
    public List<String> getAllMember(){
        return orderMemberService.getAllMember();
    }
    @RequestMapping("/index")
    public String index(){
        return "b.  serverport"+serverport;
    }
}
