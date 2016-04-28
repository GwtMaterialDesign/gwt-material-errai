package gwt.material.errai.shared;

public class UserDTO {

    private long id;
    private String user;
    private String picture;

    public UserDTO() {}

    public UserDTO(long id, String user, String picture) {
        this.id = id;
        this.user = user;
        this.picture = picture;
    }

    public UserDTO(String user, String picture) {
        this.user = user;
        this.picture = picture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
