package in.thilak.springboot.myfirstwebapp.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping(path = "say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello what are you learning today?";
    }

    @RequestMapping(path = "say-html")
    @ResponseBody
    public String sayHelloHTML() {
        return """
                <html>
                    <head>
                        <title>My First HTML Page </title>
                    </head>
                    <body>
                        My First HTML body
                    </body>
                </html>             \s
                """;
    }

    //say hello.jsp -->C:\Users\THILAK G V\code_practice\myfirstwebapp\src\main\resources\META-INF\resources\WEB-INF\jsp
    @RequestMapping(path = "say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
