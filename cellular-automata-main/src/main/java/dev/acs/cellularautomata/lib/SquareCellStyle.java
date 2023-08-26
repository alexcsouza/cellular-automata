package dev.acs.cellularautomata.lib;

import dev.acs.cellularautomata.CellularAutomata;
import processing.core.PApplet;

public class SquareCellStyle implements ICellStyle{

  private PApplet pa;

  public SquareCellStyle(PApplet pa){
    this.pa = pa;
  }
  public void drawCell(Cell cell, int size){
    this.pa.noStroke();
    if(cell.getState() == 1){
      this.pa.fill(0);
    }else{
      this.pa.fill(255);
    }
    
    this.pa.rect(
      cell.getXpos() * size,
      cell.getYpos() * size,
      size,
      size
    );
  }
  
}
