package Lab07;

import java.text.DecimalFormat;

class Main {

    public static void main(String[] args) {
        Plane.Wing first = new Plane.Wing(10.15);
        Plane.Wing second = new Plane.Wing(15.53);

        DecimalFormat format = new DecimalFormat("0.##");

        System.out.printf("First plane wings weight is %s \n", format.format(first.getWeight()));
        System.out.printf("Second plane wings weight is %s \n", format.format(second.getWeight()));
    }
}
