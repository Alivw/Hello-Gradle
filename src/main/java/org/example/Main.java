package org.example;


import org.example.component.EnablePrint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnablePrint("Hello world")
public class Main {
        public static void main(String[] args) {
            SpringApplication.run(Main.class, args);
        }
}