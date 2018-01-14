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
        System.out.println("电梯门打开...");
        this.lift.setLiftState(this.lift.getOpeningState());
    }

    @Override
    public void close() {
        System.out.println("电梯门已经关闭...");
    }

    @Override
    public void run() {
        // 电梯门关闭后运行
        System.out.println("电梯运行...");
        this.lift.setLiftState(this.lift.getRunningState());
    }

    @Override
    public void stop() {
        // 电梯门关闭后停止运行，不按楼层
        System.out.println("电梯停止...");
        this.lift.setLiftState(this.lift.getStoppingState());
    }
}
