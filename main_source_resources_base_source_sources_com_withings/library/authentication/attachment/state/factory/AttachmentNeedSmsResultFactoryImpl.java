package com.withings.library.authentication.attachment.state.factory;

import com.withings.library.authentication.attachment.state.AttachmentNeedSmsResult;
import com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultImpl;
import com.withings.library.authentication.attachment.state.impl.AttachmentNeedSmsResultWithRepo;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AttachmentNeedSmsResultFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactoryImpl;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "()V", "build", "Lcom/withings/library/authentication/attachment/state/AttachmentNeedSmsResult;", "buildWithRepo", "attachmentNeedSmsResult", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttachmentNeedSmsResultFactoryImpl implements AttachmentNeedSmsResultFactory {
    @Override // com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactory
    public AttachmentNeedSmsResult build() {
        return new AttachmentNeedSmsResultImpl();
    }

    @Override // com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactory
    public AttachmentNeedSmsResult buildWithRepo(AttachmentNeedSmsResult attachmentNeedSmsResult) {
        u.j(attachmentNeedSmsResult, "attachmentNeedSmsResult");
        return new AttachmentNeedSmsResultWithRepo(attachmentNeedSmsResult);
    }
}
