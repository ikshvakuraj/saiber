<?php
date_default_timezone_set('Europe/Copenhagen');
include 'dbh.inc.php';
function setComments($conn)
{
if(isset($_POST['commentSubmit']))
{
    $uid=$_POST['uid'];
    $date = $_POST['date'];
    $message=$_POST['message'];
    $sql="INSERT INTO comments(uid,date,message) VALUES('$uid','$date','$message')";
    $result= $conn->query($sql);
}   
    
}

function getComments($conn)
{
    $sql = "Select * from comments";
    $result = $conn->query($sql);
    while($row = $result->fetch_assoc())
    {
        echo "<div class='comment-box'><p>";
               echo $row['uid']."<br>";
                echo $row['date']."<br>";
                echo nl2br($row['message']);
                echo "</p></div>";
 
}
    
}