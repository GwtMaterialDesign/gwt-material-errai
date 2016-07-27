package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.constants.SideNavType;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialSideNav;
import gwt.material.errai.shared.DataHelper;
import gwt.material.errai.shared.Links;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class SideNav extends Composite {

    @Inject
    @DataField("side-nav")
    protected MaterialSideNav sideNav = new MaterialSideNav();

    @PostConstruct
    public void init(){
        sideNav.setId("side-nav");
        sideNav.setType(SideNavType.CARD);
        sideNav.setCloseOnClick(true);
        for(Links l : DataHelper.getAllSideNavLinks()){
            MaterialLink link = new MaterialLink(l.getName());
            link.setIconType(l.getIcon());
            link.setHref(l.getLink());
            sideNav.add(link);
        }
    }

}
