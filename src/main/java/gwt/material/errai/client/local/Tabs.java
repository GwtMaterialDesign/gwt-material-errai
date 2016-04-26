package gwt.material.errai.client.local;

import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialTab;
import gwt.material.design.client.ui.MaterialTabItem;
import gwt.material.errai.shared.DataHelper;
import gwt.material.errai.shared.Links;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class Tabs extends Composite {

    @Inject
    @DataField("tabs")
    MaterialTab tab = new MaterialTab();

    @PostConstruct
    public void init() {
        tab.setBackgroundColor("light-blue");
        for (Links l : DataHelper.getAllTabLinks()) {
            MaterialTabItem item = new MaterialTabItem();
            MaterialLink link = new MaterialLink();
            link.setHref(l.getLink());
            link.setText(l.getName());
            link.setTextColor("white");
            item.add(link);
            tab.add(item);
        }
    }

}
