package com.withings.library.authentication.sensitiveaction.state;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NeedCode2FASensitiveAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "", "Creation", "Verification", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence$Creation;", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence$Verification;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Sequence {

    /* compiled from: NeedCode2FASensitiveAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/Sequence$Creation;", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "needPhoneNumber", "Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "(Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;)V", "getNeedPhoneNumber", "()Lcom/withings/library/authentication/sensitiveaction/state/NeedPhoneNumberSensitiveActionState;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creation implements Sequence {
        private final NeedPhoneNumberSensitiveActionState needPhoneNumber;

        public Creation(NeedPhoneNumberSensitiveActionState needPhoneNumber) {
            u.j(needPhoneNumber, "needPhoneNumber");
            this.needPhoneNumber = needPhoneNumber;
        }

        public final NeedPhoneNumberSensitiveActionState getNeedPhoneNumber() {
            return this.needPhoneNumber;
        }
    }

    /* compiled from: NeedCode2FASensitiveAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/library/authentication/sensitiveaction/state/Sequence$Verification;", "Lcom/withings/library/authentication/sensitiveaction/state/Sequence;", "()V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Verification implements Sequence {
        public static final Verification INSTANCE = new Verification();

        private Verification() {
        }
    }
}
