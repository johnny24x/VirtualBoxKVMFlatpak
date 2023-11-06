const question = [{
   que: "Which of the following is a client site language?",
   a: "Java",
   b: "C",
   c: "Python",
   d: "JavaScript",
   correct: "d",
},
{
   que: "What does HTML stand for?",
   a: "Hypertext Markup Language",
   b: "Cascading Style Sheet",
   c: "Jason Object Notation",
   d: "Helicopters Terminals Motorboats Lamborginis",
   correct: "a",
},
{
   que: "What year was JavaScript launched?",
   a: "1996",
   b: "1995",
   c: "1994",
   d: "none of the above",
   correct: "b",
},
{
   que: "What does CSS stands for?",
   a: "Hypertext Markup Language",
   b: "Cascading Style Sheet",
   c: "Jason Object Notation",
   d: "Helicopters Terminals Motorboats Lamborginis",
   correct: "b",
}
];
let index = 0; 
let total = question.length;
let right = 0;
    wrong = 0;
const quesbox = document.getElementById("quesbox")
const optioninputs = document.querySelectorAll('.options')
const loadquestion = () => {
   if(index === total){
      return endquiz()
   }
   reset()
   const data = question[index]
   quesbox.innerText =`${index + 1}) ${data.que}`
   optioninputs[0].nextElementSibling.innerText = data.a;
   optioninputs[1].nextElementSibling.innerText = data.b;
   optioninputs[2].nextElementSibling.innerText = data.c;
   optioninputs[3].nextElementSibling.innerText = data.d;
   
 }
 const submitquiz = () => {
   const data = question[index]
   const ans = getanswer()
   if(ans === data.correct){
      right++;
   }else{
      wrong++
   }
   index++;
   loadquestion();
   return;
}

 const getanswer = () => {
   let answer;
   optioninputs.forEach(
      (input) => {
         if(input.checked){
           answer= input.value;

         }
      }
   )
   return answer;
 }
 const reset = () => {
   optioninputs.forEach(
      (input) => {
         input.checked = false;
      }
   )


 }
 const endquiz = () => {
   document.getElementById("box").innerHTML =`<h3> thank you for playing the quiz </h3><h2>${right} / ${total} are correct </h2>`
   
   
} 
 loadquestion();
