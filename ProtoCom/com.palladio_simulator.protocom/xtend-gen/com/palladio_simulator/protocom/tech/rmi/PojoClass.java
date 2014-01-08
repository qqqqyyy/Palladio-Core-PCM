package com.palladio_simulator.protocom.tech.rmi;

import com.palladio_simulator.protocom.lang.java.IJClass;
import com.palladio_simulator.protocom.lang.java.IJField;
import com.palladio_simulator.protocom.lang.java.IJMethod;
import com.palladio_simulator.protocom.lang.java.util.JavaNames;
import com.palladio_simulator.protocom.tech.ConceptMapping;
import java.util.Collection;
import java.util.LinkedList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Common super type for all provider creating Java classes. Defines default values
 * for all templates.
 * 
 * @author Thomas Zolynski
 */
@SuppressWarnings("all")
public abstract class PojoClass<E/*  extends Entity */> extends ConceptMapping<E> implements IJClass {
  public PojoClass(final E pcmEntity) {
    super(pcmEntity);
  }
  
  public String superClass() {
    return null;
  }
  
  public Collection<? extends IJMethod> constructors() {
    LinkedList<IJMethod> _newLinkedList = CollectionLiterals.<IJMethod>newLinkedList();
    return _newLinkedList;
  }
  
  public String packageName() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from E to System");
  }
  
  public String compilationUnitName() {
    String _javaName = JavaNames.javaName(this.pcmEntity);
    return _javaName;
  }
  
  public Collection<String> interfaces() {
    LinkedList<String> _newLinkedList = CollectionLiterals.<String>newLinkedList();
    return _newLinkedList;
  }
  
  public Collection<? extends IJMethod> methods() {
    LinkedList<IJMethod> _newLinkedList = CollectionLiterals.<IJMethod>newLinkedList();
    return _newLinkedList;
  }
  
  public Collection<? extends IJField> fields() {
    LinkedList<IJField> _newLinkedList = CollectionLiterals.<IJField>newLinkedList();
    return _newLinkedList;
  }
  
  public String filePath() {
    Object _fileName = JavaNames.getFileName(this.pcmEntity);
    return _fileName;
  }
}