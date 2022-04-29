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
<title>CREDIT TABLE</title>
</head>
<body>
 <H2 align="center">CREDIT TABLE</H2>
 <BR></BR>
 <A href="/credit/home">HOME</A>
 <BR></BR>
 <A href="/expense/eTable">Go To Expense Table</A>
 <BR></BR>
  <A href="/credit/add">ADD</A> <BR/>
  <A href="/Calc/sum">Check financial Status</A>
   <TABLE  border="2" class= "table table-bordered table-striped" >
   <THEAD class="thead-dark">
     <TR>
     <TH>C_ID</TH>
     <TH>DESCRIPTION</TH>
     <TH>PRICE</TH>
     <TH>ACTION</TH>
     </TR>
     </THEAD>
     <TBODY>
      <f:forEach items= "${CreditTable}" var="cObj" >
        <TR >
          <TD><f:out value="${cObj.c_Id}"/></TD>
          <TD><f:out value="${cObj.description}"/></TD>
          <TD><f:out value="${cObj.price}"/></TD>
          <TD> <A href="/credit/update?c_Id=${cObj.c_Id}">update</A> |
          <A href="/credit/delete?c_Id=${cObj.c_Id }" onclick="if(!(confirm('Are you sure want to delete?'))) return false">delete</A></TD>
        </TR>
        
      </f:forEach>
     </TBODY>
   </TABLE>
  
</body>
</html>
</jsp:root>