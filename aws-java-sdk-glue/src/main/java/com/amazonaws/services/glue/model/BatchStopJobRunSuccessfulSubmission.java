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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Records a successful request to stop a specified JobRun.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchStopJobRunSuccessfulSubmission"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchStopJobRunSuccessfulSubmission implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Name of the Job in question.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The JobRunId of the JobRun in question.
     * </p>
     */
    private String jobRunId;

    /**
     * <p>
     * The Name of the Job in question.
     * </p>
     * 
     * @param jobName
     *        The Name of the Job in question.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The Name of the Job in question.
     * </p>
     * 
     * @return The Name of the Job in question.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The Name of the Job in question.
     * </p>
     * 
     * @param jobName
     *        The Name of the Job in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunSuccessfulSubmission withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The JobRunId of the JobRun in question.
     * </p>
     * 
     * @param jobRunId
     *        The JobRunId of the JobRun in question.
     */

    public void setJobRunId(String jobRunId) {
        this.jobRunId = jobRunId;
    }

    /**
     * <p>
     * The JobRunId of the JobRun in question.
     * </p>
     * 
     * @return The JobRunId of the JobRun in question.
     */

    public String getJobRunId() {
        return this.jobRunId;
    }

    /**
     * <p>
     * The JobRunId of the JobRun in question.
     * </p>
     * 
     * @param jobRunId
     *        The JobRunId of the JobRun in question.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchStopJobRunSuccessfulSubmission withJobRunId(String jobRunId) {
        setJobRunId(jobRunId);
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
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobRunId() != null)
            sb.append("JobRunId: ").append(getJobRunId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchStopJobRunSuccessfulSubmission == false)
            return false;
        BatchStopJobRunSuccessfulSubmission other = (BatchStopJobRunSuccessfulSubmission) obj;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobRunId() == null ^ this.getJobRunId() == null)
            return false;
        if (other.getJobRunId() != null && other.getJobRunId().equals(this.getJobRunId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobRunId() == null) ? 0 : getJobRunId().hashCode());
        return hashCode;
    }

    @Override
    public BatchStopJobRunSuccessfulSubmission clone() {
        try {
            return (BatchStopJobRunSuccessfulSubmission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.BatchStopJobRunSuccessfulSubmissionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
