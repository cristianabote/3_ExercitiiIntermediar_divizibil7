package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // scrie un program care returneaza true daca suma, diferenta, inmultirea sau impartirea a 2 nr primite este divizibila cu7


        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti cele doua numere: ");
        int nr1=scan.nextInt();
        int nr2=scan.nextInt();
        if( divizibilitate(nr1,nr2) == true)
            System.out.println("Suma, Diferenta , Inmultirea sau Impartirea dintre cele doua numere introduse este divizibila cu 7");
        else
            System.out.println("Suma, Diferenta , Inmultirea sau Impartirea dintre cele doua numere introduse NU este divizibila cu 7");

    }

    public static boolean divizibilitate(int n1, int n2){
        int sum=n1+n2;
        int diferenta=n1-n2;
        int inmultire=n1*n2;
        int impartire=n1/n2;
        if(sum%7==0||diferenta%7==0||inmultire%7==0||impartire%7==0)
            return true;
        else
            return false;
    }
}
