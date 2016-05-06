package gwt.material.errai.client.local;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.*;
import gwt.material.errai.shared.CollectionDTO;
import gwt.material.errai.shared.UserDTO;
import org.jboss.errai.databinding.client.api.DataBinder;
import org.jboss.errai.ui.client.widget.HasModel;
import org.jboss.errai.ui.shared.api.annotations.AutoBound;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class CollectionCard extends Composite implements HasModel<CollectionDTO>{

    @Inject @AutoBound
    DataBinder<CollectionDTO> dataBinder;

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
        cardImage.add(image);
        card.add(cardImage);

        content.setTextColor("white");
        content.setHeight("120px");

        profileImage.setHeight("32px");
        profileImage.setWidth("32px");
        profileImage.setCircle(true);
        profileImage.setMarginTop(-32);
        profileImage.setLayoutPosition(Style.Position.ABSOLUTE);
        content.add(profileImage);

        title.setFontSize("1em");
        content.add(title);

        description.setOpacity(0.6);
        description.setMarginTop(4);
        content.add(description);

        card.add(content);
    }

    @Override
    public CollectionDTO getModel() {
        return dataBinder.getModel();
    }

    @Override
    public void setModel(CollectionDTO collectionDTO) {
        card.setBackgroundColor(collectionDTO.getColor());
        dataBinder.setModel(collectionDTO);
        image.setUrl(collectionDTO.getPicture());
        title.setText(collectionDTO.getName());
        description.setText(collectionDTO.getDescription());

    }
}
