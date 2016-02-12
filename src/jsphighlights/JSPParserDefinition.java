package jsphighlights;

import com.intellij.lang.xhtml.XHTMLParserDefinition;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.source.xml.XmlFileImpl;
import com.intellij.psi.tree.IFileElementType;

/**
 * Created by Oleksandr_Kononenko on 10.02.2016.
 */
public class JSPParserDefinition extends XHTMLParserDefinition {

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new JSPFileImpl(viewProvider, new IFileElementType(JspLanguage.INSTANCE));
    }
}
