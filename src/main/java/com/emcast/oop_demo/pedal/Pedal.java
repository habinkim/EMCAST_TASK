package com.emcast.oop_demo.pedal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public enum Pedal implements PedalAction {

    EXCEL("엑셀"), BRAKE("브레이크"), CLUTCH("클러치");

    private final String name;

    @Override
    public void step(Boolean on) {
        if (on) log.info("{}를(을) 밟았습니다.", name);
        else log.info("{}를(을) 뗐습니다.", name);
    }
}
