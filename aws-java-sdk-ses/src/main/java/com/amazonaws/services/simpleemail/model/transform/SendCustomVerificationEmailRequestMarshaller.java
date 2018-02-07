/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simpleemail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * SendCustomVerificationEmailRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendCustomVerificationEmailRequestMarshaller implements
        Marshaller<Request<SendCustomVerificationEmailRequest>, SendCustomVerificationEmailRequest> {

    public Request<SendCustomVerificationEmailRequest> marshall(SendCustomVerificationEmailRequest sendCustomVerificationEmailRequest) {

        if (sendCustomVerificationEmailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SendCustomVerificationEmailRequest> request = new DefaultRequest<SendCustomVerificationEmailRequest>(sendCustomVerificationEmailRequest,
                "AmazonSimpleEmailService");
        request.addParameter("Action", "SendCustomVerificationEmail");
        request.addParameter("Version", "2010-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (sendCustomVerificationEmailRequest.getEmailAddress() != null) {
            request.addParameter("EmailAddress", StringUtils.fromString(sendCustomVerificationEmailRequest.getEmailAddress()));
        }

        if (sendCustomVerificationEmailRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(sendCustomVerificationEmailRequest.getTemplateName()));
        }

        if (sendCustomVerificationEmailRequest.getConfigurationSetName() != null) {
            request.addParameter("ConfigurationSetName", StringUtils.fromString(sendCustomVerificationEmailRequest.getConfigurationSetName()));
        }

        return request;
    }

}
