package com.withings.library.authentication.attachment.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttachmentNeedMailResultWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.attachment.state.impl.AttachmentNeedMailResultWithRepo", f = "AttachmentNeedMailResultWithRepo.kt", l = {66, 69}, m = "switchToBirthdayVerification")
/* loaded from: classes4.dex */
public final class AttachmentNeedMailResultWithRepo$switchToBirthdayVerification$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachmentNeedMailResultWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentNeedMailResultWithRepo$switchToBirthdayVerification$1(AttachmentNeedMailResultWithRepo attachmentNeedMailResultWithRepo, d<? super AttachmentNeedMailResultWithRepo$switchToBirthdayVerification$1> dVar) {
        super(dVar);
        this.this$0 = attachmentNeedMailResultWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.switchToBirthdayVerification(this);
    }
}
