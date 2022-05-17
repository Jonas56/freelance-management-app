<!DOCTYPE html>
<html lang="en">
<head>
  <!-- SITE TITTLE -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>Classimax</title>

  <!-- Favicons -->
  <link href="../../assets/img/favicon.png" rel="icon" />
  <link href="../../assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

<!--  Bootstrap-->
  <link href="../../assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
  <link href="../../assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet"/>

  <!-- Template Main CSS File -->
  <link href="../../assets/css/list-services.css" rel="stylesheet"/>

  <link rel="stylesheet" href="../../assets/vendor/fonts/ionicons.min.css"/>
</head>

<body class="body-wrapper">
<section class="dashboard section">
  <!-- Container Start -->
  <div class="container">
    <!-- Row Start -->
    <div class="row">
      <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
        <div class="sidebar">
          <!-- User Widget -->
          <div class="widget user-dashboard-profile">
            <!-- User Image -->
            <div class="profile-thumb">
              <img
                      src="images/user/user-thumb.jpg"
                      alt=""
                      class="rounded-circle"
              />
            </div>
            <!-- User Name -->
            <h5 class="text-center">Samanta Doe</h5>
            <p>Joined February 06, 2017</p>
            <a href="user-profile.html" class="btn btn-main-sm"
            >Edit Profile</a
            >
          </div>
         </div>
      </div>
      <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0">
        <!-- Recently Favorited -->
        <div class="widget dashboard-container my-adslist">
          <h3 class="widget-header">My Ads</h3>
          <table class="table table-responsive product-dashboard-table">
            <thead>
            <tr>
              <th>Image</th>
              <th>Product Title</th>
              <th class="text-center">Category</th>
              <th class="text-center">Action</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td class="product-thumb">
                <img
                        width="80px"
                        height="auto"
                        src="images/products/products-1.jpg"
                        alt="image description"
                />
              </td>
              <td class="product-details">
                <h3 class="title">Macbook Pro 15inch</h3>
                <span class="add-id"
                ><strong>Ad ID:</strong> ng3D5hAMHPajQrM</span
                >
                <span
                ><strong>Posted on: </strong><time>Jun 27, 2017</time>
                      </span>
                <span class="status active"
                ><strong>Status</strong>Active</span
                >
                <span class="location"
                ><strong>Location</strong>Dhaka,Bangladesh</span
                >
              </td>
              <td class="product-category">
                <span class="categories">Laptops</span>
              </td>
              <td class="action" data-title="Action">
                <div class="">
                  <ul class="list-inline justify-content-center">
                    <li class="list-inline-item">
                      <a
                              data-toggle="tooltip"
                              data-placement="top"
                              title="View"
                              class="view"
                              href="category.html"
                      >
                        <i class="fa fa-eye"></i>
                      </a>
                    </li>
                    <li class="list-inline-item">
                      <a
                              data-toggle="tooltip"
                              data-placement="top"
                              title="Edit"
                              class="edit"
                              href=""
                      >
                        <i class="fa fa-pencil"></i>
                      </a>
                    </li>
                    <li class="list-inline-item">
                      <a
                              data-toggle="tooltip"
                              data-placement="top"
                              title="Delete"
                              class="delete"
                              href=""
                      >
                        <i class="fa fa-trash"></i>
                      </a>
                    </li>
                  </ul>
                </div>
              </td>
            </tr>
            </tbody>
          </table>
        </div>

        <!-- pagination -->
        <div class="pagination justify-content-center">
          <nav aria-label="Page navigation example">
            <ul class="pagination">
              <li class="page-item">
                <a class="page-link" href="#" aria-label="Previous">
                  <span aria-hidden="true">&laquo;</span>
                </a>
              </li>
              <li class="page-item"><a class="page-link" href="#">1</a></li>
              <li class="page-item active">
                <a class="page-link" href="#">2</a>
              </li>
              <li class="page-item"><a class="page-link" href="#">3</a></li>
              <li class="page-item">
                <a class="page-link" href="#" aria-label="Next">
                  <span aria-hidden="true">&raquo;</span>
                </a>
              </li>
            </ul>
          </nav>
        </div>
        <!-- pagination -->
      </div>
    </div>
    <!-- Row End -->
  </div>
  <!-- Container End -->
</section>



<!-- Vendor JS Files -->
<script src="../../assets/vendor/aos/aos.js"></script>
<script src="../../assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="../../assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="../../assets/vendor/swiper/swiper-bundle.min.js"></script>

<!-- Template Main JS File -->
<script src="../../assets/js/main.js"></script>

</body>
</html>
