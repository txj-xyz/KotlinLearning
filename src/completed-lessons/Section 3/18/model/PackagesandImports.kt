package model

import kotlin.random.Random

/*
    Lesson 18: Packages and Imports
        NOTES:
        - Multiple files
        - Default location is root since we are in root right now
        package: keyword for associating modules in dirs, can be nested with `dot notation`
        when you make a package folder it auto-sets the name of the package in each file.
        Good practice for package names is the same as the folder
 */



class Person

fun calculate() {}

val age = 10

fun calculateTheNumberFrom0To100(): Int {
    return Random.nextInt(from = 0, until = 100)
}