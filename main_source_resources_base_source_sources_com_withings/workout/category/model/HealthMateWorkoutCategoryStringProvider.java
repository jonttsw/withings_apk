package com.withings.workout.category.model;

import android.content.Context;
import uj0.a;
/* loaded from: classes5.dex */
public class HealthMateWorkoutCategoryStringProvider implements a {
    private final Context context;

    public HealthMateWorkoutCategoryStringProvider(Context context) {
        this.context = context;
    }

    @Override // uj0.a
    public String getString(int i11) {
        return this.context.getString(i11);
    }

    @Override // uj0.a
    public String getStringResourceNameId(int i11) {
        return this.context.getResources().getResourceName(i11);
    }
}
