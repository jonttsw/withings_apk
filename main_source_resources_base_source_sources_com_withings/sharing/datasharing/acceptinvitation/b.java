package com.withings.sharing.datasharing.acceptinvitation;

import androidx.appcompat.app.h;
/* compiled from: AcceptInvitationViewModel.kt */
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: AcceptInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f44015a = false;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f44015a == ((a) obj).f44015a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44015a);
        }

        public final String toString() {
            return h.d(new StringBuilder("InvitationAccepted(invitationWasAShareBack="), this.f44015a, ")");
        }
    }

    /* compiled from: AcceptInvitationViewModel.kt */
    /* renamed from: com.withings.sharing.datasharing.acceptinvitation.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0605b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0605b f44016a = new C0605b();

        private C0605b() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0605b)) {
                return false;
            }
            C0605b c0605b = (C0605b) obj;
            return true;
        }

        public final int hashCode() {
            return 534481837;
        }

        public final String toString() {
            return "InvitationRefused";
        }
    }
}
