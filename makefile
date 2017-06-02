C = gcc 
CFLAGS = -Wall -pedantic -std=c99

executables = chess

bin/chess.o: chess.c 
	$(C) $(CFLAGS) chess.c -o bin/chess

run:
	./bin/chess

clean: 
	rm -rf bin/chess
