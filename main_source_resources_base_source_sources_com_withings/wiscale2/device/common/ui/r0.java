package com.withings.wiscale2.device.common.ui;

import android.app.Application;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.l<fl.o, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f54067a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Application f54068b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(p0 p0Var, Application application) {
        super(1);
        this.f54067a = p0Var;
        this.f54068b = application;
    }

    @Override // ym0.l
    public final String invoke(fl.o oVar) {
        return (String) cr.a.a(new nm0.j(oVar, this.f54067a.i0()), new q0(this.f54068b));
    }
}
