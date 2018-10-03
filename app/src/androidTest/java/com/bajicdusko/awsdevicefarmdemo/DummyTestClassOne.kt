package com.bajicdusko.awsdevicefarmdemo

import android.support.test.runner.AndroidJUnit4
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

/**
 * Created by Dusko Bajic
 * GitHub @bajicdusko
 */
@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class DummyTestClassOne {

  @Test
  fun test_01(){
    Assert.assertEquals(2, 1 + 1)
  }

  @Test
  fun test_02(){
    Assert.assertEquals(2, 1 + 1)
  }

  @Test
  fun test_03(){
    Assert.assertEquals(2, 1 + 1)
  }

  @Test
  fun test_04(){
    Assert.assertEquals(2, 1 + 1)
  }

  @Test
  fun test_05(){
    Assert.assertEquals(2, 1 + 1)
  }
}