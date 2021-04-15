/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.languages.g2048.g2048.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.languages.g2048.g2048.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class G2048FactoryImpl extends EFactoryImpl implements G2048Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static G2048Factory init()
  {
    try
    {
      G2048Factory theG2048Factory = (G2048Factory)EPackage.Registry.INSTANCE.getEFactory(G2048Package.eNS_URI);
      if (theG2048Factory != null)
      {
        return theG2048Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new G2048FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public G2048FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case G2048Package.G2048_PROGRAM: return createG2048Program();
      case G2048Package.STATEMENT: return createStatement();
      case G2048Package.TITLE_DEFINE_STATEMENT: return createTitleDefineStatement();
      case G2048Package.SIZE_DEFINE_STATEMENT: return createSizeDefineStatement();
      case G2048Package.LEVEL_DEFINE_STATEMENT: return createLevelDefineStatement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case G2048Package.LEVEL:
        return createLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case G2048Package.LEVEL:
        return convertLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public G2048Program createG2048Program()
  {
    G2048ProgramImpl g2048Program = new G2048ProgramImpl();
    return g2048Program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TitleDefineStatement createTitleDefineStatement()
  {
    TitleDefineStatementImpl titleDefineStatement = new TitleDefineStatementImpl();
    return titleDefineStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SizeDefineStatement createSizeDefineStatement()
  {
    SizeDefineStatementImpl sizeDefineStatement = new SizeDefineStatementImpl();
    return sizeDefineStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LevelDefineStatement createLevelDefineStatement()
  {
    LevelDefineStatementImpl levelDefineStatement = new LevelDefineStatementImpl();
    return levelDefineStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Level createLevelFromString(EDataType eDataType, String initialValue)
  {
    Level result = Level.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public G2048Package getG2048Package()
  {
    return (G2048Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static G2048Package getPackage()
  {
    return G2048Package.eINSTANCE;
  }

} //G2048FactoryImpl