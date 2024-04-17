package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedMailResultWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedMailResultWithRepo", f = "NeedMailResultWithRepo.kt", l = {78, 81, 85, 89, 94, 98, 102, 106, 111, 116, 120}, m = "injectJWTToken")
/* loaded from: classes4.dex */
public final class NeedMailResultWithRepo$injectJWTToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedMailResultWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedMailResultWithRepo$injectJWTToken$1(NeedMailResultWithRepo needMailResultWithRepo, d<? super NeedMailResultWithRepo$injectJWTToken$1> dVar) {
        super(dVar);
        this.this$0 = needMailResultWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectJWTToken(null, this);
    }
}
