package jsphighlights.tld;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yurii_Banin on 2/12/2016.
 */
public class Tag {

    private String name;
    private List<Tag> subTags = new ArrayList<Tag>();
    private List<Attribute> attributes = new ArrayList<Attribute>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tag> getSubTags() {
        return subTags;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }
}