package dev.acs.cellularautomata;

import processing.core.PApplet;

public class Main {
    public static void main(String[] args) {
        String[] processingArgs = {"CellularAutomata"};
        CellularAutomata ca = new CellularAutomata();
        PApplet.runSketch(processingArgs, ca);
    }
}