if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'WebJs'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'WebJs'.");
}
if (typeof this['KotlinMultiPlatform-js'] === 'undefined') {
  throw new Error("Error loading module 'WebJs'. Its dependency 'KotlinMultiPlatform-js' was not found. Please, check whether 'KotlinMultiPlatform-js' is loaded prior to 'WebJs'.");
}
var WebJs = function (_, Kotlin, $module$KotlinMultiPlatform_js) {
  'use strict';
  var doSomething = $module$KotlinMultiPlatform_js.com.bennyhuo.kmp.doSomething;
  function main(args) {
    var tmp$;
    (tmp$ = document.getElementsByTagName('body')[0]) != null ? (tmp$.textContent = doSomething()) : null;
  }
  var package$com = _.com || (_.com = {});
  var package$bennyhuo = package$com.bennyhuo || (package$com.bennyhuo = {});
  var package$kmp = package$bennyhuo.kmp || (package$bennyhuo.kmp = {});
  var package$webjs = package$kmp.webjs || (package$kmp.webjs = {});
  package$webjs.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('WebJs', _);
  return _;
}(typeof WebJs === 'undefined' ? {} : WebJs, kotlin, this['KotlinMultiPlatform-js']);
