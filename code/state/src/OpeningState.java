/**
 * Created by zero on 2018/1/7.
 */
public class OpeningState implements LiftState {
    private Lift lift;

    public OpeningState(Lift lift) {
        this.lift = lift;
    }

    @Override
    public void open() {
        // 打开电梯门，打开状态要实现的动作
        System.out.println("电梯门已经打开...");
    }

    @Override
    public void close() {
        // 电梯门打开后关闭
        System.out.println("电梯门关闭...");
        this.lift.setLiftState(this.lift.getClosingState());
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
