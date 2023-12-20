package com.gameprojects.arkhamhorrorrm;

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный класс принимает варианты ответов от игрока: открывает ввод данных в консоль и проверяет их на соответствие
(цифра ли это, есть ли такой вариант ответа в списке);
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

import java.util.Scanner;

public class GameControl {
    private String answer;
    public void gameController(int decisionNum){
        Scanner scan = new Scanner(System.in);
        answer = scan.nextLine();

        //дописать
    }
}
