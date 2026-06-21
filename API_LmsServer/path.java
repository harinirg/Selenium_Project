Started by user Harini R G

[Pipeline] Start of Pipeline
[Pipeline] node
Running on Jenkins
 in C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Declarative: Tool Install)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] }
[Pipeline] // stage
[Pipeline] withEnv
[Pipeline] {
[Pipeline] stage
[Pipeline] { (Checkout Code)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] git
The recommended git tool is: NONE
No credentials specified
 > C:\Program Files\Git\bin\git.exe rev-parse --resolve-git-dir C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\.git # timeout=10
Fetching changes from the remote Git repository
 > C:\Program Files\Git\bin\git.exe config remote.origin.url https://github.com/harinirg/Selenium_Project.git # timeout=10
Fetching upstream changes from https://github.com/harinirg/Selenium_Project.git
 > C:\Program Files\Git\bin\git.exe --version # timeout=10
 > git --version # 'git version 2.53.0.windows.1'
 > C:\Program Files\Git\bin\git.exe fetch --tags --force --progress -- https://github.com/harinirg/Selenium_Project.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > C:\Program Files\Git\bin\git.exe rev-parse "refs/remotes/origin/master^{commit}" # timeout=10
Checking out Revision 75922d10b195a5d2592dadebbbbe4c35781fe338 (refs/remotes/origin/master)
 > C:\Program Files\Git\bin\git.exe config core.sparsecheckout # timeout=10
 > C:\Program Files\Git\bin\git.exe checkout -f 75922d10b195a5d2592dadebbbbe4c35781fe338 # timeout=10
 > C:\Program Files\Git\bin\git.exe branch -a -v --no-abbrev # timeout=10
 > C:\Program Files\Git\bin\git.exe branch -D master # timeout=10
 > C:\Program Files\Git\bin\git.exe checkout -b master 75922d10b195a5d2592dadebbbbe4c35781fe338 # timeout=10
Commit message: "Commited the LmsServer"
 > C:\Program Files\Git\bin\git.exe rev-list --no-walk 38d6ccac69200b8f2bb8f1bb1cf46e020ff9c854 # timeout=10
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Build & Run Tests)
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] tool
[Pipeline] envVarsForTool
[Pipeline] withEnv
[Pipeline] {
[Pipeline] dir
Running in C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\LmsServer_API
[Pipeline] {
[Pipeline] bat

C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\LmsServer_API>mvn clean test 
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.testlmsserver:API_LmsServer >-------------------
[INFO] Building API_LmsServer 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar
Progress (1): 0.9/283 kB
Progress (1): 2.3/283 kB
Progress (1): 3.6/283 kB
Progress (1): 5.0/283 kB
Progress (1): 6.4/283 kB
Progress (1): 7.7/283 kB
Progress (1): 9.1/283 kB
Progress (1): 10/283 kB 
Progress (1): 12/283 kB
Progress (1): 13/283 kB
Progress (1): 15/283 kB
Progress (1): 16/283 kB
Progress (1): 17/283 kB
Progress (1): 19/283 kB
Progress (1): 20/283 kB
Progress (1): 21/283 kB
Progress (1): 23/283 kB
Progress (1): 24/283 kB
Progress (1): 25/283 kB
Progress (1): 27/283 kB
Progress (1): 28/283 kB
Progress (1): 30/283 kB
Progress (1): 31/283 kB
Progress (1): 32/283 kB
Progress (1): 34/283 kB
Progress (1): 35/283 kB
Progress (1): 36/283 kB
Progress (1): 38/283 kB
Progress (1): 39/283 kB
Progress (1): 41/283 kB
Progress (1): 42/283 kB
Progress (1): 43/283 kB
Progress (1): 45/283 kB
Progress (1): 46/283 kB
Progress (1): 47/283 kB
Progress (1): 49/283 kB
Progress (1): 50/283 kB
Progress (1): 51/283 kB
Progress (1): 53/283 kB
Progress (1): 54/283 kB
Progress (1): 56/283 kB
Progress (1): 60/283 kB
Progress (1): 64/283 kB
Progress (1): 68/283 kB
Progress (1): 73/283 kB
Progress (1): 77/283 kB
Progress (1): 81/283 kB
Progress (1): 85/283 kB
Progress (1): 89/283 kB
Progress (1): 94/283 kB
Progress (1): 98/283 kB
Progress (1): 102/283 kB
Progress (1): 106/283 kB
Progress (1): 111/283 kB
Progress (1): 115/283 kB
Progress (1): 119/283 kB
Progress (1): 123/283 kB
Progress (1): 127/283 kB
Progress (1): 132/283 kB
Progress (1): 136/283 kB
Progress (1): 140/283 kB
Progress (1): 144/283 kB
Progress (1): 149/283 kB
Progress (1): 153/283 kB
Progress (1): 155/283 kB
Progress (1): 159/283 kB
Progress (1): 164/283 kB
Progress (1): 168/283 kB
Progress (1): 172/283 kB
Progress (1): 176/283 kB
Progress (1): 181/283 kB
Progress (1): 185/283 kB
Progress (1): 189/283 kB
Progress (1): 193/283 kB
Progress (1): 197/283 kB
Progress (1): 202/283 kB
Progress (1): 206/283 kB
Progress (1): 210/283 kB
Progress (1): 214/283 kB
Progress (1): 219/283 kB
Progress (1): 223/283 kB
Progress (1): 239/283 kB
Progress (1): 256/283 kB
Progress (1): 272/283 kB
Progress (1): 283 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.jar (283 kB at 82 kB/s)
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ API_LmsServer ---
[INFO] 
[INFO] --- resources:3.4.0:resources (default-resources) @ API_LmsServer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\LmsServer_API\src\main\resources
[INFO] 
[INFO] --- compiler:3.15.0:compile (default-compile) @ API_LmsServer ---
[INFO] No sources to compile
[INFO] 
[INFO] --- resources:3.4.0:testResources (default-testResources) @ API_LmsServer ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\LmsServer_API\src\test\resources
[INFO] 
[INFO] --- compiler:3.15.0:testCompile (default-testCompile) @ API_LmsServer ---
[INFO] Recompiling the module because of changed dependency.
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 8 source files with javac [debug target 1.8] to target\test-classes
[WARNING] bootstrap class path is not set in conjunction with -source 8
  not setting the bootstrap class path may lead to class files that cannot run on JDK 8
    --release 8 is recommended instead of -source 8 -target 1.8 because it sets the bootstrap class path automatically
[WARNING] source value 8 is obsolete and will be removed in a future release
[WARNING] target value 8 is obsolete and will be removed in a future release
[WARNING] To suppress warnings about obsolete options, use -Xlint:-options.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ API_LmsServer ---
[INFO] Using auto detected provider org.apache.maven.surefire.testng.TestNGProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by org.aspectj.weaver.loadtime.ClassLoaderWeavingAdaptor (file:/C:/Windows/system32/config/systemprofile/.m2/repository/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.jar)
WARNING: Please consider reporting this to the maintainers of class org.aspectj.weaver.loadtime.ClassLoaderWeavingAdaptor
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Running TestSuite
SLF4J(W): No SLF4J providers were found.
SLF4J(W): Defaulting to no-operation (NOP) logger implementation
SLF4J(W): See https://www.slf4j.org/codes.html#noProviders for further details.
[ERROR] 
Cannot find class in classpath: com.test.Get_All_Roles_Test
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 0, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  35.237 s
[INFO] Finished at: 2026-06-21T21:32:19+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.2.5:test (default-test) on project API_LmsServer: 
[ERROR] 
[ERROR] Please refer to C:\ProgramData\Jenkins\.jenkins\workspace\API_LmsServer\LmsServer_API\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] There was an error in the forked process
[ERROR] 
[ERROR] Cannot find class in classpath: com.test.Get_All_Roles_Test
[ERROR] org.apache.maven.surefire.booter.SurefireBooterForkException: There was an error in the forked process
[ERROR] 
[ERROR] Cannot find class in classpath: com.test.Get_All_Roles_Test
[ERROR] 	at org.apache.maven.plugin.surefire.booterclient.ForkStarter.fork(ForkStarter.java:628)
[ERROR] 	at org.apache.maven.plugin.surefire.booterclient.ForkStarter.run(ForkStarter.java:285)
[ERROR] 	at org.apache.maven.plugin.surefire.booterclient.ForkStarter.run(ForkStarter.java:250)
[ERROR] 	at org.apache.maven.plugin.surefire.AbstractSurefireMojo.executeProvider(AbstractSurefireMojo.java:1241)
[ERROR] 	at org.apache.maven.plugin.surefire.AbstractSurefireMojo.executeAfterPreconditionsChecked(AbstractSurefireMojo.java:1090)
[ERROR] 	at org.apache.maven.plugin.surefire.AbstractSurefireMojo.execute(AbstractSurefireMojo.java:910)
[ERROR] 	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:126)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute2(MojoExecutor.java:328)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.doExecute(MojoExecutor.java:316)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:212)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:174)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.access$000(MojoExecutor.java:75)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor$1.run(MojoExecutor.java:162)
[ERROR] 	at org.apache.maven.plugin.DefaultMojosExecutionStrategy.execute(DefaultMojosExecutionStrategy.java:39)
[ERROR] 	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:159)
[ERROR] 	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:105)
[ERROR] 	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:73)
[ERROR] 	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:53)
[ERROR] 	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:118)
[ERROR] 	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:261)
[ERROR] 	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:173)
[ERROR] 	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:101)
[ERROR] 	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:919)
[ERROR] 	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:285)
[ERROR] 	at org.apache.maven.cli.MavenCli.main(MavenCli.java:207)
[ERROR] 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
[ERROR] 	at java.base/java.lang.reflect.Method.invoke(Method.java:565)
[ERROR] 	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:255)
[ERROR] 	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:201)
[ERROR] 	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:361)
[ERROR] 	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:314)
[ERROR] 
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoExecutionException
[Pipeline] }
[Pipeline] // dir
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Publish TestNG XML Results)
Stage "Publish TestNG XML Results" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Publish Allure Report)
Stage "Publish Allure Report" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Publish TestNG HTML Report)
Stage "Publish TestNG HTML Report" skipped due to earlier failure(s)
[Pipeline] getContext
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Declarative: Post Actions)
[Pipeline] archiveArtifacts
Archiving artifacts
[Pipeline] emailext
Sending mail from default account using System Admin e-mail address
messageContentType = text/html; charset=UTF-8
Adding recipients from project recipient list
Analyzing: 2k22ece028@kiot.ac.in
Looking for: 2k22ece028@kiot.ac.in
	starting at: 0
	firstFoundIdx: 0
	firstFoundIdx-substring: 2k22ece028@kiot.ac.in
	=> found type: 0
