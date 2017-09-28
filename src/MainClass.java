
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/** 
 *
 * @author Wirasinee
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input FileName :"); //cap41.txt
        String FileName = in.next();
        ActionFiles fileClass = new ActionFiles();
        ArrayList<Double> al = fileClass.readFile(FileName);
        int index = 0;
        int n = al.get(index++).intValue();
        int m = al.get(index++).intValue();

        Map<String, Warehouse> mapWareHouseI = new TreeMap<>();//คลัง,ความจุคลัง,ต้นทุน
        Warehouse warehouse = new Warehouse();
        for (int i = 1; i <=n; i ++) {
            int capacity = al.get(index++).intValue(); //ความจุ
            int cost = al.get(index++).intValue(); //ต้นทุน

            warehouse = new Warehouse(capacity, cost);
            mapWareHouseI.put("I"+i, warehouse);//(คลังที่,(ความจุคลัง,ต้นทุน))

        }
        System.out.println("จำนวนตลังสินค้า(n): " + n + " จำนวนลูกค้า(m): " + m);
        
        for (String i : mapWareHouseI.keySet()) {
            System.out.println(i + " | ความจุ(S): " + mapWareHouseI.get(i).getCapacity() + " | ต้นทุน(C): " + mapWareHouseI.get(i).getCost());
        }

        System.out.println("_____________________________________");

        Customer customer = new Customer();
        

        Map<String, Double> mapCustomerJI = new TreeMap<>();
        Map<Integer, Customer> mapWantJ = new HashMap<>();
        for(int j=1;j<=m;j++){
            mapWantJ.put(j, new Customer(al.get(index++).intValue()));
            for (int i = 1 ; i <=  n; i++) {
            
                double w = al.get(index++);
                
                mapCustomerJI.put("C"+j+","+i, w);
            }
        }
        System.out.println("ความต้องการลูกค่าคนที่j");
        for(int W: mapWantJ.keySet()){
            System.out.println("W"+W+" : "+mapWantJ.get(W).want);
        }
        System.out.println("ราคาความต้องการทั้งหมดลูกค้าคนที่jไปยังโกดังi");
         for (String Cij : mapCustomerJI.keySet()) {
                System.out.println(Cij +" : "+ mapCustomerJI.get(Cij));
            
        
        }
    }

}
