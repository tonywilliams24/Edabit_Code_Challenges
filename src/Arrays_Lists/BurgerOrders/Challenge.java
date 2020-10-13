package Arrays_Lists.BurgerOrders;

import java.util.TreeMap;

// Creates TreeMap (for sorting), uses array parameter to add the orders to the map, then returns an array of order numbers sorted by order serve time.
public class Challenge {
    static TreeMap<Order, Integer> orderTree = new TreeMap<>();
    public static int[] jimOrders(int[][] orders) {
        orderTree.clear();
        for(int i=0; i<orders.length; i++) {
            Order o = new Order(i+1, orders[i][0], orders[i][1]);
            orderTree.put((o),o.cust);
        }
        return orderTree.values().stream().mapToInt(order->order).toArray();
    }
}
