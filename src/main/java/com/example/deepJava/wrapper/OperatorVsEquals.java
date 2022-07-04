package com.example.deepJava.wrapper;

class Car{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    //  Equals for Car
    @Override
    public boolean equals(Object obj){
        if (obj instanceof Car){
            Car crr = (Car) obj;
            if (crr.getModel().equals(model)){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }

}

public class OperatorVsEquals {
    /**
     * Operator == is used to compare two objects.
     */
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");
        Car car3 = car1;


        System.out.println(car1 == car2);
        System.out.println(car1 == car3);

        /**
         * Equals is used to compare two objects.
         */
        System.out.println(car1.equals(car2));

        // Other Equals methods
        // Todos valen 10, pero hay 2 métodos de inicialización de datos.
        Integer x = new Integer(10); // Deprecado y False.
        Integer y = 10; // Asignación directa y True.
        Integer z = 10; // Asignación directa y True.

        System.out.println("---");
        System.out.println(x.equals(y));
        System.out.println(y == z);


    }

}
