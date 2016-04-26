package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.ui.MaterialPanel;
import gwt.material.design.client.ui.MaterialToast;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionAnchor;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class LoginPage extends Composite {

    @Inject
    @DataField("content")
    MaterialPanel content;

    @Inject
    Navigation navigation;

    @Inject
    RootPanel rootPanel;

    @PostConstruct
    public void init() {
        content.add(navigation.getContentPanel());
        rootPanel.add(this);
    }
}
