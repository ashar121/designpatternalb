/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author fa20-bse-021
 */
public class DoubleBorderTriangle implements DoubleBorderShape {

  @Override
  public void draw() {
    System.out.println("Inside DoubleBorderTriangle::draw() method.");
  }

  @Override
  public void drawDoubleBorder() {
    System.out.println("Drawing double border around triangle...");
  }
}
