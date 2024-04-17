package com.withings.sharing.datasharing.sendinvitation;

import java.util.List;
/* compiled from: SelectDataViewModel.kt */
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: SelectDataViewModel.kt */
    /* renamed from: com.withings.sharing.datasharing.sendinvitation.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0610a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f44108a;

        public C0610a(boolean z5) {
            super(0);
            this.f44108a = z5;
        }

        public final boolean a() {
            return this.f44108a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0610a) && this.f44108a == ((C0610a) obj).f44108a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f44108a);
        }

        public final String toString() {
            return androidx.appcompat.app.h.d(new StringBuilder("SelectAllBiomarkers(selected="), this.f44108a, ")");
        }
    }

    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final y40.a f44109a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y40.a biomarker) {
            super(0);
            kotlin.jvm.internal.u.j(biomarker, "biomarker");
            this.f44109a = biomarker;
        }

        public final y40.a a() {
            return this.f44109a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f44109a, ((b) obj).f44109a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44109a.hashCode();
        }

        public final String toString() {
            return "SetBiomarkerSelection(biomarker=" + this.f44109a + ")";
        }
    }

    /* compiled from: SelectDataViewModel.kt */
    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final List<y40.a> f44110a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<y40.a> biomarkers) {
            super(0);
            kotlin.jvm.internal.u.j(biomarkers, "biomarkers");
            this.f44110a = biomarkers;
        }

        public final List<y40.a> a() {
            return this.f44110a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f44110a, ((c) obj).f44110a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f44110a.hashCode();
        }

        public final String toString() {
            return defpackage.d.i(new StringBuilder("SetBiomarkers(biomarkers="), this.f44110a, ")");
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
