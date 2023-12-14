const regist = document.getElementById('regBtn');
const regist_input = document.getElementById('name');



if(regist || regist_input){
	regist.addEventListener("click", brandReg);
	regist_input.addEventListener("keypress", (event) => {
		if(event.isComposing || event.keyCode === 13){
			brandReg();
		}
	});
}

function brandReg(){
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
}