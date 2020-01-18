REM JDKVERSION=major.minor.micro-supplier
SET JDKVERSION=11.0.6-Bellsoft+
REM JDKPLATFORMS: win32, linux-arm32
SET JDKPLATFORM=win32
SET JDKPATH=bellsoft-jdk11.0.6-win_i586
SET JMODPATH=%JDKPATH%\jmods
SET PARAMS=-Dversion=%JDKVERSION% -Dpackaging=jmod -Dclassifier=%JDKPLATFORM%

call mvn install:install-file -Dfile=%JMODPATH%\javafx.base.jmod -DgroupId=local.openjdk -DartifactId=javafx-base %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.controls.jmod -DgroupId=local.openjdk -DartifactId=javafx-controls %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.fxml.jmod -DgroupId=local.openjdk -DartifactId=javafx-fxml %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.graphics.jmod -DgroupId=local.openjdk -DartifactId=javafx-graphics %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.media.jmod -DgroupId=local.openjdk -DartifactId=javafx-media %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.swing.jmod -DgroupId=local.openjdk -DartifactId=javafx-swing %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.web.jmod -DgroupId=local.openjdk -DartifactId=javafx-web %PARAMS%
