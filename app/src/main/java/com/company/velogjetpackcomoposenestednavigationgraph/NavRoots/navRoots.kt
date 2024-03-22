package com.company.velogjetpackcomoposenestednavigationgraph.NavRoots

sealed class navRoots(val route : String) {
    object first : navRoots("first")
    object second : navRoots("second")
}
