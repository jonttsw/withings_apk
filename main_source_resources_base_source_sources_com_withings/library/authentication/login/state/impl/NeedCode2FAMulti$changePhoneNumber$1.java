package com.withings.library.authentication.login.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeedCode2FAMulti.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.login.state.impl.NeedCode2FAMulti", f = "NeedCode2FAMulti.kt", l = {180}, m = "changePhoneNumber")
/* loaded from: classes4.dex */
public final class NeedCode2FAMulti$changePhoneNumber$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeedCode2FAMulti this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeedCode2FAMulti$changePhoneNumber$1(NeedCode2FAMulti needCode2FAMulti, d<? super NeedCode2FAMulti$changePhoneNumber$1> dVar) {
        super(dVar);
        this.this$0 = needCode2FAMulti;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.changePhoneNumber(this);
    }
}
