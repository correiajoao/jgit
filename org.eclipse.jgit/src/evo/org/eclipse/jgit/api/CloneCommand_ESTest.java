/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 25 14:41:33 GMT 2020
 */

package org.eclipse.jgit.api;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.internal.storage.dfs.DfsRepositoryDescription;
import org.eclipse.jgit.internal.storage.dfs.InMemoryRepository;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectIdRef;
import org.eclipse.jgit.lib.ProgressMonitor;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.TextProgressMonitor;
import org.eclipse.jgit.transport.PackedObjectInfo;
import org.eclipse.jgit.transport.TestProtocol;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.resolver.ReceivePackFactory;
import org.eclipse.jgit.transport.resolver.UploadPackFactory;
import org.eclipse.jgit.util.FS;
import org.eclipse.jgit.util.FS_Win32_Cygwin;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CloneCommand_ESTest extends CloneCommand_ESTest_scaffolding {
    /*
  * Informações do teste
  *
  * Plausível: sim
  *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se o diretório
  *     contendo o resultado da execução é igual ao esperado.
  *
  * Compreensivel: sim
  *     - O comportamento do teste e suas instruções são compreensíveis.
  */
  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      MockFile mockFile0 = new MockFile("Xg#lD`1sI", "");
      CloneCommand cloneCommand1 = cloneCommand0.setDirectory(mockFile0);
      File file0 = cloneCommand1.getDirectory();
      assertEquals("/Users/joaocorreia/jgit/org.eclipse.jgit", file0.getParent());
  }

    /*
  * Informações do teste
  *
  * Plausível: sim
  *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
  *     ao método verifyDirectories() lança uma NullPointerException.
  *
  * Compreensivel: sim
  *     - O comportamento do teste e suas instruções são compreensíveis.
  */
  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      // Undeclared exception!
      try { 
        cloneCommand0.verifyDirectories((URIish) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

    /*
  * Informações do teste
  *
  * Plausível: não
  *     - O teste é muito complexo.
  *
  * Compreensivel: não
  *     - Tanto o comportamento quanto as instruções são muito complexas para serem compreendidas.
  */
  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("conn0");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "_goWrmQLQR LBVC(");
      DfsRepositoryDescription dfsRepositoryDescription0 = new DfsRepositoryDescription((String) null);
      InMemoryRepository inMemoryRepository0 = new InMemoryRepository(dfsRepositoryDescription0);
      UploadPackFactory<ObjectIdRef.PeeledNonTag> uploadPackFactory0 = (UploadPackFactory<ObjectIdRef.PeeledNonTag>) mock(UploadPackFactory.class, new ViolatedAssumptionAnswer());
      ReceivePackFactory<ObjectIdRef.PeeledNonTag> receivePackFactory0 = (ReceivePackFactory<ObjectIdRef.PeeledNonTag>) mock(ReceivePackFactory.class, new ViolatedAssumptionAnswer());
      TestProtocol<ObjectIdRef.PeeledNonTag> testProtocol0 = new TestProtocol<ObjectIdRef.PeeledNonTag>(uploadPackFactory0, receivePackFactory0);
      Ref.Storage ref_Storage0 = Ref.Storage.NEW;
      ObjectId objectId0 = new ObjectId(13, 13, 13, (-3749), 13);
      PackedObjectInfo packedObjectInfo0 = new PackedObjectInfo(objectId0);
      ObjectIdRef.PeeledNonTag objectIdRef_PeeledNonTag0 = new ObjectIdRef.PeeledNonTag(ref_Storage0, "Q`,MoCMr*L_jd", packedObjectInfo0, (-3749));
      URIish uRIish0 = testProtocol0.register(objectIdRef_PeeledNonTag0, inMemoryRepository0);
      // Undeclared exception!
      try { 
        cloneCommand0.verifyDirectories(uRIish0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set directory to 'conn0' which is not a directory
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }
    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
    *     do método verifyDirectories() com argumentos ilegais lança uma IllegalArgumentException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      URIish uRIish0 = new URIish();
      // Undeclared exception!
      try { 
        cloneCommand0.verifyDirectories(uRIish0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.jgit.transport.URIish", e);
      }
  }
  /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
    *     do método call() lança uma Exception.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      try { 
        cloneCommand0.call();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid URL null
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

    /*
* Informações do teste
*
* Plausível: não
*     - O teste cria dois comandos clone com arquivos inválidos e então verifica se os dois comandos são iguais.
*
* Compreensivel: sim
*     - O comportamento do teste e suas instruções são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      FS_Win32_Cygwin fS_Win32_Cygwin0 = new FS_Win32_Cygwin();
      File file0 = fS_Win32_Cygwin0.resolve((File) null, "B5]4(ul(ZjT");
      CloneCommand cloneCommand1 = cloneCommand0.setGitDir(file0);
      CloneCommand cloneCommand2 = cloneCommand1.setDirectory(file0);
      assertSame(cloneCommand2, cloneCommand0);
  }

    /*
      * Informações do teste
      *
      * Plausível: sim
      *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
      *     do método setGitDir() lança uma IllegalStateException.
      *
      * Compreensivel: sim
      *     - O comportamento do teste e suas instruções são compreensíveis.
      */
  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      MockFile mockFile0 = new MockFile("refs/heads/", "");
      CloneCommand cloneCommand1 = cloneCommand0.setDirectory(mockFile0);
      // Undeclared exception!
      try { 
        cloneCommand1.setGitDir(mockFile0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // When initializing a non-bare repo with directory /Users/joaocorreia/jgit/org.eclipse.jgit/refs/heads and separate git-dir /Users/joaocorreia/jgit/org.eclipse.jgit/refs/heads specified both folders should not point to the same location
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

    /*
      * Informações do teste
      *
      * Plausível: sim
      *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
      *     do método setDirectory() lança uma IllegalStateException.
      *
      * Compreensivel: sim
      *     - O comportamento do teste e suas instruções são compreensíveis.
      */
  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      MockFile mockFile0 = new MockFile("refs/heads/master", "U\"w!e]iC=pN+x5VuB");
      File file0 = MockFile.createTempFile("refs/heads/master", "refs/heads/master", (File) mockFile0);
      CloneCommand cloneCommand1 = cloneCommand0.setGitDir(file0);
      // Undeclared exception!
      try { 
        cloneCommand1.setDirectory(mockFile0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set git-dir to '/Users/joaocorreia/jgit/org.eclipse.jgit/refs/heads/master/U\"w!e]iC=pN+x5VuB/refs/heads/master0refs/heads/master' which is not a directory
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }
    /*
    * Informações do teste
    *
    * Plausível: não
    *     - O teste é muito complexo.
    *
    * Compreensivel: não
    *     - Tanto o comportamento quanto as instruções são muito complexas para serem compreendidas.
    */
  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      UploadPackFactory<ObjectIdRef.PeeledNonTag> uploadPackFactory0 = (UploadPackFactory<ObjectIdRef.PeeledNonTag>) mock(UploadPackFactory.class, new ViolatedAssumptionAnswer());
      ReceivePackFactory<ObjectIdRef.PeeledNonTag> receivePackFactory0 = (ReceivePackFactory<ObjectIdRef.PeeledNonTag>) mock(ReceivePackFactory.class, new ViolatedAssumptionAnswer());
      TestProtocol<ObjectIdRef.PeeledNonTag> testProtocol0 = new TestProtocol<ObjectIdRef.PeeledNonTag>(uploadPackFactory0, receivePackFactory0);
      Ref.Storage ref_Storage0 = Ref.Storage.PACKED;
      ObjectIdRef.PeeledNonTag objectIdRef_PeeledNonTag0 = new ObjectIdRef.PeeledNonTag(ref_Storage0, "*sK6j/~/@!@NE_#p0", (ObjectId) null);
      URIish uRIish0 = testProtocol0.register(objectIdRef_PeeledNonTag0, (Repository) null);
      cloneCommand0.verifyDirectories(uRIish0);
      Boolean boolean0 = new Boolean(".jgitconfig");
      FS fS0 = FS.detect(boolean0);
      File file0 = fS0.userHome();
      File file1 = fS0.resolve(file0, "3+9n7[$A+(wM@S");
      CloneCommand cloneCommand1 = cloneCommand0.setGitDir(file1);
      assertSame(cloneCommand1, cloneCommand0);
  }
    /*
       * Informações do teste
       *
       * Plausível: não
       *     - O teste é muito complexo.
       *
       * Compreensivel: não
       *     - Tanto o comportamento quanto as instruções são muito complexas para serem compreendidas.
       */
  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      UploadPackFactory<ObjectIdRef.PeeledNonTag> uploadPackFactory0 = (UploadPackFactory<ObjectIdRef.PeeledNonTag>) mock(UploadPackFactory.class, new ViolatedAssumptionAnswer());
      ReceivePackFactory<ObjectIdRef.PeeledNonTag> receivePackFactory0 = (ReceivePackFactory<ObjectIdRef.PeeledNonTag>) mock(ReceivePackFactory.class, new ViolatedAssumptionAnswer());
      TestProtocol<ObjectIdRef.PeeledNonTag> testProtocol0 = new TestProtocol<ObjectIdRef.PeeledNonTag>(uploadPackFactory0, receivePackFactory0);
      Ref.Storage ref_Storage0 = Ref.Storage.PACKED;
      ObjectIdRef.PeeledNonTag objectIdRef_PeeledNonTag0 = new ObjectIdRef.PeeledNonTag(ref_Storage0, "*sK6j/~/@!@NE_#p0", (ObjectId) null);
      URIish uRIish0 = testProtocol0.register(objectIdRef_PeeledNonTag0, (Repository) null);
      cloneCommand0.verifyDirectories(uRIish0);
      Boolean boolean0 = new Boolean(".jgitconfig");
      FS fS0 = FS.detect(boolean0);
      File file0 = fS0.userHome();
      CloneCommand cloneCommand1 = cloneCommand0.setGitDir(file0);
      assertSame(cloneCommand1, cloneCommand0);
  }
    /*
    * Informações do teste
    *
    * Plausível: sim
    *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
    *     do método call() lança uma IllegalStateException.
    *
    * Compreensivel: sim
    *     - O comportamento do teste e suas instruções são compreensíveis.
    */
  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("iSbY3f.git");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "ALL_BRANCHES");
      CloneCommand cloneCommand0 = new CloneCommand();
      CloneCommand cloneCommand1 = cloneCommand0.setBare(true);
      cloneCommand0.setURI("iSbY3f");
      // Undeclared exception!
      try { 
        cloneCommand1.call();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Cannot set directory to 'iSbY3f.git' which is not a directory
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

  /*
  * Informações do teste
  *
  * Plausível: sim
  *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se duas
  *     instâncias de CloneCommand são iguais.
  *
  * Compreensivel: sim
  *     - O comportamento do teste e suas instruções são compreensíveis.
  */
  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      CloneCommand cloneCommand1 = cloneCommand0.setProgressMonitor((ProgressMonitor) null);
      assertSame(cloneCommand1, cloneCommand0);
  }

  /*
* Informações do teste
*
* Plausível: sim
*     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se duas
*     instâncias de CloneCommand são iguais.
*
* Compreensivel: sim
*     - O comportamento do teste e suas instruções são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CloneCommand cloneCommand0 = Git.cloneRepository();
      TextProgressMonitor textProgressMonitor0 = new TextProgressMonitor();
      CloneCommand cloneCommand1 = cloneCommand0.setProgressMonitor(textProgressMonitor0);
      assertSame(cloneCommand1, cloneCommand0);
  }

    /*
  * Informações do teste
  *
  * Plausível: sim
  *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se duas
  *     instâncias de CloneCommand são iguais.
  *
  * Compreensivel: sim
  *     - O comportamento do teste e suas instruções são compreensíveis.
  */
  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      CloneCommand cloneCommand1 = cloneCommand0.setRemote((String) null);
      assertSame(cloneCommand0, cloneCommand1);
  }

    /*
* Informações do teste
*
* Plausível: sim
*     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se duas
*     instâncias de CloneCommand são iguais.
*
* Compreensivel: sim
*     - O comportamento do teste e suas instruções são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      CloneCommand cloneCommand1 = cloneCommand0.setRemote("S$19mj");
      assertSame(cloneCommand1, cloneCommand0);
  }

    /*
       * Informações do teste
       *
       * Plausível: não
       *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
       *     do método call() lança uma SecurityException. Apesar de funcional, o teste não parece plausível pois tem um nível de
       *     especificidade muito alto.
       *
       * Compreensivel: sim
       *     - O comportamento do teste e suas instruções são compreensíveis.
       */
  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          CloneCommand cloneCommand0 = Git.cloneRepository();
          cloneCommand0.setURI("ET#>W)AC%#n^~}");
          FS fS0 = FS.detect();
          cloneCommand0.setFs(fS0);
          // Undeclared exception!
          try { 
            cloneCommand0.call();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/Users/joaocorreia/.config\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileSystemProvider.createDirectory(UnixFileSystemProvider.java:376)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // org.eclipse.jgit.util.SystemReader$Default.getXDGConfigHome(SystemReader.java:120)
             // org.eclipse.jgit.util.SystemReader$Default.openJGitConfig(SystemReader.java:131)
             // org.eclipse.jgit.util.SystemReader.getJGitConfig(SystemReader.java:348)
             // org.eclipse.jgit.util.SystemReader.getSystemConfig(SystemReader.java:373)
             // org.eclipse.jgit.util.SystemReader.getUserConfig(SystemReader.java:321)
             // org.eclipse.jgit.internal.storage.file.FileRepository.<init>(FileRepository.java:158)
             // org.eclipse.jgit.lib.BaseRepositoryBuilder.build(BaseRepositoryBuilder.java:583)
             // org.eclipse.jgit.api.InitCommand.call(InitCommand.java:90)
             // org.eclipse.jgit.api.CloneCommand.init(CloneCommand.java:265)
             // org.eclipse.jgit.api.CloneCommand.call(CloneCommand.java:171)
             // sun.reflect.GeneratedMethodAccessor140.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

    /*
     * Informações do teste
     *
     * Plausível: não
     *     - O teste é muito complexo.
     *
     * Compreensivel: não
     *     - Tanto o comportamento quanto as instruções são muito complexas para serem compreendidas.
     */
  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      UploadPackFactory<ObjectIdRef.PeeledNonTag> uploadPackFactory0 = (UploadPackFactory<ObjectIdRef.PeeledNonTag>) mock(UploadPackFactory.class, new ViolatedAssumptionAnswer());
      ReceivePackFactory<ObjectIdRef.PeeledNonTag> receivePackFactory0 = (ReceivePackFactory<ObjectIdRef.PeeledNonTag>) mock(ReceivePackFactory.class, new ViolatedAssumptionAnswer());
      TestProtocol<ObjectIdRef.PeeledNonTag> testProtocol0 = new TestProtocol<ObjectIdRef.PeeledNonTag>(uploadPackFactory0, receivePackFactory0);
      Ref.Storage ref_Storage0 = Ref.Storage.PACKED;
      ObjectIdRef.PeeledNonTag objectIdRef_PeeledNonTag0 = new ObjectIdRef.PeeledNonTag(ref_Storage0, "*sK6j/~/@!@NE_#p0", (ObjectId) null);
      URIish uRIish0 = testProtocol0.register(objectIdRef_PeeledNonTag0, (Repository) null);
      Boolean boolean0 = new Boolean(".jgitconfig");
      FS fS0 = FS.detect(boolean0);
      File file0 = fS0.userHome();
      cloneCommand0.setGitDir(file0);
      // Undeclared exception!
      try { 
        cloneCommand0.verifyDirectories(uRIish0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Destination path \"joaocorreia\" already exists and is not an empty directory
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

  /*
       * Informações do teste
       *
       * Plausível: não
       *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
       *     do método call() lança uma SecurityException. Apesar de funcional, o teste não parece plausível pois tem um nível de
       *     especificidade muito alto.
       *
       * Compreensivel: sim
       *     - O comportamento do teste e suas instruções são compreensíveis.
       */
  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          CloneCommand cloneCommand0 = Git.cloneRepository();
          MockFile mockFile0 = new MockFile("org.eclipse.jgit.lib.ObjectChecker", "Ru}19");
          CloneCommand cloneCommand1 = cloneCommand0.setGitDir(mockFile0);
          CloneCommand cloneCommand2 = cloneCommand1.setURI("ET#>W)AC%#n^~}");
          // Undeclared exception!
          try { 
            cloneCommand2.call();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/Users/joaocorreia/.config\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileSystemProvider.createDirectory(UnixFileSystemProvider.java:376)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // org.eclipse.jgit.util.SystemReader$Default.getXDGConfigHome(SystemReader.java:120)
             // org.eclipse.jgit.util.SystemReader$Default.openJGitConfig(SystemReader.java:131)
             // org.eclipse.jgit.util.SystemReader.getJGitConfig(SystemReader.java:348)
             // org.eclipse.jgit.util.SystemReader.getSystemConfig(SystemReader.java:373)
             // org.eclipse.jgit.util.SystemReader.getUserConfig(SystemReader.java:321)
             // org.eclipse.jgit.internal.storage.file.FileRepository.<init>(FileRepository.java:158)
             // org.eclipse.jgit.lib.BaseRepositoryBuilder.build(BaseRepositoryBuilder.java:583)
             // org.eclipse.jgit.api.InitCommand.call(InitCommand.java:90)
             // org.eclipse.jgit.api.CloneCommand.init(CloneCommand.java:265)
             // org.eclipse.jgit.api.CloneCommand.call(CloneCommand.java:171)
             // sun.reflect.GeneratedMethodAccessor140.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }



    /*
         * Informações do teste
         *
         * Plausível: sim
         *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
         *     do método call() lança uma RuntimeException.
         *
         * Compreensivel: sim
         *     - O comportamento do teste e suas instruções são compreensíveis.
         */
  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      MockFile mockFile0 = new MockFile("remote");
      MockFile.createTempFile("remote", "remote", (File) mockFile0);
      cloneCommand0.setURI("remote");
      // Undeclared exception!
      try { 
        cloneCommand0.call();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Destination path \"remote\" already exists and is not an empty directory
         //
         verifyException("org.eclipse.jgit.api.CloneCommand", e);
      }
  }

    /*
* Informações do teste
*
* Plausível: não
*     - O teste é muito complexo, além de a princípio não parece fazer sentido.
*
* Compreensivel: não
*     - O comportamento do teste e suas instruções não são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(file0).exists();
      CloneCommand cloneCommand1 = cloneCommand0.setGitDir(file0);
      URIish uRIish0 = mock(URIish.class, new ViolatedAssumptionAnswer());
      cloneCommand0.verifyDirectories(uRIish0);
      assertSame(cloneCommand0, cloneCommand1);
  }

    /*
         * Informações do teste
         *
         * Plausível: não
         *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
         *     do método call() lança uma SecurityException. Apesar de funcional, o teste não parece plausível pois tem um nível de
         *     especificidade muito alto.
         *
         * Compreensivel: sim
         *     - O comportamento do teste e suas instruções são compreensíveis.
         */
  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          CloneCommand cloneCommand0 = Git.cloneRepository();
          CloneCommand cloneCommand1 = cloneCommand0.setURI("ET#>W)AC%#n^~}");
          HashSet<String> hashSet0 = new HashSet<String>();
          cloneCommand1.setBranchesToClone(hashSet0);
          // Undeclared exception!
          try { 
            cloneCommand1.call();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/Users/joaocorreia/.config\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileSystemProvider.createDirectory(UnixFileSystemProvider.java:376)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // org.eclipse.jgit.util.SystemReader$Default.getXDGConfigHome(SystemReader.java:120)
             // org.eclipse.jgit.util.SystemReader$Default.openJGitConfig(SystemReader.java:131)
             // org.eclipse.jgit.util.SystemReader.getJGitConfig(SystemReader.java:348)
             // org.eclipse.jgit.util.SystemReader.getSystemConfig(SystemReader.java:373)
             // org.eclipse.jgit.util.SystemReader.getUserConfig(SystemReader.java:321)
             // org.eclipse.jgit.internal.storage.file.FileRepository.<init>(FileRepository.java:158)
             // org.eclipse.jgit.lib.BaseRepositoryBuilder.build(BaseRepositoryBuilder.java:583)
             // org.eclipse.jgit.api.InitCommand.call(InitCommand.java:90)
             // org.eclipse.jgit.api.CloneCommand.init(CloneCommand.java:265)
             // org.eclipse.jgit.api.CloneCommand.call(CloneCommand.java:171)
             // sun.reflect.GeneratedMethodAccessor140.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

    /*
         * Informações do teste
         *
         * Plausível: não
         *     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se a chamada
         *     do método call() lança uma SecurityException. Apesar de funcional, o teste não parece plausível pois tem um nível de
         *     especificidade muito alto.
         *
         * Compreensivel: sim
         *     - O comportamento do teste e suas instruções são compreensíveis.
         */
  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          CloneCommand cloneCommand0 = new CloneCommand();
          cloneCommand0.setURI("S$19mj");
          CloneCommand cloneCommand1 = cloneCommand0.setMirror(true);
          // Undeclared exception!
          try { 
            cloneCommand1.call();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/Users/joaocorreia/.config\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileSystemProvider.createDirectory(UnixFileSystemProvider.java:376)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // org.eclipse.jgit.util.SystemReader$Default.getXDGConfigHome(SystemReader.java:120)
             // org.eclipse.jgit.util.SystemReader$Default.openJGitConfig(SystemReader.java:131)
             // org.eclipse.jgit.util.SystemReader.getJGitConfig(SystemReader.java:348)
             // org.eclipse.jgit.util.SystemReader.getSystemConfig(SystemReader.java:373)
             // org.eclipse.jgit.util.SystemReader.getUserConfig(SystemReader.java:321)
             // org.eclipse.jgit.internal.storage.file.FileRepository.<init>(FileRepository.java:158)
             // org.eclipse.jgit.lib.BaseRepositoryBuilder.build(BaseRepositoryBuilder.java:583)
             // org.eclipse.jgit.api.InitCommand.call(InitCommand.java:90)
             // org.eclipse.jgit.api.CloneCommand.init(CloneCommand.java:265)
             // org.eclipse.jgit.api.CloneCommand.call(CloneCommand.java:171)
             // sun.reflect.GeneratedMethodAccessor140.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:497)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

    /*
* Informações do teste
*
* Plausível: sim
*     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se
*     os valores iniciais retornados pelo método getDirectory() são iguais aos esperados.
*
* Compreensivel: sim
*     - O comportamento do teste e suas instruções são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      File file0 = cloneCommand0.getDirectory();
      assertNull(file0);
  }

    /*
* Informações do teste
*
* Plausível: sim
*     - O teste verifica dois comportamentos: primeiro se ele pode ser executado no tempo de 4s. Em seguida, se
*     duas instâncias de CloneCommand
*
* Compreensivel: sim
*     - O comportamento do teste e suas instruções são compreensíveis.
*/
  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CloneCommand cloneCommand0 = new CloneCommand();
      CloneCommand cloneCommand1 = cloneCommand0.setCloneSubmodules(false);
      assertSame(cloneCommand0, cloneCommand1);
  }
}
