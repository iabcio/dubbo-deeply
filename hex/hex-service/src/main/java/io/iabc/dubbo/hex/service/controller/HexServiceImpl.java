 /*
  * Copyright 2017-2018 Iabc Co.Ltd.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *      http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

 package io.iabc.dubbo.hex.service.controller;

 import com.alibaba.dubbo.config.annotation.Service;

 import io.iabc.dubbo.hex.share.service.HexService;

 /**
  * Project: dubbo-learning
  * TODO:
  *
  * @author <a href="mailto:h@iabc.io">shuchen</a>
  * @version V1.0
  * @since 2018-03-09 15:08
  */
 @Service(protocol = { "rest", "dubbo" }, timeout = 10000)
 public class HexServiceImpl implements HexService {

     @Override
     public String status() {
         return "ok";
     }

     @Override
     public String echoSimple(String msg) {
         return msg;
     }
     
 }
