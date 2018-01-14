public class Main {

    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.open();
        lift.close();
    }
}
