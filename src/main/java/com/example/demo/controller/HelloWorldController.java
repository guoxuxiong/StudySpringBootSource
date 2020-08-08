package com.example.demo.controller;

import com.example.demo.util.HttpRequest;
import org.springframework.web.bind.annotation.*;


import javax.websocket.server.PathParam;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(value = "user")
public class HelloWorldController {
//    @Autowired
//    private PersonRepository personRepository;

//    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
//    public void getUser(User user) {
////        User user1 = new User();
////        user1.setAge(50);
////        user1.setName("测试哈");
////        personRepository.save(user1);
//    }

//    @RequestMapping(value = "/getUserAll", method = RequestMethod.GET)
//    public List<User> getUserAll(Long id) {
//        long count = personRepository.count();
//        List<User> all = personRepository.findAllById(id);
//        return all;
//    }

//    @RequestMapping(value = "/DeleteId", method = RequestMethod.GET)
//    public void DeleteId(long id) {
//        personRepository.deleteById(id);
//        System.out.println("sddddddddddddd");
//    }

    /**
     * 分页
     *
     * @param
     * @return
     */
//    @RequestMapping(value = "/QueryPage", method = RequestMethod.GET)
//    public List<User> QueryPage() {
//        int page = 1;
//        int pageSize = 10;
//        Sort sort = new Sort(Sort.Direction.DESC, "id");
////        PageRequest pageble=PageRequest.of(page,pageSize);
//        PageRequest pageRequest = new PageRequest(0, 3, sort);
//        List<User> all = new ArrayList<>();
//        User user = new User();
//        int totalPages = personRepository.findAll(pageRequest).getTotalPages();//得到记录总数
//        System.out.print("jsj" + totalPages);
//        List<User> content = personRepository.findAll(pageRequest).getContent();//得到记录总数
//        all.addAll(content);
//        return all;
//    }

    /**
     * 获取全部商品
     * @return
     */
    @RequestMapping(value = "/getProud", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*")
    public String getProadData() {
        String result = HttpRequest.sendGet("https://openapi.vmall.com/mcp/queryPrd",
                "portal=2&lang=zh-CN&country=CN&searchFlag=1&brandType=0&keyword=59&searchSortField=0&searchSortType=desc&pageNum=1&pageSize=20&screenParams=%7B%7D&tid=06d602bbd4e9ad47a7dac44d7ae872df");
        return result;
    }
    @RequestMapping(value = "/getProudById/{proudId}", method = RequestMethod.GET)
//    @CrossOrigin(origins = "*")
    public String getProadById( @PathVariable  String  proudId) {
        String result = HttpRequest.sendGet("https://openapi.vmall.com/mcp/product/querySbomDepositActivity",
                "portal=2&lang=zh-CN&country=CN&sbomCode="+proudId);
        return result;
    }
    @RequestMapping(value = "/getNews", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String getNews( ) {
        String result = HttpRequest.sendGet("http://c.m.163.com/nc/article/headline/T1348649580692/0-40.html",
                "");
        return result;
    }
    @RequestMapping(value = "/getTreeJson", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public String getTreeDatat( ) {
        String result = HttpRequest.sendGet("https://www.wanandroid.com/tree/json",
                "");
        return result;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public String login(@PathParam("username")String username,@PathParam("password")String password) {

        String result = HttpRequest.sendPost("https://www.wanandroid.com/user/login",
                "username="+username+"&password="+password);
        return result;
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @CrossOrigin(origins = "*")
    public String register(@PathParam("username")String username,@PathParam("password")
            String password,
            @PathParam("repassword")String repassword) {

        String result = HttpRequest.sendPost("https://www.wanandroid.com/user/register",
                "username="+username+"&password="+password+"&repassword="+repassword);
        return result;
    }
}
