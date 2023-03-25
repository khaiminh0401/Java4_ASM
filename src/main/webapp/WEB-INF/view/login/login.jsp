<%@ page language="java"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SingUp</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">


    <style>
        .card-header {
            background-color: rgb(106, 146, 248);
        }

        .card-footer {
            background-color: rgb(106, 146, 248);
        }

        .card {
            box-shadow: 5px 10px  rgb(219, 144, 144);
        }

        body {
            background: rgb(234, 247, 247);
        }

        /* hiệu ứng input */
        .control {
            position: relative;
            margin: 20px 0 40px;

        }

        .control input {
            background-color: transparent;
            border: 0;
            border-bottom: 2px #fff solid;
            display: block;
            width: 100%;
            padding: 15px 0;
            font-size: 18px;
            border-bottom-color: #282626;
            width: 350px;
        }

        .control input:focus,
        .control input:valid {
            outline: 0;
        }

        .control label {
            position: absolute;
            top: 15px;
            left: 10px;
            pointer-events: none;
        }

        .control label span {
            display: inline-block;
            font-size: 20px;
            min-width: 8px;
            color: #323030;
            -webkit-transition: 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
            transition: 0.5s cubic-bezier(0.68, -0.55, 0.265, 1.55);
        }

        .control input:focus+label span,
        .control input:valid+label span {
            color: #c35454;
            -webkit-transform: translateY(-30px);
            -ms-transform: translateY(-30px);
            transform: translateY(-30px);
            font-style: italic;
        }
    </style>
</head>

<body>
    <div class="justify-content-center d-flex">
        <div class="card mt-5">
            <div class="card-header">
                <div class="card-title">
                    <h1 class="fst-italic text-danger">REGISTRATION</h1>
                </div>
            </div>
            <form class="needs-validation" novalidate>

                <div class="row m-2">
                    <div class="col-lg-6 control">
                        <input type="text" class="" required>
                        <label class="form-label" for="">
                            <span style="transition-delay: 0ms;">u</span>
                            <span style="transition-delay: 50ms;">s</span>
                            <span style="transition-delay: 100ms;">e</span>
                            <span style="transition-delay: 150ms;">r</span>
                            <span style="transition-delay: 200ms;">n</span>
                            <span style="transition-delay: 250ms;">a</span>
                            <span style="transition-delay: 300ms;">m</span>
                            <span style="transition-delay: 350ms;">e</span>
                        </label>
                    </div>
                    <div class="col-lg-6 control">
                        <input type="text" class="" required>
                        <label class="form-label" for="">
                            <span style="transition-delay: 0ms;">p</span>
                            <span style="transition-delay: 50ms;">a</span>
                            <span style="transition-delay: 100ms;">s</span>
                            <span style="transition-delay: 150ms;">s</span>
                            <span style="transition-delay: 200ms;">w</span>
                            <span style="transition-delay: 250ms;">o</span>
                            <span style="transition-delay: 300ms;">r</span>
                            <span style="transition-delay: 350ms;">d</span>
                        </label>
                    </div>
                </div>
                <div class="row m-2">
                    <div class="col-lg-6 control">
                        <input type="text" class="" required>
                        <label class="form-label" for="">
                            <span style="transition-delay: 0ms;">F</span>
                            <span style="transition-delay: 50ms;">u</span>
                            <span style="transition-delay: 100ms;">l</span>
                            <span style="transition-delay: 150ms;">l</span>
                            <span style="transition-delay: 200ms;">n</span>
                            <span style="transition-delay: 250ms;">a</span>
                            <span style="transition-delay: 300ms;">m</span>
                            <span style="transition-delay: 350ms;">e</span>
                        </label>
                    </div>
                    <div class="col-lg-6 control">
                        <input type="text" class="" required>
                        <label class="form-label" for="">
                            <span style="transition-delay: 0ms;">E</span>
                            <span style="transition-delay: 50ms;">m</span>
                            <span style="transition-delay: 100ms;">a</span>
                            <span style="transition-delay: 150ms;">i</span>
                            <span style="transition-delay: 200ms;">l</span>
                            <span style="transition-delay: 250ms;"> </span>
                            <span style="transition-delay: 300ms;">A</span>
                            <span style="transition-delay: 350ms;">d</span>
                            <span style="transition-delay: 350ms;">d</span>
                            <span style="transition-delay: 350ms;">r</span>
                            <span style="transition-delay: 350ms;">e</span>
                            <span style="transition-delay: 350ms;">s</span>
                            <span style="transition-delay: 350ms;">s</span>
                        </label>
                    </div>
                </div>
            </form>
            <div class="card-footer justify-content-end d-flex">
                <button class="btn btn-danger btn-outline-dark m-2 fw-bold"><span class="bi-stop-btn-fill"></span>
                    Cancel</button>
                <button class="btn btn-danger btn-outline-dark m-2 fw-bold" ng-click="login()"></span>
                    Sing Up</button>

            </div>
        </div>
    </div>
</body>

</html>