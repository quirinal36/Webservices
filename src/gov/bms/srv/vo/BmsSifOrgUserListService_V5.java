package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Wed Jul 24 01:13:05 KST 2019  
 */

public interface BmsSifOrgUserListService_V5 extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: BmsSifOrgUserListService_V5Port  
     // Port Type: BmsSifOrgUserListService_V5Port   
     //***********************************
     
  /**
   * returns BmsSifOrgUserListService_V5Port port in this service 
   */
  gov.bms.srv.vo.BmsSifOrgUserListService_V5Port getBmsSifOrgUserListService_V5Port() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getBmsSifOrgUserListService_V5Port(byte[] username, byte[] password);
   */
  gov.bms.srv.vo.BmsSifOrgUserListService_V5Port getBmsSifOrgUserListService_V5Port(String username, String password) throws javax.xml.rpc.ServiceException;

  gov.bms.srv.vo.BmsSifOrgUserListService_V5Port getBmsSifOrgUserListService_V5Port(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }