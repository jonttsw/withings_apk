package com.withings.partner.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import java.io.Serializable;
import kotlin.coroutines.jvm.internal.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Partner.kt */
@e(c = "com.withings.partner.model.Partner$SamsungHealth", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_WRONGVERSION}, m = "isMissingSHealthScopes")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: a  reason: collision with root package name */
    Object f43526a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f43527b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Partner.i f43528c;

    /* renamed from: d  reason: collision with root package name */
    int f43529d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Partner.i iVar, qm0.d<? super a> dVar) {
        super(dVar);
        this.f43528c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Serializable X;
        this.f43527b = obj;
        this.f43529d |= Integer.MIN_VALUE;
        X = this.f43528c.X(null, this);
        return X;
    }
}
