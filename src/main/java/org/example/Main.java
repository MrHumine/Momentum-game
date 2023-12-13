package org.example;


import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList> listBoard = new ArrayList<>();
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        for(int i = 0; i < 9; i++){listOfIntegers.add(0);};

        for(int i = 0; i < 9; i++){
            listBoard.add(listOfIntegers);
        };

        for(ArrayList word: listBoard){
            System.out.println(word);
        };
    }
}