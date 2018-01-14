/**
 * Created by zero on 2018/1/7.
 */
public class RunningState implements LiftState {
    private Lift lift;

    public RunningState(Lift lift) {
        this.lift = lift;
    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        // 电梯运行，运行状态要实现的动作
        System.out.println("电梯已经在运行...");
    }

    @Override
    public void stop() {
        // 电梯运行后停止
        System.out.println("电梯停止...");
        this.lift.setLiftState(this.lift.getStoppingState());
    }
}
