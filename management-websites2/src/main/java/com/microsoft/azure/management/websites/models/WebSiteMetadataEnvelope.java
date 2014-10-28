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

import com.microsoft.windowsazure.core.LazyArrayList;
import java.util.ArrayList;

/**
* List of metadata for the website.
*/
public class WebSiteMetadataEnvelope extends ResourceBase {
    private ArrayList<NameValuePair> properties;
    
    /**
    * Optional. Metadata configuration for a web site.
    * @return The Properties value.
    */
    public ArrayList<NameValuePair> getProperties() {
        return this.properties;
    }
    
    /**
    * Optional. Metadata configuration for a web site.
    * @param propertiesValue The Properties value.
    */
    public void setProperties(final ArrayList<NameValuePair> propertiesValue) {
        this.properties = propertiesValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteMetadataEnvelope class.
    *
    */
    public WebSiteMetadataEnvelope() {
        super();
        this.setProperties(new LazyArrayList<NameValuePair>());
    }
    
    /**
    * Initializes a new instance of the WebSiteMetadataEnvelope class with
    * required arguments.
    *
    */
    public WebSiteMetadataEnvelope(String location) {
        this();
        if (location == null) {
            throw new NullPointerException("location");
        }
        this.setLocation(location);
    }
}
