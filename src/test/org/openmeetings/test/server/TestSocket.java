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
package org.openmeetings.test.server;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author sebastianwagner
 *
 */
public class TestSocket extends TestCase {
	
	//private static final Logger log = Logger.getLogger(TestSocket.class);
	private static Logger log = Logger.getLogger(TestSocket.class);
	
	@Test
	public void testTestSocket(){
		try {
			
//			ServerSocketProcess serverSocketProcess = new ServerSocketProcess();
//			
//			serverSocketProcess.run();
			
			System.out.println("TEST COMPLETE _ _");
		
		} catch (Exception err) {
			log.error("[TestSocket] ",err);
		}
		
	}

}
