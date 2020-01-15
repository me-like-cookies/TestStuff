SET JDKPATH=C:\OpenJDK\bellsoft-jdk-11.0.5-win32_i586
SET JDKVERSION=11.0.5-Bellsoft+

mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.base.jmod -DgroupId=local.openjdk -DartifactId=javafx-base -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.controls.jmod -DgroupId=local.openjdk -DartifactId=javafx-controls -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.fxml.jmod -DgroupId=local.openjdk -DartifactId=javafx-fxml -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.graphics.jmod -DgroupId=local.openjdk -DartifactId=javafx-graphics -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.media.jmod -DgroupId=local.openjdk -DartifactId=javafx-media -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.swing.jmod -DgroupId=local.openjdk -DartifactId=javafx-swing -Dversion=%JDKVERSION% -Dpackaging=jmod
mvn install:install-file -Dfile=%JDKPATH%\jmods\javafx.web.jmod -DgroupId=local.openjdk -DartifactId=javafx-web -Dversion=%JDKVERSION% -Dpackaging=jmod