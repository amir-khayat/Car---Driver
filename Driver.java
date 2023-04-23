public class Driver extends Car {
    public void drive() {
        gas--;
    }
    public void booster() {
        gas += 3;
    }
    public void refuel() {
        gas = 2;
    }
}