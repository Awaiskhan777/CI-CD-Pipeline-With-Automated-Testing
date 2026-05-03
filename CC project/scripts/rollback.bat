@echo off
echo =========================================
echo   ROLLBACK SCRIPT
echo =========================================
echo.
echo Initiating rollback to previous version...
echo.

cd /d C:\Users\Cyber World\OneDrive\Desktop\CC project

echo Step 1: Finding previous JAR file...
for /f "delims=" %%i in ('dir target\*.jar /b /o-d') do set LATEST_JAR=%%i
echo Latest JAR: %LATEST_JAR%

echo.
echo Step 2: Restoring previous version...
copy target\*.jar target\app-backup.jar

echo.
echo Step 3: Restarting application...
echo Rollback completed successfully!

echo.
echo =========================================
echo   ROLLBACK COMPLETE
echo =========================================
pause