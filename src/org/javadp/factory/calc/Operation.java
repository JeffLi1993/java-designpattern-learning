package org.javadp.factory.calc;

/**
 * 运算类
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class Operation {
	private double numberA = 0;
	private double numberB = 0;
	
	public double getNumberA() {
		return numberA;
	}
	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}
	public double getNumberB() {
		return numberB;
	}
	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	/**
	 * 获取计算结果
	 * @return
	 */
	public double getResult() {
		double result = 0;
		return result;
	}
}
