package com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeTracksWithHealthConnectRequest.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeTracksWithHealthConnectWorker$exchangeRequest$2$1", f = "ExchangeTracksWithHealthConnectRequest.kt", l = {ConstantsWs.WS_STATUS_MEASUPDATEERROR}, m = "getTracksForDateBounds")
/* loaded from: classes5.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    c f56717a;

    /* renamed from: b  reason: collision with root package name */
    PartnerCapabilities f56718b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56719c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f56720d;

    /* renamed from: e  reason: collision with root package name */
    int f56721e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, qm0.d<? super d> dVar) {
        super(dVar);
        this.f56720d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable l5;
        this.f56719c = obj;
        this.f56721e |= Integer.MIN_VALUE;
        l5 = this.f56720d.l(null, this);
        return l5;
    }
}
