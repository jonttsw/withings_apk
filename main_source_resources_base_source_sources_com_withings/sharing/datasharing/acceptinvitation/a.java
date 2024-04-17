package com.withings.sharing.datasharing.acceptinvitation;

import androidx.camera.core.y1;
import kotlin.jvm.internal.u;
/* compiled from: AcceptInvitationViewModel.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: AcceptInvitationViewModel.kt */
    /* renamed from: com.withings.sharing.datasharing.acceptinvitation.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0604a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0604a f44012a = new C0604a();

        private C0604a() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0604a)) {
                return false;
            }
            C0604a c0604a = (C0604a) obj;
            return true;
        }

        public final int hashCode() {
            return -1469894461;
        }

        public final String toString() {
            return "AcceptInvitation";
        }
    }

    /* compiled from: AcceptInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f44013a;

        public b(String invitationHash) {
            u.j(invitationHash, "invitationHash");
            this.f44013a = invitationHash;
        }

        public final String a() {
            return this.f44013a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && u.e(this.f44013a, ((b) obj).f44013a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44013a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("LoadInvitation(invitationHash="), this.f44013a, ")");
        }
    }

    /* compiled from: AcceptInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f44014a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return true;
        }

        public final int hashCode() {
            return 1111620815;
        }

        public final String toString() {
            return "RefuseInvitation";
        }
    }
}
