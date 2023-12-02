/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gameprojects.arkhamhorrorrm;

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный клас хранит данные о персонаже игрока (характеристики, показатели 
здоровья и рассудка, верний и нижний пределы показателей и характеристик)
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++S
*/

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author vlad__236
 */
public class GameCharacter {

    @Setter
    @Getter
    private String name;

    @Getter
    @Setter
    private int health;

    @Getter
    @Setter
    private int actualHeath;

    @Getter
    @Setter
    private int mind;

    @Getter
    @Setter
    private int actualMind;

    @Getter
    @Setter
    private int speed;

    @Getter
    @Setter
    private int actualSpeed;

    @Getter
    @Setter
    private int lowSpeed;

    @Getter
    @Setter
    private int secrecy;

    @Getter
    @Setter
    private int actualSecrecy;

    @Getter
    @Setter
    private int lowSecrecy;

    @Getter
    @Setter
    private int strong;

    @Getter
    @Setter
    private int actualStrong;

    @Getter
    @Setter
    private int lowStrong;

    @Getter
    @Setter
    private int will;

    @Getter
    @Setter
    private int actualWill;

    @Getter
    @Setter
    private int lowWill;

    @Getter
    @Setter
    private int knowledge;

    @Getter
    @Setter
    private int actualKnowledge;

    @Getter
    @Setter
    private int lowKnowledge;

    @Getter
    @Setter
    private int luck;

    @Getter
    @Setter
    private int actualLuck;

    @Getter
    @Setter
    private int lowLuck;

    @Getter
    @Setter
    private int composure;

    @Getter
    @Setter
    private int actualComposure;

    public void charCreate(String name, int health, int mind, int speed, int secrecy,
            int strong, int will, int knowledge, int luck, int composure, int lowSpeed,
                           int lowSecrecy, int lowStrong, int lowWill, int lowKnowledge,
                           int lowLuck){
        this.name = name;

        this.health = health;
        this.mind = mind;
        
        this.speed = speed;
        this.lowSpeed = lowSpeed;

        this.secrecy = secrecy;
        this.lowSecrecy = lowSecrecy;

        this.strong = strong;
        this.lowStrong = lowStrong;

        this.will = will;
        this.lowWill = lowWill;

        this.knowledge = knowledge;
        this.lowKnowledge = lowKnowledge;

        this.luck = luck;
        this.lowLuck = lowLuck;

        this.composure = composure;
    }
}