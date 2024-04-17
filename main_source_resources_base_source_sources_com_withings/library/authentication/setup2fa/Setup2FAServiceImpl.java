package com.withings.library.authentication.setup2fa;

import com.withings.library.authentication.setup2fa.state.Setup2FAState;
import com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import nm0.g;
import nm0.h;
import nm0.y;
import pq0.a;
import qm0.d;
/* compiled from: Setup2FAServiceImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0005J%\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/withings/library/authentication/setup2fa/Setup2FAServiceImpl;", "Lcom/withings/library/authentication/setup2fa/MutableSetup2FAService;", "Lpq0/a;", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getState", "(Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "clearState", "initiationSetup2FASequence", "T", "newSetup2FAState", "pushNewState", "(Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "initializationError2FASetupFactory$delegate", "Lnm0/g;", "getInitializationError2FASetupFactory", "()Lcom/withings/library/authentication/setup2fa/state/factory/InitializationError2FASetupFactory;", "initializationError2FASetupFactory", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "<init>", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class Setup2FAServiceImpl implements MutableSetup2FAService, a {
    private final g initializationError2FASetupFactory$delegate = h.a(LazyThreadSafetyMode.f76136a, new Setup2FAServiceImpl$special$$inlined$inject$default$1(this, null, null));
    private final MutableStateFlow<Setup2FAState> _currentState = StateFlowKt.MutableStateFlow(null);

    private final InitializationError2FASetupFactory getInitializationError2FASetupFactory() {
        return (InitializationError2FASetupFactory) this.initializationError2FASetupFactory$delegate.getValue();
    }

    @Override // com.withings.library.authentication.setup2fa.Setup2FAService
    public Object clearState(d<? super y> dVar) {
        Object emit = this._currentState.emit(null, dVar);
        if (emit == CoroutineSingletons.f76214a) {
            return emit;
        }
        return y.f85009a;
    }

    @Override // com.withings.library.authentication.setup2fa.Setup2FAService
    public Flow<Setup2FAState> getCurrentState() {
        return this._currentState;
    }

    @Override // pq0.a
    public oq0.a getKoin() {
        return qq0.a.f93676a.a();
    }

    @Override // com.withings.library.authentication.setup2fa.Setup2FAService
    public Object getState(d<? super Setup2FAState> dVar) {
        Setup2FAState value = this._currentState.getValue();
        if (value == null) {
            return initiationSetup2FASequence(dVar);
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.withings.library.authentication.setup2fa.Setup2FAService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initiationSetup2FASequence(qm0.d<? super com.withings.library.authentication.setup2fa.state.Setup2FAState> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$initiationSetup2FASequence$1
            if (r0 == 0) goto L13
            r0 = r5
            com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$initiationSetup2FASequence$1 r0 = (com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$initiationSetup2FASequence$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$initiationSetup2FASequence$1 r0 = new com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$initiationSetup2FASequence$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            nm0.l.b(r5)
            com.withings.library.authentication.setup2fa.state.factory.InitializationError2FASetupFactory r5 = r4.getInitializationError2FASetupFactory()
            com.withings.library.authentication.setup2fa.state.InitializationError2FASetup$ErrorType$Unknown r2 = com.withings.library.authentication.setup2fa.state.InitializationError2FASetup.ErrorType.Unknown.INSTANCE
            com.withings.library.authentication.setup2fa.state.InitializationError2FASetup r5 = r5.buildWithRepo(r2)
            r0.label = r3
            java.lang.Object r5 = r5.retryInitialization(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.withings.library.authentication.setup2fa.state.InitializationError2FASetup$RetryOutputState r5 = (com.withings.library.authentication.setup2fa.state.InitializationError2FASetup.RetryOutputState) r5
            com.withings.library.authentication.setup2fa.state.Setup2FAState r5 = com.withings.library.authentication.setup2fa.state.helper.OutputStateUnwrapperKt.unwrap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.Setup2FAServiceImpl.initiationSetup2FASequence(qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.withings.library.authentication.setup2fa.MutableSetup2FAService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends com.withings.library.authentication.setup2fa.state.Setup2FAState> java.lang.Object pushNewState(T r5, qm0.d<? super T> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$pushNewState$1
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$pushNewState$1 r0 = (com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$pushNewState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$pushNewState$1 r0 = new com.withings.library.authentication.setup2fa.Setup2FAServiceImpl$pushNewState$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            com.withings.library.authentication.setup2fa.state.Setup2FAState r5 = (com.withings.library.authentication.setup2fa.state.Setup2FAState) r5
            nm0.l.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            nm0.l.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow<com.withings.library.authentication.setup2fa.state.Setup2FAState> r6 = r4._currentState
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.setup2fa.Setup2FAServiceImpl.pushNewState(com.withings.library.authentication.setup2fa.state.Setup2FAState, qm0.d):java.lang.Object");
    }
}
