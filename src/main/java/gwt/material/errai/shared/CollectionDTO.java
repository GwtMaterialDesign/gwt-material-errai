package gwt.material.errai.shared;

import org.jboss.errai.databinding.client.api.Bindable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Bindable
@Entity
@NamedQuery(name = "allUsers", query = "SELECT s FROM CollectionDTO s ORDER BY s.name")
public class CollectionDTO {

    private String name;
    private String description;
    private String link;
    private String picture;
    private String color;

    public CollectionDTO() {}

    public CollectionDTO(String name, String description, String link, String picture, String color) {
        this.name = name;
        this.description = description;
        this.link = link;
        this.picture = picture;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
