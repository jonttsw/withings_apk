package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FAWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedCode2FAWithRepo", f = "NeedCode2FAWithRepo.kt", l = {32, 38, 42, 46, 50, 54, 58, 63, 67}, m = "injectCode")
/* loaded from: classes4.dex */
public final class NeedCode2FAWithRepo$injectCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FAWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FAWithRepo$injectCode$1(NeedCode2FAWithRepo needCode2FAWithRepo, d<? super NeedCode2FAWithRepo$injectCode$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FAWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectCode(null, false, this);
    }
}
