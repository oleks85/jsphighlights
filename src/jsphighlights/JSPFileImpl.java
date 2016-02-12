package jsphighlights;

import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.impl.source.html.ScriptSupportUtil;
import com.intellij.psi.impl.source.xml.XmlFileImpl;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Oleksandr_Kononenko on 10.02.2016.
 */
public class JSPFileImpl extends XmlFileImpl {

    public JSPFileImpl(FileViewProvider viewProvider, IElementType elementType) {
        super(viewProvider, elementType);
    }

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state, PsiElement lastParent, @NotNull PsiElement place) {
        return super.processDeclarations(processor, state, lastParent, place) &&
                ScriptSupportUtil.processDeclarations(this, processor, state, lastParent, place);

    }
}
