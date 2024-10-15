package com.driver;

public class Main {
  public static class A{
  public String meth()
  {
    return "Invoking method from class A";
  }
}

 public static class B extends A{
  public String callSuperMeth() {
      return super.meth();  
    }
  @Override
  public String meth()
  {
    // Extenden[]d
    return "Method is overridden in Extendend class B";
  }
}

  public static void main(String []args)
  {
    B obj = new B();
    obj.callSuperMeth();
    obj.meth();
  }
}
