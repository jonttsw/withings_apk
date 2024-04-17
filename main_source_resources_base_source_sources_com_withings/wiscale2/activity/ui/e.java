package com.withings.wiscale2.activity.ui;

import com.withings.vasistas.model.Vasistas;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: VasistasInfoActivity.kt */
/* loaded from: classes4.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VasistasInfoActivity f48635a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VasistasInfoActivity vasistasInfoActivity) {
        super(0);
        this.f48635a = vasistasInfoActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        Vasistas.Category category;
        VasistasInfoActivity vasistasInfoActivity = this.f48635a;
        category = vasistasInfoActivity.f48543b;
        l.b(vasistasInfoActivity, category, vasistasInfoActivity);
        return y.f85009a;
    }
}
