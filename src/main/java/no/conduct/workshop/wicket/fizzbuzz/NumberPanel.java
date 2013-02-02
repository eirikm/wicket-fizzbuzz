package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class NumberPanel extends Panel {
    private static final Logger LOG = Logger.getLogger(NumberPanel.class);

    public NumberPanel(String id, Model<Integer> model) {
        super(id);
        add(new Label("number", model));
    }
}
