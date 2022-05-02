
// jqeruy : js 프레임워크
	//$ : 제이쿼리
//$(function() {실행문 ;} ) // 문서 실행시 무조건 실행되는 함수
	//keyup() : 해당 키보드 입력되었을때
	

	let signpass = new Boolean(false);
	$("#mid").keyup(function(){ // mid가 입력될때마다 해당 함수 실행
			// HTML 값 가져오기
	let mid = document.getElementById("mid").value;
	
	let idcheck = document.getElementById("idcheck");
	
	// 정규 표현식 : 특정한 규칙을 가지는 문자열의 집합 언어
	let idj = /^[a-zA-Z0-9]{5,15}$/;
		// /^ : 정규표현식 시작
		// /$ : 정규표현식 끝
		// [a-z] : 소문자 찾음
		// [0-9] : 숫자 찾음
		// { 최소길이, 최대길이 } : 문자 최소길이~최대길이 까지만 입력
			// 정규표현식 test( 비교할 변수 )
	if(idj.test(mid)){ //  정규표현식과 같으면
		// 아이디 중복체크
			// 비동기식 통신 [ 목적 : 페이지 전환이 없이 java (Controller) 통신 ]
		//$.ajax({ 속성 = 속성값 , 속성 = 속성값});
		$.ajax({
			url : "../Idcheck", //해당서블릿의 경로
			data : { mid : mid }, // 해당 경로로 보내는 데이터
			success : function( result ) { // 통신 성공후 받는 데이터

				if(result == "1Served at: /jspweb"){
					idcheck.innerHTML = "중복된 아이디입니다.";
					signpass = false;	
				}else{
					idcheck.innerHTML = "사용가능한 아이디입니다.";
					signpass = true;
				};	
			}
		});
		
	}else {
		idcheck.innerHTML = "영문, 숫자 포한 5~15글자를 입력해주세요";
	};
	});
	$("#password").keyup(function() {
		let mpw = document.getElementById("password").value;
		let pwj = /^[a-zA-Z0-9]{5,15}$/
		
		if(pwj.test(mpw)){
			$("#pwcheck").html("사용가능한 비밀번호");	
			signpass = true;
		}else{
			$("#pwcheck").html("영문, 숫자 포함 5~15글자를 입력해주세요");
			signpass = false;
		}
		
	});
	// 비밀번호 체크
	$("#pwacheck").keyup(function(){
		let mpw = document.getElementById("password").value;
		
		let mrpw = $("#pwacheck").val();
		
		if(mpw != mrpw){
			// 비밀번호 와 비밀번호체크 와 다르면
				// 자바스크립트는 equals 사용 x
			$("#pwcheck").html("패스워드가 서로 다릅니다.");
			signpass = false;
		}else {
			$("#pwcheck").html("");
			signpass = true;
		};
	});
	
	//이름체크
	$("#mname").keyup(function() {
		
		let mname = $("#mname").val(); // 해당아이디의 값을 가져옴
		let namej = /^[가-힣]{2,10}$/; // 한글만 2~10 정규표현식
		if(namej.test(mname)){
			$("#namecheck").html("사용가능");
			signpass = true;
		}else{
			$("#namecheck").html("한글만 2~10글자만 입력해주세요");
			signpass = false;
		} 	
	});
	
	// 전화번호
	$("#mphone").keyup(function(){
		let mphone = $("#mphone").val();
		let mphonej = /^010-([0-9]{4})-([0-9]{4})$/;
		if(mphonej.test(mphone)){
			$("#mphonecheck").html("사용가능 전화번호");
			signpass = true;
		}else {
			$("#mphonecheck").html("형식이잘못된 전화번호입니다. [예시) 010-1234-1234]");
			signpass = false;
		};
	});
	
	//이메일
	$("#memail").keyup(function(){
		let memail = $("#memail").val();
		let memailj =  /^[a-zA-Z0-9+-\_.]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/;
		if(memailj.test(memail)){
			$("#memailcheck").html("사용가능 이메일");
			signpass = true;
		}else {
			$("#memailcheck").html("올바른 이메일 형식이 아닙니다.");
			signpass = false;
		};
	});
	 function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("sample4_roadAddress").value = roadAddr;
                document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
                if(roadAddr !== ''){
                    document.getElementById("sample4_extraAddress").value = extraRoadAddr;
                } else {
                    document.getElementById("sample4_extraAddress").value = '';
                }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else if(data.autoJibunAddress) {
                    var expJibunAddr = data.autoJibunAddress;
                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                    guideTextBox.style.display = 'block';
                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }        
        }).open();
    }
    let ad = $("#sample4_postcode").val();
    if(ad == null || ad != ""){
		signpass = false;
	}else{
		signpass = true;
	}
    
    
	// 최종회원가입
		$("#in").click(function(){
			
			if(signpass == true){	
				let signtext = {
				id : $("#mid").val(),
				pw : $("#password").val(),
				name : $("#mname").val(),
				phone : $("#mphone").val(),
				emali : $("#memail").val(),
				address : $("#sample4_postcode").val() +" "+  $("#sample4_detailAddress").val()
				}
				$.ajax({
				url : "../siginup", //해당서블릿의 경로
				data : { 
					id : signtext.id,
					pw : signtext.pw,
					name : signtext.name,
					phone : signtext.phone,
					emali : signtext.emali,
					address : signtext.address
							}, // 해당 경로로 보내는 데이터
				success : function( result ) { // 통신 성공후 받는 데이터
						if(result == "1Served at: /jspweb"){
						
						}else{
						
						};	
					}
				});
				
			}else {
				alert("필수항목 누락");
			}		
		});
		
		
				

