function hideAndShowInput(){
    var container = document.getElementById("capital-pay-container");
    if(container.matches(".d-none"))
        container.classList.remove("d-none");
    else
        container.classList.add("d-none");
}