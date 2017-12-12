YUI.add("aui-tree-io",function(e,t){function v(e){var t=this;t.publish(s,{defaultFn:t._onIOSuccessDefault})}var n=e.Lang,r=n.isFunction,i=n.isString,s="ioRequestSuccess",o="contentBox",u="io",a="ownerTree",f="loaded",l="loading",c="node",h="tree",p=e.getClassName,d=p(h,c,u,l);v.ATTRS={io:{lazyAdd:!1,value:null,setter:function(e){return this._setIO(e)}}},v.prototype={initializer:function(){var e=this;e.publish()},createNodes:function(t){var n=this,r=n.get("paginator");e.Array.each(e.Array(t),function(e){var t=n.getChildrenLength();if(r&&r.total<=t)return;n.appendChild(n.createNode(e))}),n._syncPaginatorUI(t)},initIO:function(){var t=this,n=t.get(u);r(n.cfg.data)&&(n.cfg.data=n.cfg.data.call(t,t)),t._syncPaginatorIOData(n);if(r(n.loader)){var i=e.bind(n.loader,t);i(n.url,n.cfg,t)}else e.io.request(n.url,n.cfg)},ioStartHandler:function(){var e=this,t=e.get(o);e.set(l,!0),t.addClass(d)},ioCompleteHandler:function(){var e=this,t=e.get(o);e.set(l,!1),e.set(f,!0),t.removeClass(d)},ioSuccessHandler:function(){var t=this,n=t.get(u),r=Array.prototype.slice.call(arguments),i=r.length,o=r[1];if(i>=3){var a=r[2];try{o=e.JSON.parse(a.responseText)}catch(f){}}var l=n.formatter;l&&(o=l(o)),t.createNodes(o),t.fire(s,o)},ioFailureHandler:function(){var e=this;e.fire("ioRequestFailure"),e.set(l,!1),e.set(f,!1)},_onIOSuccessDefault:function(e){var t=this,n=t.get(a);n&&n.ddDelegate&&n.ddDelegate.syncTargets()},_setIO:function(t){var n=this;if(!t)return null;i(t)&&(t={url:t}),t=t||{},t.cfg=t.cfg||{},t.cfg.on=t.cfg.on||{};var s={start:e.bind(n.ioStartHandler,n),complete:e.bind(n.ioCompleteHandler,n),success:e.bind(n.ioSuccessHandler,n),failure:e.bind(n.ioFailureHandler,n)};return e.each(s,function(i,s){var o=t.cfg.on[s];i.defaultFn=!0;if(r(o)){var u=e.bind(function(){i.apply(n,arguments),o.apply(n,arguments)},n);u.wrappedFn=!0,t.cfg.on[s]=u}else t.cfg.on[s]=i}),t}},e.TreeViewIO=v},"2.0.0",{requires:["aui-component","aui-io"]});
