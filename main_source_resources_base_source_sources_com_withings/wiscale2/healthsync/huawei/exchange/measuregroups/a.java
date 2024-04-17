package com.withings.wiscale2.healthsync.huawei.exchange.measuregroups;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExchangeMeasureGroupsWithHuaweiHealthRequest.kt */
@e(c = "com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeMeasuresGroupWithHuaweiHealthWorker", f = "ExchangeMeasureGroupsWithHuaweiHealthRequest.kt", l = {54}, m = "delete$suspendImpl")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f56819a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExchangeMeasuresGroupWithHuaweiHealthWorker f56820b;

    /* renamed from: c  reason: collision with root package name */
    int f56821c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ExchangeMeasuresGroupWithHuaweiHealthWorker exchangeMeasuresGroupWithHuaweiHealthWorker, d<? super a> dVar) {
        super(dVar);
        this.f56820b = exchangeMeasuresGroupWithHuaweiHealthWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f56819a = obj;
        this.f56821c |= Integer.MIN_VALUE;
        return ExchangeMeasuresGroupWithHuaweiHealthWorker.X(this.f56820b, null, this);
    }
}
