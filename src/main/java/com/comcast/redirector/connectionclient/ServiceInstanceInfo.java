/* ===========================================================================
 * Copyright (c) 2017 Comcast Corp. All rights reserved.
 * ===========================================================================
 *
 * Author: Stanislav Menshykov
 * Created: 10/27/2017  4:25 PM
 */
package com.comcast.redirector.connectionclient;

import java.util.Map;

public class ServiceInstanceInfo {

    private String dataCenter;

    private String availabilityZone;

    private String flavor;

    private String listenAddress;

    private String application;

    private Integer port;

    private Map<String, String> parameters;

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getListenAddress() {
        return listenAddress;
    }

    public void setListenAddress(String listenAddress) {
        this.listenAddress = listenAddress;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public ServiceInstanceInfo(ServiceInstanceInfoBuilder builder) {
        this.dataCenter = builder.dataCenter;
        this.availabilityZone = builder.availabilityZone;
        this.flavor = builder.flavor;
        this.listenAddress = builder.listenAddress;
        this.application = builder.application;
        this.port = builder.port;
        this.parameters = builder.parameters;
    }

    public static class ServiceInstanceInfoBuilder {
        private String dataCenter;

        private String availabilityZone;

        private String flavor;

        private String listenAddress;

        private String application;

        private Integer port;

        private Map<String, String> parameters;

        public ServiceInstanceInfoBuilder withDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }

        public ServiceInstanceInfoBuilder withAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public ServiceInstanceInfoBuilder withFlavor(String flavor) {
            this.flavor = flavor;
            return this;
        }

        public ServiceInstanceInfoBuilder withListenAddress(String listenAddress) {
            this.listenAddress = listenAddress;
            return this;
        }

        public ServiceInstanceInfoBuilder withApplication(String application) {
            this.application = application;
            return this;
        }

        public ServiceInstanceInfoBuilder withPort(Integer port) {
            this.port = port;
            return this;
        }

        public ServiceInstanceInfoBuilder withParameters(Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public ServiceInstanceInfo build() {
            return new ServiceInstanceInfo(this);
        }
    }
}
