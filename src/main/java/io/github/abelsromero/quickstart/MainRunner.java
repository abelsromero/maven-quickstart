package io.github.abelsromero.quickstart;


import java.time.LocalDate;

public class MainRunner {

    public static void main(String[] args) {
        final User user = User.builder()
            .name("Some name")
            .birthDate(LocalDate.now())
            .build();
        System.out.println(user);
    }

}
