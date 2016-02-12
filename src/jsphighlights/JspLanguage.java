package jsphighlights;

import com.intellij.lang.Language;

/**
 * Created by Oleksandr_Kononenko on 09.02.2016.
 */
public class JspLanguage extends Language {

    public static JspLanguage INSTANCE = new JspLanguage();

    private JspLanguage(){
        super(JspLanguage.INSTANCE, "JSP", "text/xhtml", "application/xhtml+xml");
    }

}
