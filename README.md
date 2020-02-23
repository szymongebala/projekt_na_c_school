# projekt_na_c_school
Projekt zaliczeniowy 
Program do zarządzania projektami, instrukcjami i opakowaniami w bazie danych.
Role:
Użytkownik.
Funkcjonalności
Baza przechowuje projekty:
  -projekt sklada sie z :
    instrukcji
    skrzyń
    materiałów
    kosztów
Baza przechowuje Instrukcje
  -instrukcja składa się z :
    preservation
    boxmaterial
    do instrukcji należą projekty
Baza przechowuje Preservation
  -preservation reprezentuje trzy sposoby konserwacji
  -Preservation należy do instrukcji
Baza przechowuje BoxMaterial
  -boxmaterial reprezentuke trzy typy materiałów 
  -box material należy do:
    -instrukcji
    -projektu
Baza przechowuje skrzynie:
 skrzynie należą do projektu
 do skrzyń należy boxmaterial
Funkcje
-można dodać do bazy sam projekt
-można dodać do bazy samą instrukcję
-można dodać do bazy same skrzynie
-można dodać do bazy samo Preservation
-można dodać do bazy boxmaterial
Budowanie zależności
-projekt mozna połaćzyć:
  z instrukcją
  skrzyniami
  preservation
Wrtość boxmaterial jest pobierana w zależności od instrukcji
Projektom można nadać status:
Ofertowany
Zamówiony
Przygotowany
Skończony
Wysłany

Technologie użyte w projekcie:
SpringBoot
Hibernate
Baza danych PostgresQL
Spring MVC
Spring data
    
 

    
  
