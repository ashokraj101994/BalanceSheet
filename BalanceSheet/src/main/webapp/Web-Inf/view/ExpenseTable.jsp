<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsp/jstl/core" xmlns:h="http://java.sun.com/jsf/html" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="ISO-8859-1" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>EXPENSE TABLE</title>
</head>
<body>
 <H2 align="center">EXPENSE TABLE</H2>
 <BR></BR>
 <A href="/expense/home">HOME</A>
 <BR></BR>
 <A href="/credit/cTable">Go To Credit Table</A>
 <BR></BR>
  <A href="/expense/add">ADD</A> <BR />
  <A href="/Calc/sum">Check financial Status</A>
   <TABLE  border="2" class= "table table-bordered table-striped" >
   <THEAD  class="thead-dark">
     <TR>
     <TH>E_ID</TH>
     <TH>DESCRIPTION</TH>
     <TH>PRICE</TH>
     <TH>ACTION</TH>
     </TR>
     </THEAD>
     <TBODY>
      <f:forEach items= "${ExpenseTable}" var="eObj" >
        <TR >
          <TD><f:out value="${eObj.e_Id}"/></TD>
          <TD><f:out value="${eObj.description}"/></TD>
          <TD><f:out value="${eObj.price}"/></TD>
          <TD> <A href="/expense/update?e_Id=${eObj.e_Id}">update</A> |
          <A href="/expense/delete?e_Id=${eObj.e_Id }" onclick="if(!(confirm('Are you sure want to delete?'))) return false">delete</A></TD>
        </TR>
        
      </f:forEach>
     </TBODY>
   </TABLE>
  
</body>
</html>
</jsp:root>