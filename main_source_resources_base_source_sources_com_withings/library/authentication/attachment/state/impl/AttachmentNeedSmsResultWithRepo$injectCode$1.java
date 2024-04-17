package com.withings.library.authentication.attachment.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttachmentNeedSmsResultWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo", f = "AttachmentNeedSmsResultWithRepo.kt", l = {22, 25, 29, 33, 37}, m = "injectCode")
/* loaded from: classes4.dex */
public final class AttachmentNeedSmsResultWithRepo$injectCode$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachmentNeedSmsResultWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentNeedSmsResultWithRepo$injectCode$1(AttachmentNeedSmsResultWithRepo attachmentNeedSmsResultWithRepo, d<? super AttachmentNeedSmsResultWithRepo$injectCode$1> dVar) {
        super(dVar);
        this.this$0 = attachmentNeedSmsResultWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectCode(null, this);
    }
}
