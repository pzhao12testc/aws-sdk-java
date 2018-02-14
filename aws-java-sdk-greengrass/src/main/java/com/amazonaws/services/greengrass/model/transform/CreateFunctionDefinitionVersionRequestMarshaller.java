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
package com.amazonaws.services.greengrass.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.greengrass.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateFunctionDefinitionVersionRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateFunctionDefinitionVersionRequestMarshaller {

    private static final MarshallingInfo<String> AMZNCLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.HEADER).marshallLocationName("X-Amzn-Client-Token").build();
    private static final MarshallingInfo<String> FUNCTIONDEFINITIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("FunctionDefinitionId").build();
    private static final MarshallingInfo<List> FUNCTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Functions").build();

    private static final CreateFunctionDefinitionVersionRequestMarshaller instance = new CreateFunctionDefinitionVersionRequestMarshaller();

    public static CreateFunctionDefinitionVersionRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateFunctionDefinitionVersionRequest createFunctionDefinitionVersionRequest, ProtocolMarshaller protocolMarshaller) {

        if (createFunctionDefinitionVersionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createFunctionDefinitionVersionRequest.getAmznClientToken(), AMZNCLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createFunctionDefinitionVersionRequest.getFunctionDefinitionId(), FUNCTIONDEFINITIONID_BINDING);
            protocolMarshaller.marshall(createFunctionDefinitionVersionRequest.getFunctions(), FUNCTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
