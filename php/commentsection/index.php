<?php
date_default_timezone_set('Europe/Copenhagen');
include 'dbh.inc.php';
include 'comments.inc.php';
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Titile of the document</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
    <iframe  src=        "https://www.youtube.com/embed/DhgXNPfzESc?list=PL0eyrZgxdwhwBToawjm9faF1ixePexft-"
 frameborder="0" allowfullscreen></iframe>
       
        <?php
echo"<form method='POST' action='".setComments($conn)."'>
    <input type ='hidden' name='uid' value='Anonymous'>
    <input type ='hidden' name='date' value='".date('Y-m-d H:i:s')."'>
        <textarea name='message'> </textarea><br>
        <button type='submit' name='commentSubmit'>COMMENT</button>
        </form>";
 getComments($conn);
        ?>
        
    </body>
</html>