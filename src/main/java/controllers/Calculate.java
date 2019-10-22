package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Calculate {
@RequestMapping("/index")
    public String index(){
    return "index";
}
    @RequestMapping("/ok")
    public String getCalculate(@RequestParam("operator") String operator,@RequestParam("first") double first,@RequestParam("second") double second, Model model){
        double result=0;
        switch (operator){
            case "addition":
                result=first+second;
                break;
            case "minus":
                result=first-second;
                break;
            case "multiplication":
                result=first*second;
                break;
            case "division":
                result=first/second;
                break;
        }

        model.addAttribute("result", result);
        return "index";
    }
}
