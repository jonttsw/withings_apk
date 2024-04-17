package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f45016a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45017b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f45018c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l0.c f45019d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q60.a f45020e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45021f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Context context, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var, l0.c cVar, q60.a aVar2, e.n<Intent, ActivityResult> nVar) {
        super(2);
        this.f45016a = context;
        this.f45017b = aVar;
        this.f45018c = r0Var;
        this.f45019d = cVar;
        this.f45020e = aVar2;
        this.f45021f = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(703817886);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new o0(this.f45018c);
                aVar2.n(t11);
            }
            aVar2.J();
            d0.m(this.f45016a, this.f45017b, this.f45018c, (ym0.a) t11, aVar2, 3464);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._OK_, aVar2), null, false, ColorStyle.f33322a, null, false, new p0(this.f45019d, this.f45020e, this.f45016a, this.f45021f, this.f45018c), aVar2, 24576, 109);
        }
        return nm0.y.f85009a;
    }
}
