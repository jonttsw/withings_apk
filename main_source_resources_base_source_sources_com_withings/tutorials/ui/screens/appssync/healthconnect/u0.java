package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class u0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ q60.a f45045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f45046c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45047d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ym0.a<nm0.y> aVar, q60.a aVar2, Context context, e.n<Intent, ActivityResult> nVar) {
        super(2);
        this.f45044a = aVar;
        this.f45045b = aVar2;
        this.f45046c = context;
        this.f45047d = nVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            d0.e(0, 0, aVar2, this.f45044a, new t0(this.f45045b, this.f45046c, this.f45047d));
        }
        return nm0.y.f85009a;
    }
}
