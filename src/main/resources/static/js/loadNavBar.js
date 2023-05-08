 $(document).ready(() =>{


 $.get("../fragments/nav.html", function (data) {
             $("#nav-placeholder").replaceWith(data);
         });



 })