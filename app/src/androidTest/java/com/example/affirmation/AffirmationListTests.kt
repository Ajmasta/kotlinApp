package com.example.affirmation

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class AffirmationListTests {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)
    onView(withId(R.id.recycler_view)).perform(
    RecyclerViewActions
    .scrollToPosition<RecyclerView.ViewHolder>(9)
    )
}