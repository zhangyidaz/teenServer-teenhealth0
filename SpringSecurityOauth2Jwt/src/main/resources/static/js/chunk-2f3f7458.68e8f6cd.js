(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2f3f7458","chunk-2d0e8c9d","chunk-2d0a3c41"],{"0429":function(t,e,r){"use strict";r.r(e),r.d(e,"crudOptions",(function(){return c}));var c={options:{height:"100%"},viewOptions:{disabled:!1},pageOptions:{export:{local:!0}},rowHandle:!1,columns:[{title:"训练时长(分)",key:"records.trainTime",sortable:!0},{title:"平均速度(转/秒)",key:"records.averageSpeed",sortable:!0},{title:"训练得分",key:"records.testScore",sortable:!1},{title:"训练时间",key:"time",sortable:!1}]}},"4c54":function(t,e,r){},"8b85":function(t,e,r){"use strict";r.r(e),r.d(e,"GetList",(function(){return n}));var c=r("22ce");function n(t,e){return console.log(t),Object(c["a"])({url:"/teacher/executecardioplan1/"+t,method:"post",data:e})}},d23a7:function(t,e,r){"use strict";var c=r("4c54"),n=r.n(c);n.a},f2a9:function(t,e,r){"use strict";r.r(e);var c=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("d2-container",{class:{"page-compact":t.crud.pageOptions.compact}},[r("d2-crud-x",t._g(t._b({ref:"d2Crud",scopedSlots:t._u([{key:"priceGroupTitleSlot",fn:function(e){return r("div",{},[r("h3",{staticClass:"group-title",staticStyle:{display:"inline"}},[r("i",{staticClass:"header-icon",class:e.group.icon}),t._v(" "+t._s(e.group.title))])])}}])},"d2-crud-x",t._crudProps,!1),t._crudListeners),[r("div",{attrs:{slot:"header"},slot:"header"},[r("crud-toolbar",t._g(t._b({attrs:{search:null,compact:t.crud.pageOptions.compact,columns:t.crud.columns},on:{"update:compact":function(e){return t.$set(t.crud.pageOptions,"compact",e)},refresh:function(e){return t.doRefresh()},"columns-filter-changed":t.handleColumnsFilterChanged}},"crud-toolbar",t._crudToolbarProps,!1),t._crudToolbarListeners))],1)])],1)},n=[],o=r("0429"),s=r("1fbf"),u=r("8b85"),a={name:"executecardioplan",mixins:[s["d2CrudPlus"].crud],methods:{getCrudOptions:function(){return o["crudOptions"]},pageRequest:function(t){return Object(u["GetList"])(this.$route.query.id,t)}}},i=a,d=(r("d23a7"),r("2877")),l=Object(d["a"])(i,c,n,!1,null,null,null);e["default"]=l.exports}}]);