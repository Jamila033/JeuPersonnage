package com.pantxi.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void Orientation_NORD_Zero_Tour() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(0);
        assertThat(or).isEqualTo(Orientation.NORD);
    }

    @Test
    void Orientation_EST() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(1);
        assertThat(or).isEqualTo(Orientation.EST);
    }

    @Test
    void Orientation_SUD() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(2);
        assertThat(or).isEqualTo(Orientation.SUD);
    }

    @Test
    void Orientation_OUEST() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(3);
        assertThat(or).isEqualTo(Orientation.OUEST);
    }

    @Test
    void Orientation_NORD_Tour_Complet() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(4);
        assertThat(or).isEqualTo(Orientation.NORD);
    }

    @Test
    void Orientation_EST_Plus_Un_Tour() {
        Personnage monPersonnage = new Personnage();
        Orientation or = monPersonnage.tourner(5);
        assertThat(or).isEqualTo(Orientation.EST);
    }
}