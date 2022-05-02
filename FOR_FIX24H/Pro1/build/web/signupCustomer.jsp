<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
  <head>
    <meta charset="UTF-8">
    
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="css/selectrole.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  <div class="container">
    <!-- <div class="title">??NG KI? CHO KHA?CH</div> -->
    <div class="logo-title">
        
        <a href="homeControl"><img src="images/Logo1.png" width="100" height="100"></a>
      <div class="title">Đăng ký cho khách</div>
      
                          <p class="text-danger">${mess}</p>
                  
    </div>
    <div class="content">
              <form class="signup_bg" action="signup" method="post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Họ và tên</span>
                 <input type="text" id="fullname" class="form-control " name ="name" style="background-color: #8fa2f6;" placeholder="Enter your name" required/>
          </div>
          <div class="input-box">
            <span class="details">Tên Đăng nhập</span>
            <input type="text" id="username" class="form-control "name="username"style="background-color: #8fa2f6;" placeholder="Enter your username" required/>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" id="emailAddress" class="form-control  "name="email" style="background-color: #8fa2f6;" placeholder="Enter your email" required/>
          </div>
          <div class="input-box">
            <span class="details">Số điện thoại</span>
            <input type="text" onkeypress='return event.charCode >= 48 && event.charCode <= 57' id="phoneNumber" name="phonenumber" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your phoneNumber" required/>
          </div>
          <div class="input-box">
            <span class="details">Mật khẩu</span>
            <input type="password" id="password" class="form-control "style="background-color: #8fa2f6;" name="password" placeholder="Enter your password" required/>
          </div>
          <div class="input-box">
            <span class="details">Nhập lại mật khẩu</span>
            <input type="password" id="password" class="form-control "style="background-color: #8fa2f6;" name="retypepassword" placeholder="Enter your password one more time" required/>
          </div>
            
        </div>  
        <div class="button input-box-large">
          <input type="submit" value="Đăng ký" >
        </div>
                  
        <!-- <div class="button">
          <input type="submit" value="??ng ky?" >
        </div> -->
      </form>
    </div>
  </div>

</body>
</html>
