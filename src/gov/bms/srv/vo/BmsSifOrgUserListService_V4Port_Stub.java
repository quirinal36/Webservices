package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This stub class was generated by weblogic
 * webservice stub gen on Thu Jul 18 17:19:49 KST 2019 
 */

public class BmsSifOrgUserListService_V4Port_Stub 
     extends weblogic.wsee.jaxrpc.StubImpl
     implements gov.bms.srv.vo.BmsSifOrgUserListService_V4Port, /**/java.io.Serializable
{

  public BmsSifOrgUserListService_V4Port_Stub(weblogic.wsee.wsdl.WsdlPort port, 
                        weblogic.wsee.jaxrpc.ServiceImpl service) 
    throws javax.xml.rpc.ServiceException
  {
    super(port, gov.bms.srv.vo.BmsSifOrgUserListService_V4Port.class, service);
  }
  
    
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}isAlive   */

  public boolean isAlive() throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();

    try {
            java.lang.Object _result = _invoke("isAlive", _args.toArray());
      return ((java.lang.Boolean)_result).booleanValue();
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void isAliveAsync(weblogic.wsee.async.AsyncPreCallContext apc ) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "isAlive");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "isAlive");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "boolean");

    try {
      java.lang.Object _result = _invoke("isAlive", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
        
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getAllUserInfoListViewLite   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes3VO getAllUserInfoListViewLite(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getAllUserInfoListViewLite", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes3VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getAllUserInfoListViewLiteAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getAllUserInfoListViewLite");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getAllUserInfoListViewLite");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes3VO");
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getAllUserInfoListViewLite", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
        
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getAllUserInfoListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes4VO getAllUserInfoListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getAllUserInfoListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes4VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getAllUserInfoListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getAllUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getAllUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewRes4VO");
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getAllUserInfoListView", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
        
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getDeptUserInfoListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO getDeptUserInfoListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getDeptUserInfoListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getDeptUserInfoListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getDeptUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getDeptUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO");
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getDeptUserInfoListView", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
    
  private Object writeReplace() throws java.io.ObjectStreamException {
    java.util.HashMap map = new java.util.HashMap();
            map.put("BmsSifOrgUserListService_V4Port", "BmsSifOrgUserListService_V4Port");
            
    return new weblogic.wsee.tools.clientgen.stubgen.StubSerialWrapper(
      "gov.bms.srv.vo.BmsSifOrgUserListService_V4",
      (String)map.get(_getPortName()),
      _getUserProperties());
  }
}