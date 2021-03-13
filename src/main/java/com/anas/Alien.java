package com.anas;

public class Alien {

  private int age;
  private Computer computer;


  public Alien() {
    System.out.println("Alien Object created");
  }
  // public Alien(int age) {
  //   this.age = age;
  // }



  public Computer getComputer() {
    return computer;
  }



  public void setComputer(Computer computer) {
    this.computer = computer;
  }



  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void code() {
    System.out.println("Im coding");
    computer.compile();
  }
}
