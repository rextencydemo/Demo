package com.salesforce.ide.core.remote.tooling;

import com.salesforce.ide.core.model.Component;
import com.sforce.soap.tooling.MetadataContainer;

/**
 * Adapts an ApexClass component to a ApexClassMember for deployment.
 * 
 * @author nchen
 * 
 */
public class ApexClassMemberAdapter extends ContainerMemberAdapter {

    public ApexClassMemberAdapter(Component component, MetadataContainer container) {
        super(component, container);
    }

}
