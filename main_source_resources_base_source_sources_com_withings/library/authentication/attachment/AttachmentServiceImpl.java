package com.withings.library.authentication.attachment;

import com.withings.library.authentication.attachment.state.AttachmentState;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedMailResultFactory;
import com.withings.library.authentication.attachment.state.factory.AttachmentNeedSmsResultFactory;
import com.withings.library.authentication.login.state.LoggedIn;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.g;
import nm0.h;
import pq0.a;
import qm0.d;
/* compiled from: AttachmentServiceImpl.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b#\u0010$J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00042\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/withings/library/authentication/attachment/AttachmentServiceImpl;", "Lcom/withings/library/authentication/attachment/AttachmentService;", "Lcom/withings/library/authentication/attachment/MutableAttachmentService;", "Lpq0/a;", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "getState", "()Lcom/withings/library/authentication/attachment/state/AttachmentState;", "", "jwt", "Lcom/withings/library/authentication/login/state/LoggedIn;", "loggedIn", "initiateAttachmentSequence", "(Ljava/lang/String;Lcom/withings/library/authentication/login/state/LoggedIn;Lqm0/d;)Ljava/lang/Object;", "T", "newAttachmentState", "pushNewState", "(Lcom/withings/library/authentication/attachment/state/AttachmentState;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactory;", "attachmentNeedMailResultFactory$delegate", "Lnm0/g;", "getAttachmentNeedMailResultFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedMailResultFactory;", "attachmentNeedMailResultFactory", "Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "attachmentNeedSmsResultFactory$delegate", "getAttachmentNeedSmsResultFactory", "()Lcom/withings/library/authentication/attachment/state/factory/AttachmentNeedSmsResultFactory;", "attachmentNeedSmsResultFactory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AttachmentServiceImpl implements AttachmentService, MutableAttachmentService, a {
    private final MutableStateFlow<AttachmentState> _currentState;
    private final g attachmentNeedMailResultFactory$delegate;
    private final g attachmentNeedSmsResultFactory$delegate;

    public AttachmentServiceImpl() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f76136a;
        this.attachmentNeedMailResultFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentServiceImpl$special$$inlined$inject$default$1(this, null, null));
        this.attachmentNeedSmsResultFactory$delegate = h.a(lazyThreadSafetyMode, new AttachmentServiceImpl$special$$inlined$inject$default$2(this, null, null));
        this._currentState = StateFlowKt.MutableStateFlow(null);
    }

    private final AttachmentNeedMailResultFactory getAttachmentNeedMailResultFactory() {
        return (AttachmentNeedMailResultFactory) this.attachmentNeedMailResultFactory$delegate.getValue();
    }

    private final AttachmentNeedSmsResultFactory getAttachmentNeedSmsResultFactory() {
        return (AttachmentNeedSmsResultFactory) this.attachmentNeedSmsResultFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.attachment.AttachmentService
    public Flow<AttachmentState> getCurrentState() {
        return this._currentState;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.attachment.AttachmentService
    public AttachmentState getState() {
        return this._currentState.getValue();
    }

    @Override // com.withings.library.authentication.attachment.AttachmentService
    public Object initiateAttachmentSequence(String str, LoggedIn loggedIn, d<? super AttachmentState> dVar) {
        return pushNewState(getAttachmentNeedSmsResultFactory().buildWithRepo(getAttachmentNeedSmsResultFactory().build()), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.withings.library.authentication.attachment.MutableAttachmentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends com.withings.library.authentication.attachment.state.AttachmentState> java.lang.Object pushNewState(T r5, qm0.d<? super T> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.attachment.AttachmentServiceImpl$pushNewState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.attachment.AttachmentServiceImpl$pushNewState$1 r0 = (com.withings.library.authentication.attachment.AttachmentServiceImpl$pushNewState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.attachment.AttachmentServiceImpl$pushNewState$1 r0 = new com.withings.library.authentication.attachment.AttachmentServiceImpl$pushNewState$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.withings.library.authentication.attachment.state.AttachmentState r5 = (com.withings.library.authentication.attachment.state.AttachmentState) r5
            nm0.l.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            nm0.l.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow<com.withings.library.authentication.attachment.state.AttachmentState> r6 = r4._currentState
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.attachment.AttachmentServiceImpl.pushNewState(com.withings.library.authentication.attachment.state.AttachmentState, qm0.d):java.lang.Object");
    }
}
