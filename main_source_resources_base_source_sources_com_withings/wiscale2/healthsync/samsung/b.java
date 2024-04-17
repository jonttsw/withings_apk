package com.withings.wiscale2.healthsync.samsung;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImportStepsFromSHealth.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth", f = "ImportStepsFromSHealth.kt", l = {ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS, 98}, m = "importSteps")
/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ImportStepsFromSHealth f56956a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f56957b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56958c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ImportStepsFromSHealth f56959d;

    /* renamed from: e  reason: collision with root package name */
    int f56960e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ImportStepsFromSHealth importStepsFromSHealth, qm0.d<? super b> dVar) {
        super(dVar);
        this.f56959d = importStepsFromSHealth;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56958c = obj;
        this.f56960e |= Integer.MIN_VALUE;
        return ImportStepsFromSHealth.x(this.f56959d, this);
    }
}
