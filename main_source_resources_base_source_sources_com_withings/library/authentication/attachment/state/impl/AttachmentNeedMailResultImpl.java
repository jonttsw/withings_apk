package com.withings.library.authentication.attachment.state.impl;

import com.withings.library.authentication.attachment.state.AttachmentNeedMailResult;
import com.withings.library.authentication.attachment.state.factory.AttachmentBirthdayVerificationFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
import qm0.d;
/* compiled from: AttachmentNeedMailResultImpl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/withings/library/authentication/attachment/state/impl/AttachmentNeedMailResultImpl;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "Lpq0/a;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$CodeOutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$MailOutputState;", "resendMail", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult$SwitchMethodOutputState;", "switchToBirthdayVerification", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory$delegate", "Lnm0/g;", "getAttachmentBirthdayVerificationFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory$delegate", "getAttachmentFinishedFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AttachmentNeedMailResultImpl implements AttachmentNeedMailResult, a {
    private final g attachmentBirthdayVerificationFactory$delegate;
    private final g attachmentFinishedFactory$delegate;

    public AttachmentNeedMailResultImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.attachmentBirthdayVerificationFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedMailResultImpl$special$$inlined$inject$default$1(this, null, null));
        this.attachmentFinishedFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedMailResultImpl$special$$inlined$inject$default$2(this, null, null));
    }

    private final AttachmentBirthdayVerificationFactory getAttachmentBirthdayVerificationFactory() {
        return (AttachmentBirthdayVerificationFactory) this.attachmentBirthdayVerificationFactory$delegate.getValue();
    }

    private final AttachmentFinishedFactory getAttachmentFinishedFactory() {
        return (AttachmentFinishedFactory) this.attachmentFinishedFactory$delegate.getValue();
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult
    public Object injectCode(String str, d<? super AttachmentNeedMailResult.CodeOutputState> dVar) {
        return new AttachmentNeedMailResult.CodeOutputState.SuccessFinished(getAttachmentFinishedFactory().build());
    }

    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult
    public Object resendMail(d<? super AttachmentNeedMailResult.MailOutputState> dVar) {
        return new AttachmentNeedMailResult.MailOutputState.SuccessNeedMailResult(this);
    }

    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedMailResult
    public Object switchToBirthdayVerification(d<? super AttachmentNeedMailResult.SwitchMethodOutputState> dVar) {
        return new AttachmentNeedMailResult.SwitchMethodOutputState.SuccessBirthdayVerification(getAttachmentBirthdayVerificationFactory().build());
    }
}
