 // 문서 열렸을때 실행 함수 무조건 실행
 $(document).ready( function(){
	 $('#summernote').summernote({
    	placeholder: '내용 입력',
    	tabsize: 2,
   	 	minHeight : 250 , // 최소 높이
   	 	maxHeight : null , // 최대 높이 
   	 	lang : 'ko-KR'	// 메뉴 한글 버전 
	  });

	  
});


function filedelete( bno ){
	
	// HTML에서 JS 로 변수 이동[통신]
		// 1. 메소드 인수로 이동 
		// 2. 태그의 value 혹은 html 이동  [ $("#bno").val();]
	alert("파일만삭제");
	// 비동기통신 = 페이지 전환이 없는 상태 DB통신 
	// JQUERY라이브러리의 AJAX 사용 
	$.ajax({
		url : "filedelete", /*서블릿통신 */ 
		data : { "bno" : bno }, /* 통신 데이터 : { 변수명 : 값 , 변수명2 : 값  } */
		success : function( result ){
			if( result == "1" ){
				 alert("첨부파일삭제성공 "); 
				 $("#oldfile").html("없음");
			}
			else { alert("첨부파일삭제실패[관리자에게문의]")}
		}
	});
	
}