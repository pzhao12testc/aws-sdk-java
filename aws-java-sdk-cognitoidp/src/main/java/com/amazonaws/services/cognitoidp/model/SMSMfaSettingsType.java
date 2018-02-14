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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SMS multi-factor authentication (MFA) settings type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/SMSMfaSettingsType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSMfaSettingsType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether SMS text message MFA is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The preferred MFA method.
     * </p>
     */
    private Boolean preferredMfa;

    /**
     * <p>
     * Specifies whether SMS text message MFA is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether SMS text message MFA is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether SMS text message MFA is enabled.
     * </p>
     * 
     * @return Specifies whether SMS text message MFA is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether SMS text message MFA is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether SMS text message MFA is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMfaSettingsType withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether SMS text message MFA is enabled.
     * </p>
     * 
     * @return Specifies whether SMS text message MFA is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The preferred MFA method.
     * </p>
     * 
     * @param preferredMfa
     *        The preferred MFA method.
     */

    public void setPreferredMfa(Boolean preferredMfa) {
        this.preferredMfa = preferredMfa;
    }

    /**
     * <p>
     * The preferred MFA method.
     * </p>
     * 
     * @return The preferred MFA method.
     */

    public Boolean getPreferredMfa() {
        return this.preferredMfa;
    }

    /**
     * <p>
     * The preferred MFA method.
     * </p>
     * 
     * @param preferredMfa
     *        The preferred MFA method.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSMfaSettingsType withPreferredMfa(Boolean preferredMfa) {
        setPreferredMfa(preferredMfa);
        return this;
    }

    /**
     * <p>
     * The preferred MFA method.
     * </p>
     * 
     * @return The preferred MFA method.
     */

    public Boolean isPreferredMfa() {
        return this.preferredMfa;
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPreferredMfa() != null)
            sb.append("PreferredMfa: ").append(getPreferredMfa());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSMfaSettingsType == false)
            return false;
        SMSMfaSettingsType other = (SMSMfaSettingsType) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPreferredMfa() == null ^ this.getPreferredMfa() == null)
            return false;
        if (other.getPreferredMfa() != null && other.getPreferredMfa().equals(this.getPreferredMfa()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPreferredMfa() == null) ? 0 : getPreferredMfa().hashCode());
        return hashCode;
    }

    @Override
    public SMSMfaSettingsType clone() {
        try {
            return (SMSMfaSettingsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.SMSMfaSettingsTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
