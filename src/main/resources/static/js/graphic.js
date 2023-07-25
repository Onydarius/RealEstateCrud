var date = new Date();

var months = ["Enero",
"Febrero",
"Marzo",
"Abril",
"Mayo",
"Junio",
"Julio",
"Agosto",
"Septiembre",
"Octubre",
"Noviembre",
"Diciembre", ]

var firstMonths = months.splice(date.getMonth()+1);
var lastMonths = months.splice(0, date.getMonth()+1)

firstMonths = firstMonths.map(i=> i + ' ' + (date.getFullYear() -1))
lastMonths = lastMonths.map(i=> i + ' ' + (date.getFullYear()))

var labels =  firstMonths.concat(lastMonths);

const ctx = document.getElementById('grafica');

  new Chart(ctx, {
    type: 'bar',
    options: {
            plugins: {
              legend: {
                display: false
              },
            }
          },
    data: {
      labels: labels,
      datasets: [{
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1,
        borderColor: '#36A2EB',
        backgroundColor: '#9BD0F5',
      }]
    },
    options: {
      scales: {
        y: {
          beginAtZero: true
        }
      }
    }
  });


