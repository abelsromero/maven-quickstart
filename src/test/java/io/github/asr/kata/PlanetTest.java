package io.github.asr.kata;


import org.junit.Assert;
import org.junit.Test;


public class PlanetTest {

    @Test
    public void should_create_simple_planet() {
        // when
        final Planet planet = new Planet(20);
        // then
        Assert.assertNotNull(planet);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_when_radius_is_0() {
        // when
        final Planet planet = new Planet(0);
        // then: expect exception
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_fail_when_radius_is_negative() {
        // when
        final Planet planet = new Planet(-1);
        // then: expect exception
    }

}
