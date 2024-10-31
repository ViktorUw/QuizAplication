package com.example.quiz;

import java.sql.Array;
import java.util.ArrayList;



public class DataProvider {
    public static ArrayList<questions> questionsList = new ArrayList<questions>();

    public static void fillList(){
        questionsList.add(new questions("Jakie jest największe państwo na świecie pod względem powierzchni?", "Chiny", "Kanada", "Rosja","Stany Zjednoczone","Rosja"));

        questionsList.add(new questions("Kto jest autorem powieści \"Krzyżacy\"?", "Adam Mickiewicz", "Henryk Sienkiewicz", "Bolesław Prus","Eliza Orzeszkowa","Henryk Sienkiewicz"));

        questionsList.add(new questions("Który pierwiastek chemiczny ma symbol \"O\"?", "Wodór", "Tlen", "Sód","Wapń","Tlen"));

        questionsList.add(new questions("Jak nazywa się najdłuższa rzeka na świecie?", "Amazonka", "Nil", "Jangcy","Missisipi","Nil"));

        questionsList.add(new questions("Ile wynosi liczba dni w roku przestępnym?", "365", "366", "364","367","366"));

        questionsList.add(new questions("W jakim mieście znajduje się Wieża Eiffla?", "Londyn", "Nowy Jork", "Paryż","Berlin","Paryż"));

        questionsList.add(new questions("Kto był pierwszym człowiekiem, który stanął na Księżycu?", "Buzz Aldrin", "Jurij Gagarin", "Neil Armstrong","Michael Collins","Neil Armstrong"));

        questionsList.add(new questions("Który kontynent jest najmniejszy pod względem powierzchni?", "Europa", "Australia", "Ameryka Południowa","Afryka","Australia"));

        questionsList.add(new questions("Co jest walutą Japonii?", "Won", "Dolar", "Peso","Jen","Jen"));

        questionsList.add(new questions("Ile planet znajduje się w Układzie Słonecznym?", "8", "7", "10","9","8"));

    }

}
