package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class KeyAndPeeleTest extends AbstractFakerTest {
    @Test
    public void fullName() {
        assertThat(faker.keyAndPeele().fullName(), matchesRegularExpression("[A-Za-z' ,.-]+"));
    }

    @Test
    public void firstName() {
        assertThat(faker.keyAndPeele().firstName(), matchesRegularExpression("[A-Za-z' ,.-]+"));
    }

    @Test
    public void lastName() {
        assertThat(faker.keyAndPeele().lastName(), matchesRegularExpression("[A-Za-z' ,.-]+"));
    }
}
