package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import org.jboss.errai.ui.nav.client.local.Page;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
@Page(role = DefaultPage.class)
public class Main extends Composite {

    @Inject
    CollectionCard card;

    @Inject
    CollectionCard card1;

    @Inject
    CollectionCard card2;

    protected MaterialRow row = new MaterialRow();

    @Inject
    @DataField("main")
    protected MaterialContainer container = new MaterialContainer();

    protected MaterialLabel label = new MaterialLabel("Test");

    @PostConstruct
    public void init() {
        container.add(row);
        row.add(card);
        row.add(card1);
        row.add(card2);
    }
}
