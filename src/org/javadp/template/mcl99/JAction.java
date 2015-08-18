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
 * 动作模板抽象实现类
 * @author Jeff Lee
 * @since 2015-8-18 17:24:45
 */
public class JAction extends Iterator<Integer> {
	private final int x;// 变量
	
	public JAction(int x) {
		this.x = x;
	}
	
	@Override
	void process(Integer n) {
		System.out.print(" " + x * n);// i * j 相乘积
	}
}
