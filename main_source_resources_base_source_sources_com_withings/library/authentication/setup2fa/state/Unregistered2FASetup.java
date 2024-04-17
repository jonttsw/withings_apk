package com.withings.library.authentication.setup2fa.state;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: Unregistered2FASetup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup;", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "startSetupSequence", "(Lqm0/d;)Ljava/lang/Object;", "StartSetup2FAOutputState", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface Unregistered2FASetup extends Setup2FAState {

    /* compiled from: Unregistered2FASetup.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/Setup2FAState;", "SuccessNeedPhoneNumber2FA", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState$SuccessNeedPhoneNumber2FA;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface StartSetup2FAOutputState {

        /* compiled from: Unregistered2FASetup.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState$SuccessNeedPhoneNumber2FA;", "Lcom/withings/library/authentication/setup2fa/state/Unregistered2FASetup$StartSetup2FAOutputState;", "setup2FAState", "Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "(Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;)V", "getSetup2FAState", "()Lcom/withings/library/authentication/setup2fa/state/NeedPhoneNumber2FASetup;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class SuccessNeedPhoneNumber2FA implements StartSetup2FAOutputState {
            private final NeedPhoneNumber2FASetup setup2FAState;

            public SuccessNeedPhoneNumber2FA(NeedPhoneNumber2FASetup setup2FAState) {
                u.j(setup2FAState, "setup2FAState");
                this.setup2FAState = setup2FAState;
            }

            @Override // com.withings.library.authentication.setup2fa.state.Unregistered2FASetup.StartSetup2FAOutputState
            public NeedPhoneNumber2FASetup getSetup2FAState() {
                return this.setup2FAState;
            }
        }

        Setup2FAState getSetup2FAState();
    }

    Object startSetupSequence(d<? super StartSetup2FAOutputState> dVar);
}
