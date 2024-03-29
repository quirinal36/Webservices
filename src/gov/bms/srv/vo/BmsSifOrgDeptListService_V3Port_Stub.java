package gov.bms.srv.vo;

/**
 * Generated class, do not edit.
 *
 * This stub class was generated by weblogic
 * webservice stub gen on Thu Sep 19 14:41:59 KST 2019 
 */

public class BmsSifOrgDeptListService_V3Port_Stub 
     extends weblogic.wsee.jaxrpc.StubImpl
     implements gov.bms.srv.vo.BmsSifOrgDeptListService_V3Port, /**/java.io.Serializable
{

  public BmsSifOrgDeptListService_V3Port_Stub(weblogic.wsee.wsdl.WsdlPort port, 
                        weblogic.wsee.jaxrpc.ServiceImpl service) 
    throws javax.xml.rpc.ServiceException
  {
    super(port, gov.bms.srv.vo.BmsSifOrgDeptListService_V3Port.class, service);
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
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getAllDeptListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO getAllDeptListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewReqVO bmsLnkIniOrgAllDeptLViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgAllDeptLViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getAllDeptListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getAllDeptListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewReqVO bmsLnkIniOrgAllDeptLViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getAllDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getAllDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO");
    _args.add(bmsLnkIniOrgAllDeptLViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getAllDeptListView", _args.toArray());
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
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getAllDeptListViewLite   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO getAllDeptListViewLite(gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewReqVO bmsLnkIniOrgAllDeptLViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgAllDeptLViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getAllDeptListViewLite", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getAllDeptListViewLiteAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewReqVO bmsLnkIniOrgAllDeptLViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getAllDeptListViewLite");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getAllDeptListViewLite");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgAllDeptLViewRes2VO");
    _args.add(bmsLnkIniOrgAllDeptLViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getAllDeptListViewLite", _args.toArray());
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
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getFirstDeptListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgFirstDeptLViewRes2VO getFirstDeptListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgFirstDeptLViewReqVO bmsLnkIniOrgFirstDeptLViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgFirstDeptLViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getFirstDeptListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgFirstDeptLViewRes2VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getFirstDeptListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgFirstDeptLViewReqVO bmsLnkIniOrgFirstDeptLViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getFirstDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getFirstDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgFirstDeptLViewRes2VO");
    _args.add(bmsLnkIniOrgFirstDeptLViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getFirstDeptListView", _args.toArray());
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
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getSubDeptListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgSubDeptLViewRes2VO getSubDeptListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgSubDeptLViewReqVO bmsLnkIniOrgSubDeptLViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgSubDeptLViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getSubDeptListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgSubDeptLViewRes2VO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getSubDeptListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgSubDeptLViewReqVO bmsLnkIniOrgSubDeptLViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getSubDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getSubDeptListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgSubDeptLViewRes2VO");
    _args.add(bmsLnkIniOrgSubDeptLViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getSubDeptListView", _args.toArray());
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
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getByDeptUserInfoListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO getByDeptUserInfoListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
            java.lang.Object _result = _invoke("getByDeptUserInfoListView", _args.toArray());
      return (gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void getByDeptUserInfoListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "getByDeptUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "getByDeptUserInfoListView");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO");
    _args.add(bmsLnkIniOrgUserInfoViewReqVO);
    
    try {
      java.lang.Object _result = _invoke("getByDeptUserInfoListView", _args.toArray());
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
            map.put("BmsSifOrgDeptListService_V3Port", "BmsSifOrgDeptListService_V3Port");
            
    return new weblogic.wsee.tools.clientgen.stubgen.StubSerialWrapper(
      "gov.bms.srv.vo.BmsSifOrgDeptListService_V3",
      (String)map.get(_getPortName()),
      _getUserProperties());
  }
}