/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
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
package org.apache.sling.launchpad.testservices.servlets;

import javax.servlet.Servlet;

import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

/** Example/test Sling Servlet registered with two selectors */
@Component(service = Servlet.class)
@SlingServletResourceTypes(
        resourceTypes = "sling/servlet/default",
        methods = {"GET", "POST"},
        selectors = {"TEST_SEL_1", "TEST_SEL_2"},
        extensions = "txt")
@SuppressWarnings("serial")
public class SelectorServlet extends TestServlet {}
