package ru.sberbank.jd;

import dto.Gateway;

public class Lesson2HW2 {
    public static void main(String[] args) throws Exception {
        try (Gateway gateway = new Gateway()){
            gateway.broken();

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
