package com.emcast.oop_demo.transmission;

import com.emcast.oop_demo.gear.AutoGear;
import com.emcast.oop_demo.strategy.MovingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AT extends Transmission implements MovingStrategy {

    private AutoGear gear = AutoGear.D;

    @Override
    public void turnOn() {
        log.info("-------시동--------");

        setBrake(true);
        setTurn(true);

        setBrake(false);
    }

    public void shift(Boolean excelStepOn) {
        log.info("-------변속--------");

        if (excelStepOn) log.info("가속합니다. 기어가 올라갑니다.");
        else log.info("감속합니다. 기어가 내려갑니다.");
    }

    @Override
    public void backWard() {
        log.info("-------후진 주행--------");

        setExcel(false);
        setBrake(true);

        setGear(AutoGear.R);
        setBrake(false);
        setExcel(true);

    }
}
