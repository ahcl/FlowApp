var count = 0;
var number = 0;
//添加新闻
$(".plus").click(function(){
	  if(count<4){
		  count++;
		$(".thumbnails").append("<li class='span11 clear"+count+"'>"+
							"<a href='#' class='thumbnail'>"+
							"<div class='cover-img-little'>"+
							"<div class='cover-img-little-left'>"+
							"<p class='litle-title'>标题</p>"+
							"</div>"+
							"<div class='cover-img-little-right'></div>"+
							"</div>"+
							"</a>" +
							"<div class='actions'>"+
							"<a title='' href='#'><i class='icon-pencil icon-white'></i></a>"+
							"<a title='' href='javaScript:del("+count+")'><i class='icon-remove icon-white'></i></a>"+
							"</div>"+
							"</li>");
		
		//alert(count);
	  }else{
		  alert("最多添加4个");
	  }
});

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
			number++;
			$("img").addClass("img"+number);
			$("#d2").append("<a title='' href='javaScript:delImg("+number+")'><i class='icon-remove remove"+number+"'></i></a>");
			//activeImg.value=fr.result;
			//alert(document.f1.f.name);
			};
			}
			else{
				//div1.style.value="请上传正确的格式";
				document.getElementsByTagName("p")[0].innerHTML = "不是图片类型，请重新上传<br>";
			}
}

/*保存后样式修改
$("#savebt").click(function(){
	alert(1);
	$(".cover-img-top-title").remove();
	$(".cover-img-top-title").css('background-color','red');

});*/

//删除添加框
function del(ccc){
	$(".clear"+count).remove();
	count--;
	//alert(count);
}

//删除图片
function delImg(number){
	$(".img"+number).remove();
	$(".remove"+number).remove();
}
//删除保存新闻
function delNews(id){
	if(confirm('是否删除')){
		 window.location.href="news/delNews.do?id="+id;
	}
}

//编辑表单修改
function modifyNews(id){
	$.ajax({
		   type: "POST",
		   url: "news/findNewsById.do",
		   data: "id="+id,
		   dataType:"json",
		   success: function(data){
				   //alert(data[0].newsName);
			   $("#newsName").val(data[0].newsName);
			   KindEditor.html("#newsContent",data[0].newsContent); 
			   $("#d2").append("<img src='/flowApp/"+data[0].newsImg+"'>");
			   $("#d2").append("<a title='' href='javaScript:delImg("+data[0].id+")'><i class='icon-remove remove"+data[0].id+"'></i></a>");
			   $("img").addClass("img"+data[0].id);
			   $("#savebt").remove();
			   $(".form-actions").append("<button type='submit' class='btn btn-primary bnt-new' id='savebt'>修改保存</button>");
		   }
		});
}