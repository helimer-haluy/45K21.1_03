<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">


    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>fix24h.biz</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/login.css" rel="stylesheet" />
    </head>

    <body>
        <div class="wrapper bg-white">
            <div class="h2 text-center "><a href="homeControl"> <img src="images/Logo1.png" alt="LOGO FIX 24H"  style="border-radius:100%; width: 65%;"/> </a> </div>
            <div class="h4 text-muted text-center pt-2">Đăng nhập</div>
            <c:if test="${!wrong}">
                <p class="text-danger">${mess}</p>
            </c:if>
            <p class="text-center">${mess1}</p>
                           


            <form class="pt-3" action="login" method="post">
                <div class="form-group py-2">
                    <div class="input-field"> <span class="far fa-user p-2"></span> <input type="text" placeholder="Tên đăng nhập" name ="username" required class=""> </div>
                </div>
                <div class="form-group py-1 pb-2">
                    <div class="input-field"> <span class="fas fa-lock p-2"></span> <input type="password" placeholder="Mật Khẩu" name="password" required class=""> <button class="btn bg-white text-muted"> <span class="far fa-eye-slash"></span> </button> </div>
                </div>
                <button type="submit" class="btn btn-block text-center my-2 " style="display: block;
                        margin-left: auto;
                        margin-right: auto;
                        width: 40%;">Đăng nhập</button>
                <div class="text-center pt-1 text-muted"> 
                    <a
                        href="forgetPassword.jsp">Quên mật khẩu
                    </a>
                </div>
            </form>
        </div>
    </body>

</html>