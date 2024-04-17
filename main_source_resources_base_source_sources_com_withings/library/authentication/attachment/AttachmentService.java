package com.withings.library.authentication.attachment;

import com.withings.library.authentication.attachment.state.AttachmentState;
import com.withings.library.authentication.login.state.LoggedIn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.g;
import nm0.h;
import pq0.a;
import qm0.d;
/* compiled from: AttachmentService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/withings/library/authentication/attachment/AttachmentService;", "", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "", "jwt", "Lcom/withings/library/authentication/login/state/LoggedIn;", "loggedIn", "initiateAttachmentSequence", "(Ljava/lang/String;Lcom/withings/library/authentication/login/state/LoggedIn;Lqm0/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AttachmentService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AttachmentService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/library/authentication/attachment/AttachmentService$Companion;", "Lpq0/a;", "Lcom/withings/library/authentication/attachment/AttachmentService;", "getAttachmentService", "()Lcom/withings/library/authentication/attachment/AttachmentService;", "<init>", "()V", "attachmentService", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion implements a {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final AttachmentService getAttachmentService$lambda$0(g<? extends AttachmentService> gVar) {
            return gVar.getValue();
        }

        public final AttachmentService getAttachmentService() {
            return getAttachmentService$lambda$0(h.a(LazyThreadSafetyMode.f76136a, new AttachmentService$Companion$getAttachmentService$$inlined$inject$default$1(this, null, null)));
        }

        @Override // pq0.a
        public oq0.a getKoin() {
            return qq0.a.f93676a.a();
        }
    }

    Flow<AttachmentState> getCurrentState();

    AttachmentState getState();

    Object initiateAttachmentSequence(String str, LoggedIn loggedIn, d<? super AttachmentState> dVar);
}
