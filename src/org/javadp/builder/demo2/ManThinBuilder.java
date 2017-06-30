package org.javadp.builder.demo2;

/**
 * 瘦子建造者 - 具体子类
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class ManThinBuilder extends ManBuilder {
	
	@Override
	public void buildHead() {
		System.out.println("瘦子-头部建造完毕");
	}

	@Override
	public void buildBody() {
		System.out.println("瘦子-身体建造完毕");
	}

	@Override
	public void buildArmLeft() {
		System.out.println("瘦子-左手建造完毕");
	}

	@Override
	public void buildArmRight() {
		System.out.println("瘦子-右手建造完毕");
	}

	@Override
	public void buildLegLeft() {
		System.out.println("瘦子-左腿建造完毕");
	}

	@Override
	public void buildLegRight() {
		System.out.println("瘦子-右腿建造完毕");
	}
	
}
