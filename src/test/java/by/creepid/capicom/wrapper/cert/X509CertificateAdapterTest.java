/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.creepid.capicom.wrapper.cert;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author rusakovich
 */
public class X509CertificateAdapterTest extends TestCase {

    private static final String certContent = "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";

    public X509CertificateAdapterTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getSubjectKeyIdentifier method, of class X509CertificateAdapter.
     */
    public void testGetSubjectKeyIdentifier() {
        System.out.println("***** getSubjectKeyIdentifier *****");
        X509CertificateAdapter instance = new X509CertificateAdapter(Base64.decode(certContent));
        String expResult = "CFD7911986C99313573A1776759D09A60583A06F";
        String result = instance.getSubjectKeyIdentifier();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAuthorityKeyIdentifier method, of class
     * X509CertificateAdapter.
     */
    public void testGetAuthorityKeyIdentifier() {
        System.out.println("***** getAuthorityKeyIdentifier ******");
        X509CertificateAdapter instance = new X509CertificateAdapter(Base64.decode(certContent));
        String expResult = "68835BB5005D6CB8592417D98DD2DE4C9F719E28";
        String result = instance.getAuthorityKeyIdentifier();
        assertEquals(expResult, result);
    }

}
