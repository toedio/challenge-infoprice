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
            .otherwise({
                redirectTo: '/'
            });
            $locationProvider.html5Mode(true);
        });
})();