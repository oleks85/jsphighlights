package jsphighlights.utils.tld;

import jsphighlights.tld.Namespace;
import org.w3c.dom.Node;

/**
 * Created by Yurii_Banin on 2/29/2016.
 */
public class TldNamespaceParser {
    static final String TAG_NODE_NAME = "tag";
    static final String DESCRIPTION_NODE_NAME = "description";
    static final String DISPLAY_NAME_NODE_NAME = "display-name";
    static final String SHORT_NAME_NODE_NAME = "short-name";

    public Namespace parseNamespace(Node rootNode) {
        Namespace namespace = new Namespace();
        TagParser tagParser = new TagParser();
        for(int i = 0; i < rootNode.getChildNodes().getLength(); i++) {
            Node child = rootNode.getChildNodes().item(i);
            String childName = child.getNodeName();
            if(childName.equalsIgnoreCase(DESCRIPTION_NODE_NAME)) {
                namespace.setDescription(child.getTextContent());
            } else if(childName.equalsIgnoreCase(DISPLAY_NAME_NODE_NAME)) {
                namespace.setName(child.getTextContent());
            } else if(childName.equalsIgnoreCase(SHORT_NAME_NODE_NAME)) {
                namespace.setShortName(child.getTextContent());
            } else if(childName.equalsIgnoreCase(TAG_NODE_NAME)) {
                namespace.getTags().add(tagParser.parseTag(child));
            }
        }
        return namespace;
    }
}