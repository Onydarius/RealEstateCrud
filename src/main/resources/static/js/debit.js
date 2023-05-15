    var plot_val;
    var option;
    var total;
    var deposit;
    var deposit_value;
    var interest;
    var anualPeriod;
    var period;
    var pay;
    var limit;

    function formatNumber(number){
        return number.toLocaleString('en-US', { style: 'currency', currency: 'USD' });
    }

    function updatePlotForm(){
        updateData();
        document.getElementById('price').value = formatNumber(total);
        document.getElementById('deposit').value = formatNumber(deposit);
        document.getElementById('total').value = formatNumber(balance);
        document.getElementById('month-pay').value = formatNumber(pay);
        document.getElementById('period-month').value = anualPeriod * 12;
    }

    function calculateTable(){
        updatePlotForm();
        $('#myTable').DataTable().clear().draw();
        for(var i = 1;i <= period; i++ ){
            var interestPay = balance * interest;
            var capitalPay = pay - interestPay;
            balance = balance - capitalPay;
            $('#myTable').DataTable().row.add([i, formatNumber(interestPay), formatNumber(capitalPay), formatNumber(balance)]).draw(false);
        }
    }

    function updateData(){
        plot_val = $("#plots").val();
        interest =  document.getElementById('interest').value/100;
        anualPeriod =  document.getElementById('period').value;
        period = document.getElementById('period-month').value;
        deposit_value = document.getElementById('deposit-percentage').value;
        if(plot_val){
            option = $("#plotList").find("option[value='" + plot_val + "']");
            total = option[0].dataset.price * option[0].dataset.surface;
            deposit = deposit_value/100 * total;
            balance = total - deposit;
            pay = interest * Math.pow((1+interest), period) * balance  / ((Math.pow((1+interest), period)-1));
        }
    }

    function handlerSubmit(){
        updateData();
        var  error = "";
        if (!plot_val){
            error += "Seleccione un terreno \n";
        }
        if(!deposit_value){
            error += "Escribe el enganche en porcentaje \n";
        }
        if(!interest){
            error += "Escribe el interes en porcentaje \n";
        }
        if(!period){
            error += "Defina el periodo de pago en años \n";
        }
        if(error !== ""){
            console.log(error)
        }else{
            document.getElementById("myForm").submit();
        }
    }