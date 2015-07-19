package org.javadp.strategy.sql;
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
 * @since 2015-7-19 19:46:12
 * 测试类
 */
public class SqlTest {

	public static void main(String[] args) {
		QueryUtil query = new QueryUtil();
		query.findUserInfos(
				new String[]{"SQL1","MySQL1","ORACLE1"},
				new SqlStrategy1());
		query.findUserInfos(
				new String[]{"SQL2","MySQL2","ORACLE2"},
				new SqlStrategy2());
		// 补充 :
		// 它定义了算法家庭，分别封装起来。
		// 让它们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的客户。
		// 策略模式的好处就是：体现了高内聚低耦合的特性
	}

}
