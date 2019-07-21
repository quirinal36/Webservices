/**
 * Generated from schema type t=BmsLnkIniOrgUserIdViewReqVO@java:gov.bms.lnk.ini.vo
 */
package gov.bms.lnk.ini.vo;

public class BmsLnkIniOrgUserIdViewReqVO implements java.io.Serializable {

  private java.lang.String loginId;

  public java.lang.String getLoginId() {
    return this.loginId;
  }

  public void setLoginId(java.lang.String loginId) {
    this.loginId = loginId;
  }

  private gov.bms.lnk.ini.vo.BmsLnkIniLoginVO loginVo;

  public gov.bms.lnk.ini.vo.BmsLnkIniLoginVO getLoginVo() {
    return this.loginVo;
  }

  public void setLoginVo(gov.bms.lnk.ini.vo.BmsLnkIniLoginVO loginVo) {
    this.loginVo = loginVo;
  }

  private java.lang.String orgId;

  public java.lang.String getOrgId() {
    return this.orgId;
  }

  public void setOrgId(java.lang.String orgId) {
    this.orgId = orgId;
  }

}
