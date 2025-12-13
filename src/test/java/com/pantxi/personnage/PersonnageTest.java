package com.pantxi.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void Orientation_SUD() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(2);
        assertThat(or).isEqualTo(Orientation.SUD);
    }
}