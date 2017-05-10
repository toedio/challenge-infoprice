(function() {
'use strict';

    angular
        .module('testjava')
        .config(function($routeProvider, $locationProvider) {
            $routeProvider
            .when('/', {
                templateUrl : 'modules/user/views/user.home.client.view.html',
                controller: "UserController"
            })
            .when('/users/create', {
                templateUrl : 'modules/user/views/user.create.client.view.html',
                controller: "UserController"
            })
            .when('/users/edit/:userId', {
                templateUrl : 'modules/user/views/user.edit.client.view.html',
                controller: "UserController"
            })           
            .otherwise({
                redirectTo: '/'
            });
        });
})();