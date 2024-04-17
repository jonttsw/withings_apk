package com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas;

import com.withings.partner.model.capabilities.PartnerCapabilities;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeVasistasWithHealthConnectRequest.kt */
@e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeVasistasWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeVasistasWithHealthConnectRequest.kt", l = {221}, m = "getVasistasForDateBounds")
/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    a f56794a;

    /* renamed from: b  reason: collision with root package name */
    PartnerCapabilities f56795b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56796c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f56797d;

    /* renamed from: e  reason: collision with root package name */
    int f56798e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d dVar) {
        super(dVar);
        this.f56797d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable m11;
        this.f56796c = obj;
        this.f56798e |= Integer.MIN_VALUE;
        m11 = this.f56797d.m(0, null, this);
        return m11;
    }
}
