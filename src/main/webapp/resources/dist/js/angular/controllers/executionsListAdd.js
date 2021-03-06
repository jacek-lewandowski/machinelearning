/**
 * Created by mateusz on 04.03.16.
 */


angular.module('myApp').controller('executionsListAddCtrl',function ($scope,$location,$routeParams, Algorithm_execution, Method_configuration, Problem_configuration) {
    $scope.executions = [];
    $scope.method_configurations = [];
    $scope.problem_configurations = [];
    $scope.execution = {
        pending : true
    };

    loadProblem_configurations = function() {
        Problem_configuration.getProblem_configurations().success(function(data,status){
            console.log("aa");
            $scope.problem_configurations = data;
            console.log(data);
        })
    }
    loadMethod_configurations = function() {
        Method_configuration.getMethod_configurations().success(function(data,status){
            $scope.method_configurations = data;
            console.log(data);
        })
    }
    init = function() {
        console.log("bbssb");

        loadMethod_configurations();
        loadProblem_configurations();
    }
    init();
    
    $scope.add = function () {
        console.log($scope.execution);
        Algorithm_execution.createExecution($scope.execution).success(function(data,status){
            console.log("dodano wykonanie");
            $location.path("/executions");
        })
    }

});
