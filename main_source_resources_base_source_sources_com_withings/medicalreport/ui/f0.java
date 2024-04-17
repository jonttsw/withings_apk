package com.withings.medicalreport.ui;

import android.graphics.Bitmap;
/* compiled from: PdfPreviewFragment.kt */
/* loaded from: classes4.dex */
public abstract class f0 {

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends f0 {

        /* renamed from: a  reason: collision with root package name */
        private final Exception f42246a;

        public a(Exception exc) {
            super(0);
            this.f42246a = exc;
        }

        public final Exception a() {
            return this.f42246a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f42246a, ((a) obj).f42246a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42246a.hashCode();
        }

        public final String toString() {
            return "Error(exception=" + this.f42246a + ")";
        }
    }

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b extends f0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f42247a = new b();

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
            return -1148565806;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PdfPreviewFragment.kt */
    /* loaded from: classes4.dex */
    public static final class c extends f0 {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f42248a;

        public c(Bitmap bitmap) {
            super(0);
            this.f42248a = bitmap;
        }

        public final Bitmap a() {
            return this.f42248a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f42248a, ((c) obj).f42248a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f42248a.hashCode();
        }

        public final String toString() {
            return "PdfData(bitmapPdf=" + this.f42248a + ")";
        }
    }

    public /* synthetic */ f0(int i11) {
        this();
    }

    private f0() {
    }
}
