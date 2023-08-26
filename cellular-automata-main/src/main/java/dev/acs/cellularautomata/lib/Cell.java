package dev.acs.cellularautomata.lib;
public class Cell{
  
  private int xpos;
  private int ypos;
  private int state;
  
  public Cell(int xpos, int ypos, int state){
    this.xpos = xpos;
    this.ypos = ypos;
    this.state = state;
  }
  
  public int getXpos(){
    return xpos;
  }

  public int getYpos(){
    return ypos;
  }

  public void setState(int state){
    this.state = state;
  }

  public int getState(){
    return state;
  }
  
}
