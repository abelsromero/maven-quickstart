package io.github.abelsromero.quickstart;


import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTest {

    @Test
    public void should_create_simple_user() {
        final String userName = "a name";
        final int birthYear = 1983;
        // when
        final User user = new User(userName, LocalDate.of(birthYear, 11, 22));
        // then
        assertThat(user.getName())
            .isEqualTo(userName);
        assertThat(user.getBirthDate().getYear())
            .isEqualTo(birthYear);
        assertThat(user.getAge())
            .isEqualTo(35);
    }

}
