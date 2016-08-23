// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201601.express;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "PromotionService", targetNamespace = "https://adwords.google.com/api/adwords/express/v201601", wsdlLocation = "https://adwords.google.com/api/adwords/express/v201601/PromotionService?wsdl")
public class PromotionService
    extends Service
{

    private final static URL PROMOTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROMOTIONSERVICE_EXCEPTION;
    private final static QName PROMOTIONSERVICE_QNAME = new QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://adwords.google.com/api/adwords/express/v201601/PromotionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROMOTIONSERVICE_WSDL_LOCATION = url;
        PROMOTIONSERVICE_EXCEPTION = e;
    }

    public PromotionService() {
        super(__getWsdlLocation(), PROMOTIONSERVICE_QNAME);
    }

    public PromotionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns PromotionServiceInterface
     */
    @WebEndpoint(name = "PromotionServiceInterfacePort")
    public PromotionServiceInterface getPromotionServiceInterfacePort() {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionServiceInterfacePort"), PromotionServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PromotionServiceInterface
     */
    @WebEndpoint(name = "PromotionServiceInterfacePort")
    public PromotionServiceInterface getPromotionServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://adwords.google.com/api/adwords/express/v201601", "PromotionServiceInterfacePort"), PromotionServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROMOTIONSERVICE_EXCEPTION!= null) {
            throw PROMOTIONSERVICE_EXCEPTION;
        }
        return PROMOTIONSERVICE_WSDL_LOCATION;
    }

}