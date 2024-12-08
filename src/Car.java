public class Car extends Vehicle {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем автомобиль: " + getModelName());
        updateTyre();
        checkEngine();
    }
}
