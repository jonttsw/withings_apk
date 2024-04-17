package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.C1987R;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class h extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f49208a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f49209b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49210c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49211d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.compose.ui.e eVar, int i11, com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity) {
        super(3);
        this.f49208a = eVar;
        this.f49209b = i11;
        this.f49210c = lVar;
        this.f49211d = allWorkoutsActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.o(this.f49208a, null, ay.b.u(C1987R.string.homescreen_allWorkouts_title, aVar2), null, String.valueOf(this.f49209b), false, false, true, null, null, null, new g(this.f49210c, this.f49211d), null, aVar2, 12582912, 0, 5994);
        }
        return nm0.y.f85009a;
    }
}
