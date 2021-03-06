// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.changefeed;

import reactor.core.publisher.Mono;

/**
 * Interface PartitionManager.
 */
public interface PartitionManager {
    /**
     * starts the partition manager.
     *
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> start();

    /**
     * Stops the partition manager.
     *
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> stop();

    /**
     * Returns true if the instance is running.
     *
     * @return true if the instance is running.
     */
    boolean isRunning();
}
