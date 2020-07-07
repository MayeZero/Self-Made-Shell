package com.example.springshell;

import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
@ShellCommandGroup("Special")
public class CommandsGroupApp {
    @ShellMethod("Command1")
    public void command1(){}

    @ShellMethod(value = "Command2", group = "Basic Group")
    public void command2(){}
}
