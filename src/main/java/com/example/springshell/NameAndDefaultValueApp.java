package com.example.springshell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class NameAndDefaultValueApp {
    @ShellMethod(key = "default", value = "With default value")
    public void withDefault(@ShellOption(defaultValue = "Hello") final String value){
        System.out.printf("Value: %s%n", value);
    }
}
