package com.demo.base;

import org.springframework.stereotype.Component;

@Component
public interface Movable {
    // syntax error
    // private void move1();

    // syntax error
    //protected void move2();

    // modifier 'public' is redundant for interface methods
    public void move();

    // good
    void region();
}
