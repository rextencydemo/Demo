/*******************************************************************************
 * Copyright (c) 2014 Salesforce.com, inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Salesforce.com, inc. - initial API and implementation
 ******************************************************************************/
package com.salesforce.ide.core.internal.components.apex.page;

import com.salesforce.ide.core.internal.components.ComponentController;
import com.salesforce.ide.core.project.ForceProjectException;

public class ApexPageComponentController extends ComponentController {

    public ApexPageComponentController() throws ForceProjectException {
        super(new ApexPageModel());
    }
}
