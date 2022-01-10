export CLASSPATH=antlr.jar:.
java -jar antlr.jar -package gen -o gen Obj.g4
javac *.java obj/*.java
time java Main 
