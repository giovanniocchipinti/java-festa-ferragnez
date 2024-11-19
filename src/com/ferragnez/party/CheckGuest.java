package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        //* Guests list invited to party
        String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
        //* Creo uno scanner */
        Scanner input = new Scanner(System.in);
        //*Chiedo all'utente di inserire il suo nome in lista */
        System.out.println("Inserisci il tuo nome:");
        String guestName = input.nextLine();
        input.close();
        //*Creo un ciclo for per verificare se il nome inserito si trova nella guests list */
        //* inizializzo un ciclo for che iteri per ogni elemento dell'array */
        //* ad ogni iterazione, verifica se la parola inserita è uguale all'elemento */
        //* se guestName guests[i] se corretta  */
        
        boolean isFound = false;

        int counter = -1;



        for(String currentElement : guests){
            counter++;
            if (currentElement.equalsIgnoreCase(guestName)) {
                isFound = true;
                
                break;
            }
        }

        if (isFound) {
            System.out.println("puoi entrare " + counter);
        }else{
            System.out.println("non puoi entrare");
        }



    }
    

}
