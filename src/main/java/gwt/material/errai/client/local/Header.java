package gwt.material.errai.client.local;

import com.google.gwt.dom.client.Style;
import gwt.material.design.client.ui.*;
import gwt.material.errai.shared.DataHelper;
import gwt.material.errai.shared.Links;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;
import com.google.gwt.user.client.ui.Composite;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class Header extends Composite {

    @Inject
    @DataField("header")
    protected MaterialHeader header = new MaterialHeader();
    protected MaterialNavBar navBar = new MaterialNavBar();
    protected MaterialNavBrand navBrand = new MaterialNavBrand();

    protected MaterialNavSection navSection = new MaterialNavSection();

    @Inject
    Tabs tabs = new Tabs();

    @PostConstruct
    private void init() {
        navBar.setBackgroundColor("light-blue");
        navBar.setActivates("side-nav");
        header.add(navBar);
        header.add(tabs);
        navBrand.setText("GMD Errai");

        for(Links l : DataHelper.getAllNavSectionLinks()){
            MaterialLink link = new MaterialLink();
            link.setIconType(l.getIcon());
            link.setHref(l.getLink());
            navSection.add(link);
        }

        navBar.add(navBrand);
        navSection.setFloat(Style.Float.RIGHT);
        navBar.add(navSection);
    }

}
