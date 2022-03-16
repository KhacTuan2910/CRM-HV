$(function() {
	$('#btn-user-edit').click(function() {
		var id = $(this).data("id");
		var link = $(this).attr('href');
		$.ajax({
			url: link,
			type: 'GET',
			dataType: 'JSON',
			data: {
				user_id: id
			},
			success: function(res) {
				$("#fullname").val(res.fullname);
				$("#email").val(res.email);
				$("#password").val(res.password);
				$("#phone").val(res.phone);
				$("#address").val(res.address);
				$("#role").val(res.role);
				$("#password").hide();
			}
		})
	})
})