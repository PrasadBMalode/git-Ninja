package com.xworkz.allExceptions.event;

import com.sun.org.apache.xerces.internal.xni.parser.XMLParseException;
import jdk.internal.org.xml.sax.SAXException;
import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.RemarshalException;

import javax.management.*;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.print.PrintException;
import javax.script.ScriptException;
import javax.security.auth.DestroyFailedException;
import javax.security.auth.RefreshFailedException;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.transaction.xa.XAException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.URIReferenceException;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathException;
import java.awt.*;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.print.PrinterException;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.invoke.LambdaConversionException;
import java.net.URISyntaxException;
import java.rmi.AlreadyBoundException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.rmi.server.ServerNotActiveException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.TooManyListenersException;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

public class Exceptions {
    public void exception1() throws Exception{
        throw new AclNotFoundException();
    }
    public void exception2() throws Exception {
        throw new ActivationException(); }

    public void exception3()throws Exception {
        throw new AlreadyBoundException();
    }
//    public void exception4() throws Exception{
//        throw new ApplicationException();
//    }
    public void exception5() throws Exception{
        throw new AWTException(null);
    }
//    public void exception6() throws Exception{
//        throw new BackingStoreException();
//    }
    public void exception7() throws Exception{
        throw new BadAttributeValueExpException(null); }
    public void exception8()throws Exception {
        throw new BadBinaryOpValueExpException(null); }
    public void exception9() throws Exception{
        throw new BadLocationException(null, 0); }
    public void exception10() throws Exception{
        throw new BadStringOperationException(null); }
    public void exception11() throws Exception{
        throw new BrokenBarrierException(); }
    public void exception12() throws Exception{
        throw new CertificateException(); }
    public void exception13() throws Exception{
        throw new CloneNotSupportedException(); }
    public void exception14()throws Exception {
        throw new DataFormatException(); }
    public void exception15() throws Exception{
        throw new DatatypeConfigurationException(); }
    public void exception16()throws Exception {
        throw new DestroyFailedException(); }
    public void exception17() throws Exception{
        throw new ExecutionException(null); }
    public void exception18() throws Exception{
        throw new ExpandVetoException(null, null); }
    public void exception19() throws Exception{
        throw new FontFormatException(null); }
    public void exception20() throws Exception{
        throw new GeneralSecurityException(); }
    public void exception21() throws Exception{
        throw new GSSException(0); }
    public void exception22()throws Exception {
        throw new IllegalClassFormatException(); }
    public void exception23()throws Exception {
        throw new InterruptedException(); }
    public void exception24() throws Exception{
        throw new IntrospectionException(null); }
    public void exception25() throws Exception{

        throw new InvalidApplicationException(null); }
    public void exception26() throws Exception{
        throw new InvalidMidiDataException(null); }
    public void exception27() throws Exception{
        throw new InvalidPreferencesFormatException(null, null); }
    public void exception28() throws Exception{
        throw new InvalidTargetObjectTypeException(null); }
    public void exception29() throws Exception{
        throw new IOException(); }
    public void exception30() throws Exception{
        throw new JAXBException(""); }
    public void exception31() throws Exception{
        throw new JMException(); }
    public void exception32() throws Exception{
        throw new KeySelectorException(); }
    public void exception33() throws Exception{
        throw new LambdaConversionException(); }
    public void exception34() throws Exception{
        throw new LastOwnerException(); }
    public void exception35() throws Exception{
        throw new LineUnavailableException(); }
    public void exception36()throws Exception {
        throw new MarshalException(null); }
    public void exception37() throws Exception{
        throw new MidiUnavailableException(); }
    public void exception38()throws Exception {
        throw new MimeTypeParseException(); }
    public void exception39() throws Exception{
        throw new NamingException(); }
    public void exception40() throws Exception{
        throw new NoninvertibleTransformException(null); }
    public void exception41() throws Exception{
        throw new NotBoundException(); }
    public void exception42()throws Exception {
        throw new NotOwnerException(); }
    public void exception43()throws Exception{
        throw new ParseException(null, 0); }
    public void exception44()throws Exception {
        throw new ParserConfigurationException(); }
    public void exception45() throws Exception{
        throw new PrinterException(); }
    public void exception46() throws Exception{
        throw new PrintException(); }
    public void exception47() throws Exception{
        throw new PrivilegedActionException(null); }
    public void exception48() throws Exception{
        throw new PropertyVetoException(null, null); }
    public void exception49() throws Exception{
        throw new ReflectiveOperationException(); }
    public void exception50() throws Exception{
        throw new RefreshFailedException(null); }
    public void exception51()throws Exception {
        throw new RemarshalException(); }
    public void exception52() throws Exception{
        throw new RuntimeException(); } // (not checked)
    public void exception53() throws Exception{
        throw new SAXException(); }
    public void exception54()throws Exception {
        throw new ScriptException(""); }
    public void exception55() throws Exception{
        throw new ServerNotActiveException(); }
    public void exception56()throws Exception {
        throw new SOAPException(); }
    public void exception57() throws Exception{
        throw new SQLException(); }
    public void exception58() throws Exception{
        throw new TimeoutException(); }
    public void exception59() throws Exception{
        throw new TooManyListenersException(); }
//    public void exception60()throws Exception {
//        throw new TransformerException(); }
    public void exception61()throws Exception {
        throw new TransformException(); }
    public void exception62() throws Exception{
        throw new UnmodifiableClassException(); }
    public void exception63() throws Exception{
        throw new UnsupportedAudioFileException(); }
    public void exception64() throws Exception{
        throw new UnsupportedCallbackException(null); }
    public void exception65() throws Exception{
        throw new UnsupportedFlavorException(null); }
    public void exception66() throws Exception{
        throw new UnsupportedLookAndFeelException(null); }
    public void exception67() throws Exception{
        throw new URIReferenceException(); }
    public void exception68() throws Exception{
        throw new URISyntaxException("", ""); }
//    public void exception69() throws Exception{
//        throw new UserException();
//    }
    public void exception70() throws Exception{
        throw new XAException(); }
    public void exception71() {
        throw new XMLParseException(null, null); }
    public void exception72() throws Exception{
        throw new XMLSignatureException(); }
    public void exception73() throws Exception{
        throw new XMLStreamException(); }
//    public void exception74() throws Exception{
//        throw new XPathException(); }
}
