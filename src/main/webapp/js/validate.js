/**
 * 
 */
 let validate=(formObject)=>{
	let pname=formObject.uname.value;
	let paddress=formObject.address.value;
	let page=formObject.page.value;
	
	let flag=true;
	if(pname==""){
		
		alert(" Person Name is required");
		formObject.uname.focus();
		flag=false;
	}
	if(paddress==""){
		
		alert(" Person Address is required");
		formObject.paddress.focus();
		flag=false;
	}
	else if(paddress.length<10){
		alert(" Person Address min 10 characters");
		formObject.paddress.focus();
		flag=false;
	}
	if(page==""){
		
		alert(" Person Age is required");
		formObject.page.focus();
		flag=false;
	}
	else if(isNaN(page))
	{
		alert(" Person Age Must be a number");
		formObject.page.focus();
		flag=false;
	}
	
	else if(parseInt(page)<0 || parseInt(page)>125)
	{
		alert(" Person Age Must be Between 1 to 125");
		formObject.page.focus();
		flag=false;
	}
	
	return flag;
}