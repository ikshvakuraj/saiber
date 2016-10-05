<?php
require('config.php');
if(isset($_POST['submit'])){
}
else{
    
    $form = <<<EOT
    <form action = "register.php" method = "POST" autocomplete='off'>
    First Name: <input type="text" name="name"/><br/>
    Last Name: <input type="text" name="name"/><br/>
    UserName: <input type="text" name="name"/><br/>
    Email:<input type="text" name="email1"/><br/>
    Confirm Email:<input type="text" name="email1"/><br/>
    Password:<input type="password" name="pass1" />
    <br/>
   Confirm Password:<input type="password" name="pass2" />
   <input type="submit" value="Register" name="submit">
   </form>
    
    EOT;
    
    echo $form;
}
?>