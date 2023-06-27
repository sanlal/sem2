console.log("Hello");
let x= 10;
let y= 6;
let z;
z= x+y;
console.log("Addition: ");
console.log(z); //16

z= x-y;
console.log("Subtraction: ");
console.log(z); //4

z= x*y;
console.log("Multiplication: " + z);
//console.log(z); //60

z= x/y;
console.log("Division");
console.log(z); //1.6666666666666667


//Exploring the MATH object

z=Math.PI;
console.log("Pi value: ");
console.log(z);

z=Math.ceil(12.5);
console.log("Ciel value gives max of real number:");
console.log(z);

z=Math.floor(12.5);
console.log("Floor value gives lowest of real number: ");
console.log(z);

z=Math.cbrt(8);
console.log("cube Root");
console.log(z);

z=Math.abs(-12);
console.log("Absolute value: ");
console.log(z);

z=Math.max(1,0,56,48,-56,4,9,80);
console.log("Maximum: ");
console.log(z);

z=Math.min(1,0,56,48,-56,4,9,80);
console.log("minimum : ");
console.log(z);

z=Math.pow(2,3);
console.log("power: ");
console.log(z);

z=Math.random();
console.log("Rondom number is: ");
console.log(z);



z=Math.trunc(89.25);
console.log("Return INTEGER part of number is: ");
console.log(z);

z=Math.sign(); //NaN //sign(-23) gives -1
console.log("Returns 1 or -1 or NaN: ");
console.log(z);

a=90;
z=Math.sin(a*Math.PI/180);
console.log("sign (" + a+ ") is: ");
console.log(z);

z=Math.cos(a*Math.PI/180);
console.log("cos (" + a+ ") is: ");
console.log(z);

Math.log(1);
Math.log(2);//returns natural logarithm 

Math.log2(8);//base 2
Math.log10(1000);//base 10

// Returns a random integer from 0 to 9:
Math.floor(Math.random() * 10);

// Returns a random integer from 0 to 10:
Math.floor(Math.random() * 11);

let i = Math.acos(-1);//returns the arccosine (in radians) of a number.

