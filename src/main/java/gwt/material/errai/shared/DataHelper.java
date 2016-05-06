package gwt.material.errai.shared;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    public static List<Links> getAllSideNavLinks() {
        List<Links> links = new ArrayList<Links>();
        links.add(Links.HOME);
        links.add(Links.COLLECTIONS);
        links.add(Links.COMMUNITIES);
        links.add(Links.PROFILE);
        return links;
    }

    public static List<Links> getAllNavSectionLinks() {
        List<Links> links = new ArrayList<Links>();
        links.add(Links.APPS);
        links.add(Links.NOTIFICATIONS);
        return links;
    }

    public static List<Links> getAllTabLinks() {
        List<Links> links = new ArrayList<Links>();
        links.add(Links.FEATURED);
        links.add(Links.FOLLOWING);
        links.add(Links.YOURS);
        return links;
    }


    public static List<CollectionDTO> getAllCollections() {
        List<CollectionDTO> dtos = new ArrayList<CollectionDTO>();
        // String name, String description, String link, String picture, String color, UserDTO user
        //dtos.add(new CollectionDTO("Android Development Patterns", "Android Developers", "#link1", "https://lh3.googleusercontent.com/v5qz9KgMteM2F00tvu9mV9N41Ln1b3rubQnhDmLuRsI=w640-h360-p-rw", "purple", new UserDTO("John Doe", "https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg")));
        //dtos.add(new CollectionDTO("Android Development Patterns", "Android Developers", "#link1", "https://lh3.googleusercontent.com/v5qz9KgMteM2F00tvu9mV9N41Ln1b3rubQnhDmLuRsI=w640-h360-p-rw", "purple", new UserDTO("John Doe", "https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg")));
        //dtos.add(new CollectionDTO("Android Development Patterns", "Android Developers", "#link1", "https://lh3.googleusercontent.com/v5qz9KgMteM2F00tvu9mV9N41Ln1b3rubQnhDmLuRsI=w640-h360-p-rw", "purple", new UserDTO("John Doe", "https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg")));
        //dtos.add(new CollectionDTO("Android Development Patterns", "Android Developers", "#link1", "https://lh3.googleusercontent.com/v5qz9KgMteM2F00tvu9mV9N41Ln1b3rubQnhDmLuRsI=w640-h360-p-rw", "purple", new UserDTO("John Doe", "https://s3.amazonaws.com/uifaces/faces/twitter/stevedesigner/128.jpg")));
        return  dtos;
    }



}
