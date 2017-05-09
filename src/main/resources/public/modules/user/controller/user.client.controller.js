(function() {
'use strict';

    angular
        .module('testjava.user')
        .controller('UserController', UserController);

    UserController.inject = ['$scope', 'City'];
    function UserController($scope, City) {
        $scope.city = City.query();
    }
})();