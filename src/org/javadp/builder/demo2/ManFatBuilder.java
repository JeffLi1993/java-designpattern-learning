package org.javadp.builder.demo2;

/**
 * 胖子建造者 - 具体子类
 * 
 * @author justZero
 * @since 2017年6月30日
 */
public class ManFatBuilder extends ManBuilder {

	@Override
	public void buildHead() {
		System.out.println("胖子-头部建造完毕");
	}

	@Override
	public void buildBody() {
		System.out.println("胖子-身体建造完毕");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("胖子-左手建造完毕");
	}

	@Override
	public void buildArmRight() {
		System.out.println("胖子-右手建造完毕");
	}

	@Override
	public void buildLegLeft() {
		System.out.println("胖子-左腿建造完毕");
	}

	@Override
	public void buildLegRight() {
		System.out.println("胖子-右腿建造完毕");
	}
	
}
