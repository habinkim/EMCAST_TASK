package com.emcast.oop_demo.gear;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum Gear implements GearState {

    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), R(0);

    private Integer number;

    @Override
    public void shift() {
        if (Gear.R.equals(this)) log.info("기어를 후진으로 변속했습니다.");
        else log.info("기어를 {}단으로 변속했습니다.", number);
    }
}
