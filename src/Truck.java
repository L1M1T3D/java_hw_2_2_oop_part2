public class Truck extends Vehicle {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем грузовик: " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
