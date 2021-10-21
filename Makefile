JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = binary_search.java
MAIN = binary_search

default:
	$(JC) *.java



run: $(MAIN).class
	$(JVM) $(MAIN)
clean:
	$(RM) *.class
