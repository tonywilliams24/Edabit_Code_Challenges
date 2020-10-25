package arraysListsEtc.burgerOrders;

public class Order implements Comparable<Order> {
    int cust, order, prep, serve;

    // Compares orders first based on their serve time then by their order number.
    @Override
    public int compareTo(Order o) {
        int serveComp = this.serve - o.serve;
        if (serveComp != 0) return serveComp;
        else return this.cust - o.cust;
    }

    Order(int cust, int order, int prep) {
        this.cust = cust;
        this.order = order;
        this.prep = prep;
        this.serve = order + prep;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cust=" + cust +
                ", order=" + order +
                ", prep=" + prep +
                ", serve=" + serve +
                '}';
    }
}
