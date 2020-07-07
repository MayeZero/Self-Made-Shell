package com.example.springshell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.context.annotation.Bean;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class GreetingApp {
    @Bean
    public PromptProvider promptProvider(){
        return () -> new AttributedString("myshell=>",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE));
    }

    @ShellMethod("Say hi")
    public String sayHi(String name) {
        return String.format("Hi %s", name);
    }

    @ShellMethod("Echo1")
    public String echo1(int a, int b, int c){
        return String.format("a = %d, b = %d, c = %d", a, b, c);
    }

    @ShellMethod("Echo2")
    public String echo2(int a, @ShellOption("--boy") int b, int c){
        return String.format("a = %d, b = %d, c = %d", a, b ,c);
    }

    @ShellMethod("Echo3")
    public String echo3(@ShellOption(arity = 3) int[] numbers){
        return String.format("a = %d, b = %d, c = %d", numbers[0], numbers[1], numbers[2]);
    }
}
