package com.withings.account.models;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeyStoreCipher.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.account.models.AndroidKeyStoreCipher", f = "KeyStoreCipher.kt", l = {76}, m = "decrypt")
/* loaded from: classes3.dex */
public final class AndroidKeyStoreCipher$decrypt$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidKeyStoreCipher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidKeyStoreCipher$decrypt$1(AndroidKeyStoreCipher androidKeyStoreCipher, d<? super AndroidKeyStoreCipher$decrypt$1> dVar) {
        super(dVar);
        this.this$0 = androidKeyStoreCipher;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decrypt(null, this);
    }
}
