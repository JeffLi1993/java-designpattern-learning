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
 * @since 2015-7-19 19:33:11
 * SQL策略实现类2 
 */
public class SqlStrategy2 implements SqlStrategy {

	@Override
	public String getSQL(String[] userNames) {
		StringBuilder sql = new StringBuilder("SELECT * FROM user_info WHERE ");
		boolean orNeed = false;
		for (String name : userNames) {
			if (orNeed)// WHERE后不需要OR
				sql.append(" OR ");
			sql.append("username = '");
			sql.append(name);
			sql.append("'");
			orNeed = true;
		}
		
		return sql.toString();
	}

}
