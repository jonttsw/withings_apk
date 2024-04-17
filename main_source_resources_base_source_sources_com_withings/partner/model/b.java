package com.withings.partner.model;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Partner.kt */
@e(c = "com.withings.partner.model.Partner", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_OBJECT_NOTFOUND}, m = "refreshAssociationStatus$suspendImpl")
/* loaded from: classes4.dex */
public final class b extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Partner f43530a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f43531b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Partner f43532c;

    /* renamed from: d  reason: collision with root package name */
    int f43533d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Partner partner, qm0.d<? super b> dVar) {
        super(dVar);
        this.f43532c = partner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f43531b = obj;
        this.f43533d |= Integer.MIN_VALUE;
        return Partner.N(null, this.f43532c, this, false);
    }
}
