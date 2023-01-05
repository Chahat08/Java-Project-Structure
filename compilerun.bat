@ECHO OFF

set TARGET_DIR=C:\dev\ck\java\package-structure\target
set MAIN_APP=C:\dev\ck\java\package-structure\src\MainApplication.java
set TARGET_FILE=C:\dev\ck\java\package-structure\target\MainApplication.class

javac %MAIN_APP% -d %TARGET_DIR%
java %TARGET_FILE%