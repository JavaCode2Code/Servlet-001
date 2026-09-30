function validate(frm)
{ //set vflag to ''yes" indocating client side form validation are done
	frm.vflag.value="no";
	//set styles to error message
	document.getElementByld("nameErr'').innerHTML="'';
	document.getElementByld("ageErr").innerHTML="";
	document.getElementByld("nameErr").style.color='red';
    document.getElementByld("ageErr").style.color='yellow';
	//read from data
	var name=frm.pname.value;
	var age=frm.page.value;
	//perform client side from validation
	if(name=="") //required rule
	{
       document.getElementById("nameErr").innerHTML="Persion name is Mandatry";
	   frm.pname.focus();
	   return false;
	}//if
	if(age=="")
	{
	   document.getElementById("nameErr").innerHTML="Persion age is Mandatry";
	   frm.pname.focus();
	   return false;
	}//if
	else{
		if(isNaN(age))//check  whether age is numeric value or not
		{
 document.getElementById("nameErr").innerHTML="Persion age must be numeric value";
	   frm.page.focus();
	   frm.page.value="";
	   return false;
		}
	}
}