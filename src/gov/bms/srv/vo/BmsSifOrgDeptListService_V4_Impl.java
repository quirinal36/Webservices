package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Thu Sep 19 10:53:50 KST 2019 */

public class BmsSifOrgDeptListService_V4_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements gov.bms.srv.vo.BmsSifOrgDeptListService_V4 {

  public BmsSifOrgDeptListService_V4_Impl() throws javax.xml.rpc.ServiceException {
    this("gov/bms/srv/vo/BmsSifOrgDeptListService_V4_saved_wsdl.wsdl", null);
  }
  
  public BmsSifOrgDeptListService_V4_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public BmsSifOrgDeptListService_V4_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://hamoni.mogaha.go.kr/bms", "BmsSifOrgDeptListService_V4"),
          "gov/bms/srv/vo/BmsSifOrgDeptListService_V4_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: BmsSifOrgDeptListService_V4Port 
  // Port Type: BmsSifOrgDeptListService_V4Port 
  //***********************************

  gov.bms.srv.vo.BmsSifOrgDeptListService_V4Port mvar_BmsSifOrgDeptListService_V4Port;

  /**
   * returns BmsSifOrgDeptListService_V4Port port in this service 
   */
  public gov.bms.srv.vo.BmsSifOrgDeptListService_V4Port getBmsSifOrgDeptListService_V4Port() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_BmsSifOrgDeptListService_V4Port == null) {
      mvar_BmsSifOrgDeptListService_V4Port =
        new gov.bms.srv.vo.BmsSifOrgDeptListService_V4Port_Stub(_getPort("BmsSifOrgDeptListService_V4Port"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_BmsSifOrgDeptListService_V4Port)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_BmsSifOrgDeptListService_V4Port;
  }

  /**
   * @deprecated  Use getBmsSifOrgDeptListService_V4Port(byte[] username, byte[] password)
   */
  public gov.bms.srv.vo.BmsSifOrgDeptListService_V4Port getBmsSifOrgDeptListService_V4Port(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getBmsSifOrgDeptListService_V4Port();
  }

  public gov.bms.srv.vo.BmsSifOrgDeptListService_V4Port getBmsSifOrgDeptListService_V4Port(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getBmsSifOrgDeptListService_V4Port();
  }
  
  
}