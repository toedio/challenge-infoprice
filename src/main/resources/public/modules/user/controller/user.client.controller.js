(function() {
'use strict';

    angular
        .module('testjava.user')
        .controller('UserController', UserController);

    UserController.inject = ['$scope', '$location', '$routeParams', 'Cities', 'Users'];
    function UserController($scope, $location, $routeParams, Cities, Users) {

        $scope.initList = function() {            
            $scope.users = Users.query();
        };

        $scope.initFormUser = function() {
            $scope.cities = Cities.query();
        };

        $scope.initCreation = function() {
            $scope.user = { address: [ { } ] };
        };

        $scope.initEdition = function() {
            $scope.user = Users.get({userId: $routeParams.userId});
        };

        $scope.goToCreate = function() {
            $location.path('users/create');
        };

        $scope.goToList = function() {
        	$location.path('/');
        };

        $scope.goToEdit = function(user) {
            $location.path('users/edit/' + user.userId);
        };

        $scope.formatAddress = function(address) {
            return  (address.route ? address.route + ', ' : '' )+
                    (address.streetNumber ? address.streetNumber + ', ': '') +
                    (address.neighborhood ? address.neighborhood + ', ': '') +
                    (address.city.cityName ? address.city.cityName + ', ' : '' )+
                    (address.city.state ? address.city.state + ', ' : '' )+
                    (address.city.country ? address.city.country + ' ' : '');
        };

        $scope.addAddress = function(user) {
            if (!user.address)
                user.address = [];
            user.address.push({});
        };

        $scope.removeAddress = function(list, idx) {
        	return list.splice(idx, 1);
        };        

        $scope.create = function(user) {
            var user = new Users(user);
            user.$save(function(response) {
                $location.path('/');
            }, function(err) {
                alert('Failed to create user. Try again later');
            });
        };

        $scope.remove = function(user, idx) {
            if (confirm('Are you sure you want to delete ?')) {
                var user = new Users(user);
                user.$remove(function (response) {
                    $scope.users.splice(idx, 1);
                }, function(err) {
                    alert('Failed to remove user. Try again later');
                })
            }
        };
        
        $scope.update = function(user) {
            var user = new Users(user);
            user.$update(function(response) {
                $location.path('/');
            }, function(err) {
                alert('Failed to update user. Try again later');
            });
        };        
    }
})();