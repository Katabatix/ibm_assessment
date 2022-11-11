package Q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;

public class Solution {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Insert line 1:");
    String line1 = s.nextLine();
    System.out.println("Insert line 2:");
    String shopStockSizes = s.nextLine();
    System.out.println("Insert line 3:");
    String line3 = s.nextLine();
    System.out.println("Insert line 4:");
    String requestSizes = s.nextLine();

    Integer shopStockTotal = Integer.parseInt(line1);
    Integer requestsTotal = Integer.parseInt(line3);

    //if more requests than shop stock, can't fulfill
    if (requestsTotal > shopStockTotal) {
      System.out.println("No");
      return;
    }    

    //put sizes into List
    String[] tempShirtSize = shopStockSizes.split(" ");
    List<String> shirtSize = new ArrayList<String>(Arrays.asList(tempShirtSize));

    String[] requestSplit = requestSizes.split(" ");
    List<String> requestsList = new ArrayList<String>(Arrays.asList(requestSplit));
    
    //input into TreeMap
    //sort shirtSize (store stock) into TreeMap

    //iterate through requestsList and remove elements bigger than the request, if can't print no and return


    //print yes and return
    System.out.println("Yes");
    return;
  }
}