package Strategy;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
