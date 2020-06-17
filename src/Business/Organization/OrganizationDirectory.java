/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.IdentifyCollectors.getValue())){
            organization = new IdentifyCollectors();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Warehouse.getValue())){
            organization = new Warehouse();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Type.RecyclingFactory.getValue())){
            organization = new RecyclingFactory();
            organizationList.add(organization);
        }
            else if (type.getValue().equals(Type.Logistics.getValue())){
            organization = new LogisticsOrganisation();
            organizationList.add(organization);
        }
        return organization;
    }
    
    
     public boolean checkIfOrganisationExists(Type type, ArrayList<Organization> list)
    {
        
        for(Organization o : list)
        {
        if(o.getName().equals(type.getValue()))
        {
            return true;
            }
        }
        return false;
        }
        
        
//         Organization organization = null;
//    if (type.getValue().equals(Type.IdentifyCollectors.getValue()) || type.getValue().equals(Type.Warehouse.getValue())){
//          
//        return true;
//        }
//       
//        
//        
//    return false;
//    }
}