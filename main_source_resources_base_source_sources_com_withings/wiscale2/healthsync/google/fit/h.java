package com.withings.wiscale2.healthsync.google.fit;

import com.withings.library.authentication.api.ConstantsWs;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImportStepsFromFit.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.fit.ImportStepsFromFit", f = "ImportStepsFromFit.kt", l = {94, ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS}, m = "importSteps")
/* loaded from: classes5.dex */
public final class h extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ImportStepsFromFit f56446a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f56447b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56448c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ImportStepsFromFit f56449d;

    /* renamed from: e  reason: collision with root package name */
    int f56450e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ImportStepsFromFit importStepsFromFit, qm0.d<? super h> dVar) {
        super(dVar);
        this.f56449d = importStepsFromFit;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56448c = obj;
        this.f56450e |= Integer.MIN_VALUE;
        return ImportStepsFromFit.v(this.f56449d, this);
    }
}
