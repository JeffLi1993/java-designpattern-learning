package org.javadp.builder.demo2;

/**
 * 抽象建造者
 * 
 * @author justZero
 * @since 2017-6-30
 */
abstract class ManBuilder {
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArmLeft();
	public abstract void buildArmRight();
	public abstract void buildLegLeft();
	public abstract void buildLegRight();
	
}
