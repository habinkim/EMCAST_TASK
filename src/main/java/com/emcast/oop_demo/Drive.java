package com.emcast.oop_demo;


import com.emcast.oop_demo.gear.Gear;
import com.emcast.oop_demo.transmission.AT;
import com.emcast.oop_demo.transmission.MT;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Drive {

    public static void main(String[] args) {
        AT autoCar = new AT();
        MT manualCar = new MT();

        log.info("자동변속기 차량");
        autoCar.turnOn();
        log.info("");

        autoCar.shift(true);
        log.info("");

        autoCar.backWard();
        log.info("");

        log.info("---------------------------------------");
        log.info("");

        log.info("수동변속기 차량");
        manualCar.turnOn();
        log.info("");

        manualCar.shift(Gear.TWO);
        log.info("");

        manualCar.backWard();
        log.info("");
    }

}
