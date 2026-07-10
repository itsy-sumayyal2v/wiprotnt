package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h = new Hero();

        System.out.println("Hero Details");
        System.out.println("Model: " + h.getModelName());
        System.out.println("Registration No: " + h.getRegistrationNumber());
        System.out.println("Owner: " + h.getOwnerName());
        System.out.println("Speed: " + h.getSpeed());
        h.radio();

        System.out.println();

        Honda hd = new Honda();

        System.out.println("Honda Details");
        System.out.println("Model: " + hd.getModelName());
        System.out.println("Registration No: " + hd.getRegistrationNumber());
        System.out.println("Owner: " + hd.getOwnerName());
        System.out.println("Speed: " + hd.getSpeed());
        hd.cdplayer();
    }
}
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

// Inside main()

Logan l = new Logan();

System.out.println("\nLogan Details");
System.out.println("Model: " + l.getModelName());
System.out.println("Registration No: " + l.getRegistrationNumber());
System.out.println("Owner: " + l.getOwnerName());
System.out.println("Speed: " + l.speed());
l.gps();

Ford f = new Ford();

System.out.println("\nFord Details");
System.out.println("Model: " + f.getModelName());
System.out.println("Registration No: " + f.getRegistrationNumber());
System.out.println("Owner: " + f.getOwnerName());
System.out.println("Speed: " + f.speed());
f.tempControl();