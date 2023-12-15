package com.gameprojects.arkhamhorrorrm;

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный класс составляет список дейстивий для игрока. Работа класса ограничивается визуализацией списка возможных
действий, обработкой решений игрока занимается другой класс.
Внутри данного класса есть разные методы, предназначенные для сотавления списка решений для разных событий:
список локаций, в которые может пойти игрок, список предметов для покупки, список действий, в ситуации из
карты контакта и т.д.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

import lombok.Getter;
import lombok.Setter;

public class DecisionsListCreater {

    @Setter
    @Getter
    private String [] decisions;

    public void movementList(String [] variants, String actualLocation, int movementPoints){
        int a;
        System.out.println("У вас осталось " + movementPoints + " очков движения. В данный момент вы находитесь " +
                "в локации " + actualLocation + ". Куда вы хотите пойти?");
        for(a = 1; a < variants.length; ++a){
            System.out.println(a + ". "+ variants[a] + ".");
        }
        System.out.println(a + ". Остатьс тут.");
    }

    public void shopBuyList(String [] buyList, int money) {
        int a;
        System.out.println("У вас осталось " + money + "$. Что вы хотите купить?");
        for (a = 1; a < buyList.length; ++a) {
            System.out.println(a + ". " + buyList[a] + ".");
        }
        System.out.println(a + "Ничего не брать.");
    }

    public void contactCardDecisions(String [] contactCardActions){
        if(contactCardActions.length == 1){
            System.out.println(contactCardActions[0]);
        }
        else{
            System.out.println("Что вы будете делать?");
            for (int a = 1; a < contactCardActions.length; a++){
                System.out.println(a + ". " + contactCardActions[a] + ".");
            }
        }
    }

    public void characterChoiseDecision(){

    }
}