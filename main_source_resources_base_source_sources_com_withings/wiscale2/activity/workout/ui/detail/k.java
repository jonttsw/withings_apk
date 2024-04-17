package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.wiscale2.activity.workout.ui.detail.o7;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f49349a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f49350b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49351c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49352d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, androidx.compose.ui.e eVar, Context context, com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity) {
        super(4);
        this.f49349a = list;
        this.f49350b = eVar;
        this.f49351c = context;
        this.f49352d = lVar;
        this.f49353e = allWorkoutsActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            o7.a aVar3 = (o7.a) this.f49349a.get(intValue);
            aVar2.s(1372028028);
            WorkoutCategory a11 = aVar3.a();
            int b10 = aVar3.b();
            com.withings.common.compose.component.v0.b(0.0f, aVar2, 0, 1);
            String name = a11.getName(this.f49351c);
            kotlin.jvm.internal.u.i(name, "getName(...)");
            com.withings.common.compose.component.o.o(this.f49350b, null, name, null, String.valueOf(b10), false, false, true, null, null, null, new i(this.f49352d, this.f49353e, a11), null, aVar2, 12582912, 0, 5994);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
