package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Denne skal ikke endres
 */
public class WicketFizzBuzzApplication extends WebApplication {
    @Override
    public Class<? extends WebPage> getHomePage() {
        return FizzBuzzPage.class;
    }
}
