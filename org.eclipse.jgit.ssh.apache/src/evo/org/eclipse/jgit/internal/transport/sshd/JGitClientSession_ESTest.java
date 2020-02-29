/*
* This file was automatically generated by EvoSuite
* Tue Feb 25 14:24:24 GMT 2020
*/

package org.eclipse.jgit.internal.transport.sshd;

import org.apache.sshd.client.ClientFactoryManager;
import org.apache.sshd.common.Factory;
import org.apache.sshd.common.io.IoSession;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.net.SocketAddress;

import static org.evosuite.runtime.EvoAssertions.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class JGitClientSession_ESTest extends JGitClientSession_ESTest_scaffolding {

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o construtor
    *     JGitClientSession() com parâmetros inválidos lança uma IllegalStateException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
    @Test(timeout = 4000)
    public void test0() throws Throwable {
        ClientFactoryManager clientFactoryManager0 = mock(ClientFactoryManager.class, new ViolatedAssumptionAnswer());
        IoSession ioSession0 = mock(IoSession.class, new ViolatedAssumptionAnswer());
        doReturn("").when(ioSession0).toString();
        doReturn("").when(ioSession0).setAttributeIfAbsent(any(), any());
        doReturn((SocketAddress) null).when(ioSession0).getRemoteAddress();
        JGitClientSession jGitClientSession0 = null;
        try {
            jGitClientSession0 = new JGitClientSession(clientFactoryManager0, ioSession0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Multiple attached session to :  and JGitClientSession[null@null]
            //
            verifyException("org.apache.sshd.common.session.helpers.AbstractSession", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o construtor
    *     JGitClientSession() com parâmetros inválidos lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
    @Test(timeout = 4000)
    public void test1() throws Throwable {
        ClientFactoryManager clientFactoryManager0 = mock(ClientFactoryManager.class, new ViolatedAssumptionAnswer());
        doReturn((Factory) null).when(clientFactoryManager0).getRandomFactory();
        IoSession ioSession0 = mock(IoSession.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(ioSession0).toString();
        doReturn((Object) null).when(ioSession0).setAttributeIfAbsent(any(), any());
        JGitClientSession jGitClientSession0 = null;
        try {
            jGitClientSession0 = new JGitClientSession(clientFactoryManager0, ioSession0);
            fail("Expecting exception: IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            //
            // No random factory for null
            //
            verifyException("org.apache.sshd.common.util.ValidateUtils", e);
        }
    }

    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica os seguintes comportamentos: primeiro se ele pode ser executado no tempo de 4s; Em seguida, se o construtor
    *     JGitClientSession() com parâmetros inválidos lança uma NullPointerException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
    @Test(timeout = 4000)
    public void test2() throws Throwable {
        ClientFactoryManager clientFactoryManager0 = mock(ClientFactoryManager.class, new ViolatedAssumptionAnswer());
        JGitClientSession jGitClientSession0 = null;
        try {
            jGitClientSession0 = new JGitClientSession(clientFactoryManager0, (IoSession) null);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // No IoSession provided
            //
            verifyException("java.util.Objects", e);
        }
    }
}
