/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql;

import com.microsoft.windowsazure.core.FilterableService;
import com.microsoft.windowsazure.credentials.SubscriptionCloudCredentials;
import java.io.Closeable;
import java.net.URI;

/**
* The Windows Azure SQL Database management API provides a RESTful set of web
* services that interact with Windows Azure SQL Database services to manage
* your databases. The API enables users to create, retrieve, update, and
* delete databases and servers.
*/
public interface SqlManagementClient extends Closeable, FilterableService<SqlManagementClient> {
    /**
    * Gets the API version.
    * @return The ApiVersion value.
    */
    String getApiVersion();
    
    /**
    * Gets the URI used as the base for all cloud service requests.
    * @return The BaseUri value.
    */
    URI getBaseUri();
    
    /**
    * Gets subscription credentials which uniquely identify Microsoft Azure
    * subscription. The subscription ID forms part of the URI for every
    * service call.
    * @return The Credentials value.
    */
    SubscriptionCloudCredentials getCredentials();
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @return The LongRunningOperationInitialTimeout value.
    */
    int getLongRunningOperationInitialTimeout();
    
    /**
    * Gets or sets the initial timeout for Long Running Operations.
    * @param longRunningOperationInitialTimeoutValue The
    * LongRunningOperationInitialTimeout value.
    */
    void setLongRunningOperationInitialTimeout(final int longRunningOperationInitialTimeoutValue);
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @return The LongRunningOperationRetryTimeout value.
    */
    int getLongRunningOperationRetryTimeout();
    
    /**
    * Gets or sets the retry timeout for Long Running Operations.
    * @param longRunningOperationRetryTimeoutValue The
    * LongRunningOperationRetryTimeout value.
    */
    void setLongRunningOperationRetryTimeout(final int longRunningOperationRetryTimeoutValue);
    /**
    * Represents all the operations for operating on Azure SQL Databases.
    * Contains operations to: Create, Retrieve, Update, and Delete databases,
    * and also includes the ability to get the event logs for a database.
    * @return The DatabasesOperations value.
    */
    DatabaseOperations getDatabasesOperations();
    
    /**
    * Represents all the operations for operating on Azure SQL Database Server
    * Firewall Rules.  Contains operations to: Create, Retrieve, Update, and
    * Delete firewall rules.
    * @return The FirewallRulesOperations value.
    */
    FirewallRuleOperations getFirewallRulesOperations();
    
    /**
    * Represents all the operations for operating on Azure SQL Database
    * security policy.  Contains operations to: Retrieve and Update security
    * policy
    * @return The DatabaseSecurityOperations value.
    */
    SecurityOperations getDatabaseSecurityOperations();
    
    /**
    * Represents all the operations for operating on Azure SQL Database
    * Servers.  Contains operations to: Create, Retrieve, Update, and Delete
    * servers.
    * @return The ServersOperations value.
    */
    ServerOperations getServersOperations();
}
