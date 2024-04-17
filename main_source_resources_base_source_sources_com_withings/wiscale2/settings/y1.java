package com.withings.wiscale2.settings;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class y1 extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f60389a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ym0.a<nm0.y> aVar) {
        super(1);
        this.f60389a = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(ActivityResult activityResult) {
        ActivityResult result = activityResult;
        kotlin.jvm.internal.u.j(result, "result");
        Intent a11 = result.a();
        if (a11 != null && a11.hasExtra("EXTRA_DISTANCE_UPDATED")) {
            this.f60389a.invoke();
        }
        return nm0.y.f85009a;
    }
}
