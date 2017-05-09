(function() {
'use strict';

    angular
        .module('testjava.user')
        .controller('UserController', UserController);

    UserController.inject = ['$scope', 'Cities'];
    function UserController($scope, Cities) {
        $scope.cities = Cities.query();
    }
})();