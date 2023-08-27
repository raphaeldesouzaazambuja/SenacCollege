document.querySelector(".back").addEventListener("click", function() {
  window.location.href = "./list.html";
});

document.querySelector(".save").addEventListener("click", function() {
  
  const name = document.querySelector(".name").value;
  const login = document.querySelector(".login").value;
  const email = document.querySelector(".email").value;
  const password = document.querySelector(".password").value;

  if (name === "" || login === "" || email === "" || password === "") 
  {
    const alert = document.querySelector(".alert");

    alert.classList.add("error");
    alert.innerHTML = "please fill in all fields.";

    setTimeout(() => {
        alert.classList.remove("error");
        alert.innerHTML = "";
    }, 3000);
    return;
  }

  if (login.indexOf(".") === -1) 
  {
    const alert = document.querySelector(".alert");

    alert.classList.add("error");
    alert.innerHTML = "The login must contain a (.) in the middle.";

    setTimeout(() => {
        alert.classList.remove("error");
        alert.innerHTML = "";
    }, 3000);
    return;
  }

  if (email.indexOf("@") === -1) 
  {
    const alert = document.querySelector(".alert");

    alert.classList.add("error");
    alert.innerHTML = "The email must contain a (@) in the middle.";

    setTimeout(() => {
        alert.classList.remove("error");
        alert.innerHTML = "";
    }, 3000);
    return;
  }

  if (!validatePassword(password)) 
  {
    const alert = document.querySelector(".alert");

    alert.classList.add("error");
    alert.innerHTML = "Password must be 8 characters or more, contain at least one capital letter and at least one special character.";

    setTimeout(() => {
        alert.classList.remove("error");
        alert.innerHTML = "";
    }, 5000);
    return;
  }

  const alert = document.querySelector(".alert");

  alert.classList.add("success");
  alert.innerHTML = "Successfully registered user";

  document.querySelector(".name").value = "";
  document.querySelector(".login").value = "";
  document.querySelector(".email").value = "";
  document.querySelector(".password").value = "";
  
  setTimeout(() => {
      alert.classList.remove("success");
      alert.innerHTML = "";
  }, 3000);
});

function validatePassword(password) {
  const regex = /^(?=.*[A-Z])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
  return regex.test(password);
}
