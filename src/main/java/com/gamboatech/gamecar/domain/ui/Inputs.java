package com.gamboatech.gamecar.domain.ui;

import java.util.Objects;
import java.util.Scanner;

public class Inputs {
    public static int inputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("::Ingrese un numero:");
        String input = Objects.requireNonNull(sc.nextLine(),"number is required");
        return Integer.parseInt(input);
    }

    public static String inputText(){
        Scanner sc = new Scanner(System.in);
        return Objects.requireNonNull(sc.nextLine(),"input is required");
    }
}
