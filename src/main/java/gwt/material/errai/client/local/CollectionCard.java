package gwt.material.errai.client.local;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.*;
import gwt.material.errai.shared.CollectionDTO;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class CollectionCard extends Composite{

    private CollectionDTO collection;

    @Inject
    @DataField("collection-card")
    protected MaterialCard card = new MaterialCard();

    protected MaterialCardImage cardImage = new MaterialCardImage();
    protected MaterialImage image = new MaterialImage();
    protected MaterialCardContent content = new MaterialCardContent();
    protected MaterialImage profileImage = new MaterialImage();
    protected MaterialLabel title = new MaterialLabel();
    protected MaterialLabel description = new MaterialLabel();

    @PostConstruct
    public void init() {
        card.setBackgroundColor("indigo lighten-1");
        image.setUrl("https://lh3.googleusercontent.com/v5qz9KgMteM2F00tvu9mV9N41Ln1b3rubQnhDmLuRsI=w640-h360-p-rw");
        cardImage.add(image);
        card.add(cardImage);

        content.setTextColor("white");
        content.setHeight("120px");

        profileImage.setHeight("32px");
        profileImage.setWidth("32px");
        profileImage.setCircle(true);
        profileImage.setMarginTop(-32);
        profileImage.setLayoutPosition(Style.Position.ABSOLUTE);
        profileImage.setUrl("http://lh3.googleusercontent.com/-mGTYed3Uh-E/AAAAAAAAAAI/AAAAAAAAHXA/GZnkarBLO-s/s24-p-rw-no/photo.jpg");
        content.add(profileImage);

        title.setText("Android Development Patterns");
        title.setFontSize("1em");
        content.add(title);

        description.setText("Android Developers");
        description.setOpacity(0.6);
        description.setMarginTop(4);
        content.add(description);

        card.add(content);
    }
}
