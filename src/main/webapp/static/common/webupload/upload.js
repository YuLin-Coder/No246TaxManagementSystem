function createFileUpload(projectUri){
	var imgDivs = $(".imgUpload");
	for(var i=0;i<imgDivs.length;i++){
		var uploadId = $(imgDivs[i]).attr("id");
		var uploadNum = $(imgDivs[i]).attr("upload-num");
		var uploadType = $(imgDivs[i]).attr("upload-type");
		var tip = $(imgDivs[i]).attr("tip");
		var redTip = $(imgDivs[i]).attr("red-tip");
		var preVal = $(imgDivs[i]).attr("init-val");
		if(uploadNum==undefined||uploadNum==''){
			uploadNum=1;
		}
		if(uploadType==undefined||uploadType==''){
			uploadType=1;
		}
		var typename = "";
		if(uploadType==1){
			typename="图片";
		}else if(uploadType==2){
			typename="视频";
		}else if(uploadType==3){
			typename="音频";
		}else if(uploadType==4){
			typename="文件";
		}
		if(tip==undefined||tip==''){
			tip='请上传';
			alert(redTip);
			tip+=typename+"，且"+typename+'数量不能大于'+uploadNum+'个';
		}
		if(redTip!=null&&redTip!=undefined){
			tip+='<span style="color:red">'+redTip+'</span>';
		}
		$(imgDivs[i]).append('<div id="imgContent'+uploadId+'"></div>');
		$(imgDivs[i]).append('<div id="imgBar'+uploadId+'"></div>');
		var uploadContent='';
		uploadContent+='<div  class="wu-example">';
		uploadContent+='<div class="btns" style="margin-top:20px;">';
		uploadContent+='	<div class="btns" style="display:inline">';
		uploadContent+='		<div id="'+uploadId+'Picker" style="display:inline">选择 '+typename+'</div>';
		uploadContent+='	</div>';
		uploadContent+='<span style="">'+tip+'</span>';
		uploadContent+='</div>';
		$(imgDivs[i]).append(uploadContent);
		if(preVal!=undefined&&preVal!=''){
			var preValSplit = preVal.split(';');
			for(var j=0;j<preValSplit.length;j++){
				addAImg(preValSplit[j],uploadType,uploadId,projectUri);
			}
		}
		createUpload(uploadId,uploadType,uploadNum,projectUri);
	}
}
function addAImg(url,uploadType,domId,projectUri){
	barNum++;
	var abar='imgbar'+barNum;
	var html='<div style="margin-top:20px;">'
		+'<div id="uploadContent'+barNum+'" style="width:400px;">';
	 html +='<div><a href="javascript:void(0)" data-type="img" onclick="deleteImg(this)" style="position:relative;left:97%;top:20px;">';
	 html += '<img width="40px;" src="'+projectUri+'/static/common/webupload/关 闭.png">';
	 html += '</a>';
		if(uploadType==1){
			html+='<img src="'+url+'" class="uploadShow" val-id="'+domId+'" val="'+url+'" style="width:400px">';
		}else if(uploadType==2){
			html+='<video src="'+url+'" class="uploadShow"  val-id="'+domId+'" val="'+url+'"  controls="controls" style="width:400px;"></video>';
		}else if(uploadType==3){
			html+='<audio src="'+url+'" class="uploadShow"  val-id="'+domId+'" val="'+url+'"  controls="controls" style="width:400px;"></audio>';
		}else if(uploadType==4){
			var index1 = url.lastIndexOf('/');
			var index2 = url.lastIndexOf('.');
			html+='<a href="'+url+'"  class="uploadShow"  val-id="'+domId+'" val="'+url+'" download="'+url.substring(index1+1,index2)+'">点击下载文件</a>';
		}
		html+='</div>'
	 html +='</div><div id="'+abar+'"></div></div>';
		$("#imgContent"+domId).append(html);	
}
var barNum=0;
function createUpload(domId,uploadType,uploadNum,projectUri){
	var state = 'pending'; // 上传文件初始化
	var uploader = WebUploader.create({
		swf : projectUri+'/static/common/webupload/Uploader.swf',
		server : projectUri+'/commonapi/imgUpload/thumb',
		pick : '#'+domId+'Picker',
		resize : false,
		 duplicate :true
	});
	uploader.on('fileQueued', function(file) {
		var typeName ='';
		if(uploadType==1){//图片
			if(file.ext!='jpg'&&file.ext!='jpeg'&&file.ext!='png'&&file.ext!='gif'){
				alert("请上传图片格式：jpg/jpeg/png/gif");
				 uploader.reset();
				return;
			}
			typeName='图片';
		}else if(uploadType==2){//视频
			if(file.ext!='mp4'&&file.ext!='avi'){
				alert("请上传视频格式：mp4/avi");
				 uploader.reset();
				return;
			}
			typeName='视频';
		}else if(uploadType==3){//音频
			if(file.ext!='mp3'&&file.ext!='wav'){
				alert("请上传音频格式：mp3/wav");
				 uploader.reset();
				return;
			}
			typeName='音频';
		}else{
			typeName='文件';
		}
		var currentNum = getUploadFile(domId).length;
		if(currentNum>=uploadNum){
			alert(typeName+"数量最多可上传"+uploadNum+"个");
			 uploader.reset();
			return;
		}
		if(file.size>1000*1000*1000){
			 uploader.reset();
			 	alert('上传'+typeName+'大小不能大于1G','好的', function(){console.log('ok');});
	    	return;
	    }
		barNum++;
		var abar='imgbar'+barNum;
		$("#imgContent"+domId).append('<div id="uploadContentParent'+barNum+'" style="margin-top:20px;">'
		+'<div id="uploadContent'+barNum+'" style="width:400px;">'
		+'<img src="'+projectUri+'/static/common/webupload/imgloading.gif" style="width:400px;">'
		+'</div><div id="'+abar+'"></div></div>');
		uploader.upload();
	});
	uploader.on('uploadProgress',
					function(file, percentage) {
						var abar='imgbar'+barNum;
						$("#"+abar).html(
								'<div class="progress progress-striped active" style="width:400px">'
										+ '<div class="progress-bar" id="'+abar+'Pro" role="progressbar" style="width: 0%;background-color:#5eb95e;">'
										+ '</div></div><font id="'+abar+'Txt"></font>');
						$('#'+abar+'Pro').css('width', percentage * 100 + '%');
						$("#"+abar+"Txt").html('进度'+(percentage * 100).toFixed(2) + '%');
					});
		uploader.on('uploadSuccess', function(file, response) {
			debugger;
		var html = '<div><a href="javascript:void(0)" id="delBtn'+barNum+'" data-type="img" onclick="deleteImg(this)" style="position:relative;left:97%;top:20px;">';
		 html += '<img width="40px;" src="'+projectUri+'/static/common/webupload/关 闭.png">';
		 html += '</a>';
		if(uploadType==1){
			html+='<img src="'+response.url+'" class="uploadShow" val-id="'+domId+'" val="'+response.url+'" style="width:400px">';
		}else if(uploadType==2){
			html+='<video src="'+response.url+'" class="uploadShow"  val-id="'+domId+'" val="'+response.url+'"  controls="controls" style="width:400px;"></video>';
		}else if(uploadType==3){
			html+='<audio src="'+response.url+'" class="uploadShow"  val-id="'+domId+'" val="'+response.url+'"  controls="controls" style="width:400px;"></audio>';
		}else if(uploadType==4){
			var index1 = response.url.lastIndexOf('/');
			var index2 = response.url.lastIndexOf('.');
			html+='<a href="'+response.url+'"  class="uploadShow"  val-id="'+domId+'" val="'+response.url+'" download="'+response.url.substring(index1+1,index2)+'">点击下载文件</a>';
		}
		html+='</div>'
		$("#uploadContent"+barNum).html(html);	
		$("#imgbar"+barNum+'Pro').remove();
		$("#imgbar"+barNum+'Txt').remove();
	});
	uploader.on('uploadError', function(file) {
		$('#' + file.id).find('p.state').text('上传出错');
	});
	uploader.on('uploadComplete', function(file) {
		$('#' + file.id).find('.progress').fadeOut();
	}); 
}
function deleteImg(e){
	$(e).parent().parent().parent().remove();
}
function getUploadFileStr(domId){
	var list = getUploadFile(domId);
	var rs ='';
	for(var i=0;i<list.length;i++){
		rs+=list[i]+';';
	}
	if(rs!=''){
		rs = rs.substring(0,rs.length-1);
	}
	return rs;
}
function getUploadFile(domId){
	var uploads = $(".uploadShow");
	var list =[];
	for(var i=0;i<uploads.length;i++){
		var valId = $(uploads[i]).attr("val-id");
		var val = $(uploads[i]).attr("val");
		if(valId==domId){
			list.push(val);
		}
	}
	return list;
}
