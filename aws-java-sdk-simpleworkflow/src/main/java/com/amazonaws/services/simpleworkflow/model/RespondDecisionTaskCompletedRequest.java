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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input data for a TaskCompleted response to a decision task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondDecisionTaskCompleted" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RespondDecisionTaskCompletedRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     */
    private String taskToken;
    /**
     * <p>
     * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for
     * the <a>Decision</a> structure for details.
     * </p>
     */
    private java.util.List<Decision> decisions;
    /**
     * <p>
     * User defined context to add to workflow execution.
     * </p>
     */
    private String executionContext;

    /**
     * <p>
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> from the <a>DecisionTask</a>.</p> <important>
     *        <p>
     *        <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *        is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *        its progress and respond with results.
     *        </p>
     */

    public void setTaskToken(String taskToken) {
        this.taskToken = taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @return The <code>taskToken</code> from the <a>DecisionTask</a>.</p> <important>
     *         <p>
     *         <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *         is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *         its progress and respond with results.
     *         </p>
     */

    public String getTaskToken() {
        return this.taskToken;
    }

    /**
     * <p>
     * The <code>taskToken</code> from the <a>DecisionTask</a>.
     * </p>
     * <important>
     * <p>
     * <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task is
     * passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide its
     * progress and respond with results.
     * </p>
     * </important>
     * 
     * @param taskToken
     *        The <code>taskToken</code> from the <a>DecisionTask</a>.</p> <important>
     *        <p>
     *        <code>taskToken</code> is generated by the service and should be treated as an opaque value. If the task
     *        is passed to another process, its <code>taskToken</code> must also be passed. This enables it to provide
     *        its progress and respond with results.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondDecisionTaskCompletedRequest withTaskToken(String taskToken) {
        setTaskToken(taskToken);
        return this;
    }

    /**
     * <p>
     * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for
     * the <a>Decision</a> structure for details.
     * </p>
     * 
     * @return The list of decisions (possibly empty) made by the decider while processing this decision task. See the
     *         docs for the <a>Decision</a> structure for details.
     */

    public java.util.List<Decision> getDecisions() {
        return decisions;
    }

    /**
     * <p>
     * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for
     * the <a>Decision</a> structure for details.
     * </p>
     * 
     * @param decisions
     *        The list of decisions (possibly empty) made by the decider while processing this decision task. See the
     *        docs for the <a>Decision</a> structure for details.
     */

    public void setDecisions(java.util.Collection<Decision> decisions) {
        if (decisions == null) {
            this.decisions = null;
            return;
        }

        this.decisions = new java.util.ArrayList<Decision>(decisions);
    }

    /**
     * <p>
     * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for
     * the <a>Decision</a> structure for details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDecisions(java.util.Collection)} or {@link #withDecisions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param decisions
     *        The list of decisions (possibly empty) made by the decider while processing this decision task. See the
     *        docs for the <a>Decision</a> structure for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondDecisionTaskCompletedRequest withDecisions(Decision... decisions) {
        if (this.decisions == null) {
            setDecisions(new java.util.ArrayList<Decision>(decisions.length));
        }
        for (Decision ele : decisions) {
            this.decisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for
     * the <a>Decision</a> structure for details.
     * </p>
     * 
     * @param decisions
     *        The list of decisions (possibly empty) made by the decider while processing this decision task. See the
     *        docs for the <a>Decision</a> structure for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondDecisionTaskCompletedRequest withDecisions(java.util.Collection<Decision> decisions) {
        setDecisions(decisions);
        return this;
    }

    /**
     * <p>
     * User defined context to add to workflow execution.
     * </p>
     * 
     * @param executionContext
     *        User defined context to add to workflow execution.
     */

    public void setExecutionContext(String executionContext) {
        this.executionContext = executionContext;
    }

    /**
     * <p>
     * User defined context to add to workflow execution.
     * </p>
     * 
     * @return User defined context to add to workflow execution.
     */

    public String getExecutionContext() {
        return this.executionContext;
    }

    /**
     * <p>
     * User defined context to add to workflow execution.
     * </p>
     * 
     * @param executionContext
     *        User defined context to add to workflow execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RespondDecisionTaskCompletedRequest withExecutionContext(String executionContext) {
        setExecutionContext(executionContext);
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
        if (getTaskToken() != null)
            sb.append("TaskToken: ").append(getTaskToken()).append(",");
        if (getDecisions() != null)
            sb.append("Decisions: ").append(getDecisions()).append(",");
        if (getExecutionContext() != null)
            sb.append("ExecutionContext: ").append(getExecutionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RespondDecisionTaskCompletedRequest == false)
            return false;
        RespondDecisionTaskCompletedRequest other = (RespondDecisionTaskCompletedRequest) obj;
        if (other.getTaskToken() == null ^ this.getTaskToken() == null)
            return false;
        if (other.getTaskToken() != null && other.getTaskToken().equals(this.getTaskToken()) == false)
            return false;
        if (other.getDecisions() == null ^ this.getDecisions() == null)
            return false;
        if (other.getDecisions() != null && other.getDecisions().equals(this.getDecisions()) == false)
            return false;
        if (other.getExecutionContext() == null ^ this.getExecutionContext() == null)
            return false;
        if (other.getExecutionContext() != null && other.getExecutionContext().equals(this.getExecutionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskToken() == null) ? 0 : getTaskToken().hashCode());
        hashCode = prime * hashCode + ((getDecisions() == null) ? 0 : getDecisions().hashCode());
        hashCode = prime * hashCode + ((getExecutionContext() == null) ? 0 : getExecutionContext().hashCode());
        return hashCode;
    }

    @Override
    public RespondDecisionTaskCompletedRequest clone() {
        return (RespondDecisionTaskCompletedRequest) super.clone();
    }

}
