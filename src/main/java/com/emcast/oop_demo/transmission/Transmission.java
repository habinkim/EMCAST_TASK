package com.emcast.oop_demo.transmission;

import com.emcast.oop_demo.pedal.Pedal;
import com.emcast.oop_demo.pedal.PedalState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Transmission {

    private PedalState excel = new PedalState(Pedal.EXCEL);

    private PedalState brake = new PedalState(Pedal.BRAKE);

    private Boolean turn = false;

    public void setExcel(Boolean bool) {
        excel.setStep(bool);
    }

    public void setBrake(Boolean bool) {
        brake.setStep(bool);
    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
        if (turn) log.info("시동을 걸었습니다.");
        else log.info("시동을 껐습니다.");
    }
}
