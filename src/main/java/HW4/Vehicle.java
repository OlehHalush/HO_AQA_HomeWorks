package HW4;

/*
Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that inherits from the Car class.
You should be able to hand steering, changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
*/
public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer():Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move():Moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public static class Car extends Vehicle {
        private int doors;
        private String type;

        public Car(String name, String size, int doors, String type) {
            super(name, size);
            this.doors = doors;
            this.type = type;
        }

        public int getDoors() {
            return doors;
        }

        public String getType() {
            return type;
        }
    }

    public static class Mercedes extends Car {
        private String color;
        private String transmission;

        public Mercedes(String name, String size, int doors, String type, String color, String transmission) {
            super(name, size, doors, type);
            this.color = color;
            this.transmission = transmission;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTransmission() {
            return transmission;
        }
    }

    public static void main(String[] args) {
        Mercedes myCustomCar = new Mercedes("GL", "4", 2, "sedan", "black", "manual");
        myCustomCar.move(10, 1);
        System.out.println(myCustomCar.getCurrentDirection());
        System.out.println(myCustomCar.getCurrentVelocity());
        myCustomCar.steer(25);
        myCustomCar.move(-5, 0);
        myCustomCar.steer(-20);
        System.out.println(myCustomCar.getName());
        myCustomCar.stop();
        System.out.println(myCustomCar.getCurrentDirection());
        System.out.println(myCustomCar.getCurrentVelocity());
        myCustomCar.move(50, 15);
        System.out.println(myCustomCar.getCurrentDirection());
        System.out.println(myCustomCar.getCurrentVelocity());
    }
}

