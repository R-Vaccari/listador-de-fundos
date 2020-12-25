package com.rvapp.listadordefundos.activities;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;

import org.hamcrest.Matchers;
import org.junit.Assert;

public class RecyclerSizeAssertion implements ViewAssertion {
    private final int expectedCount;

    public RecyclerSizeAssertion(int expectedCount) {
        this.expectedCount = expectedCount;
    }

    @Override
    public void check(View view, NoMatchingViewException noViewFoundException) {
        RecyclerView recyclerView = (RecyclerView) view;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Assert.assertThat(adapter.getItemCount(), Matchers.is(expectedCount));
    }
}
