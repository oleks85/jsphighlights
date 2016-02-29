package jsphighlights.tld;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yurii_Banin on 2/12/2016.
 */
public class Namespace {

    private String name;
    private String shortName;
    private String description;
    private List<Tag> tags = new ArrayList<Tag>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTags() {
        return tags;
    }
}
