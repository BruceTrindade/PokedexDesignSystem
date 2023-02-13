package com.example.dsmpokedex

import androidx.compose.foundation.layout.Box
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PokeChipsTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun givenPokeChipsCheckIsDisplayed() {
        // Test based in https://cs.android.com/androidx/platform/frameworks/support/+/
        // androidx-main:compose/material3/material3/src/androidAndroidTest/kotlin/androidx/compose/material3/ChipTest.kt?q=AssistChip

        composeTestRule.setContent {
            MaterialTheme {
                Box {
                    PokeChips(text = "Fire")
                }
            }
        }

        composeTestRule
            .onNodeWithTag("Chips Test Tag")
            .assert(SemanticsMatcher.expectValue(SemanticsProperties.Role, Role.Button))
            .assertIsEnabled()
            .assertHasClickAction()
    }
}
