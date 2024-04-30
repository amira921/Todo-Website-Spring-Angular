function openLoginForm() {
   document.getElementById("loginFrame").style.display = "block";
   document.getElementById("ForgetPasswordFrame").style.display = "none";
}

function closeLoginForm() {
   document.getElementById("loginFrame").style.display = "none";
}

function openForgetPasswordForm(){
   document.getElementById("loginFrame").style.display = "none";
   document.getElementById("ForgetPasswordFrame").style.display = "block";
}

function closeForgetPasswordForm(){
   document.getElementById("ForgetPasswordFrame").style.display = "none";
   document.getElementById("loginFrame").style.display = "block";
}

function openSignupForm(){
   document.getElementById("loginFrame").style.display = "none";
   document.getElementById("signupFrame").style.display = "block";
}

function closeSignupForm(){
   document.getElementById("signupFrame").style.display = "none";
   document.getElementById("loginFrame").style.display = "block";
}