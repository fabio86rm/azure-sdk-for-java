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

package com.microsoft.azure.management.websites.models;

/**
* Parameters supplied to the Create Web Site operation.
*/
public class WebSiteBaseProperties {
    private String serverFarm;
    
    /**
    * Required. The name of the Server Farm (Web Hosting Plan) associated with
    * this website.
    * @return The ServerFarm value.
    */
    public String getServerFarm() {
        return this.serverFarm;
    }
    
    /**
    * Required. The name of the Server Farm (Web Hosting Plan) associated with
    * this website.
    * @param serverFarmValue The ServerFarm value.
    */
    public void setServerFarm(final String serverFarmValue) {
        this.serverFarm = serverFarmValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteBaseProperties class.
    *
    */
    public WebSiteBaseProperties() {
    }
    
    /**
    * Initializes a new instance of the WebSiteBaseProperties class with
    * required arguments.
    *
    */
    public WebSiteBaseProperties(String serverFarm) {
        if (serverFarm == null) {
            throw new NullPointerException("serverFarm");
        }
        this.setServerFarm(serverFarm);
    }
}
