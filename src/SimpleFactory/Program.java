package SimpleFactory;

import java.util.Scanner;

/**
 * @author lijiechu
 * @create on 17/1/25
 * @description 客户端代码
 */
public class Program {

    public static void main(String args[]){
        Scanner mScanner = new Scanner(System.in);

        double numberA = mScanner.nextDouble();
        double numberB = mScanner.nextDouble();
        char operator = mScanner.next().charAt(0);

        Operation oper = OperationFactory.createOperation(operator);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        System.out.println(oper.getResult());
    }

}
