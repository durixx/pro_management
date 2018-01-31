package sk.durco.promanagement.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String redirectToLogin() {return "redirect:/home";}

    @RequestMapping("/login")
    public ModelAndView welcome(@RequestParam(value = "error", required = false) String error,
                                @RequestParam(value = "logout", required = false) String logout,
                                Model model) {

        ModelAndView modelAndView = new ModelAndView();

        if(error != null) {
            model.addAttribute("error", "Zadali ste neprávne prihlasovacie údaje");
        } else if(logout != null) {
            model.addAttribute("logout", "Boli ste úspešne odhlásený");

        }

        modelAndView.setViewName("loginForm");
        return modelAndView;
    }

    @RequestMapping("/login_success")
    public String home() {
        return "redirect:/home";
    }
}
