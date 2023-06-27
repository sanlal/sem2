
// MATH Object function 

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







//STRING METHOD 

let str = "RAMAVATH SANTHOSH!";

// 1. charAt()
console.log("charAt(): " + str.charAt(0)); 

// 2. charCodeAt()
console.log("charCodeAt(): " + str.charCodeAt(0));

// 3. concat()
console.log("concat(): " + str.concat(" How are you?")); 

// 4. endsWith()
console.log("endsWith(): " + str.endsWith("!")); 

// 5. includes()
console.log("includes(): " + str.includes("Hello")); 

// 6. indexOf()
console.log("indexOf(): " + str.indexOf("H")); 

// 7. lastIndexOf()
console.log("lastIndexOf(): " + str.lastIndexOf("l")); 

// 8. length
console.log("length: " + str.length); 

// 9. match()
console.log("match(): " + str.match(/l/g)); 

// 10. repeat()
console.log("repeat(): " + str.repeat(2));

// 11. replace()
console.log("replace(): " + str.replace(/Hello/g, "Hi")); 

// 12. search()
console.log("search(): " + str.search(/l/)); 

// 13. slice()
console.log("slice(): " + str.slice(0, 5)); 

// 14. split()
console.log("split(): " + str.split(", ")); 

// 15. startsWith()
console.log("startsWith(): " + str.startsWith("H"));

// 16. substr()
console.log("substr(): " + str.substr(0, 5));

// 17. substring()
console.log("substring(): " + str.substring(0, 5)); 

// 18. toLowerCase()
console.log("toLowerCase(): " + str.toLowerCase());

// 19. toUpperCase()
console.log("toUpperCase(): " + str.toUpperCase()); 
// 20. trim()
let trimmedStr = "  Hello, World!  ";
console.log("trim(): " + trimmedStr.trim()); 








// DATE Object methods 

let date = new Date(98, 1);
console.log(date);

date = new Date(22, 1);
console.log(date);

date = new Date("2/1/22"); 
console.log(date);
date.setYear(98);
console.log(date);
date.toString(); 


date.setYear(22);
console.log(date);
date.toString(); 
console.log(date);

let today = new Date();
console.log(today);
