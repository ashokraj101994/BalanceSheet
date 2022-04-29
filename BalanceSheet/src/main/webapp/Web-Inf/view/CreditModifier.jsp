<?xml version="1.0" encoding="ISO-8859-1" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" version="2.0">
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
<title>CREDIT EDIT</title>
</head>
<body>
     <H2 align="center">CREDIT MODIFIER</H2>
     <BR></BR>
     <A href="/credit/home">HOME</A>
     <BR></BR>
     <A href="/credit/cTable">Go to credit Table</A>
     <BR></BR>
     <A href="/expense/eTable">Go to expense Table</A> <BR/>
     <A href="/Calc/sum">Check financial Status</A>
      <FORM action="/credit/save">
      
       <INPUT type="hidden" name="c_Id" value="${CreditTable.c_Id}"
         placeholder="c_Id"
        />
       
       <DIV class="form-inline">
         <INPUT type="text" name="description" value="${CreditTable.description}" 
         placeholder="description"/>
       </DIV>
       
       <DIV class="form-inline">
          <INPUT type="text" name="price" value="${CreditTable.price}"
          placeholder="price"
          />
       </DIV>
       
       <DIV class="form-inline">
          <BUTTON type="submit">SAVE</BUTTON>
       </DIV>
      
      </FORM>
</body>
</html>
</jsp:root>