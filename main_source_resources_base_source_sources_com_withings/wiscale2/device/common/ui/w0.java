package com.withings.wiscale2.device.common.ui;

import android.app.Application;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class w0 extends kotlin.jvm.internal.w implements ym0.l<fl.o, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f54112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Application f54113b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(p0 p0Var, Application application) {
        super(1);
        this.f54112a = p0Var;
        this.f54113b = application;
    }

    @Override // ym0.l
    public final String invoke(fl.o oVar) {
        return (String) cr.a.a(new nm0.j(oVar, this.f54112a.i0()), new v0(this.f54113b));
    }
}
