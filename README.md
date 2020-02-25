# projekt_na_c_school
#Projekt zaliczeniowy 

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

  -preservation reprezentuje sposoby konserwacji
  -Preservation należy do instrukcji
Baza przechowuje BoxMaterial

  -boxmaterial reprezentuke  typy materiałów 
  -box material należy do:
    -instrukcji

		
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
gotowy

Technologie użyte w projekcie:
SpringBoot
Hibernate
Baza danych PostgresQL
Spring MVC
Spring data
    

Komendy.
Projekt:
CreateProjekt@nazwaProjektu-tworzy projekt o nazwie
ProjektShow-wyswietla wszystkie projekty
ProjectFind?id szuka projektu po id 
projekt-skrzynie Wypisuje projekty i listę skrzyń
projekty-wyświetla pełne informacje o projektach




Instrukcja
CreateIns?nazwaInstrukcji-tworzy instrukcję
InstrukcjaShow wuswietla wszystkie instrukcje
/addProjekt/{projektId}/{instrukcjaId} dodaje instrukcję do projektu 
/Projekt-instrukcja-wyswietla w txt listę instrukcji i powiązanych projektów 
/znajdz{id}-wyszukuje instrukcję po id
Preservation
CreatePreservation?nazwa tworzy preservation
PreservationShow wypisuje preservation
addPreservation/{preservationid}/{instrukcjaid} dodaje preservation do instrukcji 
BoxMaterial
CreateMaterial?nazwa tworzy materiał
BoxMaterialShow wypisuje listę materiałów
instrukcja-boxmaterial-wypisuje materiały powiązane z instrukcjami 
znajdzBoxmaterial/{id} znajduje materiał po id 
/projekt/status/{id}
 

    
  
