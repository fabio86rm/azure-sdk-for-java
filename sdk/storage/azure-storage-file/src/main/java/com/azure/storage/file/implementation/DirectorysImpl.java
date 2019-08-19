// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation;

import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.Delete;
import com.azure.core.implementation.annotation.ExpectedResponses;
import com.azure.core.implementation.annotation.Get;
import com.azure.core.implementation.annotation.HeaderParam;
import com.azure.core.implementation.annotation.Host;
import com.azure.core.implementation.annotation.HostParam;
import com.azure.core.implementation.annotation.PathParam;
import com.azure.core.implementation.annotation.Put;
import com.azure.core.implementation.annotation.QueryParam;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceInterface;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.implementation.annotation.UnexpectedResponseExceptionType;
import com.azure.core.util.Context;
import com.azure.storage.file.models.DirectorysCreateResponse;
import com.azure.storage.file.models.DirectorysDeleteResponse;
import com.azure.storage.file.models.DirectorysForceCloseHandlesResponse;
import com.azure.storage.file.models.DirectorysGetPropertiesResponse;
import com.azure.storage.file.models.DirectorysListFilesAndDirectoriesSegmentResponse;
import com.azure.storage.file.models.DirectorysListHandlesResponse;
import com.azure.storage.file.models.DirectorysSetMetadataResponse;
import com.azure.storage.file.models.DirectorysSetPropertiesResponse;
import com.azure.storage.file.models.StorageErrorException;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Directorys.
 */
