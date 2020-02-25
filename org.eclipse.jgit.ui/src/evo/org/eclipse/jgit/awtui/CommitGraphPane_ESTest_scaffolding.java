/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 25 13:08:00 GMT 2020
 */

package org.eclipse.jgit.awtui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CommitGraphPane_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.eclipse.jgit.awtui.CommitGraphPane"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9c/2fm2fk412pj9zjkzvdx9w2fr0000gn/T/"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/Users/joaocorreia/jgit/org.eclipse.jgit.ui"); 
    java.lang.System.setProperty("user.home", "/Users/joaocorreia"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "joaocorreia"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CommitGraphPane_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jgit.nls.TranslationBundle",
      "org.eclipse.jgit.util.FS$Attributes",
      "org.eclipse.jgit.lib.BitmapIndex$Bitmap",
      "org.eclipse.jgit.dircache.BaseDirCacheEditor",
      "org.eclipse.jgit.internal.storage.dfs.DfsPacksChangedEvent",
      "org.eclipse.jgit.transport.ReceiveCommand",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$Out",
      "org.eclipse.jgit.revwalk.RevObject",
      "org.eclipse.jgit.revwalk.RevFlag$StaticRevFlag",
      "org.eclipse.jgit.lib.RepositoryState",
      "org.eclipse.jgit.revwalk.RevWalk",
      "org.eclipse.jgit.lib.TreeFormatter",
      "org.eclipse.jgit.revwalk.RevTag",
      "org.eclipse.jgit.lib.Config",
      "org.eclipse.jgit.revwalk.RevBlob",
      "org.eclipse.jgit.internal.storage.file.FileSnapshot",
      "org.eclipse.jgit.transport.URIish",
      "org.eclipse.jgit.events.RepositoryListener",
      "org.eclipse.jgit.internal.storage.reftable.ReftableBatchRefUpdate",
      "org.eclipse.jgit.api.errors.GitAPIException",
      "org.eclipse.jgit.util.SimpleLruCache",
      "org.eclipse.jgit.revwalk.RevSort",
      "org.eclipse.jgit.lib.Constants",
      "org.eclipse.jgit.revwalk.RevTree",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$LogQueueEntry",
      "org.eclipse.jgit.awtui.CommitGraphPane$CommitTableModel",
      "org.eclipse.jgit.revwalk.BlockRevQueue",
      "org.eclipse.jgit.lib.PersonIdent",
      "org.eclipse.jgit.util.FileUtils",
      "org.eclipse.jgit.revwalk.filter.RevFilter$AllFilter",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource$ComparatorBuilder",
      "org.eclipse.jgit.internal.storage.dfs.DfsStreamKey$ForReverseIndex",
      "org.eclipse.jgit.internal.storage.reftable.ReftableReader",
      "org.eclipse.jgit.dircache.DirCache",
      "org.eclipse.jgit.lib.AsyncObjectLoaderQueue",
      "org.eclipse.jgit.internal.storage.dfs.DfsPackFile",
      "org.eclipse.jgit.util.FS",
      "org.eclipse.jgit.lib.AsyncOperation",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache$ReadableChannelSupplier",
      "org.eclipse.jgit.lib.CoreConfig$HideDotFiles",
      "org.eclipse.jgit.api.GitCommand",
      "org.eclipse.jgit.revwalk.RevCommit",
      "org.eclipse.jgit.internal.storage.dfs.DfsOutputStream",
      "org.eclipse.jgit.internal.storage.pack.ObjectToPack",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemPack",
      "org.eclipse.jgit.internal.storage.reftable.ReftableWriter$Stats",
      "org.eclipse.jgit.errors.TranslationStringMissingException",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource",
      "org.eclipse.jgit.dircache.DirCacheEntry",
      "org.eclipse.jgit.errors.TransportException",
      "org.eclipse.jgit.revwalk.DateRevQueue$Entry",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache$Ref",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase",
      "org.eclipse.jgit.events.ConfigChangedEvent",
      "org.eclipse.jgit.revwalk.TopoSortGenerator",
      "org.eclipse.jgit.lib.RefDatabase",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$ByteArrayReadableChannel",
      "org.eclipse.jgit.treewalk.FileTreeIterator$FileModeStrategy",
      "org.eclipse.jgit.errors.LockFailedException",
      "org.eclipse.jgit.lib.ObjectIdRef$PeeledNonTag",
      "org.eclipse.jgit.util.RefList",
      "org.eclipse.jgit.lib.Config$SectionParser",
      "org.eclipse.jgit.internal.storage.pack.ObjectReuseAsIs",
      "org.eclipse.jgit.treewalk.WorkingTreeIterator",
      "org.eclipse.jgit.errors.BinaryBlobException",
      "org.eclipse.jgit.lib.InflaterCache",
      "org.eclipse.jgit.errors.IndexReadException",
      "org.eclipse.jgit.util.IO",
      "org.eclipse.jgit.internal.storage.pack.PackOutputStream",
      "org.eclipse.jgit.internal.storage.dfs.DfsReaderIoStats",
      "org.eclipse.jgit.revwalk.FixUninterestingGenerator",
      "org.eclipse.jgit.util.FS$FileStoreAttributes",
      "org.eclipse.jgit.api.errors.NoFilepatternException",
      "org.eclipse.jgit.util.SystemReader",
      "org.eclipse.jgit.util.FS_Win32",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableDatabase",
      "org.eclipse.jgit.events.IndexChangedListener",
      "org.eclipse.jgit.attributes.AttributesNode",
      "org.eclipse.jgit.revwalk.filter.RevFilter$NoMergesFilter",
      "org.eclipse.jgit.transport.PackedObjectInfo",
      "org.eclipse.jgit.revwalk.RewriteGenerator",
      "org.eclipse.jgit.errors.RevWalkException",
      "org.eclipse.jgit.dircache.DirCacheEditor",
      "org.eclipse.jgit.errors.MissingObjectException",
      "org.eclipse.jgit.internal.storage.dfs.ReadableChannel",
      "org.eclipse.jgit.util.FS$StreamGobbler",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableDatabase$1",
      "org.eclipse.jgit.revwalk.RevObjectList",
      "org.eclipse.jgit.internal.storage.dfs.DfsReader$FoundObject",
      "org.eclipse.jgit.revwalk.FooterKey",
      "org.eclipse.jgit.lib.ObjectIdRef",
      "org.eclipse.jgit.nls.NLS",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository",
      "org.eclipse.jgit.revwalk.filter.RevFilter$MergeBaseFilter",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository$EmptyAttributesNodeProvider$EmptyAttributesNode",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCacheConfig",
      "org.eclipse.jgit.lib.ObjectIdSet",
      "org.eclipse.jgit.internal.storage.file.RefDirectory",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepositoryDescription",
      "org.eclipse.jgit.awtui.SwingCommitList",
      "org.eclipse.jgit.errors.CorruptObjectException",
      "org.eclipse.jgit.attributes.AttributesProvider",
      "org.eclipse.jgit.internal.storage.pack.CachedPack",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$MergedLogCursor",
      "org.eclipse.jgit.errors.LargeObjectException",
      "org.eclipse.jgit.util.FS$GobblerThread",
      "org.eclipse.jgit.util.io.SilentFileInputStream",
      "org.eclipse.jgit.transport.CredentialsProvider",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$Builder",
      "org.eclipse.jgit.internal.storage.reftable.ReftableConfig",
      "org.eclipse.jgit.internal.storage.dfs.DeltaBaseCache",
      "org.eclipse.jgit.revplot.PlotLane",
      "org.eclipse.jgit.lib.AbbreviatedObjectId",
      "org.eclipse.jgit.storage.file.FileBasedConfig",
      "org.eclipse.jgit.internal.storage.dfs.DfsInserter",
      "org.eclipse.jgit.lib.BatchRefUpdate",
      "org.eclipse.jgit.lib.AsyncObjectSizeQueue",
      "org.eclipse.jgit.lib.Ref",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableStack",
      "org.eclipse.jgit.util.sha1.UbcCheck",
      "org.eclipse.jgit.revwalk.ObjectWalk",
      "org.eclipse.jgit.events.ConfigChangedListener",
      "org.eclipse.jgit.lib.Ref$Storage",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$MergedRefCursor",
      "org.eclipse.jgit.internal.storage.dfs.DfsPackDescription",
      "org.eclipse.jgit.api.TransportConfigCallback",
      "org.eclipse.jgit.revwalk.filter.RevFilter$OnlyMergesFilter",
      "org.eclipse.jgit.internal.storage.reftree.RefTreeDatabase",
      "org.eclipse.jgit.errors.IncorrectObjectTypeException",
      "org.eclipse.jgit.util.SystemReader$Default",
      "org.eclipse.jgit.revwalk.MergeBaseGenerator",
      "org.eclipse.jgit.revwalk.PendingGenerator",
      "org.eclipse.jgit.treewalk.WorkingTreeIterator$Entry",
      "org.eclipse.jgit.util.StringUtils",
      "org.eclipse.jgit.lib.ObjectChecker",
      "org.eclipse.jgit.revwalk.AbstractRevQueue$AlwaysEmptyQueue",
      "org.eclipse.jgit.lib.BitmapIndex$BitmapBuilder",
      "org.eclipse.jgit.util.ProcessResult",
      "org.eclipse.jgit.lib.ProgressMonitor",
      "org.eclipse.jgit.internal.submodule.SubmoduleValidator$SubmoduleValidationException",
      "org.eclipse.jgit.internal.storage.dfs.BlockBasedFile",
      "org.eclipse.jgit.util.sha1.Sha1CollisionException",
      "org.eclipse.jgit.lib.TypedConfigGetter",
      "org.eclipse.jgit.events.RepositoryEvent",
      "org.eclipse.jgit.util.SystemReader$Default$1",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepositoryBuilder",
      "org.eclipse.jgit.revwalk.AsyncRevObjectQueue",
      "org.eclipse.jgit.revwalk.BoundaryGenerator",
      "org.eclipse.jgit.revwalk.AbstractRevQueue",
      "org.eclipse.jgit.util.sha1.SHA1",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable",
      "org.eclipse.jgit.internal.storage.dfs.DfsStreamKey",
      "org.eclipse.jgit.errors.UnmergedPathException",
      "org.eclipse.jgit.internal.storage.dfs.DfsPacksChangedListener",
      "org.eclipse.jgit.api.errors.JGitInternalException",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemObjDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsConfig",
      "org.eclipse.jgit.internal.storage.dfs.DfsReaderIoStats$Accumulator",
      "org.eclipse.jgit.revwalk.DepthGenerator",
      "org.eclipse.jgit.errors.StopWalkException",
      "org.eclipse.jgit.internal.storage.file.LockFile",
      "org.eclipse.jgit.errors.TranslationBundleException",
      "org.eclipse.jgit.util.FS$ExecutionResult",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableBatchRefUpdate",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache$HashEntry",
      "org.eclipse.jgit.lib.ReflogReader",
      "org.eclipse.jgit.internal.JGitText",
      "org.eclipse.jgit.events.ListenerList",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemRefDatabase",
      "org.eclipse.jgit.awtui.AWTPlotRenderer",
      "org.eclipse.jgit.treewalk.filter.PathFilter",
      "org.eclipse.jgit.internal.storage.dfs.DfsRefDatabase",
      "org.eclipse.jgit.lib.BlobObjectChecker",
      "org.eclipse.jgit.util.FS$FSFactory",
      "org.eclipse.jgit.util.TemporaryBuffer$LocalFile",
      "org.eclipse.jgit.util.time.ProposedTimestamp",
      "org.eclipse.jgit.lib.ObjectIdOwnerMap",
      "org.eclipse.jgit.storage.pack.PackConfig",
      "org.eclipse.jgit.revplot.PlotCommit",
      "org.eclipse.jgit.treewalk.filter.TreeFilter",
      "org.eclipse.jgit.lib.TagBuilder",
      "org.eclipse.jgit.awtui.CommitGraphPane",
      "org.eclipse.jgit.nls.GlobalBundleCache",
      "org.eclipse.jgit.revwalk.DelayRevQueue",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftable",
      "org.eclipse.jgit.lib.RefUpdate",
      "org.eclipse.jgit.util.FS$Holder",
      "org.eclipse.jgit.api.TransportCommand",
      "org.eclipse.jgit.treewalk.filter.TreeFilter$AllFilter",
      "org.eclipse.jgit.events.ListenerHandle",
      "org.eclipse.jgit.revplot.AbstractPlotRenderer",
      "org.eclipse.jgit.lib.ConfigLine",
      "org.eclipse.jgit.util.References",
      "org.eclipse.jgit.revwalk.DateRevQueue",
      "org.eclipse.jgit.lib.ObjectInserter$Filter",
      "org.eclipse.jgit.errors.NoWorkTreeException",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemObjDatabase$1",
      "org.eclipse.jgit.lib.ConfigSnapshot$CaseFoldingSet",
      "org.eclipse.jgit.internal.storage.dfs.DfsRefUpdate",
      "org.eclipse.jgit.internal.storage.reftable.RefCursor",
      "org.eclipse.jgit.util.sha1.SHA1$State",
      "org.eclipse.jgit.internal.storage.file.FileReftableDatabase",
      "org.eclipse.jgit.errors.TranslationBundleLoadingException",
      "org.eclipse.jgit.revwalk.ReachabilityChecker",
      "org.eclipse.jgit.revwalk.TreeRevFilter",
      "org.eclipse.jgit.errors.AmbiguousObjectException",
      "org.eclipse.jgit.errors.ConfigInvalidException",
      "org.eclipse.jgit.transport.Transport",
      "org.eclipse.jgit.awtui.SwingCommitList$SwingLane",
      "org.eclipse.jgit.internal.storage.dfs.DfsReader",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$1",
      "org.eclipse.jgit.lib.MutableObjectId",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackListImpl",
      "org.eclipse.jgit.revwalk.FIFORevQueue",
      "org.eclipse.jgit.lib.RefRename",
      "org.eclipse.jgit.lib.ObjectChecker$ErrorType",
      "org.eclipse.jgit.revwalk.Generator",
      "org.eclipse.jgit.lib.AnyObjectId",
      "org.eclipse.jgit.revwalk.RevCommitList",
      "org.eclipse.jgit.internal.storage.reftable.Reftable",
      "org.eclipse.jgit.treewalk.TreeWalk",
      "org.eclipse.jgit.transport.CredentialItem",
      "org.eclipse.jgit.revwalk.filter.RevFilter$NoneFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter",
      "org.eclipse.jgit.events.WorkingTreeModifiedListener",
      "org.eclipse.jgit.internal.storage.file.FileRepository",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjectRepresentation",
      "org.eclipse.jgit.util.FS_POSIX$AtomicFileCreation",
      "org.eclipse.jgit.util.SimpleLruCache$Entry",
      "org.eclipse.jgit.internal.storage.dfs.DfsRefRename",
      "org.eclipse.jgit.errors.StoredObjectRepresentationNotAvailableException",
      "org.eclipse.jgit.revwalk.RevObjectList$Block",
      "org.eclipse.jgit.revwalk.ObjectWalk$VisitationPolicy",
      "org.eclipse.jgit.lib.StoredConfig",
      "org.eclipse.jgit.treewalk.AbstractTreeIterator",
      "org.eclipse.jgit.revwalk.RevFlagSet",
      "org.eclipse.jgit.lib.ObjectInserter$Formatter",
      "org.eclipse.jgit.lib.ObjectReader",
      "org.eclipse.jgit.lib.Repository",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjectToPack",
      "org.eclipse.jgit.util.FS_POSIX",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource$PackSourceComparator",
      "org.eclipse.jgit.errors.RevisionSyntaxException",
      "org.eclipse.jgit.errors.CommandFailedException",
      "org.eclipse.jgit.lib.ObjectInserter",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$RefQueueEntry",
      "org.eclipse.jgit.treewalk.FileTreeIterator",
      "org.eclipse.jgit.errors.RepositoryNotFoundException",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache$RefLoader",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository$EmptyAttributesNodeProvider",
      "org.eclipse.jgit.lib.BaseRepositoryBuilder",
      "org.eclipse.jgit.revwalk.ObjectWalk$TreeVisit",
      "org.eclipse.jgit.lib.BitmapIndex",
      "org.eclipse.jgit.util.time.MonotonicClock",
      "org.eclipse.jgit.errors.InvalidObjectIdException",
      "org.eclipse.jgit.util.TemporaryBuffer$Heap",
      "org.eclipse.jgit.lib.DefaultTypedConfigGetter",
      "org.eclipse.jgit.util.sha1.UbcCheck$DvInfo",
      "org.eclipse.jgit.internal.storage.file.FileSnapshot$1",
      "org.eclipse.jgit.awtui.CommitGraphPane$NameCellRender",
      "org.eclipse.jgit.attributes.AttributesNodeProvider",
      "org.eclipse.jgit.util.FS$LockToken",
      "org.eclipse.jgit.events.RefsChangedListener",
      "org.eclipse.jgit.lib.Config$StringReader",
      "org.eclipse.jgit.internal.storage.reftable.LogCursor",
      "org.eclipse.jgit.storage.file.FileRepositoryBuilder",
      "org.eclipse.jgit.revwalk.filter.ObjectFilter",
      "org.eclipse.jgit.util.RawParseUtils",
      "org.eclipse.jgit.awtui.CommitGraphPane$GraphCellRender",
      "org.eclipse.jgit.internal.storage.pack.PackExt",
      "org.eclipse.jgit.lib.GpgSignature",
      "org.eclipse.jgit.util.IntList",
      "org.eclipse.jgit.revwalk.StartGenerator",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$FilteringMergedRefCursor",
      "org.eclipse.jgit.events.IndexChangedEvent",
      "org.eclipse.jgit.lib.ConfigSnapshot$SectionNames",
      "org.eclipse.jgit.lib.ConfigSnapshot$LineComparator",
      "org.eclipse.jgit.lib.ObjectDatabase",
      "org.eclipse.jgit.awtui.CommitGraphPane$DateCellRender",
      "org.eclipse.jgit.api.SubmoduleAddCommand",
      "org.eclipse.jgit.revwalk.RevFlag",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository",
      "org.eclipse.jgit.lib.ConfigSnapshot",
      "org.eclipse.jgit.api.CloneCommand",
      "org.eclipse.jgit.revplot.PlotCommitList",
      "org.eclipse.jgit.internal.storage.dfs.DfsStreamKey$ByteArrayDfsStreamKey",
      "org.eclipse.jgit.dircache.DirCacheBuilder",
      "org.eclipse.jgit.treewalk.filter.TreeFilter$AnyDiffFilter",
      "org.eclipse.jgit.internal.storage.file.FileObjectDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache",
      "org.eclipse.jgit.dircache.DirCacheTree",
      "org.eclipse.jgit.internal.storage.dfs.DfsRefDatabase$RefCache",
      "org.eclipse.jgit.internal.storage.pack.PackWriter",
      "org.eclipse.jgit.util.NB",
      "org.eclipse.jgit.dircache.DirCacheIterator",
      "org.eclipse.jgit.lib.CommitBuilder",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlock",
      "org.eclipse.jgit.transport.PackParser",
      "org.eclipse.jgit.util.FS_Win32_Cygwin",
      "org.eclipse.jgit.awtui.UIText",
      "org.eclipse.jgit.lib.ObjectLoader",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackList",
      "org.eclipse.jgit.revwalk.LIFORevQueue",
      "org.eclipse.jgit.util.TemporaryBuffer",
      "org.eclipse.jgit.lib.ObjectIdOwnerMap$Entry",
      "org.eclipse.jgit.util.MutableInteger",
      "org.eclipse.jgit.lib.ObjectId",
      "org.eclipse.jgit.internal.storage.file.ObjectDirectory",
      "org.eclipse.jgit.internal.storage.pack.DeltaCache$Ref",
      "org.eclipse.jgit.internal.storage.pack.StoredObjectRepresentation",
      "org.eclipse.jgit.internal.storage.dfs.DfsReaderOptions",
      "org.eclipse.jgit.storage.pack.PackStatistics",
      "org.eclipse.jgit.errors.UnsupportedCredentialItem",
      "org.eclipse.jgit.internal.storage.reftable.ReftableDatabase",
      "org.eclipse.jgit.revwalk.ObjectWalk$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CommitGraphPane_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.eclipse.jgit.awtui.CommitGraphPane",
      "org.eclipse.jgit.awtui.CommitGraphPane$GraphCellRender",
      "org.eclipse.jgit.awtui.CommitGraphPane$NameCellRender",
      "org.eclipse.jgit.awtui.CommitGraphPane$DateCellRender",
      "org.eclipse.jgit.awtui.CommitGraphPane$CommitTableModel",
      "org.eclipse.jgit.nls.NLS",
      "org.eclipse.jgit.revplot.AbstractPlotRenderer",
      "org.eclipse.jgit.awtui.AWTPlotRenderer",
      "org.eclipse.jgit.revwalk.RevObjectList",
      "org.eclipse.jgit.revwalk.RevCommitList",
      "org.eclipse.jgit.revplot.PlotCommitList",
      "org.eclipse.jgit.awtui.SwingCommitList",
      "org.eclipse.jgit.revwalk.RevObjectList$Block",
      "org.eclipse.jgit.nls.TranslationBundle",
      "org.eclipse.jgit.awtui.UIText",
      "org.eclipse.jgit.nls.GlobalBundleCache",
      "org.eclipse.jgit.events.RepositoryEvent",
      "org.eclipse.jgit.events.ConfigChangedEvent",
      "org.eclipse.jgit.lib.PersonIdent",
      "org.eclipse.jgit.lib.AnyObjectId",
      "org.eclipse.jgit.lib.ObjectId",
      "org.eclipse.jgit.lib.ObjectIdOwnerMap$Entry",
      "org.eclipse.jgit.revwalk.RevObject",
      "org.eclipse.jgit.revwalk.RevCommit",
      "org.eclipse.jgit.revwalk.RevWalk",
      "org.eclipse.jgit.lib.MutableObjectId",
      "org.eclipse.jgit.lib.ObjectIdOwnerMap",
      "org.eclipse.jgit.revwalk.Generator",
      "org.eclipse.jgit.revwalk.AbstractRevQueue$AlwaysEmptyQueue",
      "org.eclipse.jgit.revwalk.AbstractRevQueue",
      "org.eclipse.jgit.revwalk.DateRevQueue",
      "org.eclipse.jgit.revwalk.StartGenerator",
      "org.eclipse.jgit.revwalk.filter.RevFilter$AllFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter$NoneFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter$OnlyMergesFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter$NoMergesFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter$MergeBaseFilter",
      "org.eclipse.jgit.revwalk.filter.RevFilter",
      "org.eclipse.jgit.treewalk.filter.TreeFilter$AllFilter",
      "org.eclipse.jgit.treewalk.filter.TreeFilter$AnyDiffFilter",
      "org.eclipse.jgit.treewalk.filter.TreeFilter",
      "org.eclipse.jgit.lib.ObjectInserter",
      "org.eclipse.jgit.lib.ObjectInserter$Formatter",
      "org.eclipse.jgit.util.SystemReader$Default",
      "org.eclipse.jgit.util.RawParseUtils",
      "org.eclipse.jgit.lib.Constants",
      "org.eclipse.jgit.lib.ObjectChecker",
      "org.eclipse.jgit.util.MutableInteger",
      "org.eclipse.jgit.lib.ObjectChecker$ErrorType",
      "org.eclipse.jgit.util.SystemReader",
      "org.eclipse.jgit.util.sha1.SHA1",
      "org.eclipse.jgit.util.sha1.SHA1$State",
      "org.eclipse.jgit.events.ListenerList",
      "org.eclipse.jgit.lib.Repository",
      "org.eclipse.jgit.internal.storage.file.FileRepository",
      "org.eclipse.jgit.lib.BaseRepositoryBuilder",
      "org.eclipse.jgit.storage.file.FileRepositoryBuilder",
      "org.eclipse.jgit.util.FS$FSFactory",
      "org.eclipse.jgit.util.FS_POSIX",
      "org.eclipse.jgit.util.FS_POSIX$AtomicFileCreation",
      "org.eclipse.jgit.util.FS",
      "org.eclipse.jgit.lib.DefaultTypedConfigGetter",
      "org.eclipse.jgit.lib.Config",
      "org.eclipse.jgit.lib.StoredConfig",
      "org.eclipse.jgit.storage.file.FileBasedConfig",
      "org.eclipse.jgit.lib.ConfigSnapshot",
      "org.eclipse.jgit.util.SimpleLruCache",
      "org.eclipse.jgit.util.FS$FileStoreAttributes",
      "org.eclipse.jgit.internal.storage.file.FileSnapshot$1",
      "org.eclipse.jgit.internal.storage.file.FileSnapshot",
      "org.eclipse.jgit.util.FileUtils",
      "org.eclipse.jgit.util.IO",
      "org.eclipse.jgit.util.io.SilentFileInputStream",
      "org.eclipse.jgit.util.NB",
      "org.eclipse.jgit.lib.ConfigSnapshot$LineComparator",
      "org.eclipse.jgit.util.StringUtils",
      "org.eclipse.jgit.util.FS$Holder",
      "org.eclipse.jgit.util.sha1.UbcCheck$DvInfo",
      "org.eclipse.jgit.util.sha1.UbcCheck",
      "org.eclipse.jgit.lib.CommitBuilder",
      "org.eclipse.jgit.storage.pack.PackConfig",
      "org.eclipse.jgit.lib.TagBuilder",
      "org.eclipse.jgit.util.time.ProposedTimestamp",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepositoryBuilder",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$Builder",
      "org.eclipse.jgit.internal.storage.dfs.DfsConfig",
      "org.eclipse.jgit.lib.ObjectDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackList",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$1",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemObjDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsReaderOptions",
      "org.eclipse.jgit.internal.storage.dfs.DfsPackDescription",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource$ComparatorBuilder",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource$PackSourceComparator",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackSource",
      "org.eclipse.jgit.lib.RefDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsRefDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableDatabase",
      "org.eclipse.jgit.internal.storage.dfs.InMemoryRepository$MemRefDatabase",
      "org.eclipse.jgit.internal.storage.reftable.ReftableDatabase",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableDatabase$1",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepositoryDescription",
      "org.eclipse.jgit.errors.InvalidObjectIdException",
      "org.eclipse.jgit.internal.JGitText",
      "org.eclipse.jgit.internal.storage.reftable.Reftable",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable",
      "org.eclipse.jgit.lib.ObjectReader",
      "org.eclipse.jgit.internal.storage.dfs.DfsReader",
      "org.eclipse.jgit.internal.storage.dfs.DfsReaderIoStats$Accumulator",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCacheConfig",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache$Ref",
      "org.eclipse.jgit.internal.storage.dfs.DfsStreamKey",
      "org.eclipse.jgit.internal.storage.dfs.DfsStreamKey$ByteArrayDfsStreamKey",
      "org.eclipse.jgit.internal.storage.pack.PackExt",
      "org.eclipse.jgit.internal.storage.dfs.DfsBlockCache",
      "org.eclipse.jgit.internal.storage.dfs.DfsObjDatabase$PackListImpl",
      "org.eclipse.jgit.internal.storage.dfs.DfsPacksChangedEvent",
      "org.eclipse.jgit.internal.storage.dfs.DfsReftableStack",
      "org.eclipse.jgit.internal.storage.reftable.RefCursor",
      "org.eclipse.jgit.internal.storage.reftable.MergedReftable$MergedRefCursor",
      "org.eclipse.jgit.lib.ObjectIdRef",
      "org.eclipse.jgit.lib.ObjectIdRef$PeeledNonTag",
      "org.eclipse.jgit.api.GitCommand",
      "org.eclipse.jgit.api.TransportCommand",
      "org.eclipse.jgit.api.SubmoduleAddCommand",
      "org.eclipse.jgit.transport.CredentialsProvider",
      "org.eclipse.jgit.revwalk.RevFlagSet",
      "org.eclipse.jgit.revwalk.ObjectWalk$1",
      "org.eclipse.jgit.revwalk.ObjectWalk",
      "org.eclipse.jgit.dircache.DirCache",
      "org.eclipse.jgit.errors.NoWorkTreeException",
      "org.eclipse.jgit.transport.PackedObjectInfo",
      "org.eclipse.jgit.internal.storage.pack.ObjectToPack",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository$EmptyAttributesNodeProvider",
      "org.eclipse.jgit.attributes.AttributesNode",
      "org.eclipse.jgit.internal.storage.dfs.DfsRepository$EmptyAttributesNodeProvider$EmptyAttributesNode",
      "org.eclipse.jgit.lib.AbbreviatedObjectId",
      "org.eclipse.jgit.lib.InflaterCache",
      "org.eclipse.jgit.revwalk.RevFlag$StaticRevFlag",
      "org.eclipse.jgit.revwalk.RevFlag",
      "org.eclipse.jgit.revwalk.RevTag",
      "org.eclipse.jgit.errors.CorruptObjectException"
    );
  }
}
