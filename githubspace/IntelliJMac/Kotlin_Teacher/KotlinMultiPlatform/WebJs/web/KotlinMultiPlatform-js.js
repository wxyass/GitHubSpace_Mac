(function (root, factory) {
  if (typeof define === 'function' && define.amd)
    define(['exports', 'kotlin'], factory);
  else if (typeof exports === 'object')
    factory(module.exports, require('kotlin'));
  else {
    if (typeof kotlin === 'undefined') {
      throw new Error("Error loading module 'KotlinMultiPlatform-js'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlinMultiPlatform-js'.");
    }
    root['KotlinMultiPlatform-js'] = factory(typeof this['KotlinMultiPlatform-js'] === 'undefined' ? {} : this['KotlinMultiPlatform-js'], kotlin);
  }
}(this, function (_, Kotlin) {
  'use strict';
  var Kind_CLASS = Kotlin.Kind.CLASS;
  function Logger() {
  }
  Logger.prototype.debug_s8jyv4$ = function (log) {
    console.log(log);
  };
  Logger.prototype.error_s8jyv4$ = function (log) {
    console.error(log);
  };
  Logger.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Logger',
    interfaces: []
  };
  var logger;
  function doSomething() {
    logger.debug_s8jyv4$('Start Processing...');
    logger.error_s8jyv4$('Error occurred!');
    logger.debug_s8jyv4$('Done.');
    return 'HelloWorld';
  }
  var package$com = _.com || (_.com = {});
  var package$bennyhuo = package$com.bennyhuo || (package$com.bennyhuo = {});
  var package$kmp = package$bennyhuo.kmp || (package$bennyhuo.kmp = {});
  package$kmp.Logger = Logger;
  Object.defineProperty(package$kmp, 'logger', {
    get: function () {
      return logger;
    }
  });
  package$kmp.doSomething = doSomething;
  logger = new Logger();
  Kotlin.defineModule('KotlinMultiPlatform-js', _);
  return _;
}));
