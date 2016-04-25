var openeshop = openeshop || {};
$.extend(openeshop, {
	productCategory: {
		productCategorySelector: function(options){
			return new BootstrapDialog({
				size: BootstrapDialog.SIZE_NORMAL,
				type: BootstrapDialog.TYPE_DEFAULT,
				draggable: true,
				closable: true,
	            title: (options && options.title) || '',
	            message: $('<div></div>').load(contextPath + '/productCategory/tool/selector'),
	            buttons: [{
	            	label: BootstrapDialog.DEFAULT_TEXTS.CANCEL,
	            	action: function(dialogRef) {
	            		dialogRef.close();
	                }
	            }]
	        });
		},
		selectProductCategory: function(productCategory){
    		if(productCategory){
    			(window || window.parent).selectProductCategory(productCategory);
    		}
    	}
	}
});