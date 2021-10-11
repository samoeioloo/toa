JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = convHull.java
MAIN = convHull

default:
	$(JC) *.java



run: $(MAIN).class
	$(JVM) $(MAIN)
clean:
	$(RM) *.class
