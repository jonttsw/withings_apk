package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f44987a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44988b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f44989c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l0.c f44990d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q60.a f44991e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f44992f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var, l0.c cVar, q60.a aVar2, e.n<Intent, ActivityResult> nVar) {
        super(2);
        this.f44987a = context;
        this.f44988b = aVar;
        this.f44989c = r0Var;
        this.f44990d = cVar;
        this.f44991e = aVar2;
        this.f44992f = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(703816513);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new j0(this.f44989c);
                aVar2.n(t11);
            }
            aVar2.J();
            d0.m(this.f44987a, this.f44988b, this.f44989c, (ym0.a) t11, aVar2, 3464);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._OK_, aVar2), null, false, ColorStyle.f33322a, null, false, new k0(this.f44990d, this.f44991e, this.f44987a, this.f44992f, this.f44989c), aVar2, 24576, 109);
        }
        return nm0.y.f85009a;
    }
}
