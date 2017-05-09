(function() {
'use strict';

    angular
        .module('testjava.user')
        .factory('Users', Users);

    Users.inject = ['$resource'];
    function Users($resource) {

        return $resource('/api/users/:userId', 
        {
            userId: '@userId'
        },
        {
            update:
            {
                method: 'PUT'
            }
        });
    }   
})();