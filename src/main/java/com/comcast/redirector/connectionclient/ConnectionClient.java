/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  4:21 PM
 */
package com.comcast.redirector.connectionclient;

import com.comcast.redirector.connectionclient.config.ConnectionClientConfig;
import com.comcast.redirector.httpclient.SimpleHttpClient;

import java.util.concurrent.ExecutorService;

import static com.comcast.redirector.httpclient.SimpleHttpClient.ContentType.*;

public class ConnectionClient {

    private final ServiceInstanceInfo serviceInstanceInfo;

    private final ConnectionClientConfig config;
    private final ExecutorService executorService;
    private final SimpleHttpClient simpleHttpClient;
    private RegistrationInfo registrationInfo;

    public ConnectionClient(ServiceInstanceInfo serviceInstanceInfo, ExecutorService executorService, ConnectionClientConfig config) {
        this.serviceInstanceInfo = serviceInstanceInfo;
        this.executorService = executorService;
        this.config = config;

        simpleHttpClient = new SimpleHttpClient(config.getConnectionServiceBaseUri());
    }

    public void advertiseAvailability() {
        registrationInfo = new RegistrationInfo(serviceInstanceInfo, config.getConnectionMode(), System.nanoTime());
        try {
            simpleHttpClient.doPost(registrationInfo, JSON, config.getRegistrationEndpoint());
        } catch (Exception e) {
            //doing retry here
        }
    }

    public void deadvertiseAvailability() {
        try {
            simpleHttpClient.doPost(registrationInfo.getRegistrationId(), PLAIN_TEXT, config.getDeregistrationEndpoint());
        } catch (Exception e) {
            //doing retry here
        }
    }


}
