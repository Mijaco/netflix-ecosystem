$(document).ready(function() {

});

function refreshCalendarFechaPago() {
	console.log("refreshCalendarFechaPago..")
	var data = {};
    data.periodo = getPeriodFromText();

	$.ajax({
		type: 'GET',
		data: data,
		url: 'fecha_pago',
		success: function(result) {
			$("#_aportesprimasportlet_WAR_aportesprimasportlet_fechaPago").replaceWith(result);

			loadDatePicker(true);
		}
	  });

}