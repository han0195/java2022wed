/* -------- 카테고리 버튼 눌렀을때 함수(이벤트) ------- */
function categorybtn(){
	// 특정태그의 HTML 넣기 
	$("#categoryinput").html(
		'<input type="text" id="cname">'+
		'<button onclick="categoryadd()" type="button">등록</button>'
	)
}
/* -----------------------------------------*/



/* -------- 카테고리 등록 눌렀을때 함수(이벤트) ------- */
function categoryadd(){
	let cname = $("#cname").val();		/* 해당 입력값 가져오기 */ 
	$.ajax({							/* 비동기 통신 */
		url : "categoryadd" , 			/* 서블릿 URL 매핑 */
		data : { "cname" : cname } ,	/* 보내는 데이터 : 카테고리명 */
		success : function( result ){	/* 통신 성공시 받는 데이터 */
			if( result == 1 ){  
				alert("카테고리추가");
				$("#categoryinput").html("");
				fun();
			}
			else{ alert("카테고리실패"); }
		}
	});
}
/* -------- -------------------------- ------- */
/*---------- 카테고리 호출 --------------*/
$(function getcategory() {
	$.ajax({
		url : "getcategory",
		success : function( re ) {
			$("#categoryinput").html(re);
		}
	})
	fun = getcategory;
})

/*-------------- 폼 전송 -------------------*/
function productadd(){
	
	var form = $("#addform")[0]; // 폼 태그 id 호출 [0] 인덱스 호출 
	var formData = new FormData( form ); // js 지원하는 FormData 클래스를 이용한 form태그 객체화
	// ajax 기본적으로 문자열 전송한다.  인코딩 URL 타입 : application/x-www-form-urlencoded
	$.ajax({
		url : "productadd",
		type : 'POST' , /* type : 1.GET(기본타입) 2.POST(첨부파일사용시,보안용 등)*/
		data : formData , 		/* form 객체를 전송 */
		contentType : false ,  /* 전송시 문자열 타입X *
		/* contentType 전송시 내용물 URL 타입 //  String방식 : https://finance.naver.com/item/main.naver?code=005930 */
		/* contentType : true : URL 인코딩 타입 문자열 O [ 기본타입 ]
		/* contentType : false : URL 인코딩 타입 문자열 X */ 
		processData : false ,  /* 전송시 문자열 전송X */
		/*  html 에서 enctype="multipart/form-data"  */
		/*  ajax 에서 contentType : false, processData : false */
		success : function( re ){
			if( re == 1){
				alert(" 등록이 되었습니다. "); 
				form.reset(); 	/* form안에 적혀있는 내용 지우기 */
			}else{
				alert(" 등록이 실패 했습니다 [ 관리자에게 문의 ] ");
			}
		}
	});
}
/*---------------------------------------------------------------*/
$("#pimg").change( function(e) {
	
	/* 클라이언트가 업롣시 업로드파일의 경로 읽기*/
	let reader = new FileReader(); /*파일 경로 읽어오는 클래스*/
	reader.readAsDataURL(e.target.files[0]); /* readAsDataURL(파일) : 해당 파일 경로찾기 */
	reader.onload = function(e) { /* onload 통해 함수 실행 */
	$("#preview").attr("src" , e.target.result);/* attr 속성값 고치기 ("속성", 값) */
	}
	/* 
	클라이언트가 사진을 서버에 올릴때
	 서버가 클라이언트의 경로를 알수가 없다.
	*/
})
/* 첨부파일에 변경되면 특정태그에 첨부파일 이미지 표시 */



