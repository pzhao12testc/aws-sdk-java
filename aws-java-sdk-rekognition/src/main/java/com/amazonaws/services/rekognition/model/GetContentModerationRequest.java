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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContentModerationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Maximum number of content moderation labels to return. The default is 1000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code> to sort
     * array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by detection confidence. The default sort
     * is by <code>TIMESTAMP</code>.
     * </p>
     */
    private String sortBy;

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent
     *        call to <code>GetContentModeration</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     * 
     * @return The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent
     *         call to <code>GetContentModeration</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent call to
     * <code>GetContentModeration</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for the content moderation job. Use <code>JobId</code> to identify the job in a subsequent
     *        call to <code>GetContentModeration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Maximum number of content moderation labels to return. The default is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of content moderation labels to return. The default is 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of content moderation labels to return. The default is 1000.
     * </p>
     * 
     * @return Maximum number of content moderation labels to return. The default is 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of content moderation labels to return. The default is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of content moderation labels to return. The default is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        content moderation labels.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * 
     * @return If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *         returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *         content moderation labels.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition returns a
     * pagination token in the response. You can use this pagination token to retrieve the next set of content
     * moderation labels.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there is more data to retrieve), Amazon Rekognition
     *        returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     *        content moderation labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContentModerationRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code> to sort
     * array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by detection confidence. The default sort
     * is by <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code>
     *        to sort array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group
     *        elements for a label together. Within each label group, the array element are sorted by detection
     *        confidence. The default sort is by <code>TIMESTAMP</code>.
     * @see ContentModerationSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code> to sort
     * array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by detection confidence. The default sort
     * is by <code>TIMESTAMP</code>.
     * </p>
     * 
     * @return Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code>
     *         to sort array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group
     *         elements for a label together. Within each label group, the array element are sorted by detection
     *         confidence. The default sort is by <code>TIMESTAMP</code>.
     * @see ContentModerationSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code> to sort
     * array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by detection confidence. The default sort
     * is by <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code>
     *        to sort array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group
     *        elements for a label together. Within each label group, the array element are sorted by detection
     *        confidence. The default sort is by <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationSortBy
     */

    public GetContentModerationRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code> to sort
     * array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group elements for a
     * label together. Within each label group, the array element are sorted by detection confidence. The default sort
     * is by <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>ModerationLabelDetections</code> array. Use <code>TIMESTAMP</code>
     *        to sort array elements by the time labels are detected. Use <code>NAME</code> to alphabetically group
     *        elements for a label together. Within each label group, the array element are sorted by detection
     *        confidence. The default sort is by <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentModerationSortBy
     */

    public GetContentModerationRequest withSortBy(ContentModerationSortBy sortBy) {
        this.sortBy = sortBy.toString();
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContentModerationRequest == false)
            return false;
        GetContentModerationRequest other = (GetContentModerationRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public GetContentModerationRequest clone() {
        return (GetContentModerationRequest) super.clone();
    }

}
