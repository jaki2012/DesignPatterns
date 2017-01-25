package SimpleFactory;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description 工厂类,用于创建对象
 */
public class OperationFactory {

    public static Operation createOperation(char operator){

        Operation oper = null;

        switch (operator){
            case '+': {
                oper = new OperationAdd();
                break;
            }
            case '-': {
                oper = new OperationSub();
                break;
            }
            case '*': {
                oper = new OperationMul();
                break;
            }
            case '/': {
                oper = new OperationDiv();
                break;
            }
        }

        return oper;
    }

}