public final class DirectorysImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private DirectorysService service;

    /**
     * The service client containing this operation class.
     */
    private AzureFileStorageImpl client;

    /**
     * Initializes an instance of DirectorysImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DirectorysImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(DirectorysService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureFileStorageDirectorys
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{url}")
    @ServiceInterface(name = "AzureFileStorageDirectorys")
    private interface DirectorysService {
        @Put("{shareName}/{directoryPath}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysCreateResponse> create(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-file-permission") String filePermission, @HeaderParam("x-ms-file-permission-key") String filePermissionKey, @HeaderParam("x-ms-file-attributes") String fileAttributes, @HeaderParam("x-ms-file-creation-time") String fileCreationTime, @HeaderParam("x-ms-file-last-write-time") String fileLastWriteTime, @QueryParam("restype") String restype, Context context);

        @Get("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysGetPropertiesResponse> getProperties(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @Delete("{shareName}/{directoryPath}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysDeleteResponse> delete(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, Context context);

        @Put("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysSetPropertiesResponse> setProperties(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-file-permission") String filePermission, @HeaderParam("x-ms-file-permission-key") String filePermissionKey, @HeaderParam("x-ms-file-attributes") String fileAttributes, @HeaderParam("x-ms-file-creation-time") String fileCreationTime, @HeaderParam("x-ms-file-last-write-time") String fileLastWriteTime, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysSetMetadataResponse> setMetadata(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysListFilesAndDirectoriesSegmentResponse> listFilesAndDirectoriesSegment(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("prefix") String prefix, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @QueryParam("restype") String restype, @QueryParam("comp") String comp, Context context);

        @Get("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysListHandlesResponse> listHandles(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("timeout") Integer timeout, @QueryParam("sharesnapshot") String sharesnapshot, @HeaderParam("x-ms-recursive") Boolean recursive, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);

        @Put("{shareName}/{directoryPath}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<DirectorysForceCloseHandlesResponse> forceCloseHandles(@PathParam("shareName") String shareName, @PathParam("directoryPath") String directoryPath, @HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("marker") String marker, @QueryParam("sharesnapshot") String sharesnapshot, @HeaderParam("x-ms-handle-id") String handleId, @HeaderParam("x-ms-recursive") Boolean recursive, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Creates a new directory under the specified share or parent directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param fileAttributes If specified, the provided file attributes shall be set. Default value: ‘Archive’ for file and ‘Directory’ for directory. ‘None’ can also be specified as default.
     * @param fileCreationTime Creation time for the file/directory. Default value: Now.
     * @param fileLastWriteTime Last write time for the file/directory. Default value: Now.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysCreateResponse> createWithRestResponseAsync(String shareName, String directoryPath, String fileAttributes, String fileCreationTime, String fileLastWriteTime, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String filePermission = null;
        final String filePermissionKey = null;
        final String restype = "directory";
        return service.create(shareName, directoryPath, this.client.getUrl(), timeout, metadata, this.client.getVersion(), filePermission, filePermissionKey, fileAttributes, fileCreationTime, fileLastWriteTime, restype, context);
    }

    /**
     * Creates a new directory under the specified share or parent directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param fileAttributes If specified, the provided file attributes shall be set. Default value: ‘Archive’ for file and ‘Directory’ for directory. ‘None’ can also be specified as default.
     * @param fileCreationTime Creation time for the file/directory. Default value: Now.
     * @param fileLastWriteTime Last write time for the file/directory. Default value: Now.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param filePermission If specified the permission (security descriptor) shall be set for the directory/file. This header can be used if Permission size is &lt;= 8KB, else x-ms-file-permission-key header shall be used. Default value: Inherit. If SDDL is specified as input, it must have owner, group and dacl. Note: Only one of the x-ms-file-permission or x-ms-file-permission-key should be specified.
     * @param filePermissionKey Key of the permission to be set for the directory/file. Note: Only one of the x-ms-file-permission or x-ms-file-permission-key should be specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysCreateResponse> createWithRestResponseAsync(String shareName, String directoryPath, String fileAttributes, String fileCreationTime, String fileLastWriteTime, Integer timeout, Map<String, String> metadata, String filePermission, String filePermissionKey, Context context) {
        final String restype = "directory";
        return service.create(shareName, directoryPath, this.client.getUrl(), timeout, metadata, this.client.getVersion(), filePermission, filePermissionKey, fileAttributes, fileCreationTime, fileLastWriteTime, restype, context);
    }

    /**
     * Returns all system properties for the specified directory, and can also be used to check the existence of a directory. The data returned does not include the files in the directory or any subdirectories.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysGetPropertiesResponse> getPropertiesWithRestResponseAsync(String shareName, String directoryPath, Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final String restype = "directory";
        return service.getProperties(shareName, directoryPath, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Returns all system properties for the specified directory, and can also be used to check the existence of a directory. The data returned does not include the files in the directory or any subdirectories.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysGetPropertiesResponse> getPropertiesWithRestResponseAsync(String shareName, String directoryPath, String sharesnapshot, Integer timeout, Context context) {
        final String restype = "directory";
        return service.getProperties(shareName, directoryPath, this.client.getUrl(), sharesnapshot, timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Removes the specified empty directory. Note that the directory must be empty before it can be deleted.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysDeleteResponse> deleteWithRestResponseAsync(String shareName, String directoryPath, Context context) {
        final Integer timeout = null;
        final String restype = "directory";
        return service.delete(shareName, directoryPath, this.client.getUrl(), timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Removes the specified empty directory. Note that the directory must be empty before it can be deleted.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysDeleteResponse> deleteWithRestResponseAsync(String shareName, String directoryPath, Integer timeout, Context context) {
        final String restype = "directory";
        return service.delete(shareName, directoryPath, this.client.getUrl(), timeout, this.client.getVersion(), restype, context);
    }

    /**
     * Sets properties on the directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param fileAttributes If specified, the provided file attributes shall be set. Default value: ‘Archive’ for file and ‘Directory’ for directory. ‘None’ can also be specified as default.
     * @param fileCreationTime Creation time for the file/directory. Default value: Now.
     * @param fileLastWriteTime Last write time for the file/directory. Default value: Now.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetPropertiesResponse> setPropertiesWithRestResponseAsync(String shareName, String directoryPath, String fileAttributes, String fileCreationTime, String fileLastWriteTime, Context context) {
        final Integer timeout = null;
        final String filePermission = null;
        final String filePermissionKey = null;
        final String comp = "properties";
        return service.setProperties(shareName, directoryPath, this.client.getUrl(), timeout, this.client.getVersion(), filePermission, filePermissionKey, fileAttributes, fileCreationTime, fileLastWriteTime, comp, context);
    }

    /**
     * Sets properties on the directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param fileAttributes If specified, the provided file attributes shall be set. Default value: ‘Archive’ for file and ‘Directory’ for directory. ‘None’ can also be specified as default.
     * @param fileCreationTime Creation time for the file/directory. Default value: Now.
     * @param fileLastWriteTime Last write time for the file/directory. Default value: Now.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param filePermission If specified the permission (security descriptor) shall be set for the directory/file. This header can be used if Permission size is &lt;= 8KB, else x-ms-file-permission-key header shall be used. Default value: Inherit. If SDDL is specified as input, it must have owner, group and dacl. Note: Only one of the x-ms-file-permission or x-ms-file-permission-key should be specified.
     * @param filePermissionKey Key of the permission to be set for the directory/file. Note: Only one of the x-ms-file-permission or x-ms-file-permission-key should be specified.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetPropertiesResponse> setPropertiesWithRestResponseAsync(String shareName, String directoryPath, String fileAttributes, String fileCreationTime, String fileLastWriteTime, Integer timeout, String filePermission, String filePermissionKey, Context context) {
        final String comp = "properties";
        return service.setProperties(shareName, directoryPath, this.client.getUrl(), timeout, this.client.getVersion(), filePermission, filePermissionKey, fileAttributes, fileCreationTime, fileLastWriteTime, comp, context);
    }

    /**
     * Updates user defined metadata for the specified directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetMetadataResponse> setMetadataWithRestResponseAsync(String shareName, String directoryPath, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String restype = "directory";
        final String comp = "metadata";
        return service.setMetadata(shareName, directoryPath, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Updates user defined metadata for the specified directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysSetMetadataResponse> setMetadataWithRestResponseAsync(String shareName, String directoryPath, Integer timeout, Map<String, String> metadata, Context context) {
        final String restype = "directory";
        final String comp = "metadata";
        return service.setMetadata(shareName, directoryPath, this.client.getUrl(), timeout, metadata, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns a list of files or directories under the specified share or directory. It lists the contents only for a single level of the directory hierarchy.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysListFilesAndDirectoriesSegmentResponse> listFilesAndDirectoriesSegmentWithRestResponseAsync(String shareName, String directoryPath, Context context) {
        final String prefix = null;
        final String sharesnapshot = null;
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String restype = "directory";
        final String comp = "list";
        return service.listFilesAndDirectoriesSegment(shareName, directoryPath, this.client.getUrl(), prefix, sharesnapshot, marker, maxresults, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Returns a list of files or directories under the specified share or directory. It lists the contents only for a single level of the directory hierarchy.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param prefix Filters the results to return only entries whose name begins with the specified prefix.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of entries to return. If the request does not specify maxresults, or specifies a value greater than 5,000, the server will return up to 5,000 items.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysListFilesAndDirectoriesSegmentResponse> listFilesAndDirectoriesSegmentWithRestResponseAsync(String shareName, String directoryPath, String prefix, String sharesnapshot, String marker, Integer maxresults, Integer timeout, Context context) {
        final String restype = "directory";
        final String comp = "list";
        return service.listFilesAndDirectoriesSegment(shareName, directoryPath, this.client.getUrl(), prefix, sharesnapshot, marker, maxresults, timeout, this.client.getVersion(), restype, comp, context);
    }

    /**
     * Lists handles for directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysListHandlesResponse> listHandlesWithRestResponseAsync(String shareName, String directoryPath, Context context) {
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String sharesnapshot = null;
        final Boolean recursive = null;
        final String comp = "listhandles";
        return service.listHandles(shareName, directoryPath, this.client.getUrl(), marker, maxresults, timeout, sharesnapshot, recursive, this.client.getVersion(), comp, context);
    }

    /**
     * Lists handles for directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of entries to return. If the request does not specify maxresults, or specifies a value greater than 5,000, the server will return up to 5,000 items.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param recursive Specifies operation should apply to the directory specified in the URI, its files, its subdirectories and their files.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysListHandlesResponse> listHandlesWithRestResponseAsync(String shareName, String directoryPath, String marker, Integer maxresults, Integer timeout, String sharesnapshot, Boolean recursive, Context context) {
        final String comp = "listhandles";
        return service.listHandles(shareName, directoryPath, this.client.getUrl(), marker, maxresults, timeout, sharesnapshot, recursive, this.client.getVersion(), comp, context);
    }

    /**
     * Closes all handles open for given directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param handleId Specifies handle ID opened on the file or directory to be closed. Asterix (‘*’) is a wildcard that specifies all handles.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysForceCloseHandlesResponse> forceCloseHandlesWithRestResponseAsync(String shareName, String directoryPath, String handleId, Context context) {
        final Integer timeout = null;
        final String marker = null;
        final String sharesnapshot = null;
        final Boolean recursive = null;
        final String comp = "forceclosehandles";
        return service.forceCloseHandles(shareName, directoryPath, this.client.getUrl(), timeout, marker, sharesnapshot, handleId, recursive, this.client.getVersion(), comp, context);
    }

    /**
     * Closes all handles open for given directory.
     *
     * @param shareName The name of the target share.
     * @param directoryPath The path of the target directory.
     * @param handleId Specifies handle ID opened on the file or directory to be closed. Asterix (‘*’) is a wildcard that specifies all handles.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param recursive Specifies operation should apply to the directory specified in the URI, its files, its subdirectories and their files.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DirectorysForceCloseHandlesResponse> forceCloseHandlesWithRestResponseAsync(String shareName, String directoryPath, String handleId, Integer timeout, String marker, String sharesnapshot, Boolean recursive, Context context) {
        final String comp = "forceclosehandles";
        return service.forceCloseHandles(shareName, directoryPath, this.client.getUrl(), timeout, marker, sharesnapshot, handleId, recursive, this.client.getVersion(), comp, context);
    }
}
