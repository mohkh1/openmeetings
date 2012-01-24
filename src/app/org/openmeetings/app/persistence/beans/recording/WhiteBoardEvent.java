/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.openmeetings.app.persistence.beans.recording;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "recording_whiteboardevent")
public class WhiteBoardEvent implements Serializable {

	private static final long serialVersionUID = -1745738413294075264L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="wb_event_id")
	private Long whiteBoardEventId = null;
	
	@Column(name="starttime")
	private Long starttime;
	
	//This Object is made to a XML-Object using XStream to keep the
	//flexibility, otherwise a change in the Whiteboard 
	//Object (for example a new Font-Color) will need a change in the 
	//database scheme and or course big effort in maintaining the Recording
	@Lob
	@Column(name="action")
	private String action;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="roomrecording_id", insertable=true, updatable=true)
	private RoomRecording roomRecording;
	
	//this is only Filled if send to client
	@Transient
	private Object actionObj;
	
	public Long getWhiteBoardEventId() {
		return whiteBoardEventId;
	}
	public void setWhiteBoardEventId(Long whiteBoardEventId) {
		this.whiteBoardEventId = whiteBoardEventId;
	}
	
	public Long getStarttime() {
		return starttime;
	}
	public void setStarttime(Long l) {
		this.starttime = l;
	}

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public Object getActionObj() {
		return actionObj;
	}
	public void setActionObj(Object actionObj) {
		this.actionObj = actionObj;
	}

	public RoomRecording getRoomRecording() {
		return roomRecording;
	}
	public void setRoomRecording(RoomRecording roomRecording) {
		this.roomRecording = roomRecording;
	}
	
}
