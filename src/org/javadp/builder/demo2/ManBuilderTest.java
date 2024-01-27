package org.javadp.builder.demo2;

/**
 * 建造者模式示例2
 * <p>
 * 将一个复杂对象的构建与它的表示分离，
 * 使得同样的构建过程可以创建不同的表示。
 * 
 * @author justZero
 * @since 2017年6月30日
 */
public class ManBuilderTest {
	public static void main(String[] args) {
		ManDirector mdThin = new ManDirector(new ManThinBuilder());
		mdThin.createMan();
		
		System.out.println("\n");
		
		ManDirector mdFat = new ManDirector(new ManFatBuilder());
		mdFat.createMan();
	}
}
