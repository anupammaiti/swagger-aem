# NodeSwaggerAem.SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config.{runmode}/org.apache.felix.http | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config.{runmode}/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config.{runmode}/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config.{runmode}/org.apache.sling.security.impl.ReferrerFilter | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 


<a name="deleteAgent"></a>
# **deleteAgent**
> deleteAgent(runmode, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteAgent(runmode, name, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="deleteNode"></a>
# **deleteNode**
> deleteNode(path, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteNode(path, name, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAgent"></a>
# **getAgent**
> getAgent(runmode, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.getAgent(runmode, name, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAgents"></a>
# **getAgents**
> &#39;String&#39; getAgents(runmode)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAgents(runmode, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNode"></a>
# **getNode**
> getNode(path, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.getNode(path, name, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getPackage"></a>
# **getPackage**
> File getPackage(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var group = "group_example"; // String | 

var name = "name_example"; // String | 

var version = "version_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPackage(group, name, version, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**File**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getPackageFilter"></a>
# **getPackageFilter**
> &#39;String&#39; getPackageFilter(group, name, version)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var group = "group_example"; // String | 

var name = "name_example"; // String | 

var version = "version_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPackageFilter(group, name, version, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  | 
 **name** | **String**|  | 
 **version** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getQuery"></a>
# **getQuery**
> &#39;String&#39; getQuery(path, pLimit, _1Property, _1PropertyValue)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var pLimit = 8.14; // Number | 

var _1Property = "_1Property_example"; // String | 

var _1PropertyValue = "_1PropertyValue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getQuery(path, pLimit, _1Property, _1PropertyValue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **Number**|  | 
 **_1Property** | **String**|  | 
 **_1PropertyValue** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postAgent"></a>
# **postAgent**
> postAgent(runmode, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var name = "name_example"; // String | 

var opts = { 
  'jcrcontentcqdistribute': true, // Boolean | 
  'jcrcontentcqdistributeTypeHint': "jcrcontentcqdistributeTypeHint_example", // String | 
  'jcrcontentcqname': "jcrcontentcqname_example", // String | 
  'jcrcontentcqtemplate': "jcrcontentcqtemplate_example", // String | 
  'jcrcontentenabled': true, // Boolean | 
  'jcrcontentjcrdescription': "jcrcontentjcrdescription_example", // String | 
  'jcrcontentjcrlastModified': "jcrcontentjcrlastModified_example", // String | 
  'jcrcontentjcrlastModifiedBy': "jcrcontentjcrlastModifiedBy_example", // String | 
  'jcrcontentjcrmixinTypes': "jcrcontentjcrmixinTypes_example", // String | 
  'jcrcontentjcrtitle': "jcrcontentjcrtitle_example", // String | 
  'jcrcontentlogLevel': "jcrcontentlogLevel_example", // String | 
  'jcrcontentnoStatusUpdate': true, // Boolean | 
  'jcrcontentnoVersioning': true, // Boolean | 
  'jcrcontentprotocolConnectTimeout': 8.14, // Number | 
  'jcrcontentprotocolHTTPConnectionClosed': true, // Boolean | 
  'jcrcontentprotocolHTTPExpired': "jcrcontentprotocolHTTPExpired_example", // String | 
  'jcrcontentprotocolHTTPHeaders': ["jcrcontentprotocolHTTPHeaders_example"], // [String] | 
  'jcrcontentprotocolHTTPHeadersTypeHint': "jcrcontentprotocolHTTPHeadersTypeHint_example", // String | 
  'jcrcontentprotocolHTTPMethod': "jcrcontentprotocolHTTPMethod_example", // String | 
  'jcrcontentprotocolHTTPSRelaxed': true, // Boolean | 
  'jcrcontentprotocolInterface': "jcrcontentprotocolInterface_example", // String | 
  'jcrcontentprotocolSocketTimeout': 8.14, // Number | 
  'jcrcontentprotocolVersion': "jcrcontentprotocolVersion_example", // String | 
  'jcrcontentproxyNTLMDomain': "jcrcontentproxyNTLMDomain_example", // String | 
  'jcrcontentproxyNTLMHost': "jcrcontentproxyNTLMHost_example", // String | 
  'jcrcontentproxyHost': "jcrcontentproxyHost_example", // String | 
  'jcrcontentproxyPassword': "jcrcontentproxyPassword_example", // String | 
  'jcrcontentproxyPort': 8.14, // Number | 
  'jcrcontentproxyUser': "jcrcontentproxyUser_example", // String | 
  'jcrcontentqueueBatchMaxSize': 8.14, // Number | 
  'jcrcontentqueueBatchMode': "jcrcontentqueueBatchMode_example", // String | 
  'jcrcontentqueueBatchWaitTime': 8.14, // Number | 
  'jcrcontentretryDelay': "jcrcontentretryDelay_example", // String | 
  'jcrcontentreverseReplication': true, // Boolean | 
  'jcrcontentserializationType': "jcrcontentserializationType_example", // String | 
  'jcrcontentslingresourceType': "jcrcontentslingresourceType_example", // String | 
  'jcrcontentssl': "jcrcontentssl_example", // String | 
  'jcrcontenttransportNTLMDomain': "jcrcontenttransportNTLMDomain_example", // String | 
  'jcrcontenttransportNTLMHost': "jcrcontenttransportNTLMHost_example", // String | 
  'jcrcontenttransportPassword': "jcrcontenttransportPassword_example", // String | 
  'jcrcontenttransportUri': "jcrcontenttransportUri_example", // String | 
  'jcrcontenttransportUser': "jcrcontenttransportUser_example", // String | 
  'jcrcontenttriggerDistribute': true, // Boolean | 
  'jcrcontenttriggerModified': true, // Boolean | 
  'jcrcontenttriggerOnOffTime': true, // Boolean | 
  'jcrcontenttriggerReceive': true, // Boolean | 
  'jcrcontenttriggerSpecific': true, // Boolean | 
  'jcrcontentuserId': "jcrcontentuserId_example", // String | 
  'jcrprimaryType': "jcrprimaryType_example", // String | 
  'operation': "operation_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postAgent(runmode, name, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcrcontentcqdistribute** | **Boolean**|  | [optional] 
 **jcrcontentcqdistributeTypeHint** | **String**|  | [optional] 
 **jcrcontentcqname** | **String**|  | [optional] 
 **jcrcontentcqtemplate** | **String**|  | [optional] 
 **jcrcontentenabled** | **Boolean**|  | [optional] 
 **jcrcontentjcrdescription** | **String**|  | [optional] 
 **jcrcontentjcrlastModified** | **String**|  | [optional] 
 **jcrcontentjcrlastModifiedBy** | **String**|  | [optional] 
 **jcrcontentjcrmixinTypes** | **String**|  | [optional] 
 **jcrcontentjcrtitle** | **String**|  | [optional] 
 **jcrcontentlogLevel** | **String**|  | [optional] 
 **jcrcontentnoStatusUpdate** | **Boolean**|  | [optional] 
 **jcrcontentnoVersioning** | **Boolean**|  | [optional] 
 **jcrcontentprotocolConnectTimeout** | **Number**|  | [optional] 
 **jcrcontentprotocolHTTPConnectionClosed** | **Boolean**|  | [optional] 
 **jcrcontentprotocolHTTPExpired** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPHeaders** | [**[String]**](String.md)|  | [optional] 
 **jcrcontentprotocolHTTPHeadersTypeHint** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPMethod** | **String**|  | [optional] 
 **jcrcontentprotocolHTTPSRelaxed** | **Boolean**|  | [optional] 
 **jcrcontentprotocolInterface** | **String**|  | [optional] 
 **jcrcontentprotocolSocketTimeout** | **Number**|  | [optional] 
 **jcrcontentprotocolVersion** | **String**|  | [optional] 
 **jcrcontentproxyNTLMDomain** | **String**|  | [optional] 
 **jcrcontentproxyNTLMHost** | **String**|  | [optional] 
 **jcrcontentproxyHost** | **String**|  | [optional] 
 **jcrcontentproxyPassword** | **String**|  | [optional] 
 **jcrcontentproxyPort** | **Number**|  | [optional] 
 **jcrcontentproxyUser** | **String**|  | [optional] 
 **jcrcontentqueueBatchMaxSize** | **Number**|  | [optional] 
 **jcrcontentqueueBatchMode** | **String**|  | [optional] 
 **jcrcontentqueueBatchWaitTime** | **Number**|  | [optional] 
 **jcrcontentretryDelay** | **String**|  | [optional] 
 **jcrcontentreverseReplication** | **Boolean**|  | [optional] 
 **jcrcontentserializationType** | **String**|  | [optional] 
 **jcrcontentslingresourceType** | **String**|  | [optional] 
 **jcrcontentssl** | **String**|  | [optional] 
 **jcrcontenttransportNTLMDomain** | **String**|  | [optional] 
 **jcrcontenttransportNTLMHost** | **String**|  | [optional] 
 **jcrcontenttransportPassword** | **String**|  | [optional] 
 **jcrcontenttransportUri** | **String**|  | [optional] 
 **jcrcontenttransportUser** | **String**|  | [optional] 
 **jcrcontenttriggerDistribute** | **Boolean**|  | [optional] 
 **jcrcontenttriggerModified** | **Boolean**|  | [optional] 
 **jcrcontenttriggerOnOffTime** | **Boolean**|  | [optional] 
 **jcrcontenttriggerReceive** | **Boolean**|  | [optional] 
 **jcrcontenttriggerSpecific** | **Boolean**|  | [optional] 
 **jcrcontentuserId** | **String**|  | [optional] 
 **jcrprimaryType** | **String**|  | [optional] 
 **operation** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postAuthorizables"></a>
# **postAuthorizables**
> &#39;String&#39; postAuthorizables(authorizableId, intermediatePath, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var authorizableId = "authorizableId_example"; // String | 

var intermediatePath = "intermediatePath_example"; // String | 

var opts = { 
  'createUser': "createUser_example", // String | 
  'createGroup': "createGroup_example", // String | 
  'reppassword': "reppassword_example", // String | 
  'profilegivenName': "profilegivenName_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postAuthorizables(authorizableId, intermediatePath, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **String**|  | 
 **intermediatePath** | **String**|  | 
 **createUser** | **String**|  | [optional] 
 **createGroup** | **String**|  | [optional] 
 **reppassword** | **String**|  | [optional] 
 **profilegivenName** | **String**|  | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="postConfigApacheFelixJettyBasedHttpService"></a>
# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(runmode, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'orgApacheFelixHttpsNio': true, // Boolean | 
  'orgApacheFelixHttpsNioTypeHint': "orgApacheFelixHttpsNioTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystore': "orgApacheFelixHttpsKeystore_example", // String | 
  'orgApacheFelixHttpsKeystoreTypeHint': "orgApacheFelixHttpsKeystoreTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystorePassword': "orgApacheFelixHttpsKeystorePassword_example", // String | 
  'orgApacheFelixHttpsKeystorePasswordTypeHint': "orgApacheFelixHttpsKeystorePasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystoreKey': "orgApacheFelixHttpsKeystoreKey_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyTypeHint': "orgApacheFelixHttpsKeystoreKeyTypeHint_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyPassword': "orgApacheFelixHttpsKeystoreKeyPassword_example", // String | 
  'orgApacheFelixHttpsKeystoreKeyPasswordTypeHint': "orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsTruststore': "orgApacheFelixHttpsTruststore_example", // String | 
  'orgApacheFelixHttpsTruststoreTypeHint': "orgApacheFelixHttpsTruststoreTypeHint_example", // String | 
  'orgApacheFelixHttpsTruststorePassword': "orgApacheFelixHttpsTruststorePassword_example", // String | 
  'orgApacheFelixHttpsTruststorePasswordTypeHint': "orgApacheFelixHttpsTruststorePasswordTypeHint_example", // String | 
  'orgApacheFelixHttpsClientcertificate': "orgApacheFelixHttpsClientcertificate_example", // String | 
  'orgApacheFelixHttpsClientcertificateTypeHint': "orgApacheFelixHttpsClientcertificateTypeHint_example", // String | 
  'orgApacheFelixHttpsEnable': true, // Boolean | 
  'orgApacheFelixHttpsEnableTypeHint': "orgApacheFelixHttpsEnableTypeHint_example", // String | 
  'orgOsgiServiceHttpPortSecure': "orgOsgiServiceHttpPortSecure_example", // String | 
  'orgOsgiServiceHttpPortSecureTypeHint': "orgOsgiServiceHttpPortSecureTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheFelixJettyBasedHttpService(runmode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **orgApacheFelixHttpsNio** | **Boolean**|  | [optional] 
 **orgApacheFelixHttpsNioTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystore** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststore** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststoreTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **String**|  | [optional] 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **String**|  | [optional] 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **String**|  | [optional] 
 **orgApacheFelixHttpsEnable** | **Boolean**|  | [optional] 
 **orgApacheFelixHttpsEnableTypeHint** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **String**|  | [optional] 
 **orgOsgiServiceHttpPortSecureTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingDavExServlet"></a>
# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(runmode, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'alias': "alias_example", // String | 
  'aliasTypeHint': "aliasTypeHint_example", // String | 
  'davCreateAbsoluteUri': true, // Boolean | 
  'davCreateAbsoluteUriTypeHint': "davCreateAbsoluteUriTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingDavExServlet(runmode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **alias** | **String**|  | [optional] 
 **aliasTypeHint** | **String**|  | [optional] 
 **davCreateAbsoluteUri** | **Boolean**|  | [optional] 
 **davCreateAbsoluteUriTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingGetServlet"></a>
# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(runmode, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'jsonMaximumresults': "jsonMaximumresults_example", // String | 
  'jsonMaximumresultsTypeHint': "jsonMaximumresultsTypeHint_example", // String | 
  'enableHtml': true, // Boolean | 
  'enableHtmlTypeHint': "enableHtmlTypeHint_example", // String | 
  'enableTxt': true, // Boolean | 
  'enableTxtTypeHint': "enableTxtTypeHint_example", // String | 
  'enableXml': true, // Boolean | 
  'enableXmlTypeHint': "enableXmlTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingGetServlet(runmode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **jsonMaximumresults** | **String**|  | [optional] 
 **jsonMaximumresultsTypeHint** | **String**|  | [optional] 
 **enableHtml** | **Boolean**|  | [optional] 
 **enableHtmlTypeHint** | **String**|  | [optional] 
 **enableTxt** | **Boolean**|  | [optional] 
 **enableTxtTypeHint** | **String**|  | [optional] 
 **enableXml** | **Boolean**|  | [optional] 
 **enableXmlTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postConfigApacheSlingReferrerFilter"></a>
# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(runmode, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var runmode = "runmode_example"; // String | 

var opts = { 
  'allowEmpty': true, // Boolean | 
  'allowEmptyTypeHint': "allowEmptyTypeHint_example", // String | 
  'allowHosts': "allowHosts_example", // String | 
  'allowHostsTypeHint': "allowHostsTypeHint_example", // String | 
  'allowHostsRegexp': "allowHostsRegexp_example", // String | 
  'allowHostsRegexpTypeHint': "allowHostsRegexpTypeHint_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postConfigApacheSlingReferrerFilter(runmode, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **allowEmpty** | **Boolean**|  | [optional] 
 **allowEmptyTypeHint** | **String**|  | [optional] 
 **allowHosts** | **String**|  | [optional] 
 **allowHostsTypeHint** | **String**|  | [optional] 
 **allowHostsRegexp** | **String**|  | [optional] 
 **allowHostsRegexpTypeHint** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postNodeRw"></a>
# **postNodeRw**
> postNodeRw(path, name, opts)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var name = "name_example"; // String | 

var opts = { 
  'addMembers': "addMembers_example" // String | 
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postNodeRw(path, name, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **addMembers** | **String**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postPath"></a>
# **postPath**
> postPath(path, jcrprimaryType, name)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var jcrprimaryType = "jcrprimaryType_example"; // String | 

var name = "name_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postPath(path, jcrprimaryType, name, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **jcrprimaryType** | **String**|  | 
 **name** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="postQuery"></a>
# **postQuery**
> &#39;String&#39; postQuery(path, pLimit, _1Property, _1PropertyValue)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var path = "path_example"; // String | 

var pLimit = 8.14; // Number | 

var _1Property = "_1Property_example"; // String | 

var _1PropertyValue = "_1PropertyValue_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postQuery(path, pLimit, _1Property, _1PropertyValue, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **pLimit** | **Number**|  | 
 **_1Property** | **String**|  | 
 **_1PropertyValue** | **String**|  | 

### Return type

**&#39;String&#39;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postTreeActivation"></a>
# **postTreeActivation**
> postTreeActivation(ignoredeactivated, onlymodified, path)



### Example
```javascript
var NodeSwaggerAem = require('node-swagger-aem');
var defaultClient = NodeSwaggerAem.ApiClient.instance;

// Configure HTTP basic authorization: aemAuth
var aemAuth = defaultClient.authentications['aemAuth'];
aemAuth.username = 'YOUR USERNAME';
aemAuth.password = 'YOUR PASSWORD';

var apiInstance = new NodeSwaggerAem.SlingApi();

var ignoredeactivated = true; // Boolean | 

var onlymodified = true; // Boolean | 

var path = "path_example"; // String | 


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.postTreeActivation(ignoredeactivated, onlymodified, path, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **Boolean**|  | 
 **onlymodified** | **Boolean**|  | 
 **path** | **String**|  | 

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

