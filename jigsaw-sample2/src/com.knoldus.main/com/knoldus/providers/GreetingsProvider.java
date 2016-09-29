package com.knoldus.providers;

import com.knoldus.service.GreetingsService;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/**
 * Created by harmeet on 28/9/16.
 */
public class GreetingsProvider {

    private static GreetingsProvider provider;
    private ServiceLoader<GreetingsService> loader;

    private GreetingsProvider() {
        loader = ServiceLoader.load(GreetingsService.class);
    }

    public static GreetingsProvider getInstance() {
        if(provider == null) {
            provider = new GreetingsProvider();
        }
        return provider;
    }

    public GreetingsService serviceImpl() {
        GreetingsService service = loader.iterator()
                                        .next();
        if(service != null){
            return service;
        }else {
            throw new NoSuchElementException("No implementation for GreetingsProvider");
        }
    }
}
