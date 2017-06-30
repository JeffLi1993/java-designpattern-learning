package org.javadp.factory.calc;

/**
 * 简单计算器客户端 - 计算器案例测试
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class CalculatorTest {
	public static void main(String[] args) {
		Operation oper = null;
		oper = OperationFactory.createOperation("+");
		oper.setNumberA(20);
		oper.setNumberB(3);
		double result = oper.getResult();
		System.out.println("运算结果："+result);
	}
}
