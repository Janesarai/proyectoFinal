<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <!-- Bootstrap css -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
    <!-- css file -->
    <link rel="stylesheet" href="css/home.css">

</head>
<body>
    <!-- Navbar -->
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark p-md-3">
        <div class="container-fluid">
            <a href="#" class="navbar-brand">
                <img src="imagenes/Second Chance.png" id="logo" alt="logo home">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav" style="margin-left: auto;">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Inicio</a>
                </li>
                <li class="nav-item" style="display: inline-block;">
                    <a class="nav-link text-white" href="#">¿Quiénes somos?</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle text-white" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        ¿Cómo ayudar?
                        </a>
                        <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Dona</a></li>
                        <li><a class="dropdown-item" href="#">Hazte socio</a></li>
                        <li><a class="dropdown-item" href="#">Fundaciones</a></li>
                        </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle text-white" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Adoptame aquí!
                    </a>
                    <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Perros</a></li>
                    <li><a class="dropdown-item" href="#">Gatos</a></li>
                    <li><a class="dropdown-item" href="#        ">Exóticos</a></li>
                    </ul>
                </li>
                <li class="nav-item text-white">
                    <a class="nav-link text-white" href="#"><i class="bi bi-person-fill"></i> Mi cuenta</a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Registrate</a></li>
                        <li><a class="dropdown-item" href="#">Inicia sesión</a></li>
                    </ul>
                </li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Banner image start -->
    <div class="video-background">
        <div class="video-wrap">
            <div id="video">
                <video id="bgvid" autoplay loop muted playsinline>
                    <source src="imagenes/videofondo.mp4" type="video/mp4">
                </video>
            </div>
        </div>
    </div>
    <!-- Banner image end-->

    <!-- start caption image -->
    <div class="caption text-center">
        <h1>AYUDALOS A SER FELICES</h1>
        <h3>Adopta y regala una segunda opotunidad a un animal</h3>
        <a href="#" class="btn btn-outline-light btn-lg">Adopta</a>
    </div>
    <!-- end caption image -->


    <ul class="thumb">
        <li><img src="imagenes/perrocollie.png"></li>
        <li><img src="imagenes/gatohermoso.png"></li>
        <li><img src="imagenes/Rabbit_PNG-removebg-preview.png"></li>
    </ul>

    <div class="card">
        <div class="poster">
            <img src="imagenes/perropitbul.jpg" alt="">
        </div>
    </div>



    <!-- Main content area -->
    <!-- <div class="container my-5 d-grid gap-5">
            <div class="p-5 border">
                <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ea suscipit molestias voluptatum ad rerum praesentium officiis quaerat quidem facilis. Minus doloribus     eligendi reprehenderit at dolores soluta nihil, reiciendis maiores fugiat.</p>
            </div>
            <div class="container my-5 d-grid gap-5">
                <div class="p-5 border">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ea suscipit molestias voluptatum ad rerum praesentium officiis quaerat quidem facilis. Minus doloribus     eligendi reprehenderit at dolores soluta nihil, reiciendis maiores fugiat.</p>
                </div>
            </div>
            <div class="container my-5 d-grid gap-5">
                <div class="p-5 border">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ea suscipit molestias voluptatum ad rerum praesentium officiis quaerat quidem facilis. Minus doloribus     eligendi reprehenderit at dolores soluta nihil, reiciendis maiores fugiat.</p>
                </div>
            </div>
            <div class="container my-5 d-grid gap-5">
                <div class="p-5 border">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ea suscipit molestias voluptatum ad rerum praesentium officiis quaerat quidem facilis. Minus doloribus     eligendi reprehenderit at dolores soluta nihil, reiciendis maiores fugiat.</p>
                </div>
            </div>
            <div class="container my-5 d-grid gap-5">
                <div class="p-5 border">
                    <p>Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ea suscipit molestias voluptatum ad rerum praesentium officiis quaerat quidem facilis. Minus doloribus     eligendi reprehenderit at dolores soluta nihil, reiciendis maiores fugiat.</p>
                </div>
            </div>
    </div>  -->

    <script src="js/home.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>




















