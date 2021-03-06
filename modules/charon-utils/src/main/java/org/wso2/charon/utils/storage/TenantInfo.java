/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.charon.utils.storage;

import org.wso2.charon.core.extensions.TenantDTO;

public class TenantInfo implements TenantDTO{

    private String tenantAdminUserName;
    private String tenantAdminPassword;
    private String tenantDomain;
    private String authenticationMechanism;

    public String getTenantAdminUserName() {
        return tenantAdminUserName;
    }

    public void setTenantAdminUserName(String tenantAdminUserName) {
        this.tenantAdminUserName = tenantAdminUserName;
    }

    public String getTenantAdminPassword() {
        return tenantAdminPassword;
    }

    public void setTenantAdminPassword(String tenantAdminPassword) {
        this.tenantAdminPassword = tenantAdminPassword;
    }

    public String getTenantDomain() {
        return tenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {
        this.tenantDomain = tenantDomain;
    }

    public String getAuthenticationMechanism() {
        return authenticationMechanism;
    }

    public void setAuthenticationMechanism(String authenticationMechanism) {
        this.authenticationMechanism = authenticationMechanism;
    }

}
