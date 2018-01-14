/**
 * Created by zero on 2018/1/7.
 */
public class ClosingState implements LiftState {
    private Lift lift;

    public ClosingState(Lift lift) {
        this.lift = lift;
    }

    @Override
    public void open() {
        // 电梯门关闭后打开
        this.lift.setLiftState(this.lift.getOpeningState());
    }

    @Override
    public void close() {
        // 关闭电梯门，关闭状态要实现的动作
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        // 电梯门关闭后运行
        this.lift.setLiftState(this.lift.getRunningState());
    }

    @Override
    public void stop() {
        // 电梯门关闭后停止运行，不按楼层
        this.lift.setLiftState(this.lift.getStoppingState());
    }
}
