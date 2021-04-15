package uk.ac.kcl.inf.languages.g2048.typing;

import com.google.inject.Provider;
import it.xsemantics.runtime.ErrorInformation;
import it.xsemantics.runtime.Result;
import it.xsemantics.runtime.RuleApplicationTrace;
import it.xsemantics.runtime.RuleEnvironment;
import it.xsemantics.runtime.RuleFailedException;
import it.xsemantics.runtime.XsemanticsProvider;
import it.xsemantics.runtime.XsemanticsRuntimeSystem;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import uk.ac.kcl.inf.languages.g2048.g2048.LevelDefineStatement;
import uk.ac.kcl.inf.languages.g2048.g2048.SizeDefineStatement;
import uk.ac.kcl.inf.languages.g2048.g2048.Statement;
import uk.ac.kcl.inf.languages.g2048.g2048.TitleDefineStatement;
import uk.ac.kcl.inf.languages.g2048.typing.g2048Type;

@SuppressWarnings("all")
public class g2048TypeSystem extends XsemanticsRuntimeSystem {
  public static final String RULESTITLE = "uk.ac.kcl.inf.languages.g2048.typing.RulesTitle";
  
  public static final String RULESSIZE = "uk.ac.kcl.inf.languages.g2048.typing.RulesSize";
  
  public static final String RULESLEVEL = "uk.ac.kcl.inf.languages.g2048.typing.RulesLevel";
  
  private PolymorphicDispatcher<Result<g2048Type>> typeDispatcher;
  
  public g2048TypeSystem() {
    init();
  }
  
  public void init() {
    typeDispatcher = buildPolymorphicDispatcher1(
    	"typeImpl", 3, "|-", ":");
  }
  
  public Result<g2048Type> type(final Statement state) {
    return type(new RuleEnvironment(), null, state);
  }
  
  public Result<g2048Type> type(final RuleEnvironment _environment_, final Statement state) {
    return type(_environment_, null, state);
  }
  
  public Result<g2048Type> type(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Statement state) {
    return getFromCache("type", _environment_, _trace_,
    	new XsemanticsProvider<Result<g2048Type>>(_environment_, _trace_) {
    		public Result<g2048Type> doGet() {
    			try {
    				return typeInternal(_environment_, _trace_, state);
    			} catch (Exception _e_type) {
    				return resultForFailure(_e_type);
    			}
    		}
    	}, state);
  }
  
  protected Result<g2048Type> typeInternal(final RuleEnvironment _environment_, final RuleApplicationTrace _trace_, final Statement state) {
    return getFromCache("typeInternal", _environment_, _trace_,
    	new XsemanticsProvider<Result<g2048Type>>(_environment_, _trace_) {
    		public Result<g2048Type> doGet() {
    			try {
    				checkParamsNotNull(state);
    				return typeDispatcher.invoke(_environment_, _trace_, state);
    			} catch (Exception _e_type) {
    				sneakyThrowRuleFailedException(_e_type);
    				return null;
    			}
    		}
    	}, state);
  }
  
  protected void typeThrowException(final String _error, final String _issue, final Exception _ex, final Statement state, final ErrorInformation[] _errorInformations) throws RuleFailedException {
    String _stringRep = this.stringRep(state);
    String _plus = ("Cannot type " + _stringRep);
    String error = _plus;
    throwRuleFailedException(error,
    	_issue, _ex, new ErrorInformation(null, null));
  }
  
  protected Result<g2048Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TitleDefineStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<g2048Type> _result_ = applyRuleRulesTitle(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("rulesTitle") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleRulesTitle) {
    	typeThrowException(ruleName("rulesTitle") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "g2048Type",
    		RULESTITLE,
    		e_applyRuleRulesTitle, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<g2048Type> applyRuleRulesTitle(final RuleEnvironment G, final RuleApplicationTrace _trace_, final TitleDefineStatement exp) throws RuleFailedException {
    
    return new Result<g2048Type>(_applyRuleRulesTitle_1(G, exp));
  }
  
  private g2048Type _applyRuleRulesTitle_1(final RuleEnvironment G, final TitleDefineStatement exp) throws RuleFailedException {
    return g2048Type.STRING;
  }
  
  protected Result<g2048Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final SizeDefineStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<g2048Type> _result_ = applyRuleRulesSize(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("rulesSize") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleRulesSize) {
    	typeThrowException(ruleName("rulesSize") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "g2048Type",
    		RULESSIZE,
    		e_applyRuleRulesSize, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<g2048Type> applyRuleRulesSize(final RuleEnvironment G, final RuleApplicationTrace _trace_, final SizeDefineStatement exp) throws RuleFailedException {
    
    return new Result<g2048Type>(_applyRuleRulesSize_1(G, exp));
  }
  
  private g2048Type _applyRuleRulesSize_1(final RuleEnvironment G, final SizeDefineStatement exp) throws RuleFailedException {
    return g2048Type.INT;
  }
  
  protected Result<g2048Type> typeImpl(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LevelDefineStatement exp) throws RuleFailedException {
    try {
    	final RuleApplicationTrace _subtrace_ = newTrace(_trace_);
    	final Result<g2048Type> _result_ = applyRuleRulesLevel(G, _subtrace_, exp);
    	addToTrace(_trace_, new Provider<Object>() {
    		public Object get() {
    			return ruleName("rulesLevel") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + stringRep(_result_.getFirst());
    		}
    	});
    	addAsSubtrace(_trace_, _subtrace_);
    	return _result_;
    } catch (Exception e_applyRuleRulesLevel) {
    	typeThrowException(ruleName("rulesLevel") + stringRepForEnv(G) + " |- " + stringRep(exp) + " : " + "g2048Type",
    		RULESLEVEL,
    		e_applyRuleRulesLevel, exp, new ErrorInformation[] {new ErrorInformation(exp)});
    	return null;
    }
  }
  
  protected Result<g2048Type> applyRuleRulesLevel(final RuleEnvironment G, final RuleApplicationTrace _trace_, final LevelDefineStatement exp) throws RuleFailedException {
    
    return new Result<g2048Type>(_applyRuleRulesLevel_1(G, exp));
  }
  
  private g2048Type _applyRuleRulesLevel_1(final RuleEnvironment G, final LevelDefineStatement exp) throws RuleFailedException {
    return g2048Type.STRING;
  }
}
