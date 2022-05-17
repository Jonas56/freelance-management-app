<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Bocor Bootstrap Template - Index</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="../../assets/img/favicon.png" rel="icon">
    <link href="../../assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
          rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="../../assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="../../assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../../assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="../../assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="../../assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="../../assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../../assets/vendor/fonts/ionicons.min.css">

    <!-- Template Main CSS File -->
    <link href="../../assets/css/style.css" rel="stylesheet">
</head>

<body>

<%@include file="../components/header.jsp"%>

<!-- ======= Hero Section ======= -->
<section id="hero">
    <div class="container">
        <div class="row d-flex align-items-center m-lg-5">
            <div class="col-lg-6 py-5 py-lg-0 order-2 order-lg-1" data-aos="fade-right">
                <h1>Find the perfect freelance services for your business</h1>
<%--                <h2>Popular:  <a href="#about" class="">Website Design</a>   WordPress Logo Design NFT Art</h2>--%>
                <input type="text" class="form-text scrollTo" placeholder="Search"/>
                <a href="#" class="btn-get-started">Started</a>
            </div>
            <div class="col-lg-6 order-1 order-lg-2 hero-img" data-aos="fade-left">
                <img src="../../assets/img/hero-img.png" class="img-fluid" alt="hero-image-freelance">
            </div>
        </div>
    </div>
</section>
    <!-- End Hero -->

<main id="main">

    <!-- ======= Services Section ======= -->
    <section id="services" class="services section-bg">
        <div class="container">

            <div class="section-title">
                <h2 data-aos="fade-in">Services</h2>
                <p data-aos="fade-in">Find the talent needed to get your business growing. Checkout the latest services right now!</p>
            </div>

            <div class="row">
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
                <%@include file="../components/product-card.jsp"%>
            </div>

        </div>
    </section><!-- End Services Section -->

</main><!-- End #main -->

<!-- ======= Footer ======= -->
<%@include file="../components/footer.jsp"%>
<!-- End Footer -->

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i
        class="bi bi-arrow-up-short"></i></a>
<!-- Vendor JS Files -->
<script src="../../assets/vendor/aos/aos.js"></script>
<script src="../../assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="../../assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="../../assets/vendor/swiper/swiper-bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="../../assets/js/main.js"></script>

<%--<c:redirect url="/servlet"/>--%>
</body>

</html>