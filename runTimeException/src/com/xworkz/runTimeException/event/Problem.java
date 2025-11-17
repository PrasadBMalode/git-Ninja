package com.xworkz.runTimeException.event;

import org.omg.CORBA.SystemException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import javax.lang.model.UnknownEntityException;
import javax.lang.model.type.MirroredTypeException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.JMRuntimeException;
import javax.print.attribute.UnmodifiableSetException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.ws.WebServiceException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.MalformedParametersException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.security.ProviderException;
import java.util.*;
import java.util.concurrent.RejectedExecutionException;

public class Problem {
    public void problem1(){

        throw new ArithmeticException();
    }
    public void problem2(){

        throw new ClassCastException();
    }
    public void problem3(){

        throw new ArrayIndexOutOfBoundsException();
    }
    public void problem4(){
        throw new ArrayStoreException();
    }
    public void problem5(){
        throw new BufferOverflowException();
    }
    public void problem7(){
        throw new AnnotationTypeMismatchException(null, null);
    }
    public void problem6(){
        throw new BufferUnderflowException();
    }
    public void problem8(){
        throw new IllegalArgumentException();
    }
    public void problem9(){
        throw new IllegalMonitorStateException();
    }
    public void problem10(){
        throw new IllegalStateException();
    }
    public void problem11(){
        throw new IllegalThreadStateException();
    }
    public void problem12(){
        throw new IndexOutOfBoundsException();
    }
    public void problem13(){
        throw new NegativeArraySizeException();
    }
    public void problem14(){
        throw new NullPointerException();
    }
    public void problem15(){
        throw new NumberFormatException();
    }
    public void problem16(){
        throw new SecurityException();
    }
    public void problem17(){
        throw new UnsupportedOperationException();
    }
    public void problem18(){
        throw new FileSystemNotFoundException();
    }
    public void problem19(){
        throw new RuntimeException();
    }
    public void problem20(){
        throw new TypeNotPresentException("Type", null);
    }
    public void problem21() {
        throw new ConcurrentModificationException();
    }

    public void problem22() {
        throw new EmptyStackException();
    }

    public void problem23() {
        throw new EnumConstantNotPresentException(Thread.State.class, "STATE");
    }

    public void problem24() {
        throw new EventException((short) 0, "Event error");
    }

    public void problem25() {
        throw new FileSystemAlreadyExistsException();
    }

    public void problem26() {
        throw new IllegalPathStateException();
    }

    public void problem27() {
        throw new IllformedLocaleException();
    }

    public void problem28() {
        throw new ImagingOpException("Imaging op error");
    }

    public void problem29() {
        throw new IncompleteAnnotationException(Deprecated.class, "incomplete");
    }

//    public void problem30() {
//        throw new IOException();
//    }

    public void problem31() {
        throw new JMRuntimeException();
    }

    public void problem32() {
        throw new LSException((short) 0, "LS error");
    }

    public void problem33() {
        throw new MalformedParameterizedTypeException();
    }

    public void problem34() {
        throw new MalformedParametersException();
    }

    public void problem35() {
        throw new MirroredTypeException(null);
    }

    public void problem36() {
        throw new MirroredTypesException(null);
    }

    public void problem37() {
        throw new MissingResourceException("Missing", "Class", "Key");
    }

    public void problem38() {
        throw new NoSuchElementException();
    }

    public void problem39() {
        throw new NoSuchMechanismException();
    }

    public void problem40() {
        throw new ProfileDataException("Profile error");
    }

    public void problem41() {
        throw new ProviderException();
    }

    public void problem42() {
        throw new ProviderNotFoundException("Provider not found");
    }

    public void problem43() {
        throw new RasterFormatException("Raster error");
    }

    public void problem44() {
        throw new RejectedExecutionException();
    }

//    public void problem45() {
//        throw new SystemException();
//    }

    public void problem46() {
        throw new TypeConstraintException("Type constraint");
    }

    public void problem47() {
        throw new UncheckedIOException(new IOException());
    }

    public void problem48() {
        throw new UndeclaredThrowableException(new Throwable());
    }

//    public void problem49() {
//        throw new UnknownEntityException ();
//    }

    public void problem50() {
        throw new UnmodifiableSetException();
    }

    public void problem51() {
        throw new WebServiceException("Web service error");
    }

    public void problem52() {
        throw new WrongMethodTypeException();
    }

}
