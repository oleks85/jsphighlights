package jsphighlights;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * Created by Oleksandr_Kononenko on 09.02.2016.
 */
public class JspFileType extends LanguageFileType {

    public static JspFileType INSTANCE = new JspFileType();

    private JspFileType(){
        super(JspLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "JSP";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "jsp file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jsp";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Jsp;
    }
}
