package com.withings.library.authentication.attachment;

import com.withings.library.authentication.attachment.state.AttachmentState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import qm0.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttachmentServiceImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.library.authentication.attachment.AttachmentServiceImpl", f = "AttachmentServiceImpl.kt", l = {30}, m = "pushNewState")
/* loaded from: classes4.dex */
public final class AttachmentServiceImpl$pushNewState$1<T extends AttachmentState> extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AttachmentServiceImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachmentServiceImpl$pushNewState$1(AttachmentServiceImpl attachmentServiceImpl, d<? super AttachmentServiceImpl$pushNewState$1> dVar) {
        super(dVar);
        this.this$0 = attachmentServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pushNewState(null, this);
    }
}
