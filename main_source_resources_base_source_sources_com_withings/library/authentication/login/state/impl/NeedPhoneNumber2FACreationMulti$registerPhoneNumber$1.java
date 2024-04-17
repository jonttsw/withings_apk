package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedPhoneNumber2FACreationMulti.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedPhoneNumber2FACreationMulti", f = "NeedPhoneNumber2FACreationMulti.kt", l = {17}, m = "registerPhoneNumber")
/* loaded from: classes4.dex */
public final class NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedPhoneNumber2FACreationMulti this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1(NeedPhoneNumber2FACreationMulti needPhoneNumber2FACreationMulti, d<? super NeedPhoneNumber2FACreationMulti$registerPhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needPhoneNumber2FACreationMulti;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerPhoneNumber(null, this);
    }
}
