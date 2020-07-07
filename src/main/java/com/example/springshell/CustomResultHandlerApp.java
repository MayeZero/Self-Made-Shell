package com.example.springshell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CustomResultHandlerApp {
    @ShellMethod("Result handler")
    public PrefixedResult resultHandler(){
        return new PrefixedResult("PRE", "Hello!");
    }
}
