/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojava;

/**
 *
 * @author abarrios
 */
public class TestClass {

    private static class WaterBottle {

        public WaterBottle() {

        }

        private String brand;
        private boolean empty;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }

}