(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-4f6eddde","chunk-2d0d72f3","chunk-2d0dee29"],{7675:function(t,e,r){"use strict";r.r(e),r.d(e,"GetList",(function(){return s}));var o=r("22ce");function s(t){return Object(o["a"])({url:"/teacher/cardiolist1",method:"post",data:t})}},"880c":function(t,e,r){"use strict";r.r(e),r.d(e,"crudOptions",(function(){return o}));var o={options:{height:"100%"},pageOptions:{export:{local:!0}},viewOptions:{disabled:!1},rowHandle:{width:190,view:{},edit:{show:!1},remove:{show:!1},custom:[{thin:!0,text:"历史测试",type:"success",size:"small",emit:"history",icon:"el-icon-tickets"}]},columns:[{title:"学号",key:"tStudent.studentNo",sortable:!0},{title:"姓名",key:"tStudent.studentName",sortable:!1},{title:"性别",key:"tStudent.sex",sortable:!1,type:"select",dict:{data:[{value:0,label:"未知"},{value:1,label:"男"},{value:2,label:"女"}]}},{title:"最大安全心率",key:"heartRate",sortable:!0},{title:"最大摄氧量",key:"oxygenUptake",sortable:!0},{title:"最大功率",key:"maxPower",sortable:!0},{title:"F.C",key:"fc",sortable:!0},{title:"心肺耐力评分",key:"score",sortable:!0},{title:"最近测试时间",key:"createTime",sortable:!0,type:"datetime"}]}},"9f02":function(t,e,r){},bda8:function(t,e,r){"use strict";r.r(e);var o=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("d2-container",{class:{"page-compact":t.crud.pageOptions.compact}},[r("d2-crud-x",t._g(t._b({ref:"d2Crud",on:{history:t.handleHistory},scopedSlots:t._u([{key:"priceGroupTitleSlot",fn:function(e){return r("div",{},[r("h3",{staticClass:"group-title",staticStyle:{display:"inline"}},[r("i",{staticClass:"header-icon",class:e.group.icon}),t._v(" "+t._s(e.group.title))])])}}])},"d2-crud-x",t._crudProps,!1),t._crudListeners),[r("div",{attrs:{slot:"header"},slot:"header"},[r("crud-toolbar",t._g(t._b({attrs:{search:null,compact:t.crud.pageOptions.compact,columns:t.crud.columns},on:{"update:compact":function(e){return t.$set(t.crud.pageOptions,"compact",e)},refresh:function(e){return t.doRefresh()},"columns-filter-changed":t.handleColumnsFilterChanged}},"crud-toolbar",t._crudToolbarProps,!1),t._crudToolbarListeners))],1)])],1)},s=[],n=r("880c"),c=r("1fbf"),i=r("7675"),a={name:"cardiolist",mixins:[c["d2CrudPlus"].crud],methods:{getCrudOptions:function(){return n["crudOptions"]},pageRequest:function(t){return Object(i["GetList"])(t)},handleHistory:function(t){this.$router.push({path:"/system/teacher/cardiopulmonary",query:{studentId:t.row.studentId}}),console.log(t.row.studentId)}}},u=a,l=(r("c295"),r("2877")),d=Object(l["a"])(u,o,s,!1,null,null,null);e["default"]=d.exports},c295:function(t,e,r){"use strict";var o=r("9f02"),s=r.n(o);s.a}}]);