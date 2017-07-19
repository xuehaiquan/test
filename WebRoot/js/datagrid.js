$(function(){
	createGrid();
})
function createGrid(){
	$('#data-grid').datagrid({
		toolbar:"#data",
		url:path+'/query',
		pagination:true,
		rownumbers:true,
		fitColumns : true,
		striped : true,
		loadMsg : '请稍候......',
		sortOrder : 'desc',
		remoteSort : false,
		pageSize : 10,
		pageList : [ 3, 5, 10],
		onLoadSuccess: function (data) {
            alert(1111);
        },
		columns : [[ {
						 field:'id',
						 title:'编码'
					 },
					 {
						 field:'name',
						 title:'姓名'
					  },
					  {
						  field:'password',
						  title:'密码'
					  },
					  {
						  field:'phone',
						  title:'手机号码'
					  }
		            ]]
		
	});
}