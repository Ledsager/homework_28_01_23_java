package org.example.utils;

public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Ошибка телефон начинается с плюсика");
        }
        else if(telephone.length() != 6) {
            throw new PhoneException("Длина телефона должна быть 5");
        }
    }
}
