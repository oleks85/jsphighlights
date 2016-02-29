package jsphighlights.utils.tld;

import jsphighlights.tld.Attribute;
import jsphighlights.tld.Tag;
import org.w3c.dom.Node;

/**
 * Created by Yurii_Banin on 2/29/2016.
 */
public class TagParser {

    static final String NAME_NODE_NAME = "name";
    static final String ATTRIBUTE_NODE_NAME = "attribute";
    static final String REQUIRED_NODE_NAME = "required";

    public Tag parseTag(Node tagNode) {
        Tag tag = new Tag();
        for(int i = 0; i < tagNode.getChildNodes().getLength(); i++) {
            Node child =  tagNode.getChildNodes().item(i);
            String childName = child.getNodeName();
            if(childName.equalsIgnoreCase(NAME_NODE_NAME)) {
                tag.setName(child.getTextContent());
            } else if (childName.equalsIgnoreCase(ATTRIBUTE_NODE_NAME)) {
                tag.getAttributes().add(extractAttribute(child));
            }
        }
        return tag;
    }

    private Attribute extractAttribute(Node attributeNode) {
        Attribute attr = new Attribute();
        for(int i = 0; i < attributeNode.getChildNodes().getLength(); i++) {
            Node child = attributeNode.getChildNodes().item(i);
            String childName = child.getNodeName();
            if(childName.equalsIgnoreCase(NAME_NODE_NAME)) {
                attr.setName(child.getTextContent());
            } else if(childName.equalsIgnoreCase(REQUIRED_NODE_NAME)) {
                String val = child.getTextContent();
                attr.setRequired(val == null ? false : Boolean.parseBoolean(val));
            }
        }
        return attr;
    }
}
