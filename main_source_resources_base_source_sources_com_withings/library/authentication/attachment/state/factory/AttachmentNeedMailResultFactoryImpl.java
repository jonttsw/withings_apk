package com.withings.library.authentication.attachment.state.factory;

import com.withings.library.authentication.attachment.state.AttachmentNeedMailResult;
import com.withings.library.authentication.attachment.state.impl.AttachmentNeedMailResultImpl;
import com.withings.library.authentication.attachment.state.impl.AttachmentNeedMailResultWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AttachmentNeedMailResultFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactoryImpl;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactory;", "()V", "build", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedMailResult;", "buildWithRepo", "attachmentNeedMailResult", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttachmentNeedMailResultFactoryImpl implements AttachmentNeedMailResultFactory {
    @Override // com.withings.library.authentication.attachment.state.factory.AttachmentNeedMailResultFactory
    public AttachmentNeedMailResult build() {
        return new AttachmentNeedMailResultImpl();
    }

    @Override // com.withings.library.authentication.attachment.state.factory.AttachmentNeedMailResultFactory
    public AttachmentNeedMailResult buildWithRepo(AttachmentNeedMailResult attachmentNeedMailResult) {
        u.j(attachmentNeedMailResult, "attachmentNeedMailResult");
        return new AttachmentNeedMailResultWithRepo(attachmentNeedMailResult);
    }
}
