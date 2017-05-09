(function() {
'use strict';

    angular
        .module('testjava.city')
        .factory('Cities', Cities);

    Cities.inject = ['$resource'];
    function Cities($resource) {

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