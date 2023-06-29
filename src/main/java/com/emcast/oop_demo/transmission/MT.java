package com.emcast.oop_demo.transmission;

import com.emcast.oop_demo.gear.Gear;
import com.emcast.oop_demo.pedal.Pedal;
import com.emcast.oop_demo.pedal.PedalState;
import com.emcast.oop_demo.strategy.MovingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MT extends Transmission implements MovingStrategy {

    private PedalState clutch = new PedalState(Pedal.CLUTCH);

    private Gear gear = Gear.ONE;

    @Override
    public void turnOn() {
        log.info("-------시동--------");

        setClutch(true);
        setBrake(true);
        setTurn(true);

        setClutch(false);
        setBrake(false);
    }

    public void shift(Gear gear) {
        log.info("-------변속--------");
        setExcel(false);
        setClutch(true);

        setGear(gear);

        setClutch(false);
        setExcel(true);
    }

    @Override
    public void backWard() {
        log.info("-------후진 주행--------");
        setExcel(false);
        setClutch(true);

        setGear(Gear.R);

        setClutch(false);
        setExcel(true);
    }

    public void setClutch(Boolean bool) {
        clutch.setStep(bool);
    }

    public void setGear(Gear gear) {
        this.gear = gear;
        this.gear.shift();
    }
}

