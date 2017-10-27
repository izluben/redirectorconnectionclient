/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  6:05 PM
 */
package com.comcast.redirector.httpclient;

import com.comcast.redirector.connectionclient.ConnectionMode;
import com.comcast.redirector.connectionclient.RegistrationInfo;
import com.comcast.redirector.connectionclient.ServiceInstanceInfo;
import org.junit.Test;

public class SimpleHttpClientTest {

    @Test
    public void testDoPost() throws Exception {
        SimpleHttpClient simpleHttpClient = new SimpleHttpClient("http://localhost:10540/redirectorWebService/data/rules");
        ServiceInstanceInfo serviceInstanceInfo = new ServiceInstanceInfo.ServiceInstanceInfoBuilder()
                .withApplication("xreGuide")
                .withAvailabilityZone("po")
                .withDataCenter("po7")
                .withFlavor("1.43")
                .withPort(8080).build();
        ConnectionMode connectionMode = ConnectionMode.DYNAMIC;
        long uniqueId = System.nanoTime();
        RegistrationInfo registrationInfo = new RegistrationInfo(serviceInstanceInfo, connectionMode, uniqueId);

        simpleHttpClient.doPost(registrationInfo, "/testFasterJson");
    }
}
