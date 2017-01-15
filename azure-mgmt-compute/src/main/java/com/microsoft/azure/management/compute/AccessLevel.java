/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AccessLevel.
 */
public enum AccessLevel {
    /** Enum value None. */
    NONE("None"),

    /** Enum value Read. */
    READ("Read");

    /** The actual serialized value for a AccessLevel instance. */
    private String value;

    AccessLevel(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessLevel instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessLevel object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessLevel fromString(String value) {
        AccessLevel[] items = AccessLevel.values();
        for (AccessLevel item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
