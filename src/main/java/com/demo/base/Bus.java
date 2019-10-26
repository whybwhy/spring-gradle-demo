package com.demo.base;

import org.springframework.stereotype.Component;

@Component
public abstract class Bus implements Movable {
    abstract public void move();
}
