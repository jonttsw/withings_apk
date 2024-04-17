package com.withings.partner.exchanges.google.healthconnect;

import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnect.kt */
@e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Changes", f = "HealthConnect.kt", l = {408}, m = "createNewChangeToken")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f43437a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthConnect.b f43438b;

    /* renamed from: c  reason: collision with root package name */
    int f43439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HealthConnect.b bVar, d<? super a> dVar) {
        super(dVar);
        this.f43438b = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f43437a = obj;
        this.f43439c |= Integer.MIN_VALUE;
        return this.f43438b.a(null, this);
    }
}
