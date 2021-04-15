/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.validation;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Conversions;
import uk.ac.kcl.inf.languages.g2048.g2048.G2048Package;
import uk.ac.kcl.inf.languages.g2048.g2048.G2048Program;
import uk.ac.kcl.inf.languages.g2048.g2048.Level;
import uk.ac.kcl.inf.languages.g2048.g2048.LevelDefineStatement;
import uk.ac.kcl.inf.languages.g2048.g2048.SizeDefineStatement;
import uk.ac.kcl.inf.languages.g2048.g2048.Statement;
import uk.ac.kcl.inf.languages.g2048.g2048.TitleDefineStatement;
import uk.ac.kcl.inf.languages.g2048.typing.validation.g2048TypeSystemValidator;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class G2048Validator extends g2048TypeSystemValidator {
  public static final String INVALID_CHECK_SIZE = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_SIZE";
  
  public static final String INVALID_CHECK_TITLE = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_TITLE";
  
  public static final String INVALID_CHECK_ORDER = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_ORDER";
  
  public static final String INVALID_CHECK_LEVEL = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_LEVEL";
  
  public static final String INVALID_CHECK_DUP = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_DUP";
  
  public static final String INVALID_CHECK_LEVEL_VARIABLE = "uk.ac.kcl.inf.languages.g2048.INVALID_CHECK_LEVEL_VARIABLE";
  
  @Check
  public void checkMapsize(final SizeDefineStatement decl) {
    int _size = decl.getSize();
    boolean _lessThan = (_size < 2);
    if (_lessThan) {
      this.warning("Map size should be larger than 1 ", decl, G2048Package.Literals.SIZE_DEFINE_STATEMENT__SIZE, G2048Validator.INVALID_CHECK_SIZE);
    }
  }
  
  @Check
  public void checktitle(final TitleDefineStatement decl) {
    boolean _isEmpty = decl.getTitle().isEmpty();
    if (_isEmpty) {
      this.warning("Title should not be empty", decl, G2048Package.Literals.TITLE_DEFINE_STATEMENT__TITLE, G2048Validator.INVALID_CHECK_TITLE);
    }
  }
  
  @Check
  public void checkLevelvalue(final LevelDefineStatement decl) {
    boolean _isEmpty = decl.getElement().isEmpty();
    if (_isEmpty) {
      this.warning("Level variable should not be empty", decl, G2048Package.Literals.LEVEL_DEFINE_STATEMENT__ELEMENT, G2048Validator.INVALID_CHECK_LEVEL_VARIABLE);
    }
  }
  
  @Check(CheckType.NORMAL)
  public void checkOrderLevelAndNumber(final G2048Program program) {
    final int[] list = { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };
    final String[] listValue = { "", "", "", "", "", "", "", "", "", "", "" };
    boolean warningVar = false;
    boolean warningDup = false;
    final Consumer<Statement> _function = (Statement statement) -> {
      int number = this.collectLevels(statement);
      String numberValue = this.collectLevelValue(statement);
      if ((!(number == 0))) {
        list[(number - 1)] = number;
        listValue[(number - 1)] = numberValue;
      }
    };
    program.getStatements().forEach(_function);
    Integer biggestValue = Collections.<Integer>max(((Collection<? extends Integer>)Conversions.doWrapArray(list)));
    if (((biggestValue).intValue() == 99)) {
      Collections.<Integer>sort(((List<Integer>)Conversions.doWrapArray(list)));
      Collections.reverse(((List<?>)Conversions.doWrapArray(list)));
      int frequency = Collections.frequency(((Collection<?>)Conversions.doWrapArray(list)), Integer.valueOf(99));
      if ((frequency == 10)) {
        this.warning("There must not only be one Level", program, G2048Package.Literals.G2048_PROGRAM__STATEMENTS, G2048Validator.INVALID_CHECK_LEVEL);
      }
      biggestValue = Integer.valueOf(list[frequency]);
    }
    Collections.<Integer>sort(((List<Integer>)Conversions.doWrapArray(list)));
    for (int i = 1; (i < ((biggestValue).intValue() + 1)); i++) {
      {
        int _get = list[(i - 1)];
        boolean _tripleEquals = (i == _get);
        boolean _not = (!_tripleEquals);
        if (_not) {
          warningVar = true;
        }
        String _get_1 = listValue[(i - 1)];
        boolean _notEquals = (!Objects.equal(_get_1, ""));
        if (_notEquals) {
          int wordFrequency = Collections.frequency(((Collection<?>)Conversions.doWrapArray(listValue)), listValue[(i - 1)]);
          if ((wordFrequency > 1)) {
            warningDup = true;
          }
        }
      }
    }
    if (warningVar) {
      this.warning("Levels must be in consistent order", program, G2048Package.Literals.G2048_PROGRAM__STATEMENTS, G2048Validator.INVALID_CHECK_ORDER);
    }
    if (warningDup) {
      this.warning("Level variables should not be the same", program, G2048Package.Literals.G2048_PROGRAM__STATEMENTS, G2048Validator.INVALID_CHECK_DUP);
    }
  }
  
  private int _collectLevels(final Statement stmt) {
    return 0;
  }
  
  private int _collectLevels(final TitleDefineStatement stmt) {
    return 0;
  }
  
  private int _collectLevels(final LevelDefineStatement stmt) {
    Level _level = stmt.getLevel();
    boolean _tripleEquals = (_level == Level.ONE);
    if (_tripleEquals) {
      return 1;
    }
    Level _level_1 = stmt.getLevel();
    boolean _tripleEquals_1 = (_level_1 == Level.TWO);
    if (_tripleEquals_1) {
      return 2;
    }
    Level _level_2 = stmt.getLevel();
    boolean _tripleEquals_2 = (_level_2 == Level.THREE);
    if (_tripleEquals_2) {
      return 3;
    }
    Level _level_3 = stmt.getLevel();
    boolean _tripleEquals_3 = (_level_3 == Level.FOUR);
    if (_tripleEquals_3) {
      return 4;
    }
    Level _level_4 = stmt.getLevel();
    boolean _tripleEquals_4 = (_level_4 == Level.FIVE);
    if (_tripleEquals_4) {
      return 5;
    }
    Level _level_5 = stmt.getLevel();
    boolean _tripleEquals_5 = (_level_5 == Level.SIX);
    if (_tripleEquals_5) {
      return 6;
    }
    Level _level_6 = stmt.getLevel();
    boolean _tripleEquals_6 = (_level_6 == Level.SEVEN);
    if (_tripleEquals_6) {
      return 7;
    }
    Level _level_7 = stmt.getLevel();
    boolean _tripleEquals_7 = (_level_7 == Level.EIGHT);
    if (_tripleEquals_7) {
      return 8;
    }
    Level _level_8 = stmt.getLevel();
    boolean _tripleEquals_8 = (_level_8 == Level.NINE);
    if (_tripleEquals_8) {
      return 9;
    }
    Level _level_9 = stmt.getLevel();
    boolean _tripleEquals_9 = (_level_9 == Level.TEN);
    if (_tripleEquals_9) {
      return 10;
    }
    Level _level_10 = stmt.getLevel();
    boolean _tripleEquals_10 = (_level_10 == Level.ELEVEN);
    if (_tripleEquals_10) {
      return 11;
    }
    return 0;
  }
  
  private String _collectLevelValue(final Statement stmt) {
    return "";
  }
  
  private String _collectLevelValue(final TitleDefineStatement stmt) {
    return "";
  }
  
  private String _collectLevelValue(final LevelDefineStatement stmt) {
    return stmt.getElement();
  }
  
  private int collectLevels(final Statement stmt) {
    if (stmt instanceof LevelDefineStatement) {
      return _collectLevels((LevelDefineStatement)stmt);
    } else if (stmt instanceof TitleDefineStatement) {
      return _collectLevels((TitleDefineStatement)stmt);
    } else if (stmt != null) {
      return _collectLevels(stmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
  
  private String collectLevelValue(final Statement stmt) {
    if (stmt instanceof LevelDefineStatement) {
      return _collectLevelValue((LevelDefineStatement)stmt);
    } else if (stmt instanceof TitleDefineStatement) {
      return _collectLevelValue((TitleDefineStatement)stmt);
    } else if (stmt != null) {
      return _collectLevelValue(stmt);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt).toString());
    }
  }
}