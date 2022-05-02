<%-- 
    Document   : verify
    Created on : Apr 26, 2022, 8:37:28 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="login" class="login">
            <div class="container"> 
                <div class="row">
                    <div class="col-md-12">
                        <form class="login_bg" action="userverifyControl" method="post">
                            <div class="row">
                                <div class="col-md-12" >
                                    <div class="titleepage">
                                        <div class="titlepage1">
                                            <div>
                                                <h2>We just sent you a verification code, please input to finish signing up!!</h2>
                                            </div>
                                            <div class="col-md-12">
                                                <p text-danger >${mess}</p>
                                                <input type="text" name="code">
                                            </div>

                                            <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12" id="confirm">               
                                                <a href="index.jsp"><button type="submit" class="buttonlogin">Confirm</button></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
