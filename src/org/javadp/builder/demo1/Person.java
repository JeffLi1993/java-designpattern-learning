package org.javadp.builder.demo1;

/**
 * 建造者模式
 * <p>
 * 解决的问题：
 * 大型项目中复杂类的属性字段很多，传统创建对象的方法会造成代码冗杂，
 * 后期难以维护，考虑使用建造者模式。
 * 
 * @author justZero
 * @since 2017-6-30
 *
 */
public class Person {
	private final String firstName;
	private final String lastName;
	private final String sex;
	private final String city;
	private final String address;
	
	private Person(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.sex = builder.sex;
		this.city = builder.city;
		this.address = builder.address;

		/* 参数检查：
		if(illegal) {
			throws new IllegalPersonException
		}*/
	}
	
	/*
	 * Person内部类：Builder
	 */
	public static class Builder {
		private String firstName;
		private String lastName;
		private String sex;
		private String city;
		private String address;
		
		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		public Builder sex(String sex) {
			this.sex = sex;
			return this;
		}
		public Builder city(String city) {
			this.city = city;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Person build() {
			return new Person(this);
		}
	}
	
	public static Builder getBuilder(String firstName, String lastName) {
		// 姓名是必须的
		return new Builder(firstName, lastName);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSex() {
		return sex;
	}
	public String getCity() {
		return city;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Name: "+this.getFirstName()+"."+this.getLastName()+"\n"
				+"Sex: "+this.getSex()+"\n"
				+"Address: "+this.getCity()+"->"+this.getAddress();
	}
	
}
