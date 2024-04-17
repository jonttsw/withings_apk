package com.withings.library.authentication.attachment.state.impl;

import com.withings.library.authentication.attachment.MutableAttachmentService;
import com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification;
import com.withings.library.authentication.attachment.state.AttachmentContactCustomerService;
import com.withings.library.authentication.attachment.state.AttachmentFinished;
import com.withings.library.authentication.attachment.state.factory.AttachmentBirthdayVerificationFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentContactCustomerServiceFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentFinishedFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import pq0.a;
/* compiled from: AttachmentBirthdayVerificationWithRepo.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b%\u0010&J\u0013\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0003\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006J\u0013\u0010\u0003\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\u0003\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/withings/library/authentication/attachment/state/impl/AttachmentBirthdayVerificationWithRepo;", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lpq0/a;", "withRepo", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;", "(Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;)Lcom/withings/library/authentication/attachment/state/AttachmentContactCustomerService;", "", "birthday", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification$OutputState;", "injectBirthday", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "attachmentBirthdayVerification", "Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory$delegate", "Lnm0/g;", "getAttachmentFinishedFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentFinishedFactory;", "attachmentFinishedFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory$delegate", "getAttachmentBirthdayVerificationFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentBirthdayVerificationFactory;", "attachmentBirthdayVerificationFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentContactCustomerServiceFactory;", "attachmentContactCustomerServiceFactory$delegate", "getAttachmentContactCustomerServiceFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentContactCustomerServiceFactory;", "attachmentContactCustomerServiceFactory", "Lcom/withings/library/authentication/attachment/MutableAttachmentService;", "mutableAttachmentService$delegate", "getMutableAttachmentService", "()Lcom/withings/library/authentication/attachment/MutableAttachmentService;", "mutableAttachmentService", "<init>", "(Lcom/withings/library/authentication/attachment/state/AttachmentBirthdayVerification;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AttachmentBirthdayVerificationWithRepo implements AttachmentBirthdayVerification, a {
    private final AttachmentBirthdayVerification attachmentBirthdayVerification;
    private final g attachmentBirthdayVerificationFactory$delegate;
    private final g attachmentContactCustomerServiceFactory$delegate;
    private final g attachmentFinishedFactory$delegate;
    private final g mutableAttachmentService$delegate;

    public AttachmentBirthdayVerificationWithRepo(AttachmentBirthdayVerification attachmentBirthdayVerification) {
        u.j(attachmentBirthdayVerification, "attachmentBirthdayVerification");
        this.attachmentBirthdayVerification = attachmentBirthdayVerification;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.attachmentFinishedFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentBirthdayVerificationWithRepo$special$$inlined$inject$default$1(this, null, null));
        this.attachmentBirthdayVerificationFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentBirthdayVerificationWithRepo$special$$inlined$inject$default$2(this, null, null));
        this.attachmentContactCustomerServiceFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentBirthdayVerificationWithRepo$special$$inlined$inject$default$3(this, null, null));
        this.mutableAttachmentService$delegate = h.a(lazyThreadSafetyMode, new AttachmentBirthdayVerificationWithRepo$special$$inlined$inject$default$4(this, null, null));
    }

    private final AttachmentBirthdayVerificationFactory getAttachmentBirthdayVerificationFactory() {
        return (AttachmentBirthdayVerificationFactory) this.attachmentBirthdayVerificationFactory$delegate.getValue();
    }

    private final AttachmentContactCustomerServiceFactory getAttachmentContactCustomerServiceFactory() {
        return (AttachmentContactCustomerServiceFactory) this.attachmentContactCustomerServiceFactory$delegate.getValue();
    }

    private final AttachmentFinishedFactory getAttachmentFinishedFactory() {
        return (AttachmentFinishedFactory) this.attachmentFinishedFactory$delegate.getValue();
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object injectBirthday(java.lang.String r6, qm0.d<? super com.withings.library.authentication.attachment.state.AttachmentBirthdayVerification.OutputState> r7) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.attachment.state.impl.AttachmentBirthdayVerificationWithRepo.injectBirthday(java.lang.String, qm0.d):java.lang.Object");
    }

    private final AttachmentFinished withRepo(AttachmentFinished attachmentFinished) {
        return getAttachmentFinishedFactory().buildWithRepo(attachmentFinished);
    }

    private final AttachmentContactCustomerService withRepo(AttachmentContactCustomerService attachmentContactCustomerService) {
        return getAttachmentContactCustomerServiceFactory().buildWithRepo(attachmentContactCustomerService);
    }
}
