/****************************************************/
//var urlAjax = "http://" + window.location.host + "/vagper-1/";
//var urlImg  = "http://" + window.location.host + "/vagper-1/img/";
var urlAjax = "http://" + window.location.host + "/";
var urlImg  = "http://" + window.location.host + "/img/";
/****************************************************/
function addNewPosKkmF(){
   var mod_cont = document.getElementById("contentForm");
   mod_cont.style.width = "400px";
   var modal = document.getElementById("modalForm");
   mod_cont.innerHTML = block_addNewPosKkm;
   modal.style.display = "block";
}
/****************************************************/
function submitAddNewPosKkmF(){
   var newPosKkm = [];
	newPosKkm[0] = document.getElementById('inn').value;
	newPosKkm[1] = document.getElementById('kkmZavNum').value;
	newPosKkm[2] = document.getElementById('kkmModel').value;
	newPosKkm[3] = document.getElementById('kkmVersion').value;
	newPosKkm[4] = document.getElementById('kkmFn').value;
	newPosKkm[5] = document.getElementById('kkmFnStatus').value;
	newPosKkm[6] = document.getElementById('kkmRnn').value;
	newPosKkm[7] = document.getElementById('gns').value;
	newPosKkm[8] = document.getElementById('billing').value;
   //---------------------------------------
   var urlA = new URL(urlAjax + "save-new-pos-kkm");  	   
   var urlRedir = new URL(urlAjax + "main");  	   
   //---------------------------------------
   $.ajax({
	 url: urlA,
	 type: 'post',
	 data: { new_pos_kkm:newPosKkm },
	 dataType: 'json',
	 success:function(response){
		//alert( JSON.stringify(response) );
        closeModalForm();
		//alert( response["status"] );
        window.location.replace(urlRedir);		
	 }
   });
}
/****************************************************/
function closeModalForm(){
   var mod_cont = document.getElementById("contentForm");
   var modal = document.getElementById("modalForm");
   mod_cont.innerHTML = "";
   modal.style.display = "none";
}
/****************************************************/

