/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fa20-bse-158
 */


public class DoubleBorderRectangle implements DoubleBorderShape {

  @Override
  public void draw() {
    System.out.println("Inside DoubleBorderRectangle::draw() method.");
  }

  @Override
  public void drawDoubleBorder() {
    System.out.println("Drawing double border around rectangle...");
  }
}