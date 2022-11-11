<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register car</title>
</head>
<body>
    <form action="AddCar" method="post">
        Enter car name:<input type="text" name="name"><br>
        Enter Model name:<input type="text" name="modelName"><br>
        Enter car price:<input type="number" name="CarPrice"><br>
        Token price:<input type="number" name="tokenPrice"><br>
        Number of available cars:<input type="number" name="availableCars"><br>
        <input type="submit" name="submit" value="submit">
        <input type="reset" name="reset" value="reset">
    </form>
</body>
</html>