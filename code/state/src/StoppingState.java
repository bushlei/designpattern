/**
 * Created by zero on 2018/1/7.
 */
public class StoppingState implements LiftState {
    private Lift lift;

    public StoppingState(Lift lift) {
        this.lift = lift;
    }

    @Override
    public void open() {
        // 电梯停止后开门
        System.out.println("电梯门打开...");
        this.lift.setLiftState(this.lift.getOpeningState());
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        // 电梯停止后运行
        System.out.println("电梯门运行...");
        this.lift.setLiftState(this.lift.getRunningState());
    }

    @Override
    public void stop() {
        // 电梯停止，停止状态要实现的动作
        System.out.println("电梯已经停止...");
    }
}
