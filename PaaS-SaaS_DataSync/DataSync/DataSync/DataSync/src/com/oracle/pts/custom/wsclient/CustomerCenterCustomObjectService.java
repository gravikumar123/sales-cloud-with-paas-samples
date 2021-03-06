package com.oracle.pts.custom.wsclient;

import com.oracle.pts.custom.wsclient.generated.FindControl;
import com.oracle.pts.custom.wsclient.generated.FindCriteria;
import com.oracle.pts.custom.wsclient.generated.ObjectFactory;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 111209.0821.28162)

@WebService(wsdlLocation="https://isv2-crm-crm-ext.oracle.com/crmCommonCustExtn/CustomerCenterCustomObjectService?WSDL",
  targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/",
  name="CustomerCenterCustomObjectService")
@XmlSeeAlso(
  { ObjectFactory.class })
public interface CustomerCenterCustomObjectService
{
  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/createEntity")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/createEntity", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/createEntity/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/createEntityResponse")
  @ResponseWrapper(localName="createEntityResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.CreateEntityResponse")
  @RequestWrapper(localName="createEntity", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.CreateEntity")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    name="result")
  public Object createEntity(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="object")
    Object object, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="objectName")
    String objectName)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/getEntity")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/getEntity", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/getEntity/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/getEntityResponse")
  @ResponseWrapper(localName="getEntityResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.GetEntityResponse")
  @RequestWrapper(localName="getEntity", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.GetEntity")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    name="result")
  public Object getEntity(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="keyValue")
    List<String> keyValue, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="objectName")
    String objectName)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/updateEntity")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/updateEntity", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/updateEntity/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/updateEntityResponse")
  @ResponseWrapper(localName="updateEntityResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.UpdateEntityResponse")
  @RequestWrapper(localName="updateEntity", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.UpdateEntity")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    name="result")
  public Object updateEntity(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="object")
    Object object, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="objectName")
    String objectName)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/deleteEntity")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/deleteEntity", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/deleteEntity/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/deleteEntityResponse")
  @ResponseWrapper(localName="deleteEntityResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.DeleteEntityResponse")
  @RequestWrapper(localName="deleteEntity", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.DeleteEntity")
  public void deleteEntity(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="object")
    Object object, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="objectName")
    String objectName)
    throws ServiceException;

  @WebMethod(action="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/findEntity")
  @Action(input="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/findEntity", fault =
      { @FaultAction(value="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/findEntity/Fault/ServiceException",
          className = ServiceException.class) }, output="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/CustomerCenterCustomObjectService/findEntityResponse")
  @ResponseWrapper(localName="findEntityResponse", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.FindEntityResponse")
  @RequestWrapper(localName="findEntity", targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    className="com.oracle.pts.custom.wsclient.generated.FindEntity")
  @WebResult(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
    name="result")
  public List<Object> findEntity(@WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="findCriteria")
    FindCriteria findCriteria, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="findControl")
    FindControl findControl, @WebParam(targetNamespace="http://xmlns.oracle.com/apps/crmCommon/salesParties/custExtn/extnService/types/",
      name="objectName")
    String objectName)
    throws ServiceException;
}
