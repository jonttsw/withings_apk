package com.withings.wiscale2.device.common.feature;

import android.graphics.Bitmap;
/* compiled from: FeatureActivationDocumentFragment.kt */
/* loaded from: classes5.dex */
public abstract class q {

    /* compiled from: FeatureActivationDocumentFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends q {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f52406a;

        public a(Bitmap bitmap) {
            super(0);
            this.f52406a = bitmap;
        }

        public final Bitmap a() {
            return this.f52406a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && kotlin.jvm.internal.u.e(this.f52406a, ((a) obj).f52406a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f52406a.hashCode();
        }

        public final String toString() {
            return "Document(previewBitmap=" + this.f52406a + ")";
        }
    }

    /* compiled from: FeatureActivationDocumentFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b extends q {

        /* renamed from: a  reason: collision with root package name */
        private final Exception f52407a;

        public b(Exception exc) {
            super(0);
            this.f52407a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.u.e(this.f52407a, ((b) obj).f52407a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f52407a.hashCode();
        }

        public final String toString() {
            return "Error(exception=" + this.f52407a + ")";
        }
    }

    /* compiled from: FeatureActivationDocumentFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c extends q {

        /* renamed from: a  reason: collision with root package name */
        public static final c f52408a = new q(0);
    }

    public /* synthetic */ q(int i11) {
        this();
    }

    private q() {
    }
}
