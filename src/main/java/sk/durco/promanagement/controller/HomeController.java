package sk.durco.promanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sk.durco.promanagement.configuration.UserSession;

@Controller
public class HomeController {

    @Autowired
    private UserSession userSession;
    @RequestMapping("/home")
    public ModelAndView login(Model model) {


        this.userSession.setUserSession();
        model.addAttribute("userSession", userSession);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
