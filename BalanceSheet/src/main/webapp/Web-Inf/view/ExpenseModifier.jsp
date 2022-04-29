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
<title>Expense EDIT</title>
</head>
<body>
     <H2 align="center">Expense Modifier</H2>
     <BR></BR>
     <A href="/expense/home">HOME</A>
     <BR></BR>    //triestentechnology
     <A href="/credit/cTable">Go to credit Table</A>
     <BR></BR>
     <A href="/expense/eTable">Go to expense Table</A> <BR/>
     <A href="/Calc/sum">Check financial Status</A>
      <FORM action="/expense/save">
      
       <INPUT type="hidden" name="e_Id" value="${ExpenseTable.e_Id}"
         placeholder="e_Id"
        />
       
       <DIV class="form-inline">
         <INPUT type="text" name="description" value="${ExpenseTable.description}" 
         placeholder="description"/>
       </DIV>
       
       <DIV class="form-inline">
          <INPUT type="text" name="price" value="${ExpenseTable.price}"
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