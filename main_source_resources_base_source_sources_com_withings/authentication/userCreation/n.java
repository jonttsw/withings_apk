package com.withings.authentication.userCreation;

import androidx.compose.material.c5;
import androidx.compose.ui.platform.k4;
import k1.r0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class n extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k4 f32589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f32590b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0<BottomSheetUnits> f32591c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f32592d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c5 f32593e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k4 k4Var, CoroutineScope coroutineScope, r0<BottomSheetUnits> r0Var, long j5, c5 c5Var) {
        super(0);
        this.f32589a = k4Var;
        this.f32590b = coroutineScope;
        this.f32591c = r0Var;
        this.f32592d = j5;
        this.f32593e = c5Var;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f32591c.setValue(BottomSheetUnits.f32472c);
        k4 k4Var = this.f32589a;
        if (k4Var != null) {
            k4Var.a();
        }
        BuildersKt__Builders_commonKt.launch$default(this.f32590b, null, null, new m(this.f32592d, this.f32593e, null), 3, null);
        return y.f85009a;
    }
}
