package dev.acs.cellularautomata.lib;
import dev.acs.cellularautomata.lib.Cell;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Grid{
  private PApplet pa;
  private int xdim;
  private int ydim;
  
  private List<List<Cell>> cells;
  
  public Grid(PApplet pa, int xdim, int ydim){
    this.xdim = xdim;
    this.ydim = ydim;
    this.cells = new ArrayList<>(this.xdim);
    this.pa = pa;
    for(int i = 0; i < this.xdim; i++){
      this.cells.add(new ArrayList<Cell>(this.ydim));
    }
  }

  public int getXdim(){
    return this.xdim;
  }

  public int getYdim(){
    return this.ydim;
  }

  public void addCell(Cell cell){
    this.cells.get(cell.getXpos()).add(cell.getYpos(), cell); 
  }
  
  public Cell getCell(int xpos, int ypos){
    return this.cells.get(xpos).get(ypos); 
  }
}
