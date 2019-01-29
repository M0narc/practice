package com.company;

public class Main {

    public static void main(String[] args) {

        int tablescore = calculateHighScoreposition(1500);
        displayhighscoreposition("Bogarito",tablescore);

        tablescore = calculateHighScoreposition(900);
        displayhighscoreposition("Alequis",tablescore);

        tablescore = calculateHighScoreposition(400);
        displayhighscoreposition("Yisus",tablescore);

        tablescore = calculateHighScoreposition(50);
        displayhighscoreposition("Hose",tablescore);
    }

    public static void displayhighscoreposition (String playername, int position) {

        System.out.println(playername +" managed to get into position " + position + " on the highs core table");


    }
    public  static int calculateHighScoreposition(int playerscore) {


        if (playerscore >=1000) {return 1;}
        else if (playerscore >= 500 && playerscore < 1000 ){
            return 2;
        } else if (playerscore >= 100 && playerscore < 500){
            return 3;
        } else return 4;

        }
    }

