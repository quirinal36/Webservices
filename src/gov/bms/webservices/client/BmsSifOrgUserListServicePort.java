package gov.bms.webservices.client;

/**
 * Generated interface, do not edit.
 *
 * This stub interface was generated by weblogic
 * webservice stub gen on Thu Jul 18 17:19:48 KST 2019  
 */

public interface BmsSifOrgUserListServicePort extends java.rmi.Remote {
     
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}isAlive   */

  public boolean isAlive() throws java.rmi.RemoteException;
    public void isAliveAsync(weblogic.wsee.async.AsyncPreCallContext apc ) throws java.rmi.RemoteException ;
       
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getAllUserInfoListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO getAllUserInfoListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException;
    public void getAllUserInfoListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException ;
       
  /**
   * Operation Name : {http://hamoni.mogaha.go.kr/bms}getDeptUserInfoListView   */

  public gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewResVO getDeptUserInfoListView(gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException;
    public void getDeptUserInfoListViewAsync(weblogic.wsee.async.AsyncPreCallContext apc, gov.bms.lnk.ini.vo.BmsLnkIniOrgUserInfoViewReqVO bmsLnkIniOrgUserInfoViewReqVO) throws java.rmi.RemoteException ;
  
}