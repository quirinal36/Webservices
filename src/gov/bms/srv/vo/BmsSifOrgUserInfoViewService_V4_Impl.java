package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This service class was generated by weblogic
 * webservice stub gen on Thu Jul 18 02:04:31 KST 2019 */

public class BmsSifOrgUserInfoViewService_V4_Impl     extends weblogic.wsee.jaxrpc.ServiceImpl
     implements gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4 {

  public BmsSifOrgUserInfoViewService_V4_Impl() throws javax.xml.rpc.ServiceException {
    this("gov/bms/srv/vo/BmsSifOrgUserInfoViewService_V4_saved_wsdl.wsdl", null);
  }
  
  public BmsSifOrgUserInfoViewService_V4_Impl(String wsdlurl) throws javax.xml.rpc.ServiceException {
    this(wsdlurl, null);
  }
  
  public BmsSifOrgUserInfoViewService_V4_Impl(String wsdlurl, weblogic.wsee.connection.transport.TransportInfo transportInfo) throws javax.xml.rpc.ServiceException {
    super(wsdlurl,
          new javax.xml.namespace.QName("http://hamoni.mogaha.go.kr/bms", "BmsSifOrgUserInfoViewService_V4"),
          "gov/bms/srv/vo/BmsSifOrgUserInfoViewService_V4_internaldd.xml", transportInfo);
  }
  
  //***********************************
  // Port Name: BmsSifOrgUserInfoViewService_V4Port 
  // Port Type: BmsSifOrgUserInfoViewService_V4Port 
  //***********************************

  gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4Port mvar_BmsSifOrgUserInfoViewService_V4Port;

  /**
   * returns BmsSifOrgUserInfoViewService_V4Port port in this service 
   */
  public gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4Port getBmsSifOrgUserInfoViewService_V4Port() 
    throws javax.xml.rpc.ServiceException
  {

    if (mvar_BmsSifOrgUserInfoViewService_V4Port == null) {
      mvar_BmsSifOrgUserInfoViewService_V4Port =
        new gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4Port_Stub(_getPort("BmsSifOrgUserInfoViewService_V4Port"), this);
    }

    if (transportInfo != null && 
        transportInfo instanceof weblogic.wsee.connection.transport.http.HttpTransportInfo) {
      ((javax.xml.rpc.Stub)mvar_BmsSifOrgUserInfoViewService_V4Port)._setProperty(
        "weblogic.wsee.connection.transportinfo", 
        (weblogic.wsee.connection.transport.http.HttpTransportInfo)transportInfo);
    }
    
    return mvar_BmsSifOrgUserInfoViewService_V4Port;
  }

  /**
   * @deprecated  Use getBmsSifOrgUserInfoViewService_V4Port(byte[] username, byte[] password)
   */
  public gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4Port getBmsSifOrgUserInfoViewService_V4Port(String username, String password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username.getBytes());
      httpInfo.setPassword(password.getBytes());
      transportInfo = httpInfo;
    }
    return getBmsSifOrgUserInfoViewService_V4Port();
  }

  public gov.bms.srv.vo.BmsSifOrgUserInfoViewService_V4Port getBmsSifOrgUserInfoViewService_V4Port(byte[] username, byte[] password) 
    throws javax.xml.rpc.ServiceException
  {
    if (username != null & password != null) {
      weblogic.wsee.connection.transport.http.HttpTransportInfo httpInfo = 
        new weblogic.wsee.connection.transport.http.HttpTransportInfo();
      httpInfo.setUsername(username);
      httpInfo.setPassword(password);
      transportInfo = httpInfo;
    }
    return getBmsSifOrgUserInfoViewService_V4Port();
  }
  
  
}