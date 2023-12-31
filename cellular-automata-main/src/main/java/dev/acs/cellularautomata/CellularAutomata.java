package dev.acs.cellularautomata;

import dev.acs.cellularautomata.lib.Cell;
import dev.acs.cellularautomata.lib.Grid;
import dev.acs.cellularautomata.lib.ICellStyle;
import dev.acs.cellularautomata.lib.SquareCellStyle;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CellularAutomata extends PApplet {
    public static final Integer CELL_SIZE = 5;

    public static final Integer CANVAS_WIDTH = 800;

    public static final Integer CANVAS_HEIGHT = 800;

    private List<Integer> ref = new ArrayList<>(
            Arrays.asList(
                    new Integer[]{
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            1,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0,
//                            0, 0, 0, 0, 0, 0, 0, 0
                    }) );

    private Integer[] rule;
    private Grid grid;
    private ICellStyle cellStyle;
    private Integer currentLine = 1;

    private Integer currentRule = 1;

    public void settings(){
        size(CANVAS_WIDTH, CANVAS_HEIGHT);
        fullScreen(1);
    }

    public void setup(){
        grid = new Grid(this,ref.size(), ref.size());
        cellStyle = new SquareCellStyle(this);
        translate(100, 20);
        rule = toRuleArray(currentRule);
        for(int i = 0; i < ref.size(); i++){
            createCell(i, 0, ref.get(i));
        }

        for(int i = 0; i < ref.size(); i++){
            for(int j = 1; j < ref.size(); j++){
                createCell(i, j, 0);
            }
        }
    }

    public void draw(){
        if(currentLine == ref.size()) {
            currentLine = 1;
            save(String.format("celular-automata-%s.jpeg", currentRule));
            reset(++currentRule);

            if(currentRule >= 1000){
                noLoop();
                return;
            }

        }

        translate(100, 20);
        for(int i = 0; i < ref.size(); i++){

            Boolean[] states = new Boolean[3];
            int nextState = 0;

            if( i == 0 ){
                states[0] = (grid.getCell(ref.size()-1, currentLine-1).getState() == 1);
            } else {
                states[0] = (grid.getCell(i-1, currentLine-1).getState() == 1);
            }
            states[1] = (grid.getCell(i, currentLine-1).getState() == 1);
            if( i == ref.size() - 1 ){
                states[2] = (grid.getCell(0, currentLine-1).getState() == 1);
            }else{
                states[2] = (grid.getCell(i+1, currentLine-1).getState() == 1);
            }

            if(
                    states[0] == true
                            && states[1] == true
                            && states[2] == true
            ){
                nextState = rule[0];
            }else if(
                    states[0] == true
                            && states[1] == true
                            && states[2] == false
            ){
                nextState = rule[1];
            }else if(
                    states[0] == true
                            && states[1] == false
                            && states[2] == true
            ){
                nextState = rule[2];
            }else if(
                    states[0] == true
                            && states[1] == false
                            && states[2] == false
            ){
                nextState = rule[3];
            }else if(
                    states[0] == false
                            && states[1] == true
                            && states[2] == true
            ){
                nextState = rule[4];
            }else if(
                    states[0] == false
                            && states[1] == true
                            && states[2] == false
            ){
                nextState = rule[5];
            }else if(
                    states[0] == false
                            && states[1] == false
                            && states[2] == true
            ){
                nextState = rule[6];
            }else if(
                    states[0] == false
                            && states[1] == false
                            && states[2] == false
            ){
                nextState = rule[7];
            }

            System.out.println(String.valueOf(nextState));
            changeCellState(grid.getCell(i, currentLine), nextState);
        }
        currentLine++;
    }

    void createCell(Integer xpos, Integer ypos, Integer state){
        Cell cell = new Cell(xpos, ypos, state);
        grid.addCell(cell);
        cellStyle.drawCell(cell, CELL_SIZE);
    }

    void changeCellState(Cell cell, int state){
        cell.setState(state);
        cellStyle.drawCell(cell, CELL_SIZE);
    }

    void reset(Integer nextRule){
        rule = toRuleArray(nextRule);
    }

    Integer[] toRuleArray(Integer rule){
        Integer[] bits = new Integer[8];
        for (int i = 7; i >= 0; i--) {
            bits[i] = (rule & (1 << i)) != 0 ? 1 : 0;
        }
        return bits;
    }
}
