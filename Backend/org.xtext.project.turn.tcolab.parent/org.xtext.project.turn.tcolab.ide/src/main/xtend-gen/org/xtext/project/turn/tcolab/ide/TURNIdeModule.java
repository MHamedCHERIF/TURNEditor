/**
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.tcolab.ide;

import java.util.List;
import org.eclipse.lsp4j.CodeLens;
import org.eclipse.lsp4j.Command;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator;
import org.eclipse.xtext.ide.refactoring.IRenameStrategy2;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService;
import org.eclipse.xtext.ide.server.codelens.ICodeLensResolver;
import org.eclipse.xtext.ide.server.contentassist.ContentAssistService;
import org.eclipse.xtext.ide.server.formatting.FormattingService;
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolService;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl.ide.AbstractTURNIdeModule;
import org.xtext.project.turn.tcolab.ide.codeAction.CodeActionService;
import org.xtext.project.turn.tcolab.ide.completion.TurnContentAssistService;
import org.xtext.project.turn.tcolab.ide.completion.TurnContentProposalCreator;
import org.xtext.project.turn.tcolab.ide.formatting.TurnFormattingService;
import org.xtext.project.turn.tcolab.ide.rename.TurnRenameStrategy;
import org.xtext.project.turn.tcolab.ide.symbols.TurnDocumentSymbolService;

/**
 * Use this class to register ide components.
 */
@SuppressWarnings("all")
public class TURNIdeModule extends AbstractTURNIdeModule {
  public static class NoOpCodeLensResolver implements ICodeLensResolver {
    @Override
    public CodeLens resolveCodeLens(final Document document, final XtextResource resource, final CodeLens codeLens, final CancelIndicator indicator) {
      Command _command = null;
      if (codeLens!=null) {
        _command=codeLens.getCommand();
      }
      List<Object> _arguments = null;
      if (_command!=null) {
        _arguments=_command.getArguments();
      }
      Object _head = null;
      if (_arguments!=null) {
        _head=IterableExtensions.<Object>head(_arguments);
      }
      if ((_head instanceof List<?>)) {
        Command _command_1 = codeLens.getCommand();
        Object _head_1 = IterableExtensions.<Object>head(codeLens.getCommand().getArguments());
        _command_1.setArguments(((List<Object>) _head_1));
      }
      return codeLens;
    }
  }
  
  public Class<? extends DocumentSymbolService> bindDocumentSymbolService() {
    return TurnDocumentSymbolService.class;
  }
  
  public Class<? extends ICodeLensResolver> bindICodeLensResolver() {
    return TURNIdeModule.NoOpCodeLensResolver.class;
  }
  
  public Class<? extends ContentAssistService> bindContentAssistService() {
    return TurnContentAssistService.class;
  }
  
  public Class<? extends IdeContentProposalCreator> bindIdeContentProposalCreator() {
    return TurnContentProposalCreator.class;
  }
  
  public Class<? extends ICodeActionService> bindICodeActionService() {
    return CodeActionService.class;
  }
  
  @Override
  public Class<? extends IRenameStrategy2> bindIRenameStrategy2() {
    return TurnRenameStrategy.class;
  }
  
  public Class<? extends FormattingService> bindFormattingService() {
    return TurnFormattingService.class;
  }
}