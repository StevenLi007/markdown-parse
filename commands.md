javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java

java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

scp -r . cs15lwi22abb@ieng6.ucsd.edu:~/markdown-parse

ssh cs15lwi22abb@ieng6.ucsd.edu

scp -r . cs15lwi22abb@ieng6.ucsd.edu:~/markdown-parse; ssh cs15lwi22abb@ieng6.ucsd.edu; cd markdown-parse; javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java; java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest