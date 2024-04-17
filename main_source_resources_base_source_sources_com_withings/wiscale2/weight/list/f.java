package com.withings.wiscale2.weight.list;

import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WeightListActivity.kt */
/* loaded from: classes5.dex */
final class f extends w implements ym0.l<ActivityResult, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightListActivity f62922a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WeightListActivity weightListActivity) {
        super(1);
        this.f62922a = weightListActivity;
    }

    @Override // ym0.l
    public final y invoke(ActivityResult activityResult) {
        ActivityResult it = activityResult;
        u.j(it, "it");
        this.f62922a.setResult(it.b());
        return y.f85009a;
    }
}
