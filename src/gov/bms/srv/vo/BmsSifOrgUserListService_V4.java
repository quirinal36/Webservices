package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This service interface was generated by weblogic
 * webservice stub gen on Thu Jul 18 17:19:49 KST 2019  
 */

public interface BmsSifOrgUserListService_V4 extends javax.xml.rpc.Service {

  weblogic.wsee.context.WebServiceContext context();

  weblogic.wsee.context.WebServiceContext joinContext()
       throws weblogic.wsee.context.ContextNotFoundException;
 
     

     //***********************************
     // Port Name: BmsSifOrgUserListService_V4Port  
     // Port Type: BmsSifOrgUserListService_V4Port   
     //***********************************
     
  /**
   * returns BmsSifOrgUserListService_V4Port port in this service 
   */
  gov.bms.srv.vo.BmsSifOrgUserListService_V4Port getBmsSifOrgUserListService_V4Port() throws javax.xml.rpc.ServiceException;

  /**
   * @deprecated Use getBmsSifOrgUserListService_V4Port(byte[] username, byte[] password);
   */
  gov.bms.srv.vo.BmsSifOrgUserListService_V4Port getBmsSifOrgUserListService_V4Port(String username, String password) throws javax.xml.rpc.ServiceException;

  gov.bms.srv.vo.BmsSifOrgUserListService_V4Port getBmsSifOrgUserListService_V4Port(byte[] username, byte[] password) throws javax.xml.rpc.ServiceException;
  
    
  }