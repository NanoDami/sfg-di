package com.nanodami.sfgdi.controllers;

import com.nanodami.sfgdi.services.ConstructorGreetingService;
import com.nanodami.sfgdi.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
