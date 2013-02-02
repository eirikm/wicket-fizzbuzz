package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.Model;

public class FizzBuzzPage extends WebPage {
    public static final Logger LOG = Logger.getLogger(FizzBuzzPage.class);

    public FizzBuzzPage() {
        add(new NumberPanel("numberPanel", Model.of(0)));
        add(new FizzPanel("fizzPanel", Model.of(0)));
        add(new BuzzPanel("buzzPanel", Model.of(0)));

        add(new AjaxLink<Void>("ajaxLink") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                LOG.debug("click");
            }
        }.setBody(Model.of("Neste tall")));
    }
}
