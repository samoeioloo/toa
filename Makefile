JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = scoring2.java
MAIN = scoring2

default:
	$(JC) *.java



run: $(MAIN).class
	$(JVM) $(MAIN)
clean:
	$(RM) *.class
