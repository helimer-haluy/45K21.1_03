<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en" dir="ltr">
    <head>
        <meta charset="UTF-8">
        <!---<title> Responsive Registration Form | CodingLab </title>--->
        <link rel="stylesheet" href="css/selectrole.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <style>
            div.title {
                text-align: center;
            }
        </style>
        
        <div class="container">
            <div class="logo-title">
                <a href="homeControl"> <img src="images/Logo1.png" width="50" height="50"></a>
                <div class="title">ĐĂNG KÍ CHO THỢ</div>
                <p class="text-danger">${mess}</p>
            </div>
            <div class="content">
                <form action="empSignupControl" method="post" enctype="multipart/form-data" >
                    <div class="user-details">
                        <div class="input-box">
                            <span class="details">Họ tên</span>
                            <input type="text" name="name" id="fullname" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your name" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Tên đăng nhập</span>
                            <input type="text" name="username" id="username" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your username" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Email</span>
                            <input type="email" name="email" id="emailAddress" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your email" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Số điện thoại</span>
                            <input type="text" name="phonenumber" onkeypress='return event.charCode >= 48 && event.charCode <= 57' id="phoneNumber" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your phoneNumber" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Mật khẩu</span>
                            <input type="password" name="password" id="password" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your password" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Nhập lại mật khẩu</span>
                            <input type="password" name="re_pass" id="password" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your password one more time" required/>
                        </div>    
                        <div class="input-box">
                            <span class="details">Quận</span>
                            <input type="text" name="district" id="address" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your district" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Thành Phố</span>
                            <input type="city" name="city" id="address" class="form-control "style="background-color: #8fa2f6;" placeholder="Enter your city" required/>
                        </div>
                        <div class="input-box-large">
                            <span class="details">Mô tả</span>
                            <input type="text" name="des" id="description" class="form-control "style="background-color: #8fa2f6; " placeholder="Enter your description " required/>
                        </div>
                        <div class="input-box-large">
                            <span class="details">CCCD</span>
                            <input type="text" name="icard" onkeypress='return event.charCode >= 48 && event.charCode <= 57' id="CCCD" class="form-control "style="background-color: #8fa2f6; " placeholder="Enter your number" required/>
                        </div>
                        <div class="input-box">
                            <span class="details">Mặt trước CCCD</span>
                            <input type="file" class ="form-control" name="ficard" style="background-color: #8fa2f6;"  />
                        </div>
                        <div class="input-box">
                            <span class="details">Mặt sau CCCD</span>
                            <input type="file" class ="form-control" name="bicard" style="background-color: #8fa2f6;"  />
                        </div>
                        <div class="input-box">
                            <span class="details">Chứng chỉ hành nghề</span>
                            <input type="file" class ="form-control" name="license" style="background-color: #8fa2f6;"  />
                        </div>
                        <div class="input-box-checkbox">
                            <input type="checkbox" id="myFile" name="filename"  required/>
                            <span class="details-large" ><i>Tôi cam kết tất cả thông tin của tôi là đúng</i></span>
                        </div>
                        <div class="button input-box-large">
                            <input type="submit" value="Đăng ký" >
                        </div>

                    </div>
                </form>

            </div>
        </div>

    </body>
</html>