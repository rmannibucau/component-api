/**
 *  Copyright (C) 2006-2017 Talend Inc. - www.talend.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.talend.component.api.service.wizard;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.talend.component.api.meta.Documentation;
import org.talend.component.api.meta.Partial;
import org.talend.component.api.service.ActionType;

@Partial("not yet supported and very experimental")
@ActionType("wizard")
@Target(METHOD)
@Retention(RUNTIME)
@Documentation("This class marks an action taking N parameters representing N screens (sorted) to do an action")
public @interface Wizard {

    /**
     * @return the value of the component family this action relates to.
     */
    String family() default "";

    /**
     * @return the value of the action.
     */
    String value() default "default";
}
