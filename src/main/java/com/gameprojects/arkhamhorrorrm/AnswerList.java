package com.gameprojects.arkhamhorrorrm;

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный класс составляет список дейстивий для игрока. Работа класса ограничивается визуализацией списка возможных
действий, обработкой решений игрока занимается другой класс.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

import lombok.Getter;
import lombok.Setter;

public class AnswerList {

    @Setter
    @Getter
    private String [] decision;

    public void answerList(String [] variants){
        for(int a = 1; a < variants.length; ++a){
            System.out.println(a + ". "+ variants[a]);          // Еще не закончил.
        }
    }
}