package gwt.material.errai.shared;

import gwt.material.design.client.constants.IconType;

public enum Links {

    // SIDENAV LINKS

    HOME(IconType.HOME, "Home", "#home"),
    COLLECTIONS(IconType.COLLECTIONS, "Collection", "#collections"),
    COMMUNITIES(IconType.GROUP_WORK, "Communities", "#communities"),
    PROFILE(IconType.ACCOUNT_CIRCLE, "Profile", "#profile"),

    // NAVBAR LINKS
    APPS(IconType.APPS, "Apps", "#apps"),
    NOTIFICATIONS(IconType.NOTIFICATIONS, "Notifications", "#notifications"),

    // TAB LINKS
    FEATURED(null, "Featured", "#featured"),
    FOLLOWING(null, "Following", "#following"),
    YOURS(null, "Yours", "#yours");

    IconType icon;
    String name;
    String link;

    Links(IconType icon, String name, String link){
        this.icon = icon;
        this.name = name;
        this.link = link;
    }

    public void setIcon(IconType icon) {
        this.icon = icon;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IconType getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}
