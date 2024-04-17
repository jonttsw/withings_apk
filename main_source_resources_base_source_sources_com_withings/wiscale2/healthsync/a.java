package com.withings.wiscale2.healthsync;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
import u10.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Worker.kt */
@e(c = "com.withings.wiscale2.healthsync.ExchangeWorker", f = "Worker.kt", l = {ConstantsWs.MEASURE_TYPE_VISCERAL_FAT_RATING}, m = "getDateBounds$HealthMate_prodRelease")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    ExchangeWorker f56202a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f56203b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExchangeWorker<g<?, ?, ?>> f56204c;

    /* renamed from: d  reason: collision with root package name */
    int f56205d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExchangeWorker<g<?, ?, ?>> exchangeWorker, d<? super a> dVar) {
        super(dVar);
        this.f56204c = exchangeWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56203b = obj;
        this.f56205d |= Integer.MIN_VALUE;
        return this.f56204c.y(0, null, this);
    }
}
