package org.javadp.builder.demo2;

/**
 * 指挥者：控制建造过程，隔离用户与建造过程的关联
 * @author justZero
 * @since 2017年6月30日
 */
public class ManDirector {
	
	private ManBuilder mb;
	
	/*
	 * 告诉指挥者，需要什么样的小人
	 */
	public ManDirector(ManBuilder mb) {
		this.mb = mb;
	}
	
	public void createMan() {
		mb.buildHead();
		mb.buildBody();
		mb.buildArmLeft();
		mb.buildArmRight();
		mb.buildLegLeft();
		mb.buildLegRight();
	}
	
}
