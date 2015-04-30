<%-- 
    Document   : index
    Created on : 23/04/2015, 09:10:17
    Author     : Gabriel B Moro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SisMOA</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <!--<link href="css/sb-admin.css" rel="stylesheet">-->

    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<!--
    <div id="wrapper">-->

            <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
                <div class="navbar-header">
<!--                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>-->
                    <a class="navbar-brand" href="index.html">SisMOA - Sistema de Gestão do Museu Oswaldo Aranha</a>
                </div>
            </nav>
<br /><br /><br />
            <div class="container-fluid">
              <div class="row">
                  <div class="col-lg-6 col-md-8">
                      <h1>Acesso de Usuário</h1>
                  </div>
              </div>
                <div class="row">
                    <div class="col-lg-6 col-md-8">
                            <div class="panel-primary">
                                 <form class="navbar-search pull-left">
                                     <label for="cpfe"> Cpf: </label><br />
                                     <input id="cpfe" type="text" name="cpf" /> <br />
                                     <label for="pswrd">Senha: </label><br />
                                     <input id="pswrd" type="password" name="password"/> <br /><br />
                                     <input type="text" href="principal.jsp" class="btn btn-primary btn-large" value="Acessar" />
                                    </form>
                            </div>
                        </div>
                    </div>
                        </div>


    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>

