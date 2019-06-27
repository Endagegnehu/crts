<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="Test/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="Test/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="Test/Ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="Test/css/AdminLTE.min.css">
    <link rel="stylesheet" href="Test/css/skins/_all-skins.min.css">
        <title>CRTS</title>
    </head>
    <body>
        <div> 
            <h1 class="box-title" style="width: 500px;margin-left:550px; margin-top: 45px; font-family: cursive;"> Welcome to CRTS</h1>
        </div>
        <div class="box box-info" style="width:500px; margin-left:550px; margin-top: 0px;
             border-top-width: 15px; "  >
            <div class="box-header with-border">
                <h2 class="box-title" style="font-family: cursive;">Log In</h2>
            </div>
            <!-- /.box-header -->
            <!-- form start -->
            <form class="form-horizontal">
              <div class="box-body">
                <div class="form-group">
                  <label for="inputEmail3" class="col-sm-2 control-label">Email</label>

                  <div class="col-sm-10">
                      <input type="email" class="form-control" style="border-radius: 20px;"id="inputEmail3" placeholder="Email">
                  </div>
                </div>
                <div class="form-group">
                  <label for="inputPassword3" class="col-sm-2 control-label">Password</label>

                  <div class="col-sm-10">
                    <input type="password" class="form-control" style="border-radius: 20px;" id="inputPassword3" placeholder="Password">
                  </div>
                </div>
                <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                    <div class="checkbox" style="font-family: cursive; border-radius: 20px;" >
                      <label>
                          <input type="checkbox" > Remember me
                      </label>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.box-body -->
              <div class="box-footer" style="border-radius:20px;">
                <button type="submit" class="btn btn-default" style="border-radius:20px; font-family: cursive;" >Cancel</button>
                <button type="submit" class="btn btn-info pull-right" style="border-radius: 20px; font-family: cursive;">Sign in</button>
              </div>
              <!-- /.box-footer -->
            </form>
          </div>
    </body>
    
</html>
