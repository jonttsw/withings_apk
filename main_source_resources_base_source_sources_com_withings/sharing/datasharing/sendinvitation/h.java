package com.withings.sharing.datasharing.sendinvitation;
/* compiled from: SendInvitationViewModel.kt */
/* loaded from: classes4.dex */
public abstract class h {

    /* compiled from: SendInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final a f44209a = new a();

        private a() {
            super(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public final int hashCode() {
            return -1687527680;
        }

        public final String toString() {
            return "InvitationFailed";
        }
    }

    /* compiled from: SendInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b extends h {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44210a = new b();

        private b() {
            super(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public final int hashCode() {
            return 552824603;
        }

        public final String toString() {
            return "InvitationSent";
        }
    }

    public /* synthetic */ h(int i11) {
        this();
    }

    private h() {
    }
}
