package amaciag.springframework.jokesapp.controllers;

import amaciag.springframework.jokesapp.services.ChuckNorisRQuote;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorisController {

    private final ChuckNorisRQuote chuckNorisRQuote;

    public ChuckNorisController( ChuckNorisRQuote chuckNorisRQuote) {
        this.chuckNorisRQuote = chuckNorisRQuote;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", chuckNorisRQuote.getRandomQuote());

        return "index";
    }

}
