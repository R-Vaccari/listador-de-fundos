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
public class MainActivityTest { // TODO: Não funcionam sem cache, pois os testes rodam antes dos dados serem carregados.
    @Rule public ActivityScenarioRule<MainActivity> scenarioRule = new ActivityScenarioRule<>(MainActivity.class);

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

    /*@Test
    public void checkIntentContents() throws InterruptedException {
        Intents.init();
        Espresso.onView(ViewMatchers.withId(R.id.main_recyclerView)).perform(RecyclerViewActions.actionOnItemAtPosition(19, ViewActions.click()));
        Intents.intended(IntentMatchers.toPackage("com.rvapp.listadordefundos.activities"));
        Intents.release();
    }
     */
}