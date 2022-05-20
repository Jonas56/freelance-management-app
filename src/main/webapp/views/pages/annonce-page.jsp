<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />

    <title>Annonce Details</title>
    <meta content="" name="description" />
    <meta content="" name="keywords" />

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon" />
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet"
    />

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet" />
    <link
            href="assets/vendor/bootstrap/css/bootstrap.min.css"
            rel="stylesheet"
    />
    <link
            href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
            rel="stylesheet"
    />
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet" />
    <link
            href="assets/vendor/glightbox/css/glightbox.min.css"
            rel="stylesheet"
    />
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet" />

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet" />

    <link rel="stylesheet" href="../../assets/vendor/fonts/ionicons.min.css" />
</head>

<body>
<!-- ======= Header ======= -->
<%@include file="../components/header.jsp"%>
<!-- End Header -->

<main id="main">
    <!-- ======= Breadcrumbs Section ======= -->
    <section class="breadcrumbs">
        <div class="container">
            <div class="d-flex justify-content-between align-items-center">
                <h2>Annonce Details</h2>
                <ol>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Annonces</a></li>
                    <li>Details</li>
                </ol>
            </div>
        </div>
    </section>
    <!-- Breadcrumbs Section -->

    <!-- ======= Portfolio Details Section ======= -->
    <section id="portfolio-details" class="portfolio-details">
        <div class="container">
            <div class="row gy-4">
                <div class="col-lg-8">
                    <div class="portfolio-details-slider swiper">
                        <div class="swiper-wrapper align-items-center">
                            <div class="swiper-slide">
                                <img src="assets/img/portfolio/portfolio-1.jpg"
<%--                                     src="../../assets/img/portfolio/portfolio-1.jpg"--%>
                                     alt="" />
                            </div>
                            <div class="swiper-slide">
                                <img src="assets/img/portfolio/portfolio-2.jpg" alt="" />
                            </div>

                            <div class="swiper-slide">
                                <img src="assets/img/portfolio/portfolio-3.jpg" alt="" />
                            </div>
                        </div>
                        <div class="swiper-pagination"></div>
                    </div>
                </div>

                <div class="col-lg-4">
                    <div class="portfolio-info">
                        <h3>${annonce.titre}</h3>
                        <ul>
                            <li><strong>Category</strong>: Web design</li>
                            <li><strong>Phone number</strong>: +212696969696</li>
                            <li><strong>Contact</strong>: freelancer@email.com</li>
                            <li><strong>Created At</strong>: 01 March, 2020</li>
                        </ul>
                    </div>
                    <div class="portfolio-description">
                        <h2>Description</h2>
                        <p>
                            ${annonce.description}
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- End Portfolio Details Section -->
</main>
<!-- End #main -->

<!-- ======= Footer ======= -->
<footer class="footer-clean">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-sm-4 col-md-3 item">
                <h3>Services</h3>
                <ul>
                    <li><a href="#">Web design</a></li>
                    <li><a href="#">Development</a></li>
                    <li><a href="#">Hosting</a></li>
                </ul>
            </div>
            <div class="col-sm-4 col-md-3 item">
                <h3>About</h3>
                <ul>
                    <li><a href="#">Company</a></li>
                    <li><a href="#">Team</a></li>
                    <li><a href="#">Legacy</a></li>
                </ul>
            </div>
            <div class="col-sm-4 col-md-3 item">
                <h3>Careers</h3>
                <ul>
                    <li><a href="#">Job openings</a></li>
                    <li><a href="#">Employee success</a></li>
                    <li>
                        <a href="#">test</a>
                    </li>
                </ul>
            </div>
            <div class="col-lg-3 item social">
                <a href="#"><i class="icon ion-social-facebook"></i></a
                ><a href="#"><i class="icon ion-social-twitter"></i></a
            ><a href="#"><i class="icon ion-social-snapchat"></i></a
            ><a href="#"><i class="icon ion-social-instagram"></i></a>
                <p class="copyright">Company Name © 2022</p>
            </div>
        </div>
    </div>
</footer>

<a
        href="#"
        class="back-to-top d-flex align-items-center justify-content-center"
><i class="bi bi-arrow-up-short"></i
></a>

<!-- Vendor JS Files -->
<script src="assets/vendor/aos/aos.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>
</body>
</html>
