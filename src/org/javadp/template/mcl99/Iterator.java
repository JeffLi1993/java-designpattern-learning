package org.javadp.template.mcl99;
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
 * 动作模板抽象类
 * @author Jeff Lee
 * @since 2015-8-18 17:22:40
 * @param <T> 传参
 */
public abstract class Iterator<T> {
	/**
	 * 动作抽象方法
	 * @param n
	 */
	abstract void process(T n);
	/**
	 * 迭代执行模板
	 * @param n 次数
	 * @param action 实现类
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void iterate(int n,Iterator action){
		for (int i = 1; i <= n; i++) {
			action.process(i);// 动作方法
		}
	}
}
