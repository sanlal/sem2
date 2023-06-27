const form = document.getElementsByTagName("form")[0];
const username = document.getElementById("username");
const password = document.getElementById("password");
const dataDiv = document.getElementById("data");

form.addEventListener("submit", function(event) {
  event.preventDefault();

  const html = `<p>Username: ${username.value}</p><p>Password: ${password.value}</p>`;
  dataDiv.innerHTML = html;
});
