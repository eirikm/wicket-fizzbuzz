package no.conduct.workshop.wicket.fizzbuzz;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;

public class NumberPanel extends Panel {
    public NumberPanel(String id, Model<Integer> model) {
        super(id);
        add(new Label("number", model));
    }
}
