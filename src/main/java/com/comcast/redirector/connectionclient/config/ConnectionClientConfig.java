/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  5:49 PM
 */
package com.comcast.redirector.connectionclient.config;

import com.comcast.redirector.connectionclient.ConnectionMode;

public class ConnectionClientConfig {

    private ConnectionMode connectionMode;
    private int heartBeatPeriodSeconds;
    private String connectionServiceBaseUri;
    private String registrationEndpoint;
    private String deregistrationEndpoint;
    private String heartBeatEndpoint;

    public ConnectionMode getConnectionMode() {
        return connectionMode;
    }

    public void setConnectionMode(ConnectionMode connectionMode) {
        this.connectionMode = connectionMode;
    }

    public int getHeartBeatPeriodSeconds() {
        return heartBeatPeriodSeconds;
    }

    public void setHeartBeatPeriodSeconds(int heartBeatPeriodSeconds) {
        this.heartBeatPeriodSeconds = heartBeatPeriodSeconds;
    }

    public String getConnectionServiceBaseUri() {
        return connectionServiceBaseUri;
    }

    public void setConnectionServiceBaseUri(String connectionServiceBaseUri) {
        this.connectionServiceBaseUri = connectionServiceBaseUri;
    }

    public String getRegistrationEndpoint() {
        return registrationEndpoint;
    }

    public void setRegistrationEndpoint(String registrationEndpoint) {
        this.registrationEndpoint = registrationEndpoint;
    }

    public String getDeregistrationEndpoint() {
        return deregistrationEndpoint;
    }

    public void setDeregistrationEndpoint(String deregistrationEndpoint) {
        this.deregistrationEndpoint = deregistrationEndpoint;
    }

    public String getHeartBeatEndpoint() {
        return heartBeatEndpoint;
    }

    public void setHeartBeatEndpoint(String heartBeatEndpoint) {
        this.heartBeatEndpoint = heartBeatEndpoint;
    }
}
