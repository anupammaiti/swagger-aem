/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * OpenAPI spec version: 1.1.3
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.shinesolutions.swaggeraem4j.api;

import com.shinesolutions.swaggeraem4j.ApiException;
import java.io.File;
import java.math.BigDecimal;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SlingApi
 */
public class SlingApiTest {

    private final SlingApi api = new SlingApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        // api.deleteAgent(runmode, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNodeTest() throws ApiException {
        String path = null;
        String name = null;
        // api.deleteNode(path, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        // api.getAgent(runmode, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String path = null;
        String name = null;
        // api.getNode(path, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        // File response = api.getPackage(group, name, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPackageFilterTest() throws ApiException {
        String group = null;
        String name = null;
        String version = null;
        // String response = api.getPackageFilter(group, name, version);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAgentTest() throws ApiException {
        String runmode = null;
        String name = null;
        String jcrprimaryType = null;
        String jcrcontentcqname = null;
        String jcrcontentjcrtitle = null;
        String jcrcontentjcrdescription = null;
        String jcrcontentslingresourceType = null;
        String jcrcontenttransportUri = null;
        String jcrcontenttransportUser = null;
        String jcrcontenttransportPassword = null;
        String jcrcontentlogLevel = null;
        Boolean jcrcontentnoVersioning = null;
        List<String> jcrcontentprotocolHTTPHeaders = null;
        String jcrcontentprotocolHTTPHeadersTypeHint = null;
        String jcrcontentprotocolHTTPMethod = null;
        String jcrcontentretryDelay = null;
        String jcrcontentserializationType = null;
        String jcrcontentjcrmixinTypes = null;
        Boolean jcrcontenttriggerReceive = null;
        Boolean jcrcontenttriggerSpecific = null;
        String jcrcontentcqtemplate = null;
        Boolean jcrcontentenabled = null;
        Boolean jcrcontentreverseReplication = null;
        // api.postAgent(runmode, name, jcrprimaryType, jcrcontentcqname, jcrcontentjcrtitle, jcrcontentjcrdescription, jcrcontentslingresourceType, jcrcontenttransportUri, jcrcontenttransportUser, jcrcontenttransportPassword, jcrcontentlogLevel, jcrcontentnoVersioning, jcrcontentprotocolHTTPHeaders, jcrcontentprotocolHTTPHeadersTypeHint, jcrcontentprotocolHTTPMethod, jcrcontentretryDelay, jcrcontentserializationType, jcrcontentjcrmixinTypes, jcrcontenttriggerReceive, jcrcontenttriggerSpecific, jcrcontentcqtemplate, jcrcontentenabled, jcrcontentreverseReplication);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAuthorizablesTest() throws ApiException {
        String authorizableId = null;
        String intermediatePath = null;
        String createUser = null;
        String createGroup = null;
        String reppassword = null;
        String profilegivenName = null;
        // String response = api.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, reppassword, profilegivenName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postConfigTest() throws ApiException {
        String runmode = null;
        String name = null;
        Boolean orgApacheFelixHttpsNio = null;
        String orgApacheFelixHttpsNioTypeHint = null;
        String orgApacheFelixHttpsKeystore = null;
        String orgApacheFelixHttpsKeystoreTypeHint = null;
        String orgApacheFelixHttpsKeystorePassword = null;
        String orgApacheFelixHttpsKeystorePasswordTypeHint = null;
        String orgApacheFelixHttpsKeystoreKey = null;
        String orgApacheFelixHttpsKeystoreKeyTypeHint = null;
        String orgApacheFelixHttpsKeystoreKeyPassword = null;
        String orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null;
        String orgApacheFelixHttpsTruststore = null;
        String orgApacheFelixHttpsTruststoreTypeHint = null;
        String orgApacheFelixHttpsTruststorePassword = null;
        String orgApacheFelixHttpsTruststorePasswordTypeHint = null;
        String orgApacheFelixHttpsClientcertificate = null;
        String orgApacheFelixHttpsClientcertificateTypeHint = null;
        String orgApacheFelixHttpsEnable = null;
        String orgApacheFelixHttpsEnableTypeHint = null;
        String orgOsgiServiceHttpPortSecure = null;
        String orgOsgiServiceHttpPortSecureTypeHint = null;
        // api.postConfig(runmode, name, orgApacheFelixHttpsNio, orgApacheFelixHttpsNioTypeHint, orgApacheFelixHttpsKeystore, orgApacheFelixHttpsKeystoreTypeHint, orgApacheFelixHttpsKeystorePassword, orgApacheFelixHttpsKeystorePasswordTypeHint, orgApacheFelixHttpsKeystoreKey, orgApacheFelixHttpsKeystoreKeyTypeHint, orgApacheFelixHttpsKeystoreKeyPassword, orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, orgApacheFelixHttpsTruststore, orgApacheFelixHttpsTruststoreTypeHint, orgApacheFelixHttpsTruststorePassword, orgApacheFelixHttpsTruststorePasswordTypeHint, orgApacheFelixHttpsClientcertificate, orgApacheFelixHttpsClientcertificateTypeHint, orgApacheFelixHttpsEnable, orgApacheFelixHttpsEnableTypeHint, orgOsgiServiceHttpPortSecure, orgOsgiServiceHttpPortSecureTypeHint);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postNodeRwTest() throws ApiException {
        String path = null;
        String name = null;
        String addMembers = null;
        // api.postNodeRw(path, name, addMembers);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postPathTest() throws ApiException {
        String path = null;
        String jcrprimaryType = null;
        String name = null;
        // api.postPath(path, jcrprimaryType, name);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postQueryTest() throws ApiException {
        String path = null;
        BigDecimal pLimit = null;
        String _1Property = null;
        String _1PropertyValue = null;
        // String response = api.postQuery(path, pLimit, _1Property, _1PropertyValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postTreeActivationTest() throws ApiException {
        Boolean ignoredeactivated = null;
        Boolean onlymodified = null;
        String path = null;
        // api.postTreeActivation(ignoredeactivated, onlymodified, path);

        // TODO: test validations
    }
    
}
