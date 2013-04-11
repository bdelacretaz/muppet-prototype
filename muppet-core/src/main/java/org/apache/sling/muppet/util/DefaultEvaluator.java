/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The SF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.apache.sling.muppet.util;

import org.apache.sling.muppet.api.Evaluator;
import org.apache.sling.muppet.api.RuleResult;
import org.apache.sling.muppet.api.SystemAttribute;
import org.apache.sling.muppet.api.RuleResult.Status;

public class DefaultEvaluator implements Evaluator {
    @Override
    public Status evaluate(SystemAttribute a, String expression) {
        return expression.equals(a.getValue().toString()) ? RuleResult.Status.OK : RuleResult.Status.ERROR; 
    }
}
