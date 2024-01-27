package org.javadp.factory.calc;

/**
 * 减法类 - 继承运算类
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class OperationSub extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = getNumberA() - getNumberB();
		return result;
	}
	
}
