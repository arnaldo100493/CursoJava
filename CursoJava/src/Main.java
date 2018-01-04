
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FABAME
 */
public class Main {

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Drink one = new Drink();
        Drink two = new Drink();
        one.name = "Coffee";
        two.name = "Tea";
        TreeSet set = new TreeSet();
        set.add(one);
        set.add(two);

        for (Object object : set) {
            Drink drink = (Drink) object;
            System.out.println("Drinks: " + drink.name);
        }

    }

    private static class GC {

        private Object o;

        public GC() {

        }

        private void doSomethingElse(Object obj) {
            o = obj;
        }

        public void doSomething() {
            Object o = new Object();
            doSomethingElse(o);
            o = new Object();
            doSomethingElse(null);
            o = null;
        }
    }

    private static class Drink implements Comparable {

        public String name;

        public Drink() {

        }

        @Override
        public int compareTo(Object o) {
            return 0;
        }

    }

}
