package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Thu Sep 19 14:41:59 KST 2019  
 */

public interface BmsSifOrgDeptListService_V3 extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: BmsSifOrgDeptListService_V3Port  
     // Port Type: BmsSifOrgDeptListService_V3Port   
     //***********************************
     
  /**
   * returns BmsSifOrgDeptListService_V3Port port in this service 
   */
  gov.bms.srv.vo.BmsSifOrgDeptListService_V3Port getBmsSifOrgDeptListService_V3Port() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getBmsSifOrgDeptListService_V3Port(byte[] username, byte[] password);
   */
  gov.bms.srv.vo.BmsSifOrgDeptListService_V3Port getBmsSifOrgDeptListService_V3Port(String username, String password) throws javax.xml.rpc.ServiceException;

  gov.bms.srv.vo.BmsSifOrgDeptListService_V3Port getBmsSifOrgDeptListService_V3Port(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }