const regist = document.getElementById("regBtn");

if(regist){
	regist.addEventListener("click", function(){
		fetch(`/api/menu/create`, {
			method: 'POST',
			headers: {
				"Content-Type" : "application/json",
			},
			body: JSON.stringify({
				sale: document.getElementById("sale").checked,
				menuName: document.getElementById("menuName").value,
				price: document.getElementById("price").value,
				promotion: document.getElementById("promotion").value,
				brand: {
					id: document.getElementById("brandId").value,
					name: document.getElementById("brandId").innerText
				}
			}),
		}).then(() => {
			alert("전송 완료");
		})
	});	
}

const brandBtn = document.getElementById("brandBtn");

if(brandBtn){
	brandBtn.addEventListener("click", function(){
		window.open(`/newBrand`, '_blank', 'width=540, height=540');
	});
}