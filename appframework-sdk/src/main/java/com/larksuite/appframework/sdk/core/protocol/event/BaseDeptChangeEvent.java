/*
 * Copyright (c) 2019 Bytedance Inc.  All rights reserved.
 * Use of this source code is governed by a MIT style
 * license that can be found in the LICENSE file.
 */

package com.larksuite.appframework.sdk.core.protocol.event;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class BaseDeptChangeEvent extends BaseEvent {

    private String openDepartmentId;
}
