Java to tylko narzedzie, klucz do sukcesu to JVM do kompilowania kodu na bytecode bo moze byc uruchomiony na kazdym narzedziu - pralka, android, win 

klasy to jakby formularz statystyczny [szablon] ktory morzemy owielac milion razy 

obiekt to wypelniony formularz, klasa wypelniona danymi jest obiektem

Obiekt  bez danych jest klasa

aplikacjia - API + baza polaczenie hibernate 

nazwy klas z duzej litery, nazwy pul z malej litery lub camelcase, nazwy metod z malej litery

null  czyli brak jakielkolwiek wartosci

pola final - tylko raz zdefiniowane final String name = "wartosci";   musi byc odrazu zadeklaowany i ni emozna jej zmieniac  mozna rowniez ustawic poprzez konstruktor - to jedyna metoda pisana wielka litery

garbyck colektor wlacza sie kiedy chce

metody static - ile razy sie odwolamy to odwolujemy sie jedynie ciagle do tego samej metody NIE uzywac bo to zle

getery sa dobre abyy np wrzucac info o userze ktory pobiera kiedy i ile razy
mozemy przechowywac dane w inny sposob niz przekazujemy uzytkownikowi

Nierobimy czegos na wyrost jezlei ktos ma miec dostep do zminnej to nie ma sensu robic getery i setery, natomiast jak mamy jkas logike w set i get to ma sens to stosowac

pola prywatne - tylko wewnatrz tej klasy mozn ajez zmienciac

bez podania to oznacza ze zakres z dziedzcenia i wewnatrz paczki

protected tto tylko wewnatrz packed


konstruktor przygotowuje nam obiekt do pracy na nim.

pola finall musza byc od razu ustawione. ktore nie powinny si ezmieniac jak dlugo zyje obiekt. z reguly sa ustawian w konstruktorze.

getery i setry maj asens jak wykonujemy przy tym jakies metody np get - zapiszemy kto pyta  a set wydrukowac cos, zglosic itd; jak przechowujemy cos pod ina postacia a zwracamy pod inna

geter jak tylko do odczytu

CTRL + W  --- ZAZNACZA SLOWO POTEM KOJENY BLOK SLOW - METODE ITD

DZIEDZICZENIE:

null - brak przypisania  - to nie jest zero !!!

kod wykonuje sie od srdoka poniewaz >> System.out.println(bartek.getSalary());  najpierw pobeirane sa zarobki a potem dopiero jest println

w java kazda klasa tylko jednego rodzica.


SUPER TO PRZYPISANIE DO RODZICA

sprawdzeieni czy Human jest Animals   >> Human instanceof Animal  True

opel1 = new Car
opel2 = opel1

opel1 == opel2  >> True

jezlei obiekt3 = new Car

opel1 == obiek False

clasa abstrakcyjane to jakby koncept na cala klase - jak potrzbujemy jakis zaimpelentowanych metod lub danych.

a interface to koncept klasy

jezlei musimy przechowwyac jakies dane w klasie nadrzednej to trzymamy je w klasie abstrakcyjnej.

interfejs uzywamy jak mamy jakies wymagania - ogulny koncept

interfejs to jakby same wymagania

przeladowanie/przeciazanie metody - 
1 ver >> ta sama nazwa, zwracaja to same ale maja inne parametry 
2. ta sama nazwa i inne parametry

przeciazanie mozna robic rowniez dla konstruktorow

przeslanianie/overriding  - przeslaniamy metode klasy nadrzednej

przeciazanie jest w jednej klasie i dodatkowe parametry lub rozne

a przyslanianie jest ta sama metoda - nazwa, i parametry oraz retunt to to samo


Jedna zmienna ma robić tyłka jedna rzecz. Np jak zmienna weight trzyma wagę to nie powinna również odpowiadać czy np pies żyje bo weight <=0, lepiej jest dodac kolejna zmienna isALive i zmieniać jej stan!!! 

