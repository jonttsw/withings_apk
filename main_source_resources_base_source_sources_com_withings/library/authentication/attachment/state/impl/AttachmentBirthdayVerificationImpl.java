package com.withings.library.authentication.attachment.state.impl;

import com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import pq0.a;
import qm0.d;
/* compiled from: AttachmentBirthdayVerificationImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/attachment/state/impl/AttachmentBirthdayVerificationImpl;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lpq0/a;", "", "birthday", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "injectBirthday", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory$delegate", "Lnm0/g;", "getAttachmentFinishedFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AttachmentBirthdayVerificationImpl implements AttachmentBirthdayVerification, a {
    private final g attachmentFinishedFactory$delegate = h.a(LazyThreadSafetyMode.f76136a, new AttachmentBirthdayVerificationImpl$special$$inlined$inject$default$1(this, null, null));

    private final AttachmentFinishedFactory getAttachmentFinishedFactory() {
        return (AttachmentFinishedFactory) this.attachmentFinishedFactory$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification
    public Object injectBirthday(String str, d<? super AttachmentBirthdayVerification.OutputState> dVar) {
        return new AttachmentBirthdayVerification.OutputState.SuccessAttached(getAttachmentFinishedFactory().build());
    }
}
