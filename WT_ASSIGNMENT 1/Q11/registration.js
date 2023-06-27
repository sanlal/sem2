function validate() {
  // Get the values from the input fields
  const name = document.getElementById('name').value;
  const password = document.getElementById('password').value;
  const email = document.getElementById('email').value;
  const phoneNumber = document.getElementById('phone').value;

  // Regular expressions for validation
  const nameRegex = /^[a-zA-Z]{6,}$/;
  const passwordRegex = /^.{6,}$/;
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const phoneNumberRegex = /^[0-9]{10}$/;

  // Validate the name field
  if (!nameRegex.test(name)) {
    alert('Name should contain only alphabets and be at least 6 characters long.');
    return false;
  }

  // Validate the password field
  if (!passwordRegex.test(password)) {
    alert('Password should be at least 6 characters long.');
    return false;
  }

  // Validate the email field
  if (!emailRegex.test(email)) {
    alert('Please enter a valid email address.');
    return false;
  }

  // Validate the phone number field
  if (!phoneNumberRegex.test(phoneNumber)) {
    alert('Phone number should contain 10 digits only.');
    return false;
  }

  // If all fields are valid, return true
  return true;
}
const address = document.getElementById('address').value;
const city = document.getElementById('city').value;
const state = document.getElementById('state').value;
const zip = document.getElementById('zip').value;


function validateRegistrationForm() {
  // Get the values from the input fields
  const name = document.getElementById('name').value;
  const password = document.getElementById('password').value;
  const email = document.getElementById('email').value;
  const phoneNumber = document.getElementById('phone').value;

  // Regular expressions for validation
  const nameRegex = /^[a-zA-Z]{6,}$/;
  const passwordRegex = /^.{6,}$/;
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  const phoneNumberRegex = /^[0-9]{10}$/;

  // Validate the name field
  if (!nameRegex.test(name)) {
    alert('Name should contain only alphabets and be at least 6 characters long.');
    return false;
  }

  // Validate the password field
  if (!passwordRegex.test(password)) {
    alert('Password should be at least 6 characters long.');
    return false;
  }

  // Validate the email field
  if (!emailRegex.test(email)) {
    alert('Please enter a valid email address.');
    return false;
  }

  // Validate the phone number field
  if (!phoneNumberRegex.test(phoneNumber)) {
    alert('Phone number should contain 10 digits only.');
    return false;
  }

  // If all fields are valid, return true
  return true;
}
