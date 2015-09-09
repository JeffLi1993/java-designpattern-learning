package org.javadp.decorator.servletReq;
/*
 * Copyright [2015] [Jeff Lee]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jeff Lee
 * @since 2015-9-9 15:43:01
 * 装饰模式测试类
 */
public class TestDecorator {
	public static void main(String[] args) {
		System.out.println(new RequestDecorator(RequestFactory.getRequest())// 装饰类传入需要装饰对象
				.getStringParamter());
	}
}
