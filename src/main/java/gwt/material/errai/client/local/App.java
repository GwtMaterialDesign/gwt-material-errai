package gwt.material.errai.client.local;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.constants.IconSize;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.client.ui.MaterialIcon;
import gwt.material.design.client.ui.MaterialLabel;
import gwt.material.design.client.ui.MaterialPanel;
import org.jboss.errai.ioc.client.api.EntryPoint;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@EntryPoint
public class App extends Composite{

    @Inject
    private RootPanel root;

    private MaterialPanel panel = new MaterialPanel();
    private MaterialIcon icon = new MaterialIcon();
    private MaterialLabel title = new MaterialLabel();
    private MaterialLabel description = new MaterialLabel();

    @PostConstruct
    @Override
    protected void onLoad() {
        super.onLoad();
        panel.setTextAlign(TextAlign.CENTER);

        icon.setMarginTop(120);
        icon.setTextColor("blue darken-1");
        icon.setIconType(IconType.POLYMER);
        icon.setIconSize(IconSize.LARGE);

        title.setText("Hello MD World");
        title.setTextColor("blue");
        title.setFontSize(2, Style.Unit.EM);

        description.setText("Start building now your gwt-material apps.");
        description.setTextColor("blue");
        description.setFontSize(0.8, Style.Unit.EM);

        panel.add(icon);
        panel.add(title);
        panel.add(description);
        root.add(panel);
    }


}
