public class Car extends Transport implements CarDiagnostics {

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
