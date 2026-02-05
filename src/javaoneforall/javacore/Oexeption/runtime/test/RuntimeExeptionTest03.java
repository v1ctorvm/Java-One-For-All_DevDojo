package javaoneforall.javacore.Oexeption.runtime.test;

public class RuntimeExeptionTest03 {
    static void main() {
    openConnection();


    }

    private static String openConnection(){
      try{
          System.out.println("Opening Connection");
          System.out.println("Writing to the database");
          return "connected";
      }catch (Exception e){
          e.printStackTrace();
      }
      finally {
          System.out.println("Close Connection");
      }
      return "not connected";
    }
}
