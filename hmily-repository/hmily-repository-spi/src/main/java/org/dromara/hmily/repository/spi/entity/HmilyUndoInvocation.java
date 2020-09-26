/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.hmily.repository.spi.entity;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * HmilyUndoInvocation.
 *
 * @author xiaoyu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HmilyUndoInvocation implements Serializable {
    
    private static final long serialVersionUID = -4406133196112007765L;
    
    private String originSql;
    
    private String tableName;
    
    private String manipulationType;
    
    private Map<String, Object> beforeImage;
    
    private Map<String, Object> afterImage;
}
