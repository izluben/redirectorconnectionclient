/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  5:58 PM
 */
package com.comcast.redirector.connectionclient;

public class RegistrationInfo {

    private ServiceInstanceInfo serviceInstanceInfo;
    private ConnectionMode connectionMode;
    private long registrationId;

    public RegistrationInfo(ServiceInstanceInfo serviceInstanceInfo, ConnectionMode connectionMode, long registrationId) {
        this.serviceInstanceInfo = serviceInstanceInfo;
        this.connectionMode = connectionMode;
        this.registrationId = registrationId;
    }

    public ServiceInstanceInfo getServiceInstanceInfo() {
        return serviceInstanceInfo;
    }

    public void setServiceInstanceInfo(ServiceInstanceInfo serviceInstanceInfo) {
        this.serviceInstanceInfo = serviceInstanceInfo;
    }

    public ConnectionMode getConnectionMode() {
        return connectionMode;
    }

    public void setConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode;
    }

    public long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(long registrationId) {
        this.registrationId = registrationId;
    }
}
