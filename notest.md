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

Jedna zmienna ma robić tyłka jedna rzecz. Np jak zmienna weight trzyma wagę to nie powinna również odpowiadać czy np pies żyje bo weight <=0, lepiej jest dodac kolejna zmienna isALive i zmieniać jej stan!!! 
