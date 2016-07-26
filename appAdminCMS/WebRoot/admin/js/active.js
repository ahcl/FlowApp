//图片显示
function result(){
				//alert("123");
			var div1 = document.getElementById("d1");
		    var file = document.getElementById("f").files[0];
			var div2 = document.getElementById("d2");
			var activeImg = document.getElementById("activeImg");
			
			var aa= document.f1.f.value.toLowerCase().split('.');
			
			if(aa[aa.length-1]=='gif'||aa[aa.length-1]=='jpg'||aa[aa.length-1]=='png'){
			div1.style.display="none";
			var fr = new FileReader();
			fr.readAsDataURL(file);
			fr.onload = function(){
			/*div.innerHTML = "<img src='"+fr.result+"'>";*/
			var img = document.createElement("img");
			img.src = fr.result;
			img.style.width="200px";
			div2.style.display="block";
			div2.appendChild(img);
			//activeImg.value=fr.result;
			//alert(document.f1.f.name);
			};
			}
			else{
				//div1.style.value="请上传正确的格式";
				document.getElementsByTagName("p")[0].innerHTML = "不是图片类型，请重新上传<br>";
			}
}
//删除活动
function delActive(id){
	if(confirm('是否删除')){
		 window.location.href="active/delActive.do?id="+id;
	}
}

//取消发布
function delUpdateFlag(id){
	if(confirm('撤销发布？')){
		 window.location.href="active/delUpdateFlag.do?id="+id;
	}
}

//发布
function updateFlag(id){
	if(confirm('是否发布?')){
		 window.location.href="active/updateFlag.do?id="+id;
	}
}
