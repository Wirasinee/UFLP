/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wirasinee
 */

/*Class คลังสินค้า*/
public class Warehouse {
    private int ID; //คลังที่i
    private int capacity; //ความจุ
    private int cost; //ต้นทุน

    public Warehouse() {
    }

    public Warehouse( int capacity, int cost) {
        this.capacity = capacity;
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    
    
    
}
