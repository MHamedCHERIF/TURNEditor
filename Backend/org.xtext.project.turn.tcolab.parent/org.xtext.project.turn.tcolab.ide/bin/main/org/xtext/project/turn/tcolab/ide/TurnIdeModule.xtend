/*
 * generated by Xtext 2.12.0
 */
package org.xtext.project.turn.tcolab.ide

import java.util.List
import org.eclipse.lsp4j.CodeLens
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalCreator
import org.eclipse.xtext.ide.server.Document
import org.eclipse.xtext.ide.server.codeActions.ICodeActionService
import org.eclipse.xtext.ide.server.codelens.ICodeLensResolver
import org.eclipse.xtext.ide.server.contentassist.ContentAssistService
import org.eclipse.xtext.ide.server.symbol.DocumentSymbolService
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.ide.refactoring.IRenameStrategy2
import org.eclipse.xtext.ide.server.formatting.FormattingService
import org.xtext.example.mydsl.ide.AbstractTURNIdeModule
import org.xtext.project.turn.tcolab.ide.codeAction.CodeActionService
import org.xtext.project.turn.tcolab.ide.symbols.TurnDocumentSymbolService
import org.xtext.project.turn.tcolab.ide.completion.TurnContentAssistService
import org.xtext.project.turn.tcolab.ide.completion.TurnContentProposalCreator
import org.xtext.project.turn.tcolab.ide.rename.TurnRenameStrategy
import org.xtext.project.turn.tcolab.ide.formatting.TurnFormattingService

/**
 * Use this class to register ide components.
 */
class TurnIdeModule extends AbstractTURNIdeModule {

	def Class<? extends DocumentSymbolService> bindDocumentSymbolService() {
		return TurnDocumentSymbolService;
	}

	def Class<? extends ICodeLensResolver> bindICodeLensResolver() {
		return NoOpCodeLensResolver;
	}

	def Class<? extends ContentAssistService> bindContentAssistService() {
		return TurnContentAssistService;
	}

	def Class<? extends IdeContentProposalCreator> bindIdeContentProposalCreator() {
		return TurnContentProposalCreator;
	}

	def Class<? extends ICodeActionService> bindICodeActionService() {
		return CodeActionService;
	}

	override Class<? extends IRenameStrategy2> bindIRenameStrategy2() {
		return TurnRenameStrategy
	}

	static class NoOpCodeLensResolver implements ICodeLensResolver {

		override resolveCodeLens(Document document, XtextResource resource, CodeLens codeLens,
			CancelIndicator indicator) {
			// HACKY fix for https://github.com/TypeFox/monaco-languageclient/pull/6
			if (codeLens?.command?.arguments?.head instanceof List<?>) {
				codeLens.command.arguments = codeLens.command.arguments.head as List<Object>
			}
			return codeLens
		}

	}

	def Class<? extends FormattingService> bindFormattingService() {
		TurnFormattingService
	}
}