package com.gameprojects.arkhamhorrorrm;

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный класс отвечает за перемещение персонажа по карта. На входе он получает нынешнее распаоложение персонажа на карте
и колличество его очков движения.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

import lombok.Getter;
import lombok.Setter;

public class CharMovement {     //Не закончил

    @Setter
    @Getter
    private String newLocation;

    @Getter
    private String [] posibleMovment;

    public String [] posibleMovement(String actualLocation){
        switch(actualLocation){

            case "Вокзал":
                posibleMovment = new String[1];
                posibleMovment[0] = "Нортсайд";
                break;

            case "Офис газеты":
                posibleMovment = new String[1];
                posibleMovment[0] = "Нортсайд";
                break;

            case "Лавка древностей":
                posibleMovment = new String[1];
                posibleMovment[0] = "Нортсайд";
                break;

            case "Нортсайд":
                posibleMovment = new String[5];
                posibleMovment[0] = "Вокзал";
                posibleMovment[1] = "Офис газеты";
                posibleMovment[2] = "Лавка древностей";
                posibleMovment[3] = "Даунтаун";
                posibleMovment[4] = "Торговый район";
                break;

            case "Банк Аркхема":
                posibleMovment = new String[1];
                posibleMovment[0] = "Даунтаун";
                break;

            case "Аркхемская лечебница":
                posibleMovment = new String[1];
                posibleMovment[0] = "Даунтаун";
                break;

            case "Площадь независимости":
                posibleMovment = new String[1];
                posibleMovment[0] = "Даунтаун";
                break;

            case "Даунтаун":
                posibleMovment = new String[6];
                posibleMovment[0] = "Банк Аркхема";
                posibleMovment[1] = "Аркхемская лечебница";
                posibleMovment[2] = "Площадь независимости";
                posibleMovment[3] = "Нортсайд";
                posibleMovment[4] = "Торговый район";
                posibleMovment[5] = "Исттаун";
                break;

            case "Закусочная Гиббса":
                posibleMovment = new String[1];
                posibleMovment[0] = "Исттаун";
                break;

            case "Ресторанчик у Велмы":
                posibleMovment = new String[1];
                posibleMovment[0] = "Исттаун";
                break;

            case "Полицейский участок":
                posibleMovment = new String[1];
                posibleMovment[0] = "Исттаун";
                break;

            case "Исттаун":
                posibleMovment = new String[5];
                posibleMovment[0] = "Закусочная Гиббса";
                posibleMovment[1] = "Ресторанчик у Велмы";
                posibleMovment[2] = "Полицейский участок";
                posibleMovment[3] = "Даунтаун";
                posibleMovment[4] = "Ривертаун";
                break;

            case "Кладбище":
                posibleMovment = new String[1];
                posibleMovment[0] = "Ривертаун";
                break;

            case "Чёрная пещера":
                posibleMovment = new String[1];
                posibleMovment[0] = "Ривертаун";
                break;

            case "Магазин":
                posibleMovment = new String[1];
                posibleMovment[0] = "Ривертаун";
                break;

            case "Ривертаун":
                posibleMovment = new String[6];
                posibleMovment[0] = "Кладбище";
                posibleMovment[1] = "Чёрная пещера";
                posibleMovment[2] = "Магазин";
                posibleMovment[3] = "Исттаун";
                posibleMovment[4] = "Торговый район";
                posibleMovment[5] = "Фрэнч-Хилл";
                break;

            case "Безлюдый остров":
                posibleMovment = new String[1];
                posibleMovment[0] = "Торговый район";
                break;

            case "Речной порт":
                posibleMovment = new String[1];
                posibleMovment[0] = "Торговый район";
                break;

            case "Неименуемый":
                posibleMovment = new String[1];
                posibleMovment[0] = "Торговый район";
                break;

            case "Торговый район":
                posibleMovment = new String[7];
                posibleMovment[0] = "Безлюдый остров";
                posibleMovment[1] = "Речной порт";
                posibleMovment[2] = "Неименуемый";
                posibleMovment[3] = "Нортсайд";
                posibleMovment[4] = "Даунтаун";
                posibleMovment[5] = "Ривертаун";
                posibleMovment[6] = "Мискатоникский университет";
                break;

            case "Лабораторный комплекс":
                posibleMovment = new String[1];
                posibleMovment[0] = "Мискатоникский университет";
                break;

            case "Администрация":
                posibleMovment = new String[1];
                posibleMovment[0] = "Мискатоникский университет";
                break;

            case "Библиотека":
                posibleMovment = new String[1];
                posibleMovment[0] = "Мискатоникский университет";
                break;

            case "Мискатоникский университет":
                posibleMovment = new String[6];
                posibleMovment[0] = "Лабораторный комплекс";
                posibleMovment[1] = "Администрация";
                posibleMovment[2] = "Библиотека";
                posibleMovment[3] = "Торговый район";
                posibleMovment[4] = "Фрэнч-Хилл";
                posibleMovment[5] = "Аптаун";
                break;

            case "Ведьмин дом":
                posibleMovment = new String[1];
                posibleMovment[0] = "Фрэнч-Хилл";
                break;

            case "Ложа Серебряных Сумерек":
                posibleMovment = new String[1];
                posibleMovment[0] = "Фрэнч-Хилл";
                break;

            case "Фрэнч-Хилл":
                posibleMovment = new String[5];
                posibleMovment[0] = "Ведьмин дом";
                posibleMovment[1] = "Ложа Серебряных Сумерек";
                posibleMovment[2] = "Ривертаун";
                posibleMovment[3] = "Мискатоникский университет";
                posibleMovment[4] = "Саутсайд";
                break;

            case "Пансион Ма":
                posibleMovment = new String[1];
                posibleMovment[0] = "Саутсайд";
                break;

            case "Южная церковь":
                posibleMovment = new String[1];
                posibleMovment[0] = "Саутсайд";
                break;

            case "Историческое общество":
                posibleMovment = new String[1];
                posibleMovment[0] = "Саутсайд";
                break;

            case "Саутсайд":
                posibleMovment = new String[5];
                posibleMovment[0] = "Пансион Ма";
                posibleMovment[1] = "Южная церковь";
                posibleMovment[2] = "Историческое общество";
                posibleMovment[3] = "Фрэнч-Хилл";
                posibleMovment[4] = "Аптаун";
                break;

            case "Больница Святой Марии":
                posibleMovment = new String[1];
                posibleMovment[0] = "Аптаун";
                break;

            case "Стариная магическая лавка":
                posibleMovment = new String[1];
                posibleMovment[0] = "Аптаун";
                break;

            case "Леса":
                posibleMovment = new String[1];
                posibleMovment[0] = "Аптаун";
                break;

            case "Аптаун":
                posibleMovment = new String[5];
                posibleMovment[0] = "Больница Святой Марии";
                posibleMovment[1] = "Стариная магическая лавка";
                posibleMovment[2] = "Леса";
                posibleMovment[3] = "Мискатоникский университет";
                posibleMovment[4] = "Саутсайд";
                break;
        }
        return getPosibleMovment();
    }

    public String charMovement (String actualLocation, String newLocation, int walkPoints){
        if (walkPoints == 0){
            setNewLocation(actualLocation);
        }

        else{
            setNewLocation(newLocation);
        }

        return getNewLocation();
    }
}
