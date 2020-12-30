package com.rvapp.listadordefundos.activities;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.intent.Intents;
import androidx.test.espresso.intent.matcher.IntentMatchers;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.rvapp.listadordefundos.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest { // TODO: Espresso não espera o carregamento dos dados.
    @Rule public ActivityScenarioRule<MainActivity> scenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void setIntents() {
        Intents.init();
    }

    @Test
    public void checkIfCardIsDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).perform(RecyclerViewActions.scrollToPosition(5))
                .check(ViewAssertions.matches(ViewMatchers.hasDescendant(ViewMatchers.withText("Claritas Inflação Institucional FIM")))).check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void checkListSize() {
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).check(new RecyclerSizeAssertion(524));
    }

    @Test
    public void checkOramaStandard() {
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).perform(RecyclerViewActions.scrollToPosition(7))
                .check(ViewAssertions.matches(ViewMatchers.hasDescendant(ViewMatchers.withChild(ViewMatchers.withId(R.id.card_fundo_text_fund_orama_standard)))))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

    @Test
    public void checkIntentContents() {
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition(19, ViewActions.click()));
        Intents.intended(IntentMatchers.hasExtraWithKey("fundo"));
    }

    @After
    public void releaseIntents() {
        Intents.release();
    }
}