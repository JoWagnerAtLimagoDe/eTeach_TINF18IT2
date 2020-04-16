#include <iostream>


double summe(int anzahl, double summand1, ...) {
	double retval = 0;

	double* feld = &summand1;

	for (int i = 0; i < anzahl; i++) {
		retval += feld[i];
	}
	return retval;
}

void ausgabe(const char* text1, ...) {
	char** feld = (char **)&text1;
	while (*feld)
		std::cout << *feld++ << std::endl;
}


int main(int argc, char **argv, char ** env)
{
	
	ausgabe("Hallo", "Welt", "Hallo", "Universum", NULL);

	double ergebnis = summe(3, 10.0, 20.0, 30.0);
	std::cout << ergebnis << std::endl;
	///*char b1[] = "Hallo Universum";
	//char b2[] = "Welt";

	//char* buffer [] = { b1, b2 };
	//std::cout << buffer[1][0] << std::endl;

	//std::cout << sizeof(buffer) << std::endl;*/
	//for(int i = 0; i < argc; i++) 
	//std::cout << argv[i] << std::endl;

}

