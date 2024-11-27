let boxes = prompt("Enter the Range(From 0 to ?)")
let number = prompt("Enter the guessing number")
const divref = document.querySelector("div.numbers")

for (let index = 1; index <= boxes; index++) {
    const pref = document.createElement("p")
    pref.classList.add("Test")
    pref.innerText = `${index}`
    divref.appendChild(pref)
    pref.addEventListener('click', (e)=>{
        if(pref.innerText === number){
            pref.classList.toggle("success")
            setTimeout(() => {
                alert("Congratulations You Won!")
            },200);
        }else if(pref.innerText >= number){
            pref.classList.toggle("far")
        }else if(pref.innerText <= number){
            pref.classList.toggle("close")
        }
    })
}
const clicks = document.querySelector('.clicks');
clicks.id = document.querySelector('clicks');

EventCounts