package com.withings.library.authentication.sensitiveaction;

import com.withings.library.authentication.sensitiveaction.state.SensitiveActionState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import nm0.g;
import nm0.h;
import nm0.y;
import pq0.a;
import qm0.d;
/* compiled from: SensitiveActionService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService;", "", "Lcom/withings/library/authentication/sensitiveaction/state/SensitiveActionState;", "initiationSensitiveActionSequence", "(Lqm0/d;)Ljava/lang/Object;", "getState", "Lnm0/y;", "clearState", "Lkotlinx/coroutines/flow/Flow;", "getCurrentState", "()Lkotlinx/coroutines/flow/Flow;", "currentState", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface SensitiveActionService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: SensitiveActionService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService$Companion;", "Lpq0/a;", "Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService;", "getSensitiveActionService", "()Lcom/withings/library/authentication/sensitiveaction/SensitiveActionService;", "<init>", "()V", "sensitiveActionService", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion implements a {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final SensitiveActionService getSensitiveActionService$lambda$0(g<? extends SensitiveActionService> gVar) {
            return gVar.getValue();
        }

        @Override // pq0.a
        public oq0.a getKoin() {
            return qq0.a.f93676a.a();
        }

        public final SensitiveActionService getSensitiveActionService() {
            return getSensitiveActionService$lambda$0(h.a(LazyThreadSafetyMode.f76136a, new SensitiveActionService$Companion$getSensitiveActionService$$inlined$inject$default$1(this, null, null)));
        }
    }

    Object clearState(d<? super y> dVar);

    Flow<SensitiveActionState> getCurrentState();

    Object getState(d<? super SensitiveActionState> dVar);

    Object initiationSensitiveActionSequence(d<? super SensitiveActionState> dVar);
}
