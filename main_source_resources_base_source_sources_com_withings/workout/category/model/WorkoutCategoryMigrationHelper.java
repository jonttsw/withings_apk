package com.withings.workout.category.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* loaded from: classes5.dex */
public class WorkoutCategoryMigrationHelper {
    private static final String KEY_SHOULD_REDOWNLOAD_CATEGORIES = "key_should_redownload_categories";
    private static SharedPreferences prefs;

    public WorkoutCategoryMigrationHelper(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static WorkoutCategoryMigrationHelper get(Context context) {
        return new WorkoutCategoryMigrationHelper(context);
    }

    public void setShouldRedownloadCategories(Boolean bool) {
        prefs.edit().putBoolean(KEY_SHOULD_REDOWNLOAD_CATEGORIES, bool.booleanValue()).apply();
    }

    public boolean shouldRedownloadCategories() {
        return prefs.getBoolean(KEY_SHOULD_REDOWNLOAD_CATEGORIES, false);
    }
}
