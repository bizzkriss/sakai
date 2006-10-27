/*******************************************************************************
 * Copyright (c) 2006 The Regents of the University of California, The MIT Corporation
 *
 *  Licensed under the Educational Community License, Version 1.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.opensource.org/licenses/ecl1.php
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/

package org.sakaiproject.tool.gradebook;

import java.io.Serializable;
import java.util.Date;

/**
 * Author:Louis Majanja <louis@media.berkeley.edu>
 * Date: Oct 26, 2006
 * Time: 5:37:11 PM
 */
public abstract class AbstractComment implements Serializable {

    protected Long id;
    protected String studentId;
    protected String graderId;
    protected int version;
    protected Date dateRecorded;
    protected String commentText;
    protected GradableObject gradableObject;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGraderId() {
        return graderId;
    }

    public void setGraderId(String graderId) {
        this.graderId = graderId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(Date dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public GradableObject getGradableObject() {
        return gradableObject;
    }

    public void setGradableObject(GradableObject gradableObject) {
        this.gradableObject = gradableObject;
    }

}
