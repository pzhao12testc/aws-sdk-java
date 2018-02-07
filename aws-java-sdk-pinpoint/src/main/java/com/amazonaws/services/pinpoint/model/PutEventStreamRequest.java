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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/PutEventStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** ApplicationId */
    private String applicationId;
    /** EventStream to write. */
    private WriteEventStream writeEventStream;

    /**
     * ApplicationId
     * 
     * @param applicationId
     *        ApplicationId
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * ApplicationId
     * 
     * @return ApplicationId
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * ApplicationId
     * 
     * @param applicationId
     *        ApplicationId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventStreamRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * EventStream to write.
     * 
     * @param writeEventStream
     *        EventStream to write.
     */

    public void setWriteEventStream(WriteEventStream writeEventStream) {
        this.writeEventStream = writeEventStream;
    }

    /**
     * EventStream to write.
     * 
     * @return EventStream to write.
     */

    public WriteEventStream getWriteEventStream() {
        return this.writeEventStream;
    }

    /**
     * EventStream to write.
     * 
     * @param writeEventStream
     *        EventStream to write.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventStreamRequest withWriteEventStream(WriteEventStream writeEventStream) {
        setWriteEventStream(writeEventStream);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getWriteEventStream() != null)
            sb.append("WriteEventStream: ").append(getWriteEventStream());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventStreamRequest == false)
            return false;
        PutEventStreamRequest other = (PutEventStreamRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWriteEventStream() == null ^ this.getWriteEventStream() == null)
            return false;
        if (other.getWriteEventStream() != null && other.getWriteEventStream().equals(this.getWriteEventStream()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getWriteEventStream() == null) ? 0 : getWriteEventStream().hashCode());
        return hashCode;
    }

    @Override
    public PutEventStreamRequest clone() {
        return (PutEventStreamRequest) super.clone();
    }

}
