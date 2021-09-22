package amaciag.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorisRQuoteImpl extends guru.springframework.norris.chuck.ChuckNorrisQuotes  implements ChuckNorisRQuote {

    /*private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorisRQuoteImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }*/

    @Override
    public String getRandomQuote() {
        return super.getRandomQuote();
    }
}
