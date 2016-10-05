<?php
include 'header.php';

?>
      
        <br><br>
        
        <?php
$url ="http://".$_SERVER['HTTP_HOST'].$_SERVER['REQUEST_URI'];
if(strpos($url,'error=empty')!==false){
    
    echo "Fill out all the empty fields";
    
    
}
elseif(strpos($url,'error=username')!==false){
    
    echo "Username Already Exists";
    
    
}

if(isset($_SESSION['id']))
{

echo "yuo are not logged in";
}
else{
echo "<form action='includes/signup.inc.php' method='POST' autocomplete='off'>
        <input type ='text' name='first' placeholder='Firstname'><br>
        <input type ='text' name='last' placeholder='Lastname'><br>
        <input type ='text' name='uid' placeholder='Username'><br>
        <input type ='password' name='pwd' placeholder='Password'><br>
        <button type='submit'>SIGN UP</button>
        </form>";
}
  ?>          
 <br><br>
            
            
   
    
    
    </body>
    </html>