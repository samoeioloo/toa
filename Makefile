JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = closestPair.java
MAIN = closestPair

default:
	$(JC) *.java



run: $(MAIN).class
	$(JVM) $(MAIN)
clean:
	$(RM) *.class
