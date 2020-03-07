REM JDKVERSION=major.minor.micro-supplier
SET JDKVERSION=13.0.2+9-Bellsoft+
REM JDKPLATFORMS: win32, linux-arm32
SET JDKPLATFORM=win64
SET JDKPATH=bellsoft-jdk13.0.2+9-windows-amd64-full
SET JMODPATH=%JDKPATH%\jmods
SET GROUPID=local.openjdk
SET PARAMS=-Dversion=%JDKVERSION% -Dpackaging=jmod -Dclassifier=%JDKPLATFORM% -DgroupId=%GROUPID%

call mvn install:install-file -Dfile=%JMODPATH%\javafx.base.jmod     -DartifactId=javafx-base     %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.controls.jmod -DartifactId=javafx-controls %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.fxml.jmod     -DartifactId=javafx-fxml     %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.graphics.jmod -DartifactId=javafx-graphics %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.media.jmod    -DartifactId=javafx-media    %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.swing.jmod    -DartifactId=javafx-swing    %PARAMS%
call mvn install:install-file -Dfile=%JMODPATH%\javafx.web.jmod      -DartifactId=javafx-web      %PARAMS%
