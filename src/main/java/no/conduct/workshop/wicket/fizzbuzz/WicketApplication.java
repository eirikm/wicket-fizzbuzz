package no.conduct.workshop.wicket.fizzbuzz;

import no.conduct.workshop.wicket.fizzbuzz.FizzBuzzPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {
    @Override
    public Class<? extends WebPage> getHomePage() {
        return FizzBuzzPage.class;
    }
}