Analyzing: 2k22ece028@kiot.ac.in
Looking for: 2k22ece028@kiot.ac.in
	starting at: 0
	firstFoundIdx: 0
	firstFoundIdx-substring: 2k22ece028@kiot.ac.in
	=> found type: 0
Analyzing: 2k22ece028@kiot.ac.in
Looking for: 2k22ece028@kiot.ac.in
	starting at: 0
	firstFoundIdx: 0
	firstFoundIdx-substring: 2k22ece028@kiot.ac.in
	=> found type: 0
Adding recipients from trigger recipient list
Successfully created MimeMessage
Sending email to: 2k22ece028@kiot.ac.in
DEBUG: getProvider() returning jakarta.mail.Provider[TRANSPORT,smtp,org.eclipse.angus.mail.smtp.SMTPTransport,Oracle]
DEBUG SMTP: need username and password for authentication
DEBUG SMTP: protocolConnect returning false, host=smtp.gmail.com, user=LAPTOP-GT1N6IAM$, password=<null>
DEBUG SMTP: useEhlo true, useAuth true
DEBUG SMTP: trying to connect to host "smtp.gmail.com", port 587, isSSL false
220 smtp.gmail.com ESMTP 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
DEBUG SMTP: connected to host "smtp.gmail.com", port: 587
EHLO LAPTOP-GT1N6IAM
250-smtp.gmail.com at your service, [42.104.129.96]
250-SIZE 35882577
250-8BITMIME
250-STARTTLS
250-ENHANCEDSTATUSCODES
250-PIPELINING
250-CHUNKING
250 SMTPUTF8
DEBUG SMTP: Found extension "SIZE", arg "35882577"
DEBUG SMTP: Found extension "8BITMIME", arg ""
DEBUG SMTP: Found extension "STARTTLS", arg ""
DEBUG SMTP: Found extension "ENHANCEDSTATUSCODES", arg ""
DEBUG SMTP: Found extension "PIPELINING", arg ""
DEBUG SMTP: Found extension "CHUNKING", arg ""
DEBUG SMTP: Found extension "SMTPUTF8", arg ""
STARTTLS
220 2.0.0 Ready to start TLS
EHLO LAPTOP-GT1N6IAM
250-smtp.gmail.com at your service, [42.104.129.96]
250-SIZE 35882577
250-8BITMIME
250-AUTH LOGIN PLAIN XOAUTH2 PLAIN-CLIENTTOKEN OAUTHBEARER XOAUTH
250-ENHANCEDSTATUSCODES
250-PIPELINING
250-CHUNKING
250 SMTPUTF8
DEBUG SMTP: Found extension "SIZE", arg "35882577"
DEBUG SMTP: Found extension "8BITMIME", arg ""
DEBUG SMTP: Found extension "AUTH", arg "LOGIN PLAIN XOAUTH2 PLAIN-CLIENTTOKEN OAUTHBEARER XOAUTH"
DEBUG SMTP: Found extension "ENHANCEDSTATUSCODES", arg ""
DEBUG SMTP: Found extension "PIPELINING", arg ""
DEBUG SMTP: Found extension "CHUNKING", arg ""
DEBUG SMTP: Found extension "SMTPUTF8", arg ""
DEBUG SMTP: protocolConnect login, host=smtp.gmail.com, user=harinirg26@gmail.com, password=<non-null>
DEBUG SMTP: Attempt to authenticate using mechanisms: LOGIN PLAIN DIGEST-MD5 NTLM XOAUTH2 
DEBUG SMTP: Using mechanism LOGIN
DEBUG SMTP: AUTH LOGIN command trace suppressed
DEBUG SMTP: AUTH LOGIN succeeded
DEBUG SMTP: use8bit false
MAIL FROM:<harinirg26@gmail.com>
250 2.1.0 OK 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
DEBUG SMTP: sendPartial set
RCPT TO:<2k22ece028@kiot.ac.in>
250 2.1.5 OK 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
DEBUG SMTP: Verified Addresses
DEBUG SMTP:   2k22ece028@kiot.ac.in
DATA
354 Go ahead 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
Date: Sun, 21 Jun 2026 21:32:23 +0530 (IST)
From: harinirg26@gmail.com
To: 2k22ece028@kiot.ac.in
Message-ID: <1113983184.1.1782057753032@LAPTOP-GT1N6IAM>
Subject: BUILD FAILURE : API_LmsServer
MIME-Version: 1.0
Content-Type: multipart/mixed; 
	boundary="----=_Part_0_1607359706.1782057743717"
X-Jenkins-Job: API_LmsServer
X-Jenkins-Result: FAILURE
List-ID: 

------=_Part_0_1607359706.1782057743717
Content-Type: text/html; charset=UTF-8
Content-Transfer-Encoding: 7bit

Build URL: http://localhost:8080/job/API_LmsServer/10/
------=_Part_0_1607359706.1782057743717--
.
250 2.0.0 OK  1782057755 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
DEBUG SMTP: message successfully delivered to mail server
QUIT
221 2.0.0 closing connection 98e67ed59e1d1-37d4f222bafsm4690032a91.7 - gsmtp
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
ERROR: script returned exit code 1
Finished: FAILURE
