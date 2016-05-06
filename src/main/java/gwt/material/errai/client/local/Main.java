package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.MaterialContainer;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialRow;
import gwt.material.errai.shared.CollectionDTO;
import gwt.material.errai.shared.DataHelper;
import org.jboss.errai.ui.client.widget.ListWidget;
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
    @DataField
    ListWidget<CollectionDTO, CollectionCard> rowCards;

    @Inject
    CollectionCard card;

    @Inject
    CollectionCard card1;

    @Inject
    CollectionCard card2;


    @Inject
    @DataField("main")
    protected MaterialContainer container = new MaterialContainer();

    @PostConstruct
    public void init() {
        rowCards.setItems(DataHelper.getAllCollections());
    }
}
