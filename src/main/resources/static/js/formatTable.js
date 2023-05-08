 $(document).ready(() =>{
 $('#myTable').DataTable({
                 dom: 'Bfrtip',
                 language: {
                     "decimal": "",
                     "emptyTable": "No hay información disponible en la tabla",
                     "info": "Mostrando del _START_ al _END_ de un total de  _TOTAL_ entradas",
                     "infoEmpty": "Mostrando 0 a 0 de 0 entradas",
                     "infoFiltered": "(Filtrando de  un total de _MAX_  entradas)",
                     "infoPostFix": "",
                     "thousands": ",",
                     "lengthMenu": "Mostrando _MENU_ entradas",
                     "loadingRecords": "Cargando...",
                     "processing": "",
                     "search": "Busqueda:",
                     "zeroRecords": "No se encontraron resultados",
                     "paginate": {
                         "first": "Primera",
                         "last": "Ultima",
                         "next": "Siguiente",
                         "previous": "Anterior"
                     },
                     "aria": {
                         "sortAscending": ": activate to sort column ascending",
                         "sortDescending": ": activate to sort column descending"
                     }
                 }
             });
 });

