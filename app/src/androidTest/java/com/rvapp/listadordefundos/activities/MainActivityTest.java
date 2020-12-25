package com.rvapp.listadordefundos.activities;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.MediumTest;

import com.rvapp.listadordefundos.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@MediumTest
public class MainActivityTest {

    @Rule public ActivityScenarioRule<MainActivity> scenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkIfCardIsDisplayedTest() {
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).perform(RecyclerViewActions.scrollToPosition(5))
                .check(ViewAssertions.matches(ViewMatchers.hasDescendant(ViewMatchers.withText("Claritas Inflação Institucional FIM")))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}