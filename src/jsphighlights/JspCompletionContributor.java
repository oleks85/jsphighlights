package jsphighlights;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;

/**
 * Created by Yurii_Banin on 2/12/2016.
 */
public class JspCompletionContributor extends XmlCompletionContributor {

    public JspCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(), new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        if (parameters.getPosition().getContext().toString().startsWith("XmlTag")) {
//                            try {
//                                String[] suggestions = new String[0];
//
//                                int i = 0;
//                                do {
//                                    resultSet.addElement(LookupElementBuilder.create(suggestions[i]));
//                                    i++;
//
//                                } while (suggestions[i] != null);
//
//
//                            } catch (NullPointerException e) {
//                            }
                            resultSet.addElement(LookupElementBuilder.create("attribute"));
                        }

                        if(parameters.getPosition().getContext().toString().startsWith("XmlAttribute")) {
//                            try {
//                                String[] suggestions = new String[0];
//
//                                int i = 0;
//                                do {
//                                    resultSet.addElement(LookupElementBuilder.create(suggestions[i]));
//                                    i++;
//
//                                } while (suggestions[i] != null);
//
//
//                            } catch (NullPointerException e) {
//                            }
                            //TODO tag completion
                            resultSet.addElement(LookupElementBuilder.create("tag"));
                        }


                    }
                }
        );
    }

}
