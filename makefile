run: Vigenere.class
	java Vigenere $(ARGS)

Vigenere.class: Vigenere.java
	javac Vigenere.java

clean:
	rm *.class