(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d22bd7e"],{f163:function(t,e,n){"use strict";n.r(e),n.d(e,"GetList",(function(){return o})),n.d(e,"AddObj",(function(){return a})),n.d(e,"UpdateObj",(function(){return d})),n.d(e,"DelObj",(function(){return c})),n.d(e,"GetPermission",(function(){return i})),n.d(e,"DoAuthz",(function(){return s}));var r=n("22ce"),u="/permission/manager/role";function o(t){return Object(r["a"])({url:u+"/page",method:"get",params:t})}function a(t){return Object(r["a"])({url:u+"/add",method:"post",data:t})}function d(t){return Object(r["a"])({url:u+"/update",method:"post",data:t})}function c(t){return Object(r["a"])({url:u+"/delete",method:"post",params:{id:t}})}function i(t){return Object(r["a"])({url:u+"/getPermission",method:"get",params:{roleId:t}})}function s(t,e){return Object(r["a"])({url:u+"/authz",method:"post",params:{roleId:t},data:e})}}}]);