package com.bajicdusko.awsdevicefarmdemo

import org.junit.runner.RunWith
import org.junit.runners.Suite

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */


@RunWith(Suite::class)
@Suite.SuiteClasses(
    DummyTestClassOne::class,
    DummyTestClassTwo::class,
    DummyTestClassThree::class
)
class AllTests

@RunWith(Suite::class)
@Suite.SuiteClasses(
    DummyTestClassTwo::class,
    DummyTestClassThree::class
)
class UnusedTests