package SimpleFactory;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description
 */
public class OperationDiv extends Operation{

    @Override
    public double getResult(){
        double result = 0;
        try {
            if(0 != numberB){
                result = numberA/numberB;
            } else {
                throw new Exception("除数不能为0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
