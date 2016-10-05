<?php 
session_start();
include '../dbh.php';

$first =$_POST['first'];
$last =$_POST['last'];
$uid =$_POST['uid'];
$pwd =$_POST['pwd'];

if(empty($first))
{
header("location: ../signup.php?error=empty");
    exit();

}
if(empty($pwd))
{
header("location: ../signup.php?error=empty");
    exit();

}
if(empty($last))
{
header("location: ../signup.php?error=empty");
    exit();

}
if(empty($uid))
{
header("location: ../signup.php?error=empty");
    exit();

}
else{
        $sql="SELECT uid FROM user1 WHERE                 uid='$uid'";
        $result = $conn->query($sql);
        $uidcheck = mysqli_num_rows($result);

        if($uidcheck>0)
        {
            header("location: ../signup.php?                   error=username");
            exit();
        }
    else{
    $encrypted_password = password_hash($pwd,PASSWORD_DEFAULT);        
            
    $sql = "INSERT INTO user1 (first,last,uid,pwd) 
    VALUES ('$first','$last','$uid','$encrypted_password')";
    $result = $conn->query($sql);
    echo "hello";
    header("location: ../index.php");

            
        
        }
}
?>