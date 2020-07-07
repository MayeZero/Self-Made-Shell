package com.example.springshell;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@ShellComponent
public class RunTwiceToEnableApp {
    private boolean run = false;

    @ShellMethod("Run once")
    public void runOnce(){
        this.run = true;
    }

    @ShellMethod("Run again")
    public void runAgain(){
        System.out.println("Run!");
    }

    public Availability runAgainAvailability(){
        return run?Availability.available():Availability.unavailable("You should run runOnce first");
    }
}
