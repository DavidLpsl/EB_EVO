package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Se realiza un cambio en el codigo fuente!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
