package com.withings.library.authentication.setup2fa;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Setup2FAServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.setup2fa.Setup2FAServiceImpl", f = "Setup2FAServiceImpl.kt", l = {31}, m = "initiationSetup2FASequence")
/* loaded from: classes4.dex */
public final class Setup2FAServiceImpl$initiationSetup2FASequence$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Setup2FAServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Setup2FAServiceImpl$initiationSetup2FASequence$1(Setup2FAServiceImpl setup2FAServiceImpl, d<? super Setup2FAServiceImpl$initiationSetup2FASequence$1> dVar) {
        super(dVar);
        this.this$0 = setup2FAServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.initiationSetup2FASequence(this);
    }
}
