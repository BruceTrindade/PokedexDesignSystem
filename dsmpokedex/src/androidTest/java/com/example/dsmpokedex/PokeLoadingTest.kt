package com.example.dsmpokedex

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PokeLoadingTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun givenPokeChipsCheckIsDisplayed() {

        composeTestRule.setContent {
            MaterialTheme {
                Box {
                    PokeballLoading()
                }
            }
        }

        composeTestRule
            .onNodeWithTag("Test Tag Loading")
            .assertIsDisplayed()
    }
}
