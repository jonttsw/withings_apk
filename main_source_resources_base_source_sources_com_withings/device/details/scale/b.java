package com.withings.device.details.scale;

import androidx.camera.core.y1;
import com.withings.device.Device;
/* compiled from: GenerateShareScaleLinkUseCase.kt */
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: GenerateShareScaleLinkUseCase.kt */
    /* loaded from: classes3.dex */
    public static abstract class a {

        /* compiled from: GenerateShareScaleLinkUseCase.kt */
        /* renamed from: com.withings.device.details.scale.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0486a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f36907a;

            public C0486a(Throwable th2) {
                super(0);
                this.f36907a = th2;
            }

            public final Throwable a() {
                return this.f36907a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0486a) && kotlin.jvm.internal.u.e(this.f36907a, ((C0486a) obj).f36907a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f36907a.hashCode();
            }

            public final String toString() {
                return "Error(throwable=" + this.f36907a + ")";
            }
        }

        /* compiled from: GenerateShareScaleLinkUseCase.kt */
        /* renamed from: com.withings.device.details.scale.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0487b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0487b f36908a = new C0487b();

            private C0487b() {
                super(0);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0487b)) {
                    return false;
                }
                C0487b c0487b = (C0487b) obj;
                return true;
            }

            public final int hashCode() {
                return -441807612;
            }

            public final String toString() {
                return "NoInternet";
            }
        }

        /* compiled from: GenerateShareScaleLinkUseCase.kt */
        /* loaded from: classes3.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f36909a;

            public c(String str) {
                super(0);
                this.f36909a = str;
            }

            public final String a() {
                return this.f36909a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && kotlin.jvm.internal.u.e(this.f36909a, ((c) obj).f36909a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f36909a.hashCode();
            }

            public final String toString() {
                return y1.e(new StringBuilder("Success(shareLink="), this.f36909a, ")");
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    Object a(Device device, qm0.d<? super a> dVar);
}
