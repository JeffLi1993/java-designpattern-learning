package org.javadp.factory.calc;

/**
 * 简单运算工厂 - 工厂模式
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class OperationFactory {
	
	public static Operation createOperation(String operate) {
		Operation oper = null;
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		}
		return oper;
	}
	
	private OperationFactory() {}
	
}
