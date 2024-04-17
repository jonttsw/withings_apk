package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class t0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q60.a f45037a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f45038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f45039c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(q60.a aVar, Context context, e.n<Intent, ActivityResult> nVar) {
        super(0);
        this.f45037a = aVar;
        this.f45038b = context;
        this.f45039c = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Intent a11 = this.f45037a.a(this.f45038b);
        if (a11 != null) {
            this.f45039c.a(a11);
        }
        return nm0.y.f85009a;
    }
}
