@ echo off 
@ echo shutdown server ...... 
CALL shutdown.bat
@ echo building ......
CALL mvn clean package
@ echo startup server ......
CALL startup.bat
@ echo.
@ echo off
@ echo ok