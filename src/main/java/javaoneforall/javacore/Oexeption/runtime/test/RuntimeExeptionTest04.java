package javaoneforall.javacore.Oexeption.runtime.test;

public class RuntimeExeptionTest04 {
    static void main() {

        try {
            throw new IndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }
    }
}
