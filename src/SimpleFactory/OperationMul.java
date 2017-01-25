package SimpleFactory;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description
 */
public class OperationMul extends Operation {
    @Override
    public double getResult(){
        return numberA * numberB;
    }
}
