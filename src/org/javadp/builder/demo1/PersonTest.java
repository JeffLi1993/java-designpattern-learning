package org.javadp.builder.demo1;

/**
 * 建造者模式示例1
 * <p>
 * Person 类的使用
 * 
 * @author justZero
 * @since 2017-6-30
 */
public class PersonTest {
	public static void main(String[] args) {
		Person person  = Person.getBuilder("just", "zero")
				.sex("male")
				.city("Raindow Sea")
				.address("Treasure Planet")
				.build();
		System.out.println(person);
	}
}
