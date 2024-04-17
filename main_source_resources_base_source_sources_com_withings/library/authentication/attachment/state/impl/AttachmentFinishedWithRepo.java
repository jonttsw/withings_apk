package com.withings.library.authentication.attachment.state.impl;

import com.withings.library.authentication.attachment.state.AttachmentFinished;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AttachmentFinishedWithRepo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/attachment/state/impl/AttachmentFinishedWithRepo;", "Lcom/withings/library/authentication/attachment/state/AttachmentFinished;", "attachmentFinished", "(Lcom/withings/library/authentication/attachment/state/AttachmentFinished;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AttachmentFinishedWithRepo implements AttachmentFinished {
    private final AttachmentFinished attachmentFinished;

    public AttachmentFinishedWithRepo(AttachmentFinished attachmentFinished) {
        u.j(attachmentFinished, "attachmentFinished");
        this.attachmentFinished = attachmentFinished;
    }
}
