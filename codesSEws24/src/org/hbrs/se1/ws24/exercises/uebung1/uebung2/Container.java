package org.hbrs.se1.ws24.exercises.uebung1.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {
    // List zum Speichern der Member-Objekte
    private List<Member> members = new ArrayList<>();

    // Hinzufügen eines Member-Objekts
    public void addMember(Member member) throws ContainerException {
        // Überprüfen, ob ein Member mit der gleichen ID bereits existiert
        for (Member m : members) {
            if (m.getID().equals(member.getID())) {
                throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
            }
        }
        // Member-Objekt hinzufügen
        members.add(member);
    }

    // Löschen eines Member-Objekts anhand der ID
    public String deleteMember(Integer id) {
        for (Member m : members) {
            if (m.getID().equals(id)) {
                members.remove(m);
                return "Member mit der ID " + id + " wurde entfernt.";
            }
        }
        return "Member mit der ID " + id + " nicht gefunden.";
    }

    // Ausgabe der IDs der gespeicherten Member-Objekte
    public void dump() {
        for (Member m : members) {
            System.out.println(m.toString());
        }
    }

    // Rückgabe der Anzahl der gespeicherten Member-Objekte
    public int size() {
        return members.size();
    }
}
