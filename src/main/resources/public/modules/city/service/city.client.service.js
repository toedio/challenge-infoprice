(function() {
'use strict';

    angular
        .module('testjava.city')
        .factory('City', City);

    City.inject = ['$resource'];
    function City($resource) {

        return $resource('/api/cities/:cityId', 
        {
            cityId: '@cityId'
        },
        {
            update:
            {
                method: 'PUT'
            }
        });
    }   
})();