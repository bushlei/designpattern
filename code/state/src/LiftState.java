/**
 * Created by zero on 2018/1/7.
 */
public interface LiftState {
    /**
     * 电梯开门
     */
    void open();

    /**
     * 电梯关门
     */
    void close();

    /**
     * 电梯运行
     */
    void run();

    /**
     * 电梯停止
     */
    void stop();
}
