/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.microsoft.rest.v2.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Defines headers for CreateSnapshot operation.
 */
@JacksonXmlRootElement(localName = "Blobs-CreateSnapshot-Headers")
public final class BlobsCreateSnapshotHeaders {
    /**
     * Uniquely identifies the snapshot and indicates the snapshot version. It
     * may be used in subsequent requests to access the snapshot.
     */
    @JsonProperty(value = "x-ms-snapshot")
    private String snapshot;

    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 date;

    /**
     * Get the snapshot value.
     *
     * @return the snapshot value.
     */
    public String snapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot value.
     *
     * @param snapshot the snapshot value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the eTag value.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the date value.
     *
     * @return the date value.
     */
    public OffsetDateTime date() {
        if (this.date == null) {
            return null;
        }
        return this.date.dateTime();
    }

    /**
     * Set the date value.
     *
     * @param date the date value to set.
     * @return the BlobsCreateSnapshotHeaders object itself.
     */
    public BlobsCreateSnapshotHeaders withDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
