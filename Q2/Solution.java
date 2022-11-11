package Q2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class Solution {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Insert number of data:");
    Integer numOfData = Integer.parseInt(s.nextLine());
    
  
    ArrayList<String> data = new ArrayList<String>();
    for (int i = 0; i < numOfData; i++) {
      System.out.println("Insert data:");
      data.add(s.nextLine());
    }

    isValid(data);
  }

  public static boolean isValid(ArrayList<String> data){
    boolean allValid = true;
    ArrayList<String> printout = new ArrayList<String>();

    for (int i = 0; i < data.size(); i++){
      String[] dataSplit = data.get(i).split(" ");
      if (dataSplit[1].equals("false")){
        printout.add(dataSplit[2]);
        allValid = false;
      }
    }

    if (!allValid) {
      System.out.print("No");
      System.out.println(printout);
      return false;
    } 
    else {
      System.out.print("Yes");
      return true;
    }
  }
}