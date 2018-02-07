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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateIdentityProvider" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIdentityProviderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     */
    private IdentityProviderType identityProvider;

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     * 
     * @param identityProvider
     *        The newly created identity provider object.
     */

    public void setIdentityProvider(IdentityProviderType identityProvider) {
        this.identityProvider = identityProvider;
    }

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     * 
     * @return The newly created identity provider object.
     */

    public IdentityProviderType getIdentityProvider() {
        return this.identityProvider;
    }

    /**
     * <p>
     * The newly created identity provider object.
     * </p>
     * 
     * @param identityProvider
     *        The newly created identity provider object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateIdentityProviderResult withIdentityProvider(IdentityProviderType identityProvider) {
        setIdentityProvider(identityProvider);
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
        if (getIdentityProvider() != null)
            sb.append("IdentityProvider: ").append(getIdentityProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateIdentityProviderResult == false)
            return false;
        CreateIdentityProviderResult other = (CreateIdentityProviderResult) obj;
        if (other.getIdentityProvider() == null ^ this.getIdentityProvider() == null)
            return false;
        if (other.getIdentityProvider() != null && other.getIdentityProvider().equals(this.getIdentityProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityProvider() == null) ? 0 : getIdentityProvider().hashCode());
        return hashCode;
    }

    @Override
    public CreateIdentityProviderResult clone() {
        try {
            return (CreateIdentityProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
