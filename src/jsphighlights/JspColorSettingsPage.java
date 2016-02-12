package jsphighlights;

import com.intellij.ide.highlighter.XmlFileHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.pages.XMLColorsPage;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Oleksandr_Kononenko on 09.02.2016.
 */
public class JspColorSettingsPage extends XMLColorsPage {

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new XmlFileHighlighter(false, true);
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "JSP";
    }
}
