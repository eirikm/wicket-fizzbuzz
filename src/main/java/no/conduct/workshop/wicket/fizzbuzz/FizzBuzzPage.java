package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;

public class FizzBuzzPage extends WebPage {
    private static final Logger LOG = Logger.getLogger(FizzBuzzPage.class);

    public FizzBuzzPage() {
        add(new NumberPanel("numberPanel", Model.of(0)));
        add(new FizzPanel("fizzPanel", Model.of(0)));
        add(new BuzzPanel("buzzPanel", Model.of(0)));

        add(new Link<Void>("link") {
            @Override
            public void onClick() {
                LOG.debug("click");
            }
        }.setBody(Model.of("Neste tall")));
    }
}
