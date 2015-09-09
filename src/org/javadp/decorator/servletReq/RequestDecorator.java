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
 * 装饰模式-请求装饰类（也是个请求的实现类）
 */
public class RequestDecorator implements Request{
	private Request request;

	public RequestDecorator(Request request) {
		if (request == null) {
			throw new IllegalArgumentException("Request can be null");
		}
		this.request = request;
	}

	@Override
	public String getStringParamter() {
		return request.getStringParamter().toUpperCase();
	}
	
}
