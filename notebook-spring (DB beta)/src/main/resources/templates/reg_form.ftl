<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration form's Main</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>
    <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
</head>
<body ng-app="registration_form" ng-controller="AppCtrl">
<div class="col-md-8 col-md-offset-2">
    <h1>Registration form's Main</h1>
</div>
<div class="container" style="margin-top: 60px">
    <div class="row">
        <div class="col-md-8 col-md-offset-2">
            <h2 class="page-header">Registration</h2>
            <form style="margin-bottom: 30px" name="form" autocomplete="off" novalidate ng-submit="form.$valid && sendForm(auth)">
                <div class="form-group">
                    <label for="exampleInputFirstName">First name</label>
                    <input type="text"
                           class="form-control"
                           id="exampleInputFirstName"
                           placeholder="First Name"
                           required
                           ng-model="auth.first_name">
                </div>
                <div class="form-group">
                    <label for="exampleInputLastName">Last name</label>
                    <input type="text"
                           class="form-control"
                           id="exampleInputLastName"
                           placeholder="Last Name"
                           required
                           ng-model="auth.last_name">
                </div>
                <div class="form-group">
                    <label for="exampleInputLogin">Email</label>
                    <input type="email"
                           class="form-control"
                           id="exampleInputEmail"
                           placeholder="Email"
                           required
                           ng-model="auth.email">
                </div>
                <div class="form-group">
                    <label for="exampleInputNickname">Nickname</label>
                    <input type="text"
                           class="form-control"
                           id="exampleInputNickname"
                           placeholder="Nickname"
                           required
                           ng-model="auth.nickname">
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword">Password</label>
                    <input type="password"
                           class="form-control"
                           id="exampleInputPassword"
                           placeholder="Password"
                           required
                           ng-model="auth.password">
                </div>
                <button type="submit" class="btn btn-default" style="margin-top:30px" ng-disabled="form.$invalid">
                    Submit
                </button>
            </form>
        </div>
    </div>
</div>
<script type="text/javascript" src="/js/reg_form.js"></script>
</body>
</html>