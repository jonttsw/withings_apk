package com.withings.sharing.datasharing.sendinvitation;

import androidx.camera.core.y1;
import com.withings.sharing.core.model.TimeSharePeriod;
import java.util.List;
/* compiled from: SendInvitationViewModel.kt */
/* loaded from: classes4.dex */
public interface g {

    /* compiled from: SendInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private final String f44205a;

        public a(String toEmail) {
            kotlin.jvm.internal.u.j(toEmail, "toEmail");
            this.f44205a = toEmail;
        }

        public final String a() {
            return this.f44205a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f44205a, ((a) obj).f44205a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44205a.hashCode();
        }

        public final String toString() {
            return y1.e(new StringBuilder("SendInvitation(toEmail="), this.f44205a, ")");
        }
    }

    /* compiled from: SendInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        private final List<y40.a> f44206a;

        public b(List<y40.a> biomarkers) {
            kotlin.jvm.internal.u.j(biomarkers, "biomarkers");
            this.f44206a = biomarkers;
        }

        public final List<y40.a> a() {
            return this.f44206a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f44206a, ((b) obj).f44206a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44206a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("SetData(biomarkers="), this.f44206a, ")");
        }
    }

    /* compiled from: SendInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        private final TimeSharePeriod f44207a;

        public c(TimeSharePeriod timeSharePeriod) {
            kotlin.jvm.internal.u.j(timeSharePeriod, "timeSharePeriod");
            this.f44207a = timeSharePeriod;
        }

        public final TimeSharePeriod a() {
            return this.f44207a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f44207a == ((c) obj).f44207a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44207a.hashCode();
        }

        public final String toString() {
            return "SetPeriod(timeSharePeriod=" + this.f44207a + ")";
        }
    }
}
