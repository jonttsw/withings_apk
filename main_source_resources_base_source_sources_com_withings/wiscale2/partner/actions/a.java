package com.withings.wiscale2.partner.actions;

import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FetchRunkeeperActivities.kt */
@e(c = "com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker", f = "FetchRunkeeperActivities.kt", l = {116}, m = "getLastUpdateInSeconds")
/* loaded from: classes5.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f58848a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FetchRunkeeperActivitiesWorker f58849b;

    /* renamed from: c  reason: collision with root package name */
    int f58850c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FetchRunkeeperActivitiesWorker fetchRunkeeperActivitiesWorker, d<? super a> dVar) {
        super(dVar);
        this.f58849b = fetchRunkeeperActivitiesWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f58848a = obj;
        this.f58850c |= Integer.MIN_VALUE;
        return FetchRunkeeperActivitiesWorker.t(this.f58849b, this);
    }
}
