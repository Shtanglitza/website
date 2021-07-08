// Compiled by ClojureScript 1.10.866 {:optimizations :none}
goog.provide('website.core');
goog.require('cljs.core');
goog.require('goog.dom');
goog.require('goog.dom.classlist');
goog.require('goog.events');
goog.require('goog.fx.dom');
website.core.test_function = (function website$core$test_function(){
return console.log("test test test");
});
website.core.add_event = (function website$core$add_event(element,e,cb){
return goog.events.listen(element,cljs.core.name.call(null,e),cb);
});
website.core.fadein = (function website$core$fadein(element){
var anim = (new goog.fx.dom.Fade(element,(0),(1),(500)));
return anim.play();
});
website.core.hide_all_elements = (function website$core$hide_all_elements(elements){
goog.dom.classlist.add(cljs.core.first.call(null,elements),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,elements),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,cljs.core.rest.call(null,elements)),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,cljs.core.rest.call(null,cljs.core.rest.call(null,elements))),"hidden");

return goog.dom.classlist.add(cljs.core.last.call(null,elements),"hidden");
});
website.core.hide_all_projects = (function website$core$hide_all_projects(elements){
goog.dom.classlist.add(cljs.core.first.call(null,elements),"hidden");

goog.dom.classlist.add(cljs.core.second.call(null,elements),"hidden");

return goog.dom.classlist.add(cljs.core.last.call(null,elements),"hidden");
});
website.core.highlight_menu = (function website$core$highlight_menu(no){
var elements_528 = document.getElementsByClassName("menu-item-link");
goog.dom.classlist.remove(cljs.core.first.call(null,elements_528),"selected");

goog.dom.classlist.remove(cljs.core.second.call(null,elements_528),"selected");

goog.dom.classlist.remove(cljs.core.second.call(null,cljs.core.rest.call(null,elements_528)),"selected");

goog.dom.classlist.remove(cljs.core.last.call(null,elements_528),"selected");

return goog.dom.classlist.add(cljs.core.first.call(null,document.querySelectorAll([".menu-item-link[data-no='",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"']"].join(''))),"selected");
});
website.core.open_page = (function website$core$open_page(no){
goog.dom.classlist.remove(cljs.core.first.call(null,document.querySelectorAll([".main[data-page-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))),"hidden");

return website.core.fadein.call(null,cljs.core.first.call(null,document.querySelectorAll([".main[data-page-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))));
});
website.core.change_page = (function website$core$change_page(event){
var no = event.currentTarget.dataset.no;
website.core.hide_all_elements.call(null,document.getElementsByClassName("main main-item"));

website.core.hide_all_projects.call(null,document.getElementsByClassName("main main-project"));

website.core.highlight_menu.call(null,no);

return website.core.open_page.call(null,no);
});
website.core.show_proj = (function website$core$show_proj(no){
console.log([".main[data-proj-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''));

console.log(document.querySelectorAll([".main[data-proj-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join('')));

goog.dom.classlist.remove(cljs.core.first.call(null,document.querySelectorAll([".main[data-proj-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))),"hidden");

return website.core.fadein.call(null,cljs.core.first.call(null,document.querySelectorAll([".main[data-proj-no=\"",cljs.core.str.cljs$core$IFn$_invoke$arity$1(no),"\"]"].join(''))));
});
website.core.change_proj = (function website$core$change_proj(event){
var no = event.currentTarget.dataset.proj;
website.core.hide_all_elements.call(null,document.getElementsByClassName("main main-item"));

website.core.hide_all_projects.call(null,document.getElementsByClassName("main main-project"));

return website.core.show_proj.call(null,no);
});
website.core.back_from_proj = (function website$core$back_from_proj(event){
console.log(event);

console.log(event.currentTarget);

console.log(event.currentTarget.dataset);

console.log(event.currentTarget.dataset.inProjNo);

var no = event.currentTarget.dataset.inProjNo;
website.core.hide_all_elements.call(null,document.getElementsByClassName("main main-item"));

website.core.hide_all_projects.call(null,document.getElementsByClassName("main main-project"));

website.core.highlight_menu.call(null,no);

return website.core.open_page.call(null,no);
});
var menu_items_529 = document.getElementsByClassName("menu-item-link");
var project_items_530 = document.getElementsByClassName("projects-item-link-as-menu");
var project_back_buttons_531 = document.getElementsByClassName("button-link");
website.core.add_event.call(null,cljs.core.first.call(null,menu_items_529),goog.events.EventType.CLICK,website.core.change_page);

website.core.add_event.call(null,cljs.core.second.call(null,menu_items_529),goog.events.EventType.CLICK,website.core.change_page);

website.core.add_event.call(null,cljs.core.second.call(null,cljs.core.rest.call(null,menu_items_529)),goog.events.EventType.CLICK,website.core.change_page);

website.core.add_event.call(null,cljs.core.last.call(null,menu_items_529),goog.events.EventType.CLICK,website.core.change_page);

website.core.add_event.call(null,cljs.core.first.call(null,project_items_530),goog.events.EventType.CLICK,website.core.change_proj);

website.core.add_event.call(null,cljs.core.second.call(null,project_items_530),goog.events.EventType.CLICK,website.core.change_proj);

website.core.add_event.call(null,cljs.core.last.call(null,project_items_530),goog.events.EventType.CLICK,website.core.change_proj);

website.core.add_event.call(null,cljs.core.first.call(null,project_back_buttons_531),goog.events.EventType.CLICK,website.core.back_from_proj);

website.core.add_event.call(null,cljs.core.second.call(null,project_back_buttons_531),goog.events.EventType.CLICK,website.core.back_from_proj);

website.core.add_event.call(null,cljs.core.last.call(null,project_back_buttons_531),goog.events.EventType.CLICK,website.core.back_from_proj);
goog.dom.classlist.add(cljs.core.first.call(null,document.getElementsByTagName("body")),"loaded");

//# sourceMappingURL=core.js.map
