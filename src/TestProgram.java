public class MyClass {
  public static void main(String[] args) {
   int target = -5;
int num = 3;

target =- num;  // Noncompliant; target = -3. Is that really what's meant?
target =+ num; // Noncompliant; target = 3
    System.out.println("Hello World");
  }
} 
