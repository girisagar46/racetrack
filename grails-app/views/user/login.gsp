<%--
  Created by IntelliJ IDEA.
  User: linuxsagar
  Date: 5/10/15
  Time: 9:04 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="main" />
    <title>Login</title>
</head>
<body>
<div class="body">
    <g:if test="${flash.message}">
        <div class="message">${flash.message}</div>
    </g:if>
%{--    <g:form action="logout" method="post">
        <div class="buttons">
            <span class="button">
                <input type="submit" value="Logout" />
            </span>
        </div>
    </g:form>--}%
    <g:form action="authenticate" method="post" >
    %{--<div class="dialog">--}%
        <fieldset style="border: 1px solid;">
            <legend><h1>Please Login</h1></legend>
            <table>
                <tbody>
                <tr>
                    <td><label for="login">Login:</label></td>
                    <td><input type="text" id="login" name="login" required="true"/><br></td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" id="password" name="password" required="true"/><br></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                </tbody>
            </table>
        </fieldset>
    %{--            <table>
                    <tbody>
                    <tr class="prop">
                        <td valign="top" class="name">
                            <label for="login">Login:</label>
                        </td>
                        <td valign="top">
                            <input type="text" id="login" name="login"/>
                        </td>
                    </tr>
                    <tr class="prop">
                        <td valign="top" class="name">
                            <label for="password">Password:</label>
                        </td>
                        <td valign="top">
                            <input type="password" id="password" name="password"/>
                        </td>
                    </tr>
                    </tbody>
                </table>--}%
    %{--</div>--}%
    %{--<div class="buttons">
        <span class="button">--}%
    %{--<input type="submit" value="Login" />--}%
    %{--</span>
</div>--}%
    </g:form>
</div>
</body>
</html>