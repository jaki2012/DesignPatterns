package Strategy;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description
 */
public class Program {
    public static void main(String args[]){
        Context context = null;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
    }
}
