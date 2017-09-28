function submitPizza(){
	var address= {
		street: $("#your_street").val(),
		number: $("#your_street_number").val(),
		complement: $("#your_complement").val(),
		postalCode: $("#your_postal").val(),
		city: $("#your_city").val(),
		country: $("#your_country").val()
	}
	var payment = {
		provider: $("#your_cc_provider").val(),
		number: $("#your_cc_num").val(),
		expiration: $("#your_cc_expire").val()
	}
	var customer = {
		name: $("#your_name").val(),
		email: $("#your_email").val(),
		address: address,
		payment: payment
	}		
	
	var menuorder = {
		restaurant: $("#your_restaurant").val(),
		pizza: $("#pizzaChoice option:selected").attr("id")
		
		
	}		
	
	var data = {
		customer: customer,
		menuOrder: menuorder
	}
	
	$('#target').html('sending..');
	
	$.ajax({
	            url: '/userinfo/PizzaSubmit',
	            type: 'post',
	            dataType: 'json',
	            success: function (data) {
	                $('#target').html(data.msg);
	            },
	            data: data
	        });
	
	//alert(JSON.stringify(data));
}

