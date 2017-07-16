package me.delev.javaskop17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * JUnit Starship test
 */
public class StarshipTest {

    @Test
    public void withdrawSomeAmount() {
        // Arrange
        Starship starship = new Starship("Enterprise", "Sck");
        // Act
        String actual = starship.getScienceOfficer();
        // Assert
        assertEquals("Spock", actual);
    }

}