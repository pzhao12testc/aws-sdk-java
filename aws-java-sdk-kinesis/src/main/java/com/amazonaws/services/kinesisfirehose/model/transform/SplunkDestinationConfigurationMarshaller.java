/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisfirehose.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SplunkDestinationConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SplunkDestinationConfigurationMarshaller {

    private static final MarshallingInfo<String> HECENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HECEndpoint").build();
    private static final MarshallingInfo<String> HECENDPOINTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HECEndpointType").build();
    private static final MarshallingInfo<String> HECTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("HECToken").build();
    private static final MarshallingInfo<Integer> HECACKNOWLEDGMENTTIMEOUTINSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HECAcknowledgmentTimeoutInSeconds").build();
    private static final MarshallingInfo<StructuredPojo> RETRYOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetryOptions").build();
    private static final MarshallingInfo<String> S3BACKUPMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BackupMode").build();
    private static final MarshallingInfo<StructuredPojo> S3CONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Configuration").build();
    private static final MarshallingInfo<StructuredPojo> PROCESSINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProcessingConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> CLOUDWATCHLOGGINGOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CloudWatchLoggingOptions").build();

    private static final SplunkDestinationConfigurationMarshaller instance = new SplunkDestinationConfigurationMarshaller();

    public static SplunkDestinationConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SplunkDestinationConfiguration splunkDestinationConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (splunkDestinationConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(splunkDestinationConfiguration.getHECEndpoint(), HECENDPOINT_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getHECEndpointType(), HECENDPOINTTYPE_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getHECToken(), HECTOKEN_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getHECAcknowledgmentTimeoutInSeconds(), HECACKNOWLEDGMENTTIMEOUTINSECONDS_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getRetryOptions(), RETRYOPTIONS_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getS3BackupMode(), S3BACKUPMODE_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getS3Configuration(), S3CONFIGURATION_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getProcessingConfiguration(), PROCESSINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(splunkDestinationConfiguration.getCloudWatchLoggingOptions(), CLOUDWATCHLOGGINGOPTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
