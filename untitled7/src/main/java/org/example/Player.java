package org.example;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private Set<Integer> markedCells;
    private Sides side;
    public Player(Sides side) {
        this.side = side;
        markedCells = new HashSet<>();

    }

    public Set<Integer> getMarkedCells() { return markedCells;}

        public Sides getSide() {
            return side;

        }
        public boolean getCombination(){

    }
}
