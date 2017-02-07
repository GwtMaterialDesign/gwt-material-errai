package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.ui.MaterialPanel;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@EntryPoint
@Templated
@Page(path = "home" /*, role = DefaultPage.class*/ )
public class HomePage extends Composite {

    @Inject
    @DataField("home-page")
    MaterialPanel panel = new MaterialPanel();

    @Inject
    private Header header;

    @Inject
    private SideNav sideNav;

    @Inject
    private Main main;

    @PostConstruct
    public void init() {
        panel.add(header);
        panel.add(sideNav);
        panel.add(main);
        RootPanel.get().add(panel);
    }
}
