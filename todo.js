const inputref = document.querySelector("div.inputs > input")
const buttonref = document.querySelector("div.submit > input")
const listulref = document.querySelector("div.tasklist > ul")
const completedulref = document.querySelector("div.completed > ul")

checkHtml = `<input onclick="checkTask(this)" class="check" type="button" value="Check">`
removeHtml = `<input onclick="removeTask(this)" class="remove" type="button" value="Remove">`
let tasks = []
function addTask(){ 
    if(tasks.includes(inputref.value)){
        alert("Task Already Exists!")
    }else{
        if(inputref.value !== ""){
            listulref.innerHTML += `<li>${inputref.value} ${checkHtml} ${removeHtml}</li>`
            tasks.push(inputref.value)
            inputref.value === ""
        }
    } 
}

function checkTask(button){
    const taskItem = button.parentElement
    taskItem.querySelector(".check").remove();
    completedulref.innerHTML += taskItem.innerHTML
    taskItem.remove()
}

function removeTask(button){
    const taskItem = button.parentElement
    taskItem.remove()
    tasks.splice(tasks.indexOf(taskItem.innerText), 1)
}