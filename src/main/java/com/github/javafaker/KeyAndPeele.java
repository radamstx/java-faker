package com.github.javafaker;

public class KeyAndPeele {
    private final Faker faker;

    public KeyAndPeele(final Faker faker)
    {
        this.faker = faker;
    }

    public String firstName()
    {
        return faker.fakeValuesService().resolve("key_and_peele.first_names", this, faker);
    }

    public String lastName()
    {
        return faker.fakeValuesService().resolve("key_and_peele.last_names", this, faker);
    }

    public String fullName()
    {
        return faker.fakeValuesService().resolve("key_and_peele.full_names", this, faker);
    }
}
