package io.github.asr.kata;

import lombok.Getter;

public class Planet {

    @Getter
    private final int radius;

    public Planet(int radius) {
        if (radius <= 0)
            throw new IllegalArgumentException("radius cannot be 0 or negative");

        this.radius = radius;
    }

}
