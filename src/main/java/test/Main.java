package test;

public class Main {
    public static void main(String[] args) {
        double[] array = {2.1, 3.2, 7.4};
            double max = array[0];

            for (double num : array) {
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("Найбільший елемент: " + max);
        }
    }

