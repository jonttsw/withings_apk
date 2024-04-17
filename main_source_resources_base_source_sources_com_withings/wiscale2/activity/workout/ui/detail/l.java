package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.wiscale2.activity.workout.ui.detail.o7;
import java.util.List;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.l<s0.i0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f49384a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f49385b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.l f49386c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49387d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<List<o7.a>> f49388e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Context f49389f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.compose.ui.e eVar, int i11, com.google.android.material.bottomsheet.l lVar, AllWorkoutsActivity allWorkoutsActivity, k1.r0 r0Var, Context context) {
        super(1);
        this.f49384a = eVar;
        this.f49385b = i11;
        this.f49386c = lVar;
        this.f49387d = allWorkoutsActivity;
        this.f49388e = r0Var;
        this.f49389f = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(s0.i0 i0Var) {
        s0.i0 LazyColumn = i0Var;
        kotlin.jvm.internal.u.j(LazyColumn, "$this$LazyColumn");
        s0.i0.g(LazyColumn, null, new s1.a(true, 1175971692, new h(this.f49384a, this.f49385b, this.f49386c, this.f49387d)), 3);
        List<o7.a> value = this.f49388e.getValue();
        LazyColumn.c(value.size(), null, new j(value), new s1.a(true, -1091073711, new k(value, this.f49384a, this.f49389f, this.f49386c, this.f49387d)));
        return nm0.y.f85009a;
    }
}
