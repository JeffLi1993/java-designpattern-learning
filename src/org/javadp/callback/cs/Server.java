package org.javadp.callback.cs;


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
 * @since 2015-10-21 21:24:15
 * 回调模式-模拟服务端类
 */
public class Server {

    public void getClientMsg(CSCallBack csCallBack , String msg) {
        System.out.println("服务端：服务端接收到客户端发送的消息为:" + msg);

        // 模拟服务端需要对数据处理
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务端：数据处理成功，返回成功状态 200");
        String status = "200";
        csCallBack.process(status);
    }
}
