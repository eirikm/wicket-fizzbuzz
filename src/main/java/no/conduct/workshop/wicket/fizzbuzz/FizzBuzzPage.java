package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

public class FizzBuzzPage extends WebPage {
    public FizzBuzzPage() {
        add(new NumberPanel("numberPanel", Model.of(0)));
        add(new FizzPanel("fizzPanel", Model.of(0)));
        add(new BuzzPanel("buzzPanel", Model.of(0)));
    }
}
