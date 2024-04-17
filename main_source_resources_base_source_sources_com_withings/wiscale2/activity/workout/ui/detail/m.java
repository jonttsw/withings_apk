package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.compose.ui.e;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.activity.workout.ui.detail.o7;
import java.util.List;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49427a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49428b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity) {
        super(2);
        this.f49427a = allWorkoutsActivity;
        this.f49428b = lVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        o7 o7Var;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
            o7Var = this.f49427a.f49023o;
            if (o7Var != null) {
                k1.r0 a11 = androidx.compose.runtime.l0.a(o7Var.m0(), kotlin.collections.i0.f76187a, null, aVar2, 2);
                int i11 = 0;
                for (o7.a aVar3 : (List) a11.getValue()) {
                    i11 += aVar3.c();
                }
                e.a aVar4 = androidx.compose.ui.e.f8927a;
                s0.a.a(androidx.compose.foundation.layout.x0.j(aVar4, 0.0f, yk.h.B(), 0.0f, 0.0f, 13), null, null, false, null, null, null, false, new l(androidx.compose.foundation.layout.x0.h(aVar4, yk.h.o(), 0.0f, 2), i11, this.f49428b, this.f49427a, a11, context), aVar2, 0, ConstantsWs.WS_STATUS_NOREPOUSER);
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
