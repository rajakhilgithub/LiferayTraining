YUI.add("aui-scheduler-base",function(e,t){var n=e.Lang,r=n.isArray,i=n.isBoolean,s=n.isDate,o=n.isFunction,u=n.isNumber,a=n.isObject,f=n.isString,l=n.isValue,c=e.Color,h=e.DataType.DateMath,p=e.WidgetStdMod,d=":",v=".",m="",g="&ndash;",y=" ",b=function(t){return t instanceof e.ModelList},w=function(t){return t instanceof e.SchedulerView},E="%H:%M",S="%l",x="%M",T=function(e){var t=[S];return e.getMinutes()>0&&(t.push(d),t.push(x)),e.getHours()>=12&&t.push("pm"),t.join(m)},N="data-view-name",C="scheduler-base",k="scheduler-calendar",L="scheduler-view",A="activeView",O="all",M="allDay",_="button",D="color",P="colorBrightnessFactor",H="colorSaturationFactor",B="content",j="controls",F="controlsNode",I="date",q="day",R="disabled",U="endDate",z="eventRecorder",W="hd",X="header",V="headerNode",$="hidden",J="icon",K="iconNextNode",Q="iconPrevNode",G="icons",Y="isoTime",Z="locale",et="meeting",t="name",tt="nav",nt="navNode",rt="navigationDateFormatter",it="next",st="nextDate",ot="node",ut="noscroll",at="palette",ft="past",lt="prev",ct="prevDate",ht="reminder",pt="rendered",dt="repeated",vt="scheduler",mt="scheduler-event",gt="scrollable",yt="short",bt="startDate",wt="strings",Et="title",St="titleDateFormat",xt="today",Tt="todayDate",Nt="todayNode",Ct="triggerNode",kt="view",Lt="viewDateNode",At="viewStack",Ot="views",Mt="viewsNode",_t="visible",Dt="right",Pt="active",Ht="chevron",Bt="btn",jt="left",Ft=e.getClassName,It=Ft(J),qt=Ft(C,j),Rt=Ft(C,W),Ut=Ft(C,J,it),zt=Ft(C,J,lt),Wt=Ft(C,tt),Xt=Ft(C,xt),Vt=Ft(C,kt),$t=Ft(C,kt,m),Jt=Ft(C,kt,I),Kt=Ft(L,ut),Qt=Ft(L,gt),Gt=Ft(Pt),Yt=Ft(Bt),Zt=Ft(J,Ht,Dt),en=Ft(J,Ht,jt),tn=Ft(C,Ot),nn=Ft(mt),rn=Ft(mt,O,q),sn=Ft(mt,B),on=Ft(mt,R),un=Ft(mt,$),an=Ft(mt,J,R),fn=Ft(mt,J,et),ln=Ft(mt,J,ht),cn=Ft(mt,J,dt),hn=Ft(mt,G),pn=Ft(mt,et),dn=Ft(mt,ft),vn=Ft(mt,ht),mn=Ft(mt,dt),gn=Ft(mt,yt),yn=Ft(mt,Et),bn="<span>",wn="</span>",En='<div class="span7 '+qt+'"></div>',Sn='<div class="row-fluid '+Rt+'"></div>',xn='<button type="button" class="'+[Ut,Yt].join(y)+'"><i class="'+Zt+'"></i></button>',Tn='<button type="button" class="'+[zt,Yt].join(y)+'"><i class="'+en+'"></i></button>',Nn='<div class="btn-group"></div>',Cn='<button type="button" class="'+[Xt,Yt].join(y)+'">{today}</button>',kn='<button type="button" class="'+[Vt,$t].join(y)+'{name}" data-view-name="{name}">{label}</button>',Ln='<span class="'+Jt+'"></span>',An='<div class="span5 '+tn+'"></div>',On=e.Component.create({NAME:mt,ATTRS:{allDay:{setter:e.DataType.Boolean.parse,value:!1},borderColor:{value:"#FFFFFF",validator:f},borderStyle:{value:"solid",validator:f},borderWidth:{value:"2px",validator:f},content:{setter:String,validator:l},color:{lazyAdd:!1,value:"#376cd9",validator:f},colorBrightnessFactor:{value:1.4,validator:u},colorSaturationFactor:{value:.88,validator:u},titleDateFormat:{getter:"_getTitleDateFormat",value:function(){var e=this,t=e.get(vt),n=t&&t.get(A).get(Y),r={endDate:bn+g+y+E+wn,startDate:E};return n||(r.endDate=bn+g+y+T(e.get(U))+wn,r.startDate=T(e.get(bt))),e.getMinutesDuration()<=30?delete r.endDate:e.get(M)&&(r={}),r}},endDate:{setter:"_setDate",valueFn:function(){var e=h.clone(this.get(bt));return e.setHours(e.getHours()+1),e}},disabled:{value:!1,validator:i},meeting:{value:!1,validator:i},node:{valueFn:function(){return e.NodeList.create(e.Node.create(this.EVENT_NODE_TEMPLATE).setData(mt,this))}},reminder:{value:!1,validator:i},repeated:{value:!1,validator:i},scheduler:{},startDate:{setter:"_setDate",valueFn:function(){return new Date}},visible:{value:!0,validator:i}},EXTENDS:e.Model,PROPAGATE_ATTRS:[M,bt,U,B,D,P,H,St,_t,R],prototype:{EVENT_NODE_TEMPLATE:'<div class="'+nn+'">'+'<div class="'+yn+'"></div>'+'<div class="'+sn+'"></div>'+'<div class="'+hn+'">'+'<span class="'+[It,an].join(y)+'"></span>'+'<span class="'+[It,fn].join(y)+'"></span>'+'<span class="'+[It,ln].join(y)+'"></span>'+'<span class="'+[It,cn].join(y)+'"></span>'+"</div>"+"</div>",initializer:function(){var e=this;e.bindUI(),e.syncUI()},bindUI:function(){var e=this;e.after({allDayChange:e._afterAllDayChange,colorChange:e._afterColorChange,disabledChange:e._afterDisabledChange,endDateChange:e._afterEndDateChange,meetingChange:e._afterMeetingChange,reminderChange:e._afterReminderChange,repeatedChange:e._afterRepeatedChange,visibleChange:e._afterVisibleChange})},syncUI:function(){var e=this;e._uiSetAllDay(e.get(M)),e._uiSetColor(e.get(D)),e._uiSetDisabled(e.get(R)),e._uiSetEndDate(e.get(U)),e._uiSetMeeting(e.get(et)),e._uiSetPast(e._isPastEvent()),e._uiSetReminder(e.get(ht)),e._uiSetRepeated(e.get(dt)),e._uiSetVisible(e.get(_t)),e.syncNodeTitleUI(),e.syncNodeContentUI()},destroy:function(){var e=this;e.get(ot).remove(!0)},addPaddingNode:function(){var t=this;t.get(ot).push(e.Node.create(t.EVENT_NODE_TEMPLATE).setData(mt,t)),t.syncUI()},clone:function(){var e=this,t=null,n=e.get(vt);return n&&(t=new n.eventModel,t.copyPropagateAttrValues(e,null,{silent:!0})),t},copyDates:function(e,t){var n=this;n.setAttrs({endDate:h.clone(e.get(U)),startDate:h.clone(e.get(bt))},t)},copyPropagateAttrValues:function(t,n,r){var i=this,s={};i.copyDates(t,r),e.Array.each(i.constructor.PROPAGATE_ATTRS,function(e){if(!(n||{}).hasOwnProperty(e)){var r=t.get(e);a(r)||(s[e]=r)}}),i.setAttrs(s,r)},getDaysDuration:function(){var e=this;return h.getDayOffset(e.get(U),e.get(bt))},getHoursDuration:function(){var e=this;return h.getHoursOffset(e.get(U),e.get(bt))},getMinutesDuration:function(){var e=this;return h.getMinutesOffset(e.get(U),e.get(bt))},getSecondsDuration:function(){var e=this;return h.getSecondsOffset(e.get(U),e.get(bt))},sameEndDate:function(e){var t=this;return h.compare(t.get(U),e.get(U))},sameStartDate:function(e){var t=this;return h.compare(t.get(bt),e.get(bt))},isAfter:function(e){var t=this,n=t.get(bt),r=e.get(bt);return h.after(n,r)},isBefore:function(e){var t=this,n=t.get(bt),r=e.get(bt);return h.before(n,r)},intersects:function(e){var t=this,n=t.get(U),r=t.get(bt),i=e.get(bt);return t.sameStartDate(e)||h.between(i,r,n)},intersectHours:
function(e){var t=this,n=t.get(U),r=t.get(bt),i=h.clone(r);return h.copyHours(i,e.get(bt)),h.compare(r,i)||h.between(i,r,n)},isDayBoundaryEvent:function(){var e=this;return h.isDayBoundary(e.get(bt),e.get(U))},isDayOverlapEvent:function(){var e=this;return h.isDayOverlap(e.get(bt),e.get(U))},getClearEndDate:function(){var e=this;return h.safeClearTime(e.get(U))},getClearStartDate:function(){var e=this;return h.safeClearTime(e.get(bt))},move:function(e,t){var n=this,r=n.getMinutesDuration();n.setAttrs({endDate:h.add(h.clone(e),h.MINUTES,r),startDate:e},t)},setContent:function(e){var t=this;t.get(ot).each(function(t){var n=t.one(v+sn);n.setContent(e)})},setTitle:function(e){var t=this;t.get(ot).each(function(t){var n=t.one(v+yn);n.setContent(e)})},syncNodeContentUI:function(){var e=this;e.setContent(e.get(B))},syncNodeTitleUI:function(){var e=this,t=e.get(St),n=e.get(bt),r=e.get(U),i=[];t.startDate&&i.push(e._formatDate(n,t.startDate)),t.endDate&&i.push(e._formatDate(r,t.endDate)),e.setTitle(i.join(m))},split:function(){var e=this,t=h.clone(e.get(bt)),n=h.clone(e.get(U));if(e.isDayOverlapEvent()&&!e.isDayBoundaryEvent()){var r=h.clone(t);return r.setHours(24,0,0,0),[[t,h.toMidnight(h.clone(t))],[r,h.clone(n)]]}return[[t,n]]},_afterAllDayChange:function(e){var t=this;t._uiSetAllDay(e.newVal)},_afterColorChange:function(e){var t=this;t._uiSetColor(e.newVal)},_afterDisabledChange:function(e){var t=this;t._uiSetDisabled(e.newVal)},_afterEndDateChange:function(e){var t=this;t._uiSetEndDate(e.newVal)},_afterMeetingChange:function(e){var t=this;t._uiSetMeeting(e.newVal)},_afterReminderChange:function(e){var t=this;t._uiSetReminder(e.newVal)},_afterRepeatedChange:function(e){var t=this;t._uiSetRepeated(e.newVal)},_afterVisibleChange:function(e){var t=this;t._uiSetVisible(e.newVal)},_isPastEvent:function(){var e=this,t=e.get(U);return t.getTime()<(new Date).getTime()},_setDate:function(e){var t=this;return u(e)&&(e=new Date(e)),e},_formatDate:function(t,n){var r=this,i=r.get(Z);return e.DataType.Date.format(t,{format:n,locale:i})},_getTitleDateFormat:function(e){var t=this;return f(e)?e={endDate:e,startDate:e}:o(e)&&(e=e.call(t)),e},_uiSetAllDay:function(e){var t=this;t.get(ot).toggleClass(rn,!!e)},_uiSetColor:function(e){var t=this,n=t.get(ot),r=c.toHSL(e),i=c.toArray(r);i[1]*=t.get(H),i[2]*=t.get(P),i=c.fromArray(i,c.TYPES.HSL),r=c.toRGB(r),i=c.toRGB(i),n&&n.setStyles({backgroundColor:i,borderColor:t.get("borderColor"),borderStyle:t.get("borderStyle"),borderWidth:t.get("borderWidth"),color:r})},_uiSetDisabled:function(e){var t=this;t.get(ot).toggleClass(on,!!e)},_uiSetEndDate:function(e){var t=this;t.get(ot).toggleClass(gn,t.getMinutesDuration()<=30)},_uiSetMeeting:function(e){var t=this;t.get(ot).toggleClass(pn,!!e)},_uiSetPast:function(e){var t=this;t.get(ot).toggleClass(dn,!!e)},_uiSetReminder:function(e){var t=this;t.get(ot).toggleClass(vn,!!e)},_uiSetRepeated:function(e){var t=this;t.get(ot).toggleClass(mn,!!e)},_uiSetVisible:function(e){var t=this;t.get(ot).toggleClass(un,!e)}}});e.SchedulerEvent=On;var Mn=e.Base.create(k,e.ModelList,[],{model:e.SchedulerEvent,initializer:function(){var e=this;e.after("colorChange",e._afterColorChange),e.after("disabledChange",e._afterDisabledChange),e.after("visibleChange",e._afterVisibleChange),e.after(["add","remove","reset"],e._afterEventsChange),e.on(["remove","reset"],e._onRemoveEvents),e._uiSetEvents(e.toArray()),e._setModelsAttrs({color:e.get(D),disabled:e.get(R),visible:e.get(_t)})},_afterColorChange:function(e){var t=this;t._setModelsAttrs({color:t.get(D)},{silent:e.silent})},_afterDisabledChange:function(e){var t=this;t._setModelsAttrs({disabled:t.get(R)},{silent:e.silent})},_afterEventsChange:function(e){var t=this;t._setModelsAttrs({color:t.get(D),disabled:t.get(R),visible:t.get(_t)},{silent:!0}),t._uiSetEvents(t.toArray(),e.skipSyncUI)},_afterVisibleChange:function(e){var t=this;t._setModelsAttrs({visible:t.get(_t)},{silent:e.silent})},_onRemoveEvents:function(e){var t=this,n=t.get(vt);n&&n.removeEvents(t)},_setModelsAttrs:function(e,t){var n=this;n.each(function(n){n.setAttrs(e,t)})},_uiSetEvents:function(e,t){var n=this,r=n.get(vt);r&&(r.addEvents(e),t||r.syncEventsUI())}},{ATTRS:{color:{valueFn:function(){var e=this,t=e.get(at),n=Math.ceil(Math.random()*t.length)-1;return t[n]},validator:f},disabled:{value:!1,validator:i},name:{value:"(no name)",validator:f},palette:{value:["#d93636","#e63973","#b22eb3","#6e36d9","#2d70b3","#376cd9","#25998c","#249960","#24992e","#6b9926","#999926","#a68f29","#b3782d","#bf6030","#bf6060","#997399","#617181","#6b7a99","#548c85","#747446","#997e5c","#b34d1b","#993d48","#802d70"],validator:r},scheduler:{},visible:{value:!0,validator:i}}});e.SchedulerCalendar=Mn,e.SchedulerEvents=e.Base.create("scheduler-events",e.ModelList,[],{initializer:function(){this._remainingItems=this.get("originalItems"),this.after("originalItemsChange",this._afterOriginalItemsChange),this.get("scheduler").on("plotViewEvents",e.bind(this._onPlotViewEvents,this))},comparator:function(e){var t=e.get(bt),n=e.get(U);return t+1/(n-t)},_afterOriginalItemsChange:function(){this._remainingItems=this.get("originalItems"),this.remove(this.toArray()),this._updateEventsForView()},_onPlotViewEvents:function(){this._updateEventsForView()},_setOriginalItems:function(t){var n=[];for(var r=0;r<t.length;r++)e.instanceOf(t[r],this.model)?this.add(t[r]):(t[r].startDate=t[r].startDate||new Date,t[r].endDate||(t[r].endDate=h.clone(t[r].startDate),t[r].endDate.setHours(t[r].endDate.getHours()+1)),n.push(t[r]));return n},_updateEventsForView:function(){var e,t,n,r,i=[],s=this.get("scheduler").get("activeView");if(!s)return;e=s.getDateInterval();for(r=0;r<this._remainingItems.length;r++)n=this._remainingItems[r].startDate,t=this._remainingItems[r].endDate,(!e.startDate||t>=e.startDate)&&(!e.endDate||n<=e.endDate)?this.add(this._remainingItems[r]):i.push(this._remainingItems[r]);this._remainingItems=i},model:e.SchedulerEvent},{ATTRS:{originalItems:{setter:"_setOriginalItems"
,validator:e.Lang.isArray,value:[]},scheduler:{}}});var _n=function(){};_n.ATTRS={},e.mix(_n.prototype,{calendarModel:e.SchedulerCalendar,eventModel:e.SchedulerEvent,eventsModel:e.SchedulerEvents,initializer:function(t){var n=this,r=n._toSchedulerEvents(t.items||t.events);n._events=new n.eventsModel({after:{add:e.bind(n._afterAddEvent,n)},bubbleTargets:n,originalItems:this.get("pagination")?r:[],scheduler:n}),this.get("pagination")||this._events.add(r)},addEvents:function(e){var t=this,n=t._toSchedulerEvents(e);return t._events.add(n)},eachEvent:function(e){var t=this;return t._events.each(e)},flushEvents:function(){var e=this;e._events.each(function(e){delete e._filtered})},getEventByClientId:function(e){var t=this;return t._events.getByClientId(e)},getEvents:function(e,t){var n=this,r=n._events;return t||r.sort({silent:!0}),e?r=r.filter(e):r=r.toArray(),r},getEventsByDay:function(e,t){var n=this;return e=h.safeClearTime(e),n.getEvents(function(n){return h.compare(n.getClearStartDate(),e)||t&&h.compare(n.getClearEndDate(),e)})},getIntersectEvents:function(e){var t=this;return e=h.safeClearTime(e),t.getEvents(function(t){var n=t.getClearStartDate(),r=t.getClearEndDate();return t.get(_t)&&(h.compare(e,n)||h.compare(e,r)||h.between(e,n,r))})},removeEvents:function(e){var t=this,n=t._toSchedulerEvents(e);return t._events.remove(n)},resetEvents:function(e){var t=this,n=t._toSchedulerEvents(e);return t._events.reset(n)},_afterAddEvent:function(e){var t=this;e.model.set(vt,t)},_toSchedulerEvents:function(t){var n=this,i=[];return b(t)?(i=t.toArray(),t.set(vt,n)):r(t)?e.Array.each(t,function(e){b(e)?(i=i.concat(e.toArray()),e.set(vt,n)):i.push(e)}):i=t,i}}),e.SchedulerEventSupport=_n;var Dn=e.Component.create({NAME:C,ATTRS:{activeView:{validator:w},date:{value:new Date,validator:s},eventRecorder:{setter:"_setEventRecorder"},strings:{value:{agenda:"Agenda",day:"Day",month:"Month",today:"Today",week:"Week",year:"Year"}},navigationDateFormatter:{value:function(t){var n=this;return e.DataType.Date.format(t,{format:"%B %d, %Y",locale:n.get(Z)})},validator:o},pagination:{validator:e.Lang.isBoolean,value:!0,writeOnce:"initOnly"},views:{setter:"_setViews",value:[]},viewDate:{getter:"_getViewDate",readOnly:!0},firstDayOfWeek:{value:0,validator:u},controlsNode:{valueFn:function(){return e.Node.create(En)}},viewDateNode:{valueFn:function(){return e.Node.create(Ln)}},headerNode:{valueFn:function(){return e.Node.create(Sn)}},iconNextNode:{valueFn:function(){return e.Node.create(xn)}},iconPrevNode:{valueFn:function(){return e.Node.create(Tn)}},navNode:{valueFn:function(){return e.Node.create(Nn)}},todayDate:{value:new Date,validator:s},todayNode:{valueFn:function(){return e.Node.create(this._processTemplate(Cn))}},viewsNode:{valueFn:function(){return e.Node.create(An)}}},HTML_PARSER:{controlsNode:v+qt,viewDateNode:v+Jt,headerNode:v+Rt,iconNextNode:v+Ut,iconPrevNode:v+zt,navNode:v+Wt,todayNode:v+Xt,viewsNode:v+tn},UI_ATTRS:[I,A],AUGMENTS:[e.SchedulerEventSupport,e.WidgetStdMod],prototype:{viewStack:null,initializer:function(){var e=this;e[At]={},e[F]=e.get(F),e[Lt]=e.get(Lt),e[X]=e.get(V),e[K]=e.get(K),e[Q]=e.get(Q),e[nt]=e.get(nt),e[Nt]=e.get(Nt),e[Mt]=e.get(Mt),e.after({activeViewChange:e._afterActiveViewChange,render:e._afterRender}),this.publish({plotViewEvents:{defaultFn:this._defPlotViewEventsFn}})},bindUI:function(){var e=this;e._bindDelegate()},syncUI:function(){var e=this;e.syncStdContent()},getViewByName:function(e){var t=this;return t[At][e]},getStrings:function(){var e=this;return e.get(wt)},getString:function(e){var t=this;return t.getStrings()[e]},renderView:function(e){var t=this;e&&(e.show(),e.get(pt)||(t.bodyNode||t.setStdModContent(p.BODY,m),e.render(t.bodyNode)))},plotViewEvents:function(e){var t=this;e.plotEvents(t.getEvents())},syncEventsUI:function(){var e=this,t=e.get(A);t&&this.fire("plotViewEvents")},renderButtonGroup:function(){var t=this;t.buttonGroup=(new e.ButtonGroup({boundingBox:t[Mt],on:{selectionChange:e.bind(t._onButtonGroupSelectionChange,t)}})).render()},syncStdContent:function(){var t=this,n=t.get(Ot);t[nt].append(t[Q]),t[nt].append(t[K]),t[F].append(t[Nt]),t[F].append(t[nt]),t[F].append(t[Lt]),e.Array.each(n,function(e){t[Mt].append(t._createViewTriggerNode(e))}),t[X].append(t[F]),t[X].append(t[Mt]),t.setStdModContent(p.HEADER,t[X].getDOM())},_afterActiveViewChange:function(e){var t=this;if(t.get(pt)){var n=e.newVal,r=e.prevVal;r&&r.hide(),t.renderView(n);var i=t.get(z);i&&i.hidePopover(),t._uiSetDate(t.get(I))}},_afterRender:function(e){var t=this,n=t.get(A);t.renderView(n),t.renderButtonGroup(),t._uiSetDate(t.get(I)),t._uiSetActiveView(n)},_bindDelegate:function(){var e=this;e[F].delegate("click",e._onClickPrevIcon,v+zt,e),e[F].delegate("click",e._onClickNextIcon,v+Ut,e),e[F].delegate("click",e._onClickToday,v+Xt,e)},_createViewTriggerNode:function(r){var i=this;if(!r.get(Ct)){var s=r.get(t);r.set(Ct,e.Node.create(n.sub(kn,{name:s,label:i.getString(s)||s})))}return r.get(Ct)},_defPlotViewEventsFn:function(){this.plotViewEvents(this.get("activeView"))},_getViewDate:function(){var e=this,t=e.get(I),n=e.get(A);return n&&(t=n.getAdjustedViewDate(t)),t},_onClickToday:function(e){var t=this,n=t.get(A);n&&t.set(I,t.get(Tt)),e.preventDefault()},_onClickNextIcon:function(e){var t=this,n=t.get(A);n&&t.set(I,n.get(st)),e.preventDefault()},_onClickPrevIcon:function(e){var t=this,n=t.get(A);n&&t.set(I,n.get(ct)),e.preventDefault()},_onButtonGroupSelectionChange:function(e){var t=this,n=e.originEvent.target.attr(N);t.set(A,t.getViewByName(n)),e.preventDefault()},_processTemplate:function(e){var t=this;return n.sub(e,t.getStrings())},_setEventRecorder:function(e){var t=this;e&&(e.setAttrs({scheduler:t},{silent:!0}),e.addTarget(t))},_setViews:function(n){var r=this,i=[];return e.Array.each(n,function(e){w(e)&&!e.get(pt)&&(e.setAttrs({scheduler:r}),i.push(e),r[At][e.get(t)]=e)}),r.get(A)||r.set(A,n[0]),i},_uiSetActiveView:function(e){var n=this;if(e){var r=e.get(t),i=n[Mt].one(v+$t+r);i&&
(n[Mt].all(_).removeClass(Gt),i.addClass(Gt))}},_uiSetDate:function(e){var t=this,n=t.get(rt),r=n.call(t,e);if(t.get(pt)){var i=t.get(A);i&&(i._uiSetDate(e),n=i.get(rt),r=n.call(i,e)),t[Lt].html(r),t.syncEventsUI()}}}});e.Scheduler=Dn;var Pn=e.Component.create({NAME:L,AUGMENTS:[e.WidgetStdMod],ATTRS:{bodyContent:{value:m},filterFn:{validator:o,value:function(e){return!0}},height:{value:650},isoTime:{value:!1,validator:i},name:{value:m,validator:f},navigationDateFormatter:{value:function(t){var n=this,r=n.get(vt);return e.DataType.Date.format(t,{format:"%A, %d %B, %Y",locale:r.get(Z)})},validator:o},nextDate:{getter:"getNextDate",readOnly:!0},prevDate:{getter:"getPrevDate",readOnly:!0},scheduler:{lazyAdd:!1,setter:"_setScheduler"},scrollable:{value:!0,validator:i},triggerNode:{setter:e.one},visible:{value:!1}},BIND_UI_ATTRS:[gt],prototype:{initializer:function(){var e=this;e.after("render",e._afterRender)},syncUI:function(){var e=this;e.syncStdContent()},getAdjustedViewDate:function(e){var t=this;return h.toMidnight(e)},flushViewCache:function(){},getDateInterval:function(){return{endDate:h.toLastHour(h.subtract(this.getNextDate(),h.DAY,1)),startDate:this.getAdjustedViewDate(this.get("scheduler").get("viewDate"))}},getNextDate:function(){},getPrevDate:function(){},getToday:function(){return h.clearTime(new Date)},limitDate:function(e,t){var n=this;return h.after(e,t)&&(e=h.clone(t)),e},plotEvents:function(){},syncStdContent:function(){},syncEventUI:function(e){},_uiSetDate:function(e){},_afterRender:function(e){var t=this,n=t.get(vt);t._uiSetScrollable(t.get(gt))},_setScheduler:function(t){var n=this,r=n.get(vt);return r&&n.removeTarget(r),t&&(n.addTarget(t),t.after(["*:add","*:remove","*:reset"],e.bind(n.flushViewCache,n))),t},_uiSetScrollable:function(e){var t=this,n=t.bodyNode;n&&(n.toggleClass(Qt,e),n.toggleClass(Kt,!e))}}});e.SchedulerView=Pn},"2.0.0",{requires:["model","model-list","widget-stdmod","color-hsl","aui-event-base","aui-node-base","aui-component","aui-datatype","aui-button"],skinnable:!0});
