package com.withings.library.authentication.recovery;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Session;
import pq0.a;
import qm0.d;
/* compiled from: RecoveryCodeService.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "", "Lcom/withings/library/authentication/login/Session;", Session.ELEMENT, "", "getRecoveryCode", "(Lcom/withings/library/authentication/login/Session;Lqm0/d;)Ljava/lang/Object;", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface RecoveryCodeService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RecoveryCodeService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/library/authentication/recovery/RecoveryCodeService$Companion;", "Lpq0/a;", "Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "getRecoveryCodeService", "()Lcom/withings/library/authentication/recovery/RecoveryCodeService;", "<init>", "()V", "recoveryCodeService", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion implements a {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final RecoveryCodeService getRecoveryCodeService$lambda$0(g<? extends RecoveryCodeService> gVar) {
            return gVar.getValue();
        }

        @Override // pq0.a
        public oq0.a getKoin() {
            return qq0.a.f93676a.a();
        }

        public final RecoveryCodeService getRecoveryCodeService() {
            return getRecoveryCodeService$lambda$0(h.a(LazyThreadSafetyMode.f76136a, new RecoveryCodeService$Companion$getRecoveryCodeService$$inlined$inject$default$1(this, null, null)));
        }
    }

    Object getRecoveryCode(com.withings.library.authentication.login.Session session, d<? super String> dVar);
}
