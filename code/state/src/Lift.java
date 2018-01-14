/**
 * Created by zero on 2018/1/7.
 */
public class Lift {
    private OpeningState openingState;

    private ClosingState closingState;

    private RunningState runningState;

    private StoppingState stoppingState;

    private LiftState liftState;

    public Lift() {
        openingState = new OpeningState(this);
        closingState = new ClosingState(this);
        runningState = new RunningState(this);
        stoppingState = new StoppingState(this);

        // 初始状态位门关闭状态
        this.liftState = closingState;
    }

    public void open() {
        liftState.open();
    }

    public void close() {
        liftState.close();
    }

    public void run() {
        liftState.run();
    }

    public void stop() {
        liftState.stop();
    }

    public OpeningState getOpeningState() {
        return openingState;
    }

    public void setOpeningState(OpeningState openingState) {
        this.openingState = openingState;
    }

    public ClosingState getClosingState() {
        return closingState;
    }

    public void setClosingState(ClosingState closingState) {
        this.closingState = closingState;
    }

    public RunningState getRunningState() {
        return runningState;
    }

    public void setRunningState(RunningState runningState) {
        this.runningState = runningState;
    }

    public StoppingState getStoppingState() {
        return stoppingState;
    }

    public void setStoppingState(StoppingState stoppingState) {
        this.stoppingState = stoppingState;
    }

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }
}
