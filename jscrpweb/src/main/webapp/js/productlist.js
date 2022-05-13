function pnomove(pno){
	
	$("#modelinput").val(pno);
};
function activechange(active) {
	let pno = $("#modelinput").val();
	$.ajax({
		url: "activechange",
		data: {"active" : active, "pno" : pno},
		success : function(re){
			if(re == 1){
				alert("상태변경 성공");
				$("#modalclosebtn").click();
				$("#mainbox").load("productlist.jsp");
			}else {
				alert("상태변경 실패 [ 관리자 문의 바람 ] ");
			}
			
		}
	});
};
