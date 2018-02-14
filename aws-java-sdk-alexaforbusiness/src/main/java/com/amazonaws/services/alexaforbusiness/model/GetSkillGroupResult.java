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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/GetSkillGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSkillGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     */
    private SkillGroup skillGroup;

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     * 
     * @param skillGroup
     *        The details of the skill group requested. Required.
     */

    public void setSkillGroup(SkillGroup skillGroup) {
        this.skillGroup = skillGroup;
    }

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     * 
     * @return The details of the skill group requested. Required.
     */

    public SkillGroup getSkillGroup() {
        return this.skillGroup;
    }

    /**
     * <p>
     * The details of the skill group requested. Required.
     * </p>
     * 
     * @param skillGroup
     *        The details of the skill group requested. Required.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSkillGroupResult withSkillGroup(SkillGroup skillGroup) {
        setSkillGroup(skillGroup);
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
        if (getSkillGroup() != null)
            sb.append("SkillGroup: ").append(getSkillGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSkillGroupResult == false)
            return false;
        GetSkillGroupResult other = (GetSkillGroupResult) obj;
        if (other.getSkillGroup() == null ^ this.getSkillGroup() == null)
            return false;
        if (other.getSkillGroup() != null && other.getSkillGroup().equals(this.getSkillGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSkillGroup() == null) ? 0 : getSkillGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetSkillGroupResult clone() {
        try {
            return (GetSkillGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
