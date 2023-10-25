package javaCourse;

import org.junit.Test;

import java.util.ArrayList;

public class GenericTest {

    @Test
    public void test1() {
        class Order<T> {
            T t;
            int orderId;

            public T getT() {
                return t;
            }

            public void setT(T t) {
                this.t = t;
            }

            public int getOrderId() {
                return orderId;
            }

            public void setOrderId(int orderId) {
                this.orderId = orderId;
            }

            public Order(T t, int orderId) {
                this.t = t;
                this.orderId = orderId;
            }

            public Order() {
            }
        }

        ArrayList<String> list = new ArrayList<>();


        Order order = new Order<>();
        Object t = order.getT();

//Order<Integer> order1=new Order<int>();


        class subOrder<S> extends Order<String> {
            S s;

            public subOrder() {
            }

            public subOrder(String s, int orderId, S s1) {
                super(s, orderId);
                this.s = s1;
            }

            public subOrder(S s) {
                this.s = s;
            }
        }

    }

}
