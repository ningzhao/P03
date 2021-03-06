package client;

import lunch.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ning on 2/26/18.
 */
public class CompanyOrder extends Order{
    private List<Food> foodList = new ArrayList<>();

    private CompanyOrder(){}

    private static CompanyOrder instance = new CompanyOrder();

    public static CompanyOrder getInstance() {
        return instance;
    }

    //
    //private static CompanyOrder instance; // not initialized until it is called;
    //
    //public static CompanyOrder getInstance() {
    //    // synchronization problem
    //    if (instance == null) {
    //        instance = new CompanyOrder();
    //    }
    //    return instance;
    //}
}

/**
 * testing the Prototype pattern vs Singleton pattern
 */
//public class CompanyOrder extends Order implements Cloneable{
//    private List<Food> foodList = new ArrayList<>();
//
//    private CompanyOrder(){}
//
//    // //
//    private static CompanyOrder instance = new CompanyOrder();
//
//    public static CompanyOrder getInstance() {
//        return instance;
//    }
//
//    public Object clone() {
//        Object clone = null;
//        try {
//            clone = super.clone();
//        }
//        catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        return clone;
//    }
//}
