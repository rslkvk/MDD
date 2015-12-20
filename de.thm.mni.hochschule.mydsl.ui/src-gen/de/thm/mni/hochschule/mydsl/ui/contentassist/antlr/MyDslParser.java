/*
 * generated by Xtext
 */
package de.thm.mni.hochschule.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.thm.mni.hochschule.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser result = new de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDozentAccess().getAlternatives(), "rule__Dozent__Alternatives");
					put(grammarAccess.getHochschuleAccess().getGroup(), "rule__Hochschule__Group__0");
					put(grammarAccess.getHochschuleAccess().getGroup_6(), "rule__Hochschule__Group_6__0");
					put(grammarAccess.getHochschuleAccess().getGroup_9(), "rule__Hochschule__Group_9__0");
					put(grammarAccess.getFachbereichAccess().getGroup(), "rule__Fachbereich__Group__0");
					put(grammarAccess.getFachbereichAccess().getGroup_7(), "rule__Fachbereich__Group_7__0");
					put(grammarAccess.getFachbereichAccess().getGroup_10(), "rule__Fachbereich__Group_10__0");
					put(grammarAccess.getFachbereichAccess().getGroup_11(), "rule__Fachbereich__Group_11__0");
					put(grammarAccess.getFachbereichAccess().getGroup_11_2(), "rule__Fachbereich__Group_11_2__0");
					put(grammarAccess.getStudiengangAccess().getGroup(), "rule__Studiengang__Group__0");
					put(grammarAccess.getStudiengangAccess().getGroup_7(), "rule__Studiengang__Group_7__0");
					put(grammarAccess.getStudiengangAccess().getGroup_10(), "rule__Studiengang__Group_10__0");
					put(grammarAccess.getVorlesungAccess().getGroup(), "rule__Vorlesung__Group__0");
					put(grammarAccess.getVorlesungAccess().getGroup_13(), "rule__Vorlesung__Group_13__0");
					put(grammarAccess.getVorlesungAccess().getGroup_16(), "rule__Vorlesung__Group_16__0");
					put(grammarAccess.getVorlesungAccess().getGroup_19(), "rule__Vorlesung__Group_19__0");
					put(grammarAccess.getStudentAccess().getGroup(), "rule__Student__Group__0");
					put(grammarAccess.getStudentAccess().getGroup_7(), "rule__Student__Group_7__0");
					put(grammarAccess.getStudentAccess().getGroup_7_2(), "rule__Student__Group_7_2__0");
					put(grammarAccess.getDozentAccess().getGroup_0(), "rule__Dozent__Group_0__0");
					put(grammarAccess.getDozentAccess().getGroup_1(), "rule__Dozent__Group_1__0");
					put(grammarAccess.getProfessorAccess().getGroup(), "rule__Professor__Group__0");
					put(grammarAccess.getProfessorAccess().getGroup_9(), "rule__Professor__Group_9__0");
					put(grammarAccess.getLehrbeauftragerAccess().getGroup(), "rule__Lehrbeauftrager__Group__0");
					put(grammarAccess.getLehrbeauftragerAccess().getGroup_9(), "rule__Lehrbeauftrager__Group_9__0");
					put(grammarAccess.getEvaluationAccess().getGroup(), "rule__Evaluation__Group__0");
					put(grammarAccess.getHochschuleAccess().getNameAssignment_3(), "rule__Hochschule__NameAssignment_3");
					put(grammarAccess.getHochschuleAccess().getStudentAssignment_5(), "rule__Hochschule__StudentAssignment_5");
					put(grammarAccess.getHochschuleAccess().getStudentAssignment_6_1(), "rule__Hochschule__StudentAssignment_6_1");
					put(grammarAccess.getHochschuleAccess().getFachbereichAssignment_8(), "rule__Hochschule__FachbereichAssignment_8");
					put(grammarAccess.getHochschuleAccess().getFachbereichAssignment_9_1(), "rule__Hochschule__FachbereichAssignment_9_1");
					put(grammarAccess.getFachbereichAccess().getNameAssignment_2(), "rule__Fachbereich__NameAssignment_2");
					put(grammarAccess.getFachbereichAccess().getAliasAssignment_4(), "rule__Fachbereich__AliasAssignment_4");
					put(grammarAccess.getFachbereichAccess().getStudiengangAssignment_6(), "rule__Fachbereich__StudiengangAssignment_6");
					put(grammarAccess.getFachbereichAccess().getStudiengangAssignment_7_1(), "rule__Fachbereich__StudiengangAssignment_7_1");
					put(grammarAccess.getFachbereichAccess().getDozentAssignment_9(), "rule__Fachbereich__DozentAssignment_9");
					put(grammarAccess.getFachbereichAccess().getDozentAssignment_10_1(), "rule__Fachbereich__DozentAssignment_10_1");
					put(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_1(), "rule__Fachbereich__VorlesungAssignment_11_1");
					put(grammarAccess.getFachbereichAccess().getVorlesungAssignment_11_2_1(), "rule__Fachbereich__VorlesungAssignment_11_2_1");
					put(grammarAccess.getStudiengangAccess().getNameAssignment_2(), "rule__Studiengang__NameAssignment_2");
					put(grammarAccess.getStudiengangAccess().getNcAssignment_4(), "rule__Studiengang__NcAssignment_4");
					put(grammarAccess.getStudiengangAccess().getStudentAssignment_6(), "rule__Studiengang__StudentAssignment_6");
					put(grammarAccess.getStudiengangAccess().getStudentAssignment_7_1(), "rule__Studiengang__StudentAssignment_7_1");
					put(grammarAccess.getStudiengangAccess().getVorlesungAssignment_9(), "rule__Studiengang__VorlesungAssignment_9");
					put(grammarAccess.getStudiengangAccess().getVorlesungAssignment_10_1(), "rule__Studiengang__VorlesungAssignment_10_1");
					put(grammarAccess.getVorlesungAccess().getNameAssignment_2(), "rule__Vorlesung__NameAssignment_2");
					put(grammarAccess.getVorlesungAccess().getModulnrAssignment_4(), "rule__Vorlesung__ModulnrAssignment_4");
					put(grammarAccess.getVorlesungAccess().getBeschreibungAssignment_6(), "rule__Vorlesung__BeschreibungAssignment_6");
					put(grammarAccess.getVorlesungAccess().getCrpAssignment_8(), "rule__Vorlesung__CrpAssignment_8");
					put(grammarAccess.getVorlesungAccess().getDozentAssignment_10(), "rule__Vorlesung__DozentAssignment_10");
					put(grammarAccess.getVorlesungAccess().getStudentAssignment_12(), "rule__Vorlesung__StudentAssignment_12");
					put(grammarAccess.getVorlesungAccess().getStudentAssignment_13_1(), "rule__Vorlesung__StudentAssignment_13_1");
					put(grammarAccess.getVorlesungAccess().getTutorAssignment_15(), "rule__Vorlesung__TutorAssignment_15");
					put(grammarAccess.getVorlesungAccess().getTutorAssignment_16_1(), "rule__Vorlesung__TutorAssignment_16_1");
					put(grammarAccess.getVorlesungAccess().getEvaluationAssignment_18(), "rule__Vorlesung__EvaluationAssignment_18");
					put(grammarAccess.getVorlesungAccess().getEvaluationAssignment_19_1(), "rule__Vorlesung__EvaluationAssignment_19_1");
					put(grammarAccess.getStudentAccess().getMatrikelnrAssignment_2(), "rule__Student__MatrikelnrAssignment_2");
					put(grammarAccess.getStudentAccess().getVornameAssignment_4(), "rule__Student__VornameAssignment_4");
					put(grammarAccess.getStudentAccess().getNachnameAssignment_6(), "rule__Student__NachnameAssignment_6");
					put(grammarAccess.getStudentAccess().getVorlesungAssignment_7_1(), "rule__Student__VorlesungAssignment_7_1");
					put(grammarAccess.getStudentAccess().getVorlesungAssignment_7_2_1(), "rule__Student__VorlesungAssignment_7_2_1");
					put(grammarAccess.getProfessorAccess().getPersonalnrAssignment_2(), "rule__Professor__PersonalnrAssignment_2");
					put(grammarAccess.getProfessorAccess().getVornameAssignment_4(), "rule__Professor__VornameAssignment_4");
					put(grammarAccess.getProfessorAccess().getNachnameAssignment_6(), "rule__Professor__NachnameAssignment_6");
					put(grammarAccess.getProfessorAccess().getVorlesungAssignment_8(), "rule__Professor__VorlesungAssignment_8");
					put(grammarAccess.getProfessorAccess().getVorlesungAssignment_9_1(), "rule__Professor__VorlesungAssignment_9_1");
					put(grammarAccess.getLehrbeauftragerAccess().getPersonalnrAssignment_2(), "rule__Lehrbeauftrager__PersonalnrAssignment_2");
					put(grammarAccess.getLehrbeauftragerAccess().getVornameAssignment_4(), "rule__Lehrbeauftrager__VornameAssignment_4");
					put(grammarAccess.getLehrbeauftragerAccess().getNachnameAssignment_6(), "rule__Lehrbeauftrager__NachnameAssignment_6");
					put(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_8(), "rule__Lehrbeauftrager__VorlesungAssignment_8");
					put(grammarAccess.getLehrbeauftragerAccess().getVorlesungAssignment_9_1(), "rule__Lehrbeauftrager__VorlesungAssignment_9_1");
					put(grammarAccess.getEvaluationAccess().getGesamtnoteAssignment_2(), "rule__Evaluation__GesamtnoteAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (de.thm.mni.hochschule.mydsl.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleHochschule();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
