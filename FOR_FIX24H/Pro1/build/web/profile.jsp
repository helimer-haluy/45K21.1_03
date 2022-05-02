<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <!--  This file has been downloaded from bootdey.com @bootdey on twitter -->
        <!--  All snippets are MIT license http://bootdey.com/license -->
        <title>Profile</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/style.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand" href="homeControl">FIX 24h</a>
                <button class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded" type="button"
                        data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
                        aria-expanded="false" aria-label="Toggle navigation">
                    Menu
                    <i class="fas fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded"
                                                             href="#portfolio">Dịch vụ</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="">Đặt
                                lịch</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded" href="">Bảng
                                giá</a></li>


                    </ul>
                    <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
                        <input type="search" class="form-control form-control-dark" placeholder="Tìm kiếm 🔎"
                               aria-label="Search">
                    </form>

                        <a href="loadProfile?username=${sessionScope.acc.username}"><button type="button" class="btn btn-warning">Trang cá nhân</button></a>                    
                        <a href="./logout"><button type="button" class="btn btn-warning">Đăng xuất</button></a>

                    <!--                <div class="text-end">
                                        <a href="Form thợ và khách.html">
                                        <button type="button" class="btn btn-outline-light me-2">Đăng ký</button>
                                        </a>
                                        <a href="login.jsp">
                                            <button type="button" class="btn btn-warning">Đăng nhập</button>
                                        </a>
                                    </div>-->
                </div>
            </div>
        </nav>
        <section class="section about-section gray-bg" id="about">
            <div class="container">
                <div class="row align-items-center flex-row-reverse">
                    <div class="col-lg-6">
                        <div class="about-text go-to">
                            <h3 class="dark-color">About Me</h3>
                            <!--<h6 class="theme-color lead">A Lead UX &amp; UI designer based in Canada</h6>-->

                            <div class="row about-list">
                                <div class="col-md-6">
                                    <div class="media">
                                        <label>Name</label>
                                        <p>${detail.name}</p>
                                    </div>
                                    <div class="media">
                                        <label>Email:</label> 
                                        <p>${detail.email}</p>
                                    </div>
                                   
                                </div>
                                <div class="col-md-6">
                                    <div class="media">
                                        <label>Phone</label>
                                        <p>${detail.phonenumber}</p>
                                    </div>
                                </div>
                            </div>
                                    <a href="changePassword.jsp" class="btn btn-info" role="button">Change Password</a>

                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="about-avatar">
                            <img src="images/Logo1.png" title="" alt="">
                        </div>
                    </div>
                </div>

            </div>
        </section>

        <style type="text/css">
            body{
                color: #6F8BA4;
                margin-top:20px;
            }
            .section {
                padding: 100px 0;
                position: relative;
            }
            .gray-bg {
                background-color: #f5f5f5;
            }
            img {
                max-width: 100%;
            }
            img {
                vertical-align: middle;
                border-style: none;
            }
            /* About Me 
            ---------------------*/
            .about-text h3 {
                font-size: 45px;
                font-weight: 700;
                margin: 0 0 6px;
            }
            @media (max-width: 767px) {
                .about-text h3 {
                    font-size: 35px;
                }
            }
            .about-text h6 {
                font-weight: 600;
                margin-bottom: 15px;
            }
            @media (max-width: 767px) {
                .about-text h6 {
                    font-size: 18px;
                }
            }
            .about-text p {
                font-size: 18px;
                max-width: 450px;
            }
            .about-text p mark {
                font-weight: 600;
                color: #20247b;
            }

            .about-list {
                padding-top: 10px;
            }
            .about-list .media {
                padding: 5px 0;
            }
            .about-list label {
                color: #20247b;
                font-weight: 600;
                width: 88px;
                margin: 0;
                position: relative;
            }
            .about-list label:after {
                content: "";
                position: absolute;
                top: 0;
                bottom: 0;
                right: 11px;
                width: 1px;
                height: 12px;
                background: #20247b;
                -moz-transform: rotate(15deg);
                -o-transform: rotate(15deg);
                -ms-transform: rotate(15deg);
                -webkit-transform: rotate(15deg);
                transform: rotate(15deg);
                margin: auto;
                opacity: 0.5;
            }
            .about-list p {
                margin: 0;
                font-size: 15px;
            }

            @media (max-width: 991px) {
                .about-avatar {
                    margin-top: 30px;
                }
            }

            .about-section .counter {
                padding: 22px 20px;
                background: #ffffff;
                border-radius: 10px;
                box-shadow: 0 0 30px rgba(31, 45, 61, 0.125);
            }
            .about-section .counter .count-data {
                margin-top: 10px;
                margin-bottom: 10px;
            }
            .about-section .counter .count {
                font-weight: 700;
                color: #20247b;
                margin: 0 0 5px;
            }
            .about-section .counter p {
                font-weight: 600;
                margin: 0;
            }
            mark {
                background-image: linear-gradient(rgba(252, 83, 86, 0.6), rgba(252, 83, 86, 0.6));
                background-size: 100% 3px;
                background-repeat: no-repeat;
                background-position: 0 bottom;
                background-color: transparent;
                padding: 0;
                color: currentColor;
            }
            .theme-color {
                color: #fc5356;
            }
            .dark-color {
                color: #20247b;
            }


        </style>

        <script type="text/javascript">

        </script>
    </body>
</html>