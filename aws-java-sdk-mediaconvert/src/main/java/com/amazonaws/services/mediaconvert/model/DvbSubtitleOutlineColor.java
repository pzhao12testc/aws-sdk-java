/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specifies font outline color. This option is not valid for source captions that are either 608/embedded or teletext.
 * These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must
 * match.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum DvbSubtitleOutlineColor {

    BLACK("BLACK"),
    WHITE("WHITE"),
    YELLOW("YELLOW"),
    RED("RED"),
    GREEN("GREEN"),
    BLUE("BLUE");

    private String value;

    private DvbSubtitleOutlineColor(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return DvbSubtitleOutlineColor corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static DvbSubtitleOutlineColor fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (DvbSubtitleOutlineColor enumEntry : DvbSubtitleOutlineColor.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
