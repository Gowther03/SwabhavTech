const pararef = document.querySelector("body > div > p:nth-child(1)")
console.log(pararef)

const newParaRef = document.querySelectorAll(".test");
console.log(newParaRef)

newParaRef.forEach(function(para) {
    para.innerText +=" more Texr"
})

const divRef = document.querySelector("div.Test")
divRef.innerHTML += "<p>Hi from added tag for Test class</p>"

const div2Ref = document.querySelector("div.Test2")
div2Ref.innerHTML += "<p>Hi from added tag for Test2 class</p>"


const aref = document.querySelector("a")

console.log(aref.getAttribute("href"))


setTimeout(() => {
    aref.setAttribute("href", "www.swabhavtech.com")
    aref.innerText ="Link to Swabhav"
    console.log(aref.getAttribute("href"))

}, 2000);

const div3ref = document.querySelector("div.Test")

setTimeout(() => {
    div3ref.setAttribute("class", "success")
}, 3000);

//toggle

setTimeout(() => {
    div3ref.classList.add("newSuccess")
    div3ref.classList.remove("success")
}, 4000);

div3ref.addEventListener('click', (e)=>{
    div3ref.classList.toggle("success")
})


const div4ref = document.querySelector("div.Test2")

const childref = div4ref.children

console.log(childref[0])

Array.from(childref).forEach((child)=>{
    if(child.tagName ==="P"){
        child.classList.add("success")
    }else{
        child.classList.add("Test")
    }
})

