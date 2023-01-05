@ECHO OFF

set TARGET_DIR=C:\dev\ck\java\package-structure\target
set MAIN_APP=C:\dev\ck\java\package-structure\src\MainApplication.java

javac %MAIN_APP% -d %TARGET_DIR%
ECHO Compiled source program
ECHO Continue to run
PAUSE

java -cp %TARGET_DIR% MainApplication