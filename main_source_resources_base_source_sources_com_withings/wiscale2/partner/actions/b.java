package com.withings.wiscale2.partner.actions;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FetchRunkeeperActivities.kt */
@e(c = "com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker", f = "FetchRunkeeperActivities.kt", l = {122, 123}, m = "saveLastUpdate")
/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    FetchRunkeeperActivitiesWorker f58851a;

    /* renamed from: b  reason: collision with root package name */
    long f58852b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f58853c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FetchRunkeeperActivitiesWorker f58854d;

    /* renamed from: e  reason: collision with root package name */
    int f58855e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FetchRunkeeperActivitiesWorker fetchRunkeeperActivitiesWorker, d<? super b> dVar) {
        super(dVar);
        this.f58854d = fetchRunkeeperActivitiesWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f58853c = obj;
        this.f58855e |= Integer.MIN_VALUE;
        return FetchRunkeeperActivitiesWorker.w(this.f58854d, null, this);
    }
}
