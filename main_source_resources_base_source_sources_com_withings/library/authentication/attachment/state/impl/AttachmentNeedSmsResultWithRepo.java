package com.withings.library.authentication.attachment.state.impl;

import com.withings.library.authentication.attachment.MutableAttachmentService;
import com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification;
import com.withings.library.authentication.attachment.state.AttachmentFinished;
import com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult;
import com.withings.library.authentication.attachment.state.factory.AttachmentBirthdayVerificationFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import pq0.a;
/* compiled from: AttachmentNeedSmsResultWithRepo.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/withings/library/authentication/attachment/state/impl/AttachmentNeedSmsResultWithRepo;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Lpq0/a;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "withRepo", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "", XHTMLText.CODE, "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$CodeOutputState;", "injectCode", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SmsOutputState;", "resendSms", "(Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult$SwitchMethodOutputState;", "switchToBirthdayVerification", "attachmentNeedSmsResult", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory$delegate", "Lnm0/g;", "getAttachmentBirthdayVerificationFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory$delegate", "getAttachmentFinishedFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "attachmentNeedSmsResultFactory$delegate", "getAttachmentNeedSmsResultFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "attachmentNeedSmsResultFactory", "Lcom/withings/library/authentication/attachment/MutableAttachmentService;", "mutableAttachmentService$delegate", "getMutableAttachmentService", "()Lcom/withings/library/authentication/attachment/MutableAttachmentService;", "mutableAttachmentService", "<init>", "(Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AttachmentNeedSmsResultWithRepo implements AttachmentNeedSmsResult, a {
    private final g attachmentBirthdayVerificationFactory$delegate;
    private final g attachmentFinishedFactory$delegate;
    private final AttachmentNeedSmsResult attachmentNeedSmsResult;
    private final g attachmentNeedSmsResultFactory$delegate;
    private final g mutableAttachmentService$delegate;

    public AttachmentNeedSmsResultWithRepo(AttachmentNeedSmsResult attachmentNeedSmsResult) {
        u.j(attachmentNeedSmsResult, "attachmentNeedSmsResult");
        this.attachmentNeedSmsResult = attachmentNeedSmsResult;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.attachmentBirthdayVerificationFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedSmsResultWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.attachmentFinishedFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedSmsResultWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.attachmentNeedSmsResultFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedSmsResultWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.mutableAttachmentService$delegate = h.a(lazyThreadSafetyMode, new AttachmentNeedSmsResultWithRepo$special$$inlined$inject$default$4(this, null, null));
    }

    private final AttachmentBirthdayVerificationFactory getAttachmentBirthdayVerificationFactory() {
        return (AttachmentBirthdayVerificationFactory) this.attachmentBirthdayVerificationFactory$delegate.getValue();
    }

    private final AttachmentFinishedFactory getAttachmentFinishedFactory() {
        return (AttachmentFinishedFactory) this.attachmentFinishedFactory$delegate.getValue();
    }

    private final AttachmentNeedSmsResultFactory getAttachmentNeedSmsResultFactory() {
        return (AttachmentNeedSmsResultFactory) this.attachmentNeedSmsResultFactory$delegate.getValue();
    }

    private final MutableAttachmentService getMutableAttachmentService() {
        return (MutableAttachmentService) this.mutableAttachmentService$delegate.getValue();
    }

    private final AttachmentBirthdayVerification withRepo(AttachmentBirthdayVerification attachmentBirthdayVerification) {
        return getAttachmentBirthdayVerificationFactory().buildWithRepo(attachmentBirthdayVerification);
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectCode(java.lang.String r10, qm0.d<? super com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.CodeOutputState> r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo.injectCode(java.lang.String, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object resendSms(qm0.d<? super com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SmsOutputState> r11) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo.resendSms(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    @Override // com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object switchToBirthdayVerification(qm0.d<? super com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SwitchMethodOutputState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo$switchToBirthdayVerification$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo$switchToBirthdayVerification$1 r0 = (com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo$switchToBirthdayVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo$switchToBirthdayVerification$1 r0 = new com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo$switchToBirthdayVerification$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r6)
            goto L6b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.L$0
            com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo r2 = (com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo) r2
            nm0.l.b(r6)
            goto L4b
        L3a:
            nm0.l.b(r6)
            com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult r6 = r5.attachmentNeedSmsResult
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.switchToBirthdayVerification(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult$SwitchMethodOutputState r6 = (com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SwitchMethodOutputState) r6
            boolean r4 = r6 instanceof com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SwitchMethodOutputState.SuccessBirthdayVerification
            if (r4 == 0) goto L73
            com.withings.library.authentication.attachment.MutableAttachmentService r4 = r2.getMutableAttachmentService()
            com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult$SwitchMethodOutputState$SuccessBirthdayVerification r6 = (com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult.SwitchMethodOutputState.SuccessBirthdayVerification) r6
            com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification r6 = r6.getAttachmentState()
            com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification r6 = r2.withRepo(r6)
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r4.pushNewState(r6, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification r6 = (com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification) r6
            com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult$SwitchMethodOutputState$SuccessBirthdayVerification r0 = new com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult$SwitchMethodOutputState$SuccessBirthdayVerification
            r0.<init>(r6)
            return r0
        L73:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo.switchToBirthdayVerification(qm0.d):java.lang.Object");
    }

    private final AttachmentFinished withRepo(AttachmentFinished attachmentFinished) {
        return getAttachmentFinishedFactory().buildWithRepo(attachmentFinished);
    }

    private final AttachmentNeedSmsResult withRepo(AttachmentNeedSmsResult attachmentNeedSmsResult) {
        return getAttachmentNeedSmsResultFactory().buildWithRepo(attachmentNeedSmsResult);
    }
}
