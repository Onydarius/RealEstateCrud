<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>


$(document).ready(function () {
    const stateSelect = document.querySelector("#state");
    const birthStateSelect = document.querySelector("#birth-state");


    const states = fetch("/data/data.json")
        .then(response => {
            return response.json();
        })
        .then(data => {
            Object.keys(data).forEach(state => {
                var opt = document.createElement('option');
                opt.value = state;
                opt.innerHTML = state;
                const clone = opt.cloneNode(true);
                stateSelect.appendChild(opt);
                birthStateSelect.appendChild(clone);

            });
            var opt = document.createElement('option');
            opt.value = "Otro";
            opt.innerHTML = "Otro";
            stateSelect.appendChild(opt);
            birthCitySelect.appendChild(opt);

            return data;
        });
})

//const birthCitySelect = document.querySelector("#birth-city");
//const citySelect = document.querySelector("#city");