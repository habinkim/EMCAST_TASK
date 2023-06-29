package com.emcast.oop_demo.pedal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class PedalState {

    private final Pedal pedal;
    private Boolean step = false;

    public PedalState(Pedal pedal) {
        this.pedal = pedal;
    }

    public void setStep(Boolean step) {
        this.step = step;
        pedal.step(step);
    }
}
