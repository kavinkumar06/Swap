# Swap
import java.io.*;
import java.util.*;
public class Swap
{
 public static void main(String args[])
 {
   int a = 89, b = 90;
System.out.println("Before swapping:");
 
System.out.println("A=" + a);
System.out.println("B=" + b);
 
a = a ^ b; // XOR operation
b = a ^ b; // XOR operation
a = a ^ b; // XOR operation
 
System.out.println("After swapping:");
System.out.println("A=" + a);
System.out.println("B=" + b);
}
}
