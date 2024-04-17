package com.withings.partner.exchanges.google.healthconnect;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HealthConnect.kt */
@e(c = "com.withings.partner.exchanges.google.healthconnect.HealthConnect$Permissions", f = "HealthConnect.kt", l = {ConstantsWs.WS_STATUS_MEASUPDATEERROR}, m = "hasPermissionForCapability")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f43440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HealthConnect.e f43441b;

    /* renamed from: c  reason: collision with root package name */
    int f43442c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HealthConnect.e eVar, d<? super b> dVar) {
        super(dVar);
        this.f43441b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f43440a = obj;
        this.f43442c |= Integer.MIN_VALUE;
        return this.f43441b.e(0, null, this);
    }
}
