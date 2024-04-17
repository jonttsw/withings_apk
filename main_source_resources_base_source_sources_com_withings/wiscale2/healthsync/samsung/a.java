package com.withings.wiscale2.healthsync.samsung;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImportStepsFromSHealth.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth", f = "ImportStepsFromSHealth.kt", l = {89}, m = "hasStepImportPermissions")
/* loaded from: classes5.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ImportStepsFromSHealth f56951a;

    /* renamed from: b  reason: collision with root package name */
    ImportStepsFromSHealth f56952b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56953c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ImportStepsFromSHealth f56954d;

    /* renamed from: e  reason: collision with root package name */
    int f56955e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ImportStepsFromSHealth importStepsFromSHealth, qm0.d<? super a> dVar) {
        super(dVar);
        this.f56954d = importStepsFromSHealth;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56953c = obj;
        this.f56955e |= Integer.MIN_VALUE;
        return ImportStepsFromSHealth.w(this.f56954d, this);
    }
}
