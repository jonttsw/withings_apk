package com.withings.wiscale2.measure.goal.ui;

import com.withings.wiscale2.measure.goal.ui.StepGoalActivity;
/* compiled from: StepGoalActivity.java */
/* loaded from: classes5.dex */
final class e extends pm.h<StepGoalActivity.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StepGoalActivity f58424a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(StepGoalActivity stepGoalActivity) {
        this.f58424a = stepGoalActivity;
    }

    @Override // vh.m.b
    public final void onResult(Object obj) {
        int i11;
        StepGoalActivity.a aVar = (StepGoalActivity.a) obj;
        StepGoalActivity stepGoalActivity = this.f58424a;
        i11 = stepGoalActivity.f58373j;
        if (i11 == 0) {
            stepGoalActivity.f58373j = aVar.f58380a;
        }
        stepGoalActivity.f58374k = aVar.f58381b;
        stepGoalActivity.f58375l = aVar.f58382c;
        StepGoalActivity.G3(stepGoalActivity);
    }
}
