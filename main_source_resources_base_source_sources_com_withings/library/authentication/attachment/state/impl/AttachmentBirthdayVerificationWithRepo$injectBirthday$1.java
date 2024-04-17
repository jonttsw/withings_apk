package com.withings.library.authentication.attachment.state.impl;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttachmentBirthdayVerificationWithRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.attachment.state.impl.AttachmentBirthdayVerificationWithRepo", f = "AttachmentBirthdayVerificationWithRepo.kt", l = {22, 25, 31, 37, 43, 49}, m = "injectBirthday")
/* loaded from: classes4.dex */
public final class AttachmentBirthdayVerificationWithRepo$injectBirthday$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachmentBirthdayVerificationWithRepo this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentBirthdayVerificationWithRepo$injectBirthday$1(AttachmentBirthdayVerificationWithRepo attachmentBirthdayVerificationWithRepo, d<? super AttachmentBirthdayVerificationWithRepo$injectBirthday$1> dVar) {
        super(dVar);
        this.this$0 = attachmentBirthdayVerificationWithRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.injectBirthday(null, this);
    }
}
