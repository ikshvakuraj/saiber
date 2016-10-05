<?php
if(isset($_POST['submit'])){
    IT works!!
    
     $to = "ikshvakuraj@gmail.com"
     $subject = $_POST['subject'];
     $email = $_POST['email'];
     $txt = $_POST['message'];
     $headers = "From:".$email."\r\n" $_POST['subject'];
    "CC: somebodyelse@example.com";
    
mail($to,$subject,$message,$headers);
    header("Location: contact.html");
}

?>