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
 * @since 2015-7-19 19:45:57
 * 数据库操作工具类
 */
public class QueryUtil {
	
	/**
	 * 根据名称数组获取用户组
	 * @param userNames 名称数组
	 * @param sqlStrategy 策略
	 */
	public void findUserInfos(String[] userNames,SqlStrategy sqlStrategy) {
		// 数据库驱动
		// 连接
		
		// 策略中获取SQL
		String sql = sqlStrategy.getSQL(userNames);
		System.out.println("SQL: " + sql);
		
		// 读数据
		// 封装对象返回
	}
}
