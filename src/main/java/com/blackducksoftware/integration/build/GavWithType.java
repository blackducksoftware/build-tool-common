/*
 * Copyright (C) 2016 Black Duck Software Inc.
 * http://www.blackducksoftware.com/
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Black Duck Software ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Black Duck Software.
 */
package com.blackducksoftware.integration.build;

public class GavWithType {

    private Gav gav;

    private GavTypeEnum type;

    public GavWithType(Gav gav, GavTypeEnum type) {
        this.gav = gav;
        this.type = type;
    }

    public Gav getGav() {
        return gav;
    }

    public GavTypeEnum getType() {
        return type;
    }

}