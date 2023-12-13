const regist = document.getElementById('regBtn');

if(regist){
	regist.addEventListener("click", function(){
		fetch(`/api/brand/create`, {
			method: 'POST',
			headers: {
				"Content-Type": "application/json",
			},
			body: JSON.stringify({
			 name: document.getElementById("name").value,
			}),
		}).then(() => {
			alert("전송 완료");
		})
	});
}