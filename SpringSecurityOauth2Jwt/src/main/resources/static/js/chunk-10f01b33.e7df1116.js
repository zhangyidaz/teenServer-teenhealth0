(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-10f01b33","chunk-2d237117","chunk-2d0b3288"],{1805:function(t,e,r){},"26d2":function(t,e,r){"use strict";r.r(e),r.d(e,"crudOptions",(function(){return n}));var n={options:{height:"100%"},viewOptions:{disabled:!1},pageOptions:{export:{local:!0}},rowHandle:!1,columns:[{title:"身体柔韧性",key:"levelFlex"},{title:"柔韧性指导建议",key:"suggFlex"},{title:"平衡能力",key:"levelBlan"},{title:"平衡能力指导建议",key:"suggBlan"},{title:"下肢力量",key:"levelJump"},{title:"下肢力量指导建议",key:"suggJump"},{title:"反应能力",key:"levelChoosetime"},{title:"反应能力指导建议",key:"suggChoosetime"}]}},"4df9":function(t,e,r){"use strict";r.r(e);var n=function(){var t=this,e=t.$createElement,r=t._self._c||e;return r("d2-container",{class:{"page-compact":t.crud.pageOptions.compact}},[r("d2-crud-x",t._g(t._b({ref:"d2Crud",scopedSlots:t._u([{key:"priceGroupTitleSlot",fn:function(e){return r("div",{},[r("h3",{staticClass:"group-title",staticStyle:{display:"inline"}},[r("i",{staticClass:"header-icon",class:e.group.icon}),t._v(" "+t._s(e.group.title))])])}}])},"d2-crud-x",t._crudProps,!1),t._crudListeners),[r("div",{attrs:{slot:"header"},slot:"header"},[r("crud-toolbar",t._g(t._b({attrs:{search:null,compact:t.crud.pageOptions.compact,columns:t.crud.columns},on:{"update:compact":function(e){return t.$set(t.crud.pageOptions,"compact",e)},refresh:function(e){return t.doRefresh()},"columns-filter-changed":t.handleColumnsFilterChanged}},"crud-toolbar",t._crudToolbarProps,!1),t._crudToolbarListeners))],1)])],1)},o=[],c=r("26d2"),s=r("1fbf"),u=r("fa17"),i={name:"somaticgamehistory",mixins:[s["d2CrudPlus"].crud],methods:{getCrudOptions:function(){return c["crudOptions"]},pageRequest:function(t){return Object(u["GetList"])(this.$route.query.id,t)}}},l=i,a=(r("6bce"),r("2877")),d=Object(a["a"])(l,n,o,!1,null,null,null);e["default"]=d.exports},"6bce":function(t,e,r){"use strict";var n=r("1805"),o=r.n(n);o.a},fa17:function(t,e,r){"use strict";r.r(e),r.d(e,"GetList",(function(){return o}));var n=r("22ce");function o(t,e){return console.log(t),Object(n["a"])({url:"/teacher/somaticgamehistory1/"+t,method:"post",data:e})}}}]);