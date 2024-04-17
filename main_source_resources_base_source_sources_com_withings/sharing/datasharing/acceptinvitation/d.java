package com.withings.sharing.datasharing.acceptinvitation;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import com.withings.measurement.model.Biomarker;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: AcceptInvitationViewModel.kt */
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: AcceptInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private final String f44066a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f44067b;

        /* renamed from: c  reason: collision with root package name */
        private final String f44068c;

        /* renamed from: d  reason: collision with root package name */
        private final String f44069d;

        /* renamed from: e  reason: collision with root package name */
        private final List<Biomarker> f44070e;

        /* renamed from: f  reason: collision with root package name */
        private final int f44071f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f44072g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String invitationHash, boolean z5, String senderName, String senderEmail, List<? extends Biomarker> list, int i11, boolean z11) {
            u.j(invitationHash, "invitationHash");
            u.j(senderName, "senderName");
            u.j(senderEmail, "senderEmail");
            this.f44066a = invitationHash;
            this.f44067b = z5;
            this.f44068c = senderName;
            this.f44069d = senderEmail;
            this.f44070e = list;
            this.f44071f = i11;
            this.f44072g = z11;
        }

        public static a a(a aVar) {
            String invitationHash = aVar.f44066a;
            boolean z5 = aVar.f44067b;
            String senderName = aVar.f44068c;
            String senderEmail = aVar.f44069d;
            List<Biomarker> sharedBiomarkers = aVar.f44070e;
            int i11 = aVar.f44071f;
            aVar.getClass();
            u.j(invitationHash, "invitationHash");
            u.j(senderName, "senderName");
            u.j(senderEmail, "senderEmail");
            u.j(sharedBiomarkers, "sharedBiomarkers");
            return new a(invitationHash, z5, senderName, senderEmail, sharedBiomarkers, i11, false);
        }

        public final boolean b() {
            return this.f44072g;
        }

        public final String c() {
            return this.f44069d;
        }

        public final String d() {
            return this.f44068c;
        }

        public final List<Biomarker> e() {
            return this.f44070e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f44066a, aVar.f44066a) && this.f44067b == aVar.f44067b && u.e(this.f44068c, aVar.f44068c) && u.e(this.f44069d, aVar.f44069d) && u.e(this.f44070e, aVar.f44070e) && this.f44071f == aVar.f44071f && this.f44072g == aVar.f44072g) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44072g) + h.a(this.f44071f, defpackage.e.b(this.f44070e, defpackage.d.c(this.f44069d, defpackage.d.c(this.f44068c, y1.a(this.f44067b, this.f44066a.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(invitationHash=");
            sb2.append(this.f44066a);
            sb2.append(", invitationWasAShareBack=");
            sb2.append(this.f44067b);
            sb2.append(", senderName=");
            sb2.append(this.f44068c);
            sb2.append(", senderEmail=");
            sb2.append(this.f44069d);
            sb2.append(", sharedBiomarkers=");
            sb2.append(this.f44070e);
            sb2.append(", unknownSharedBiomarkerCount=");
            sb2.append(this.f44071f);
            sb2.append(", canRespondToInvitation=");
            return h.d(sb2, this.f44072g, ")");
        }
    }

    /* compiled from: AcceptInvitationViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44073a = new b();

        private b() {
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
            return 878603881;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
