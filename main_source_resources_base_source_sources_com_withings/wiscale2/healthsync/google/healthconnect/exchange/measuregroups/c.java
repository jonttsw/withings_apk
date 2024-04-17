package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ReimportHealthConnectMeasuresGroupsWorker.kt */
@e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ReimportHealthConnectDataWorker", f = "ReimportHealthConnectMeasuresGroupsWorker.kt", l = {87, 88, 89, 91, ConstantsWs.MEASURE_TYPE_HORIZONTAL_RADIUS}, m = "reimportDataForCapability")
/* loaded from: classes5.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    ReimportHealthConnectDataWorker f56629a;

    /* renamed from: b  reason: collision with root package name */
    PartnerCapabilities f56630b;

    /* renamed from: c  reason: collision with root package name */
    Serializable f56631c;

    /* renamed from: d  reason: collision with root package name */
    long f56632d;

    /* renamed from: e  reason: collision with root package name */
    int f56633e;

    /* renamed from: f  reason: collision with root package name */
    boolean f56634f;

    /* renamed from: g  reason: collision with root package name */
    boolean f56635g;

    /* renamed from: h  reason: collision with root package name */
    /* synthetic */ Object f56636h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ ReimportHealthConnectDataWorker f56637i;

    /* renamed from: j  reason: collision with root package name */
    int f56638j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReimportHealthConnectDataWorker reimportHealthConnectDataWorker, d<? super c> dVar) {
        super(dVar);
        this.f56637i = reimportHealthConnectDataWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56636h = obj;
        this.f56638j |= Integer.MIN_VALUE;
        return ReimportHealthConnectDataWorker.x(this.f56637i, null, null, 0L, this);
    }
}
