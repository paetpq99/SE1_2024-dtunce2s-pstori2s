package org.hbrs.se1.ws24.exercises.uebung1.uebung2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {

    @Test
    public void testAddMember() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        assertEquals(1, container.size());

        container.addMember(member2);
        assertEquals(2, container.size());

        // Test auf Duplikation
        Exception exception = assertThrows(ContainerException.class, () -> {
            container.addMember(member1);
        });
        assertEquals("Das Member-Objekt mit der ID 1 ist bereits vorhanden!", exception.getMessage());
    }

    @Test
    public void testDeleteMember() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        container.addMember(member2);

        // Löschen eines vorhandenen Members
        String result = container.deleteMember(1);
        assertEquals("Member mit der ID 1 wurde entfernt.", result);
        assertEquals(1, container.size());

        // Löschen eines nicht vorhandenen Members
        result = container.deleteMember(3);
        assertEquals("Member mit der ID 3 nicht gefunden.", result);
    }

    @Test
    public void testDump() throws ContainerException {
        Container container = new Container();
        Member member1 = new ConcreteMember(1);
        Member member2 = new ConcreteMember(2);

        container.addMember(member1);
        container.addMember(member2);

        // Überprüfung der Ausgabe auf der Konsole
        container.dump();  // Ausgabe: "Member (ID = 1)" und "Member (ID = 2)"
    }

    @Test
    public void testSize() throws ContainerException {
        Container container = new Container();
        assertEquals(0, container.size());

        Member member1 = new ConcreteMember(1);
        container.addMember(member1);
        assertEquals(1, container.size());
    }
}
