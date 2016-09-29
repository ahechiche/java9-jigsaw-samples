export JIGSAW_HOME=/opt/jdk-9/
export JIGSAW_BIN=/opt/jdk-9/bin/

rm -rf mods
mkdir mods

echo "Start compiling ..... "
$JIGSAW_BIN/javac -d mods --module-source-path src $(find src -name "*.java")

echo "Start execution ..... "
$JIGSAW_BIN/java -p mods -m com.knoldus.main/com.knoldus.main.Main

rm -rf mlib
mkdir mlib

echo "Start packaging ..... "

$JIGSAW_BIN/jar --create --file=mlib/com.knoldus.util@1.0.jar --module-version=1.0 -C mods/com.knoldus.util .
$JIGSAW_BIN/jar --create --file=mlib/com.knoldus.service@1.0.jar --module-version=1.0 -C mods/com.knoldus.service .
$JIGSAW_BIN/jar --create --file=mlib/com.knoldus.service.provider@1.0.jar --module-version=1.0 -C mods/com.knoldus.service.provider .
$JIGSAW_BIN/jar --create --file=mlib/com.main.jar --main-class=com.knoldus.main.Main -C mods/com.knoldus.main .
$JIGSAW_BIN/java -p mlib -m com.knoldus.main

