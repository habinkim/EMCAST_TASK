package com.emcast.oop_demo.gear;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum AutoGear implements GearState {

    D {
        @Override
        public void shift() {
            log.info("기어를 주행으로 변속했습니다.");
        }
    },
    R {
        @Override
        public void shift() {
            log.info("기어를 후진으로 변속했습니다.");
        }
    }

}
