/**
 * Created by zhaoyong on 2016-1-29.
 * 公用js
 */
var datatable_ajaxCallback = function(sSource, aoData, fnCallback, columns){
	if(sSource && columns){
		$.ajax({
    		type: 'POST',
    	    url: '' + sSource,
    	    data: function(aoDatas){
    	    	var ajaxData = {};
    	    	if(aoDatas && aoDatas.length > 0){
    	    		for(var i=0; i<aoDatas.length; i++){
    	    			var aoData = aoDatas[i];
    	    			if(aoData && aoData['name']){
    	    				var aoDataName = aoData['name'];
    	    				if('iDisplayStart' == aoDataName){
    	    					$.extend(ajaxData, {'offset' : (aoData['value'] || 0)});
    	    				} else if('iDisplayLength' == aoDataName){
    	    					$.extend(ajaxData, {'pagesize' : (aoData['value'] || 0)});
    	    				}
    	    			}
    	    		}
    	    	}
    	    	return ajaxData;
    	    }(aoData),
    	    success: function(result){
    	    	if(result && result.resultCode == '000000'){
    	    		var pagination = result.data;
    	    		if(pagination){
    	    		    var dataTableData = {
    	    		    	'iTotalRecords': parseInt(pagination['totalRecords'] || 0),
    	    		    	'iTotalDisplayRecords': parseInt(pagination['totalRecords'] || 0),
    	    		    	'aaData': function(datas){
    	    		    		var aaDatas = [];
    	    		    		if(datas && datas.length>0){
    	    		    			for(var i=0; i<datas.length; i++){
    	    		    				var data = datas[i];
    	    		    				if(data){
    	    		    					var aaData = [];
    	    		    					for(var j=0; j<columns.length; j++){
    	    		    						var column = columns[j];
    	    		    						if(column){
    	    		    							aaData.push(data[column] || '');
    	    		    						}
    	    		    					}
    	    		    					aaDatas.push(aaData);
    	    		    				}
    	    		    			}
    	    		    		}
    	    		    		return aaDatas;
    	    		    	}(pagination.datas)
    	    		    };
    	    		    console.log(dataTableData);
    	    		    fnCallback(dataTableData);
    	    		}
    	    	}
    	    }
    	});
	}
};