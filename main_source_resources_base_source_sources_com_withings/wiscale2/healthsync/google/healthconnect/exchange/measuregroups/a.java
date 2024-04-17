package com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups;

import androidx.health.connect.client.records.Record;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeMeasureGroupsWithHealthConnectRequest.kt */
@e(c = "com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMeasuresGroupWithHealthConnectWorker", f = "ExchangeMeasureGroupsWithHealthConnectRequest.kt", l = {114, 115, 116}, m = "find")
/* loaded from: classes5.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f56611a;

    /* renamed from: b  reason: collision with root package name */
    Object f56612b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f56613c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ExchangeMeasuresGroupWithHealthConnectWorker<Record> f56614d;

    /* renamed from: e  reason: collision with root package name */
    int f56615e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExchangeMeasuresGroupWithHealthConnectWorker<Record> exchangeMeasuresGroupWithHealthConnectWorker, d<? super a> dVar) {
        super(dVar);
        this.f56614d = exchangeMeasuresGroupWithHealthConnectWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56613c = obj;
        this.f56615e |= Integer.MIN_VALUE;
        return this.f56614d.Z(0L, this);
    }
}
