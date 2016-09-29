package com.knoldus.service.impl;

import com.knoldus.service.GreetingsService;

/**
 * Created by harmeet on 28/9/16.
 */
public class ConsoleGreetings implements GreetingsService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello to "+name);
    }
}
