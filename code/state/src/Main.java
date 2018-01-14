public class Main {

    public static void main(String[] args) {
        Lift lift = new Lift();
        // 初始状态位门关闭状态
        lift.setLiftState(new ClosingState(lift));

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.open();
        lift.close();
    }
}
